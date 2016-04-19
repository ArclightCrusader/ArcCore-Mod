package com.thearclightcrusader.ArcCore.tileEntity;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.blocks.ArcCoreInfuser;
import com.thearclightcrusader.ArcCore.handler.ArcCoreInfuserRecipes;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityArcCoreInfuser extends TileEntity implements ISidedInventory {

	private ItemStack slots[];
	
	public int trioPower;
	public int trioCookTime;
	public static final int maxPower = 10000;
	public static final int infusingSpeed = 100;
	
	private static final int[] slots_top = new int[] {0, 1};
	private static final int[] slots_bottom = new int[] {3};
	private static final int[] slots_side = new int[] {2};
	
	private String customName;
	
	public TileEntityArcCoreInfuser() {
		slots = new ItemStack[5];
	}

	public void setGuiDisplayName(String displayName) {
		this.customName = displayName;
	}
	
	@Override
	public int getSizeInventory() {
		return slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return slots[i];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if (slots[i] != null) {
			ItemStack itemstack = slots[i];
			slots[i] = null;
			return itemstack;
		}else{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		slots[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int i) {
		return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
	}


	

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this) {
			return false;
		}else{
			return player.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64;
		}
	}

	public void openInventory() {}
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return i == 2 ? false : (i == 1 ? hasItemPower(itemstack) : true);
	}
	
	public boolean hasItemPower(ItemStack itemstack) {
		return getItemPower(itemstack) > 0;
	}
	
	private static int getItemPower (ItemStack itemstack) {
		if (itemstack == null) {
			return 0;
		}else{
			Item item = itemstack.getItem();
			
			if (item == Main.fuelGel) return 50;
			
			return 0;
		}
	}
	
	public ItemStack decrStackSize(int i, int j) {
		if (slots[i] != null) {
			if (slots[i].stackSize <= j) {
				ItemStack itemstack = slots[i];
				slots[i] = null;
				return itemstack;
			}
			
			ItemStack itemstack1 = slots[i].splitStack(j);
			
			if (slots[i].stackSize == 0) {
				slots[i] = null;
			}
			
			return itemstack1;
		}else{
			return null;
		}
	}
	
	public void readFromNBT (NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		slots = new ItemStack[getSizeInventory()];
		
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound nbt1 = (NBTTagCompound)list.getCompoundTagAt(i);
			byte b0 = nbt1.getByte("Slot");
			
			if (b0 >= 0 && b0 < slots.length) {
				slots[b0] = ItemStack.loadItemStackFromNBT(nbt1);
			}
		}
		
		trioPower = nbt.getShort("PowerTime");
		trioCookTime = nbt.getShort("CookTime");
	}
	
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("PowerTime", (short)trioPower);
		nbt.setShort("CookTime", (short)trioCookTime);
		NBTTagList list = new NBTTagList();
		
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] != null) {
				NBTTagCompound nbt1 = new NBTTagCompound();
				nbt1.setByte("Slot", (byte)i);
				slots[i].writeToNBT(nbt1);
				list.appendTag(nbt1);
			}
		}
		
		nbt.setTag("Items", list);
	}
	

	@Override
	public String getInventoryName() {
		return "container.ingotMasher";
	}

	@Override
	public boolean canInsertItem(int var1, ItemStack itemstack, int var3) {
		return this.isItemValidForSlot(var1, itemstack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemstack, int j) {
		return j != 0 || i != 1 || itemstack.getItem() == Items.bucket;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.customName != null && this.customName.length() > 0;
	}
	
	public int getInfuserProgressScaled(int i) {
		return (trioCookTime * i) / this.infusingSpeed;
	}
	
	public int getPowerRemainingScaled(int i) {
		return (trioPower * i) / maxPower;
	}
	
	private boolean canInfuse() {
		
		if (slots[0] == null || slots[1] == null || slots[2] == null) {
			return false;
		}
		
		ItemStack itemstack = ArcCoreInfuserRecipes.getInfusingResult(slots[0].getItem(), slots[1].getItem(), slots[2].getItem());
		
		if (itemstack == null) {
			return false;
		}
		
		if (slots[4] == null) {
			return true;
		}
		
		if (!slots[4].isItemEqual(itemstack)) {
			return false;
		}
		
		if (slots[4].stackSize < getInventoryStackLimit() && slots[4].stackSize < slots[4].getMaxStackSize()) {
			return true;
		}else{
			return slots[4].stackSize < itemstack.getMaxStackSize();
		}
	}
	
	private void infuseItem() {
		if (canInfuse()) {
			ItemStack itemstack = ArcCoreInfuserRecipes.getInfusingResult(slots[0].getItem(), slots[1].getItem(), slots[2].getItem());
			
			if (slots[4] == null) {
				slots[4] = itemstack.copy();
			}else if (slots[4].isItemEqual(itemstack)) {
				slots[4].stackSize += itemstack.stackSize;
			}
			
			for (int i = 0; i < 3; i++) {
				if (slots[i].stackSize <= 0) {
					slots[i] = new ItemStack(slots[i].getItem().setFull3D());
				}else{
					slots[i].stackSize--;
				}
				
				if (slots[i].stackSize <= 0){
					slots[i] = null;
				}
			}
		}
	}
	
	
	
	public boolean hasPower() {
		return trioPower > 0;
	}
	
	public boolean isInfusing() {
		return this.trioCookTime > 0;
	}
	
	public void updateEntity() {
		boolean flag = this.hasPower();
		boolean flag1= false;
		
		if(hasPower() && this.isInfusing()) {
			this.trioPower--;
		}
		
		if(!worldObj.isRemote) {
			if (this.hasItemPower(this.slots[3]) && this.trioPower < (this.maxPower - this.getItemPower(this.slots[3]))) {
				this.trioPower += getItemPower(this.slots[3]);
				
				if(this.slots[3] != null) {
					flag1 = true;
					
					this.slots[3].stackSize--;
					
					if(this.slots[3].stackSize == 0) {
						this.slots[3] = this.slots[3].getItem().getContainerItem(this.slots[3]);
					}
				}
			}
			
			if (hasPower() && canInfuse()) {
				trioCookTime++;
				
				if (this.trioCookTime == this.infusingSpeed) {
					this.trioCookTime = 0;
					this.infuseItem();
					flag1 = true;
				}
			}else{
				trioCookTime = 0;
			}
			
			if (flag = this.isInfusing()) {
				flag1 = true;
				ArcCoreInfuser.updateBlockState(this.isInfusing(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		
		}
		
		if (flag1) {
			this.markDirty();
		}
		
		
    }
	
	
}