package mod.mfm.inventory;

import java.util.List;

import com.google.common.collect.Lists;

import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.item.ItemCore;
import mod.mfm.recipie.OriginalRecipie;
import mod.mfm.recipie.OriginalRecipie.ORIGINAL_RECIPIES;
import mod.mfm.tileentity.TileEntityIceCrasher;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ContainerIceCrasher extends Container {
	private TileEntityIceCrasher tile;
	public int crushTime;
	private final List<IContainerListener> mylisteners = Lists.newArrayList();

	public ContainerIceCrasher(PlayerInventory playerInv, IInventory ent, int wid) {
		super(Mod_ManyFoods.CONTAINER_ICECRASHER, wid);
		this.tile = (TileEntityIceCrasher)ent;
		this.addSlot(new SlotInOut(tile, 0, 56, 17,true, ORIGINAL_RECIPIES.RECIPIE_CRASHING));
		this.addSlot(new SlotInOut(tile, 1, 56, 53,new ItemStack[]{new ItemStack(ItemCore.item_icefoodbowl)}));
        this.addSlot(new SlotInOut(tile, 2, 116, 35,false, ORIGINAL_RECIPIES.RECIPIE_CRASHING));

		for (int i = 0; i < 3; ++i)
		{
			for (int j = 0; j < 9; ++j)
			{
				this.addSlot(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}

		for (int k = 0; k < 9; ++k)
		{
			this.addSlot(new Slot(playerInv, k, 8 + k * 18, 142));
		}
	}


	@Override
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		for (int i = 0; i < this.mylisteners.size(); ++i){
			IContainerListener icrafting = (IContainerListener)this.mylisteners.get(i);
			if ( this.crushTime != this.tile.getField(0)){
				icrafting.sendWindowProperty(this, 2, this.tile.getField(0));
			}
		}
		this.crushTime = this.tile.getField(0);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return this.tile.isUsableByPlayer(playerIn);
	}


	public void addListener(IContainerListener listener)
	{
		super.addListener(listener);
		if (!this.mylisteners.contains(listener)) {
			this.mylisteners.add(listener);
		}
		//listener.sendAllWindowProperties(this, this.tile);
		for(int i = 0; i < tile.getFieldCount(); ++i) {
			listener.sendWindowProperty(this, i, tile.getField(i));
		}
	}

	@Override
	public void removeListener(IContainerListener listener) {
		super.removeListener(listener);
		this.mylisteners.remove(listener);
	}

	@OnlyIn(Dist.CLIENT)
	public void updateProgressBar(int id, int data)
	{
		this.tile.setField(id, data);
	}

	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index)
	{
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (OriginalRecipie.Instance().canConvert(ORIGINAL_RECIPIES.RECIPIE_CRASHING, itemstack))
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if ((itemstack.getItem() == ItemCore.item_icefoodbowl))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.getCount() == 0)
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
	}


	public int getField(int i) {
		// TODO 自動生成されたメソッド・スタブ
		return tile.getField(i);
	}
}
