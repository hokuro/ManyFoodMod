package mod.mfm.tileentity;

import mod.mfm.block.BlockSaltPan;
import mod.mfm.block.BlockSaltPan.EnumSaltPanLevel;
import mod.mfm.core.ModCommon;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.inventory.ICnvertInventory;
import mod.mfm.item.ItemCore;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;

public class TileEntitySaltPan extends TileEntity implements ITickableTileEntity, ICnvertInventory {
	public static final String REGISTER_NAME = "tileentitysaltpan";
	private static final int BASE_TIME = ModCommon.isDebug?200:24000;
	public static final int SIZE_INVENTORY = 1;

	private int limitTime;
	private int cntTime;
	private NonNullList<ItemStack> inventory;

	private static final int[] slotsTop = new int[] {0};
	private static final int[] slotsBottom = new int[] {0};
	private static final int[] slotsSides = new int[] {0};

	net.minecraftforge.items.IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, Direction.UP);
	net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, Direction.DOWN);
	net.minecraftforge.items.IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, Direction.WEST);

	public TileEntitySaltPan(){
		super(Mod_ManyFoods.RegistryEvents.SALTPAN);
		inventory = NonNullList.<ItemStack>withSize(SIZE_INVENTORY, ItemStack.EMPTY);
		this.clear();
	}


	@Override
	public void read(CompoundNBT compound)
    {
		super.read(compound);
	    this.inventory = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
	    ItemStackHelper.loadAllItems(compound, this.inventory);

		limitTime = compound.getInt("LIMITTIME");
		cntTime = compound.getInt("CNTTIME");
    }

	@Override
    public CompoundNBT write(CompoundNBT compound)
    {
		super.write(compound);

		compound.putInt("LIMITTIME", limitTime);
		compound.putInt("CNTTIME", cntTime);

		ItemStackHelper.saveAllItems(compound, this.inventory);

		return compound;
    }

	@Override
	public void tick() {
		boolean flag1 = true;
		BlockState state = this.world.getBlockState(pos);
		if (!(state.getBlock() instanceof BlockSaltPan)){return;}
		int level = (int)state.getValues().get(BlockSaltPan.LEVEL);
        if (!this.world.isRemote)
        {
        	if (inventory.get(0).isEmpty()){
        		if ( level != EnumSaltPanLevel.EMPTY.getLevel()){
        			BlockSaltPan.setWaterLevel(this.world, pos, state, EnumSaltPanLevel.EMPTY);
        		}
        		// 空っぽの場合カウンタリセット
    			if (limitTime != 0){
    				limitTime = 0;
    				cntTime = 0;
    			}

        	}else if (!inventory.get(0).isEmpty()){
    			if (limitTime == 0){
    				// 何かが入れられた直後の場合大麻更新
    				limitTime = BASE_TIME + (ModCommon.isDebug?0:(Minecraft.getInstance().world.rand.nextInt(5)*1200));
    				cntTime = 0;
    			}
        		if (!inventory.get(0).isEmpty() && inventory.get(0).getItem() == Items.WATER_BUCKET){
    				// 水バケツの場合、インベントリの設定を水ブロックに変え、バケツを吐き出し、レベルを更新する
    				inventory.set(0,new ItemStack(Items.POTION));
    				InventoryHelper.spawnItemStack(this.world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), new ItemStack(Items.BUCKET));
    				cntTime = 0;
    				flag1 = true;
            	}else if (inventory.get(0).getItem() == Items.POTION){
    				// 水が入っている場合カウントアップ
    				cntTime ++;
            	}else{
            		return;
            	}
        		if (level != EnumSaltPanLevel.FILL.getLevel()){
    				BlockSaltPan.setWaterLevel(this.world, pos, state, EnumSaltPanLevel.FILL);
        		}
        	}

    		if (limitTime != 0 && limitTime <= cntTime){
    			// 塩ができた場合、インベントリの中身を塩6つに変え、レベルを更新する
    			inventory.set(0, new ItemStack(ItemCore.item_salt,6));
    			BlockSaltPan.setWaterLevel(this.world, this.pos, state, EnumSaltPanLevel.SATL);
    			limitTime = 0;
    			cntTime = 0;
    			flag1 = true;
    		}
        }else{
        	if (inventory.get(0).isEmpty()){
            	if (level == 0){
            		inventory.set(0, ItemStack.EMPTY);
            	}else if (level == 1){
            		inventory.set(0, new ItemStack(Items.POTION,0));
            	}else if (level == 2){
            		inventory.set(0, new ItemStack(ItemCore.item_salt,6));
            	}
        	}
        }

		if (flag1)
		{
			this.markDirty();
		}
	}

	@Override
	public int getSizeInventory() {
		return SIZE_INVENTORY;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		if (this.inventory.get(index).isEmpty()){
			return ItemStack.EMPTY;
		}
		return inventory.get(index);
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		 return ItemStackHelper.getAndSplit(inventory, index, count);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(inventory, index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		this.inventory.set(index,stack);
		if (stack.isEmpty()){
			boolean flag = stack.isItemEqual(this.inventory.get(index)) && ItemStack.areItemStackTagsEqual(stack, this.inventory.get(index));

			if (stack.getCount() > this.getInventoryStackLimit())
			{
				stack.setCount(this.getInventoryStackLimit());
			}

			if (index == 0 && !flag)
			{
				this.markDirty();
			}
		}

	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player) {
		return true;
	}

	@Override
	public void openInventory(PlayerEntity player) {
	}

	@Override
	public void closeInventory(PlayerEntity player) {
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
	}

	public int getField(int id) {
		int ret = 0;
		switch(id){
		case 0:
			ret = limitTime;
			break;
		case 1:
			ret = cntTime;
			break;
		}
		return ret;
	}

	public void setField(int id, int value) {
		switch(id){
		case 0:
			limitTime = value;
			break;
		case 1:
			cntTime = value;
			break;
		}
	}

	public int getFieldCount() {
		return 2;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.inventory.size(); ++i)
		{
			this.inventory.set(i, ItemStack.EMPTY);
		}
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return side == Direction.DOWN ? slotsBottom : (side == Direction.UP ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, Direction direction) {
		if (!inventory.get(0).isEmpty()){
			return false;
		}else if (itemStackIn.getItem() == Items.WATER_BUCKET){
			return true;
		}
		return false;
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, Direction direction) {
		if (direction == Direction.DOWN && index == 0)
		{
			Item item = stack.getItem();

			if (item == Items.BUCKET || item == ItemCore.item_salt){
				return true;
			}
		}
		return false;
	}

	@Override
    public boolean canRenderBreaking()
    {
       return false;
    }

	@Override
	public boolean isEmpty() {
		 boolean ret = true;
	        for(ItemStack st : this.inventory){
	        	if(!st.isEmpty()){
	        		ret = false;
	        		break;
	        	}
	        }
	        return ret;
	}

	net.minecraftforge.common.util.LazyOptional<? extends net.minecraftforge.items.IItemHandler>[] handlers =
			net.minecraftforge.items.wrapper.SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);

	@Override
	public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.Direction facing)
	{
		if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			if (facing == Direction.DOWN)
				return handlers[1].cast();
			else if (facing == Direction.UP)
				return handlers[0].cast();
			else
				return handlers[2].cast();
		return super.getCapability(capability, facing);
	}
}
