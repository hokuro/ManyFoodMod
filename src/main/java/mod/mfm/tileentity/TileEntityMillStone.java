package mod.mfm.tileentity;

import java.util.Random;

import mod.mfm.config.ConfigValue;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.inventory.ContainerMillStone;
import mod.mfm.inventory.ICnvertInventory;
import mod.mfm.network.MessageHandler;
import mod.mfm.recipie.OriginalRecipie;
import mod.mfm.recipie.OriginalRecipie.ORIGINAL_RECIPIES;
import mod.mfm.sounds.SoundManager;
import mod.mfm.util.ModUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.util.LazyOptional;

public class TileEntityMillStone extends LockableTileEntity implements ITickableTileEntity, ICnvertInventory {
	public static final String REGISTER_NAME = "tileentitymillstone";
	public static final int MILL_TIME_MAX = 300;
	public static final int MILL_SIZE = 1;
	public static final int SIZE_INVENTORY = 2;
	private NonNullList<ItemStack> inventory;
	private String customName;
	private boolean isRun;
	private int millTime;
	private Random random = new Random();
	private float voluem = 0.4F;
	private float pitch = 1.0F;
	private int musecount = 0;

	private static final int[] slotsTop = new int[] {0};
	private static final int[] slotsBottom = new int[] {1};
	private static final int[] slotsSides = new int[] {0};

	public TileEntityMillStone(){
		super(Mod_ManyFoods.RegistryEvents.MILLSTONE);
		inventory = NonNullList.<ItemStack>withSize(SIZE_INVENTORY, ItemStack.EMPTY);
		isRun = false;
		millTime = 0;
		this.canRenderBreaking();
		this.clear();
	}



	@Override
	public void read(CompoundNBT compound)
	{
		super.read(compound);
	    this.inventory = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
	    ItemStackHelper.loadAllItems(compound, this.inventory);

		this.millTime = compound.getInt("CrushTime");
		this.isRun = compound.getBoolean("isrun");

		if (compound.contains("CustomName"))
		{
			this.customName = compound.getString("CustomName");
		}
	}

	@Override
	public CompoundNBT write(CompoundNBT compound)
	{
		super.write(compound);
		compound.putInt("CrushTime", this.millTime);
		compound.putBoolean("isrun", this.isRun);
		ItemStackHelper.saveAllItems(compound, this.inventory);

		if (this.hasCustomName())
		{
			compound.putString("CustomName", this.customName);
		}
		return compound;
	}

	public boolean isRunning()
	{
		return isRun;
	}

	@Override
	public void tick()
	{
		boolean flag = this.isRun;
		boolean flag1 = false;
		if (!this.world.isRemote){
			if (this.isRun){
				// かきかきちゅう
				if (canOutput()){
					millTime++;
				}else{
					// 変換不可のアイテムまたは空っぽ
					this.isRun = false;
					flag1 = true;
				}
			}else{
				// とまってる
				if (canOutput()){
					this.isRun=true;
					flag1 = true;
				}
			}
			if (this.millTime > MILL_TIME_MAX){
				// かんせい
				if (this.inventory.get(1).isEmpty()){
					this.inventory.set(1,OriginalRecipie.Instance().getResultItem(ORIGINAL_RECIPIES.RECIPIE_MILLING, this.inventory.get(0)));
					this.inventory.get(1).setCount( MILL_SIZE);
				}else{
					this.inventory.get(1).grow(MILL_SIZE);
				}
				this.inventory.get(0).shrink(1);
				if (this.inventory.get(0).getCount() <= 0){
					this.inventory.set(0, ItemStack.EMPTY);
				}
				this.millTime = 0;
				flag1 = true;
			}

			if (flag != this.isRun ){
				MessageHandler.Send_MessageMillStoneUpdate(millTime, isRun, pos);
			}
		}else{
			if (this.isRun ){
				this.millTime++;
	            if (ConfigValue.mill.SoundOn() &&(musecount > 30 + random.nextInt(30)))
	            {
	            	world.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundManager.sound_mill, SoundCategory.BLOCKS, this.voluem + random.nextFloat() * 0.07F, this.pitch, false);
	            	musecount = 0;
	            }else{
	            	musecount++;
	            }
			}else{
				this.millTime = 0;
				musecount = 0;
			}
			if (this.millTime > MILL_TIME_MAX){
				this.millTime = 0;
			}
		}

		if (flag1)
		{
			this.markDirty();
		}
	}

	public int[] getSlotsForFace(Direction side)
	{
		return side == Direction.DOWN ? slotsBottom : (side == Direction.UP ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, Direction direction)
	{
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, Direction direction)
	{
		if (direction == Direction.DOWN && index == 1)
		{
			return true;
		}

		return false;
	}

	net.minecraftforge.items.IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.Direction.UP);
	net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.Direction.DOWN);
	net.minecraftforge.items.IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.Direction.WEST);

	@SuppressWarnings("unchecked")
	@Override
	public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.Direction facing)
	{
		if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			if (facing == Direction.DOWN)
				return (LazyOptional<T>) handlerBottom;
			else if (facing == Direction.UP)
				return (LazyOptional<T>) handlerTop;
			else
				return (LazyOptional<T>) handlerSide;
		return super.getCapability(capability, facing);
	}

	@Override
	public int getSizeInventory() {
		return SIZE_INVENTORY;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return this.inventory.get(index);
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
		this.inventory.set(index, stack);
		if (!stack.isEmpty()){
			boolean flag = stack.isItemEqual(this.inventory.get(index)) && ItemStack.areItemStackTagsEqual(stack, this.inventory.get(index));

			if (stack.getCount() > this.getInventoryStackLimit())
			{
				stack.setCount(this.getInventoryStackLimit());
			}
		}else{
			this.millTime = 0;
			this.markDirty();
		}
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUsableByPlayer(PlayerEntity player) {
		return true;

	}

	@Override
	public void openInventory(PlayerEntity player) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void closeInventory(PlayerEntity player) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if (index == 1)
		{
			return false;
		}
		return OriginalRecipie.Instance().canConvert(ORIGINAL_RECIPIES.RECIPIE_MILLING, stack);
	}

	public int getField(int id) {
		switch (id)
		{
			case 0:
				return this.millTime;
			case 1:
				return this.isRun?1:0;
			case 3:
				return inventory.get(1).isEmpty()?0:inventory.get(1).getCount();
			default:
				return 0;
		}
	}

	public void setField(int id, int value) {
		switch (id)
		{
			case 0:
				this.millTime = value;
				break;
			case 1:
				this.isRun = value==0?false:true;
		}
	}

	public int getFieldCount() {
		 return 2;
	}

	@Override
	public void clear()
	{
		for (int i = 0; i < this.inventory.size(); ++i)
		{
			this.inventory.set(i,ItemStack.EMPTY);
		}
	}

	@Override
	public ITextComponent getName() {
		return  new TranslationTextComponent("container.millstone");
	}

	@Override
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.isEmpty();
	}

	@Override
	protected Container createMenu(int id, PlayerInventory playerInv){
		 return new ContainerMillStone(playerInv, this, id);
	}

	public void setCustomInventoryName(String displayName) {
		this.customName = displayName;
	}

	public boolean canOutput(){
		return OriginalRecipie.Instance().canConvert(ORIGINAL_RECIPIES.RECIPIE_MILLING, this.inventory.get(0)) &&
				(inventory.get(1).isEmpty() || ((!inventory.get(1).isEmpty()) && inventory.get(1).getCount() <= (this.getInventoryStackLimit()-MILL_SIZE))) &&
				(inventory.get(1).isEmpty() || ((!inventory.get(1).isEmpty()) && ModUtil.compareItemStacks(inventory.get(1), OriginalRecipie.Instance().getResultItem(ORIGINAL_RECIPIES.RECIPIE_MILLING, this.inventory.get(0)))));
	}

	@Override
	public SUpdateTileEntityPacket getUpdatePacket()
    {
        CompoundNBT CompoundNBT = new CompoundNBT();
        return new SUpdateTileEntityPacket(this.pos, 1,  this.write(CompoundNBT));
    }

	@Override
    public void onDataPacket(net.minecraft.network.NetworkManager net, SUpdateTileEntityPacket pkt)
    {
		this.read(pkt.getNbtCompound());
    }

	@Override
    public boolean canRenderBreaking()
    {
        return true;
    }

	@Override
	public boolean isEmpty() {
		boolean ret = true;
		for(ItemStack st : this.inventory){
			if (!st.isEmpty()){
				ret = false;
				break;
			}
		}
		return ret;
	}

	@Override
    public CompoundNBT getUpdateTag()
    {
        CompoundNBT cp = super.getUpdateTag();
        return this.write(cp);
    }

	@Override
    public void handleUpdateTag(CompoundNBT tag)
    {
		super.handleUpdateTag(tag);
		this.read(tag);
    }

	@Override
	public ITextComponent getCustomName() {
		// TODO 自動生成されたメソッド・スタブ
		return this.getName();
	}



	@Override
	protected ITextComponent getDefaultName() {
		// TODO 自動生成されたメソッド・スタブ
		return this.getName();
	}
}
