package mod.mfm.tileentity;

import mod.mfm.block.BlockFreezer;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.inventory.ContainerFreezer;
import mod.mfm.inventory.ICnvertInventory;
import mod.mfm.item.ItemIceCandy;
import mod.mfm.network.MessageHandler;
import mod.mfm.recipie.OriginalRecipie;
import mod.mfm.recipie.OriginalRecipie.ORIGINAL_RECIPIES;
import mod.mfm.util.ModUtil;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class TileEntityFreezer extends LockableTileEntity implements ITickableTileEntity, ICnvertInventory  {

	public static final int FLDIDX_TNKCNT = 1;
	public static final int FLDIDX_FUEL = 2;
	public static final int FLDIDX_INFT = 3;
	public static final int FLDIDX_ICE = 4;
	public static final int FLDIDX_FLZ = 5;
	public static final int FLDIDX_FLZ2 = 6;
	public static final int FLDIDX_FLZ3 = 7;
	public static final int FLDIDX_FLZ4 = 8;
	public static final int FLDIDX_FLZ5 = 9;
	public static final int FLDIDX_FLZ6 = 10;
	public static final int FLDIDX_FLZ7 = 11;
	public static final int FLDIDX_FLZ8 = 12;
	public static final int FLDIDX_FLZ9 = 13;
	public static final int FLDIDX_FLZ10 = 14;
	public static final int FLDIDX_FLZ11 = 15;
	public static final int FLDIDX_FLZ12 = 16;
	public static final int FLDIDX_FLZ13 = 17;
	public static final int FLDIDX_FLZ14 = 18;
	public static final int FLDIDX_FLZ15 = 19;
	public static final int FLDIDX_FLZ16 = 20;
	public static final int FLDIDX_FLZ17 = 21;
	public static final int FLDIDX_FLZ18 = 22;
	public static final int FLDIDX_FLZ19 = 23;
	public static final int FLDIDX_FLZ20 = 24;
	public static final int FLDIDX_FLZ21 = 25;
	public static final int FLDIDX_FLZ22 = 26;
	public static final int FLDIDX_FLZ23 = 27;
	public static final int FLDIDX_FLZ24 = 28;
	public static final int FLDIDX_FLZ25 = 29;
	public static final int FLDIDX_FLZ26 = 30;
	public static final int FLDIDX_FLZ27 = 31;
	public static final int INV_FUEL = 54;
	public static final int ICE_IN = 55;
	public static final int ICE_OUT = 56;
	public static final int OUT_BUKET=57;

	public static final String REGISTER_NAME = "tileentityfreezer";
	public static final int FREEZING_TIME_MAX = 1200;
	public static final int FREEZING_FULE_TIME = 168000;	// 1200秒(1日) * 20tic * 1週刊
	public static final int TANK_MAX = 256;
	public static final int OUTPUTMAX = 55;

	public static final int SIZE_INVENTORY = 58;
	// 0~26:IN
	// 27~53:OUT
	// 54:FUEL
	// 55:ICE_IN
	// 56:ICE_OUT
	// 57:Buket_OUT
	private NonNullList<ItemStack> inventory;
	// 0~26:IN Timer
	private int[] timerCnt = new int[27];
	private int timerFule;
	private int timerIce;
	private boolean isInfinit;
	private int tankCnt;

	private String freezerCustomName;
	private boolean isOpen;
	private boolean canSounds;
	public float prevLidAngle;
	public float lidAngle;

	private static final ItemStack return_potion = new ItemStack(Items.GLASS_BOTTLE,1);
	private static final ItemStack return_buket = new ItemStack(Items.BUCKET,1);


	private static final int[] slotsTop = new int[]    { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,55};
	private static final int[] slotsBottom = new int[] {27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,56};
	private static final int[] slotsSides = new int[] {INV_FUEL};
	private int xflag = 0;

	public TileEntityFreezer(){
		super(Mod_ManyFoods.RegistryEvents.FREEZER);

		inventory = NonNullList.<ItemStack>withSize(SIZE_INVENTORY, ItemStack.EMPTY);
		isOpen = false;
		canSounds = false;
		isInfinit = false;
		timerFule = 0;
		timerIce = 0;
		tankCnt = 0;
		lidAngle = 0.0F;
		xflag = 0;
		this.clear();
	}

//	public Direction getFace(){
//		return this.facing;
//	}

	public int getFreezingTime(int idx){
		return this.timerCnt[idx];
	}

	public int getIcingTime(){
		return this.timerIce;
	}

	public int getTankCnt(){
		return this.tankCnt;
	}

	public int getFuel(){
		return this.timerFule;
	}

	public boolean IsInfinitFuel(){
		return this.isInfinit;
	}

	public boolean InjectionTank(){
		boolean ret = false;
		if (this.tankCnt< TANK_MAX){
			this.tankCnt++;
			ret = true;
		}
		return ret;
	}

	@Override
	public void read(CompoundNBT compound)
	{
		super.read(compound);

		// インベントリ
	    this.inventory = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
	    ItemStackHelper.loadAllItems(compound, this.inventory);

		for (int i = 0; i < timerCnt.length; i++){
			this.timerCnt[i] = compound.getInt("FreezeTime"+Integer.toString(i));
		}

		// 燃料残量
		timerFule = compound.getInt("TimerFule");
		// 製氷皿の時間
		timerIce = compound.getInt("TimerIce");
		// タンク容量の読み込み
		tankCnt = compound.getInt("TankCount");

		// 燃料が氷塊で、残燃料がない場合無限燃料
		if (timerFule == 0 && (ModUtil.compareItemStacks(this.inventory.get(INV_FUEL), new ItemStack(Blocks.PACKED_ICE)) || ModUtil.compareItemStacks(this.inventory.get(INV_FUEL), new ItemStack(Blocks.BLUE_ICE)))){
			isInfinit = true;
		}else{
			isInfinit = false;
		}

		if (compound.contains("CustomName"))
		{
			this.freezerCustomName = compound.getString("CustomName");
		}
	}

	@Override
	public CompoundNBT write(CompoundNBT compound)
	{
		super.write(compound);

		compound.putInt("TimerFule", timerFule);
		compound.putInt("TimerIce", timerIce);
		compound.putInt("TankCount", tankCnt);

		for (int i = 0; i < timerCnt.length; i++){
			compound.putInt("FreezeTime"+Integer.toString(i),this.timerCnt[i]);
		}

		ItemStackHelper.saveAllItems(compound,this.inventory);
		if (this.hasCustomName())
		{
			compound.putString("CustomName", this.freezerCustomName);
		}
		return compound;
	}


	@Override
	public void tick()
	{
		boolean flag1 = false;
		if (!this.world.isRemote){

			if (this.xflag > 0){
				this.tankCnt++;
			}else if(this.xflag < 0){
				this.tankCnt--;
			}
			if (ModUtil.compareItemStacks(this.inventory.get(INV_FUEL), new ItemStack(Blocks.ICE)) && this.timerFule == 0){
				this.inventory.get(INV_FUEL).shrink(1);
				if (this.inventory.get(INV_FUEL).getCount() <= 0){this.inventory.set(INV_FUEL, ItemStack.EMPTY);}
				this.timerFule = FREEZING_FULE_TIME;
				flag1 = true;
				this.isInfinit = false;
			}else if ((ModUtil.compareItemStacks(this.inventory.get(INV_FUEL), new ItemStack(Blocks.PACKED_ICE)) ||
					ModUtil.compareItemStacks(this.inventory.get(INV_FUEL), new ItemStack(Blocks.BLUE_ICE))) && this.timerFule == 0){
				this.isInfinit = true;
			}else if (this.timerFule == 0){
				this.isInfinit = false;
			}

			if (ModUtil.compareItemStacks(this.inventory.get(ICE_IN), new ItemStack(Items.WATER_BUCKET)) &&
					this.tankCnt < TANK_MAX){
				// タンクに余裕があり、水バケツが吸水皿に設定されている場合
				// タンクに水を移し、水バケツを空バケツに変える
				this.tankCnt++;
				this.inventory.set(ICE_IN, new ItemStack(Items.BUCKET));
				flag1 = true;
			}

			if (ModUtil.compareItemStacks(this.inventory.get(ICE_OUT), new ItemStack(Items.BUCKET)) &&
					this.tankCnt != 0){
				// タンクが空ではなく、製氷皿に空バケツが設定されている場合
				// タンクの水を移し、空バケツを水バケツに変える
				if (inventory.get(OUT_BUKET).isEmpty()){
					this.tankCnt--;
					this.inventory.set(OUT_BUKET, new ItemStack(Items.WATER_BUCKET));
					this.inventory.get(ICE_OUT).shrink(1);
					if (this.inventory.get(ICE_OUT).getCount() <= 0){
						this.inventory.set(ICE_OUT, ItemStack.EMPTY);
					}
					if (this.tankCnt == 0){
						// タンクが空になったら製氷タイマーをリセット
						this.timerIce = 0;
					}
					flag1 = true;
				}
			}

			if (this.timerFule != 0 || isInfinit){
				for (int i = 0; i < timerCnt.length; i++){
					// 冷凍庫
					// アイテムが入っていれば冷凍カウントアップ
					if (!inventory.get(i).isEmpty()){
						// カウント進行
						if (timerCnt[i] < FREEZING_TIME_MAX){
							timerCnt[i]++;
						}else{
							timerCnt[i] = FREEZING_TIME_MAX;
						}

						// 冷凍完了
						if (timerCnt[i] >= FREEZING_TIME_MAX){
							// 完成品
							ItemStack result = OriginalRecipie.Instance().getResultItem(ORIGINAL_RECIPIES.RECIPIE_FREEZING, inventory.get(i));
							// 副産物
							ItemStack subResult = ItemStack.EMPTY;
							if (result.getItem() instanceof ItemIceCandy){
								subResult = return_potion;
							}else if (result.getItem() == Item.getItemFromBlock(Blocks.ICE)){
								subResult = return_buket;
							}

							// 完成品と副産物を入れるスロットを探す
							int mi = -1;
							int si = -1;
							for (int j = timerCnt.length; j < OUTPUTMAX; j++){
								if (ModUtil.compareItemStacks(inventory.get(j), result)){
									if ((mi < 0 || (mi >= 0&& inventory.get(mi).isEmpty())) && inventory.get(j).getCount() < result.getMaxStackSize()){
										mi = j;
									}
								}else if (inventory.get(j).isEmpty() && mi < 0){
									mi = j;
								}else if (!subResult.isEmpty()){
									if (ModUtil.compareItemStacks(inventory.get(j), subResult)){
										if ((si < 0 || (si >= 0&& inventory.get(si).isEmpty())) && inventory.get(j).getCount() < result.getMaxStackSize()){
											si = j;
										}
									}else if (inventory.get(j).isEmpty() && si < 0){
										si = j;
									}
								}
							}

							if (mi >= 0 && (subResult.isEmpty() || (!subResult.isEmpty() && si >=0))){
								// 完成品のアウトプット
								if (inventory.get(mi).isEmpty()){
									inventory.set(mi, result);
									inventory.get(mi).setCount(1);;
								}else{
									inventory.get(mi).grow(1);
								}

								// 副産物があればアウトプット
								if (!subResult.isEmpty()){
									if (inventory.get(si).isEmpty()){
										inventory.set(si, subResult.copy());
										inventory.get(si).setCount(1);
									}else{
										inventory.get(si).grow(1);
									}
								}

								// ソースを減量
								inventory.get(i).shrink(1);
								if (inventory.get(i).getCount() <= 0){
									inventory.set(i, ItemStack.EMPTY);
								}

								// タイマーを巻き戻す
								timerCnt[i] = 0;

								flag1 = true;
							}else{
								// 出力する場所が足りない場合、タイマカウントを止める
								timerCnt[i] = FREEZING_TIME_MAX;
							}
						}
					}else{
						timerCnt[i] = 0;
					}
				}
				// 製氷皿
				// アイテムが入っていれば冷凍カウントアップ
				if (this.tankCnt > 0){
					// 冷凍完了
					if (this.timerIce < FREEZING_TIME_MAX){
						this.timerIce ++;
					}else{
						this.timerIce = FREEZING_TIME_MAX;
					}
					if (timerIce >= FREEZING_TIME_MAX){
						if (this.inventory.get(ICE_OUT).isEmpty()){
							// 製氷皿が空なら
							// 氷を出力してタンク容量をマイナスし、タイマーをリセット
							this.inventory.set(ICE_OUT, new ItemStack(Blocks.ICE));
							this.tankCnt--;
							this.timerIce = 0;
						}else if(ModUtil.compareItemStacks(this.inventory.get(ICE_OUT), new ItemStack(Blocks.ICE)) && this.inventory.get(ICE_OUT).getCount() < 64){
							// 製氷皿にあるのが氷なら
							// 氷を増量してタンク容量をマイナスし、タイマーをリセット
							this.inventory.get(ICE_OUT).grow(1);;
							this.tankCnt--;
							this.timerIce = 0;
						}else{
							// 製氷皿がいっぱい、もしくは水バケツが置いてあるなら
							// タイマーはマックスを保つ
							this.timerIce = FREEZING_TIME_MAX;
						}
						flag1 = true;
					}
				}else{
					// 水がないならリセット
					timerIce = 0;
					tankCnt = 0;
				}
				// 変更がある場合クライアントにメッセージを送る
				MessageHandler.Send_MessageFreezer(timerCnt, timerFule, timerIce, tankCnt, isInfinit, pos);
			}else{
				// 燃料が入っていない場合、冷凍カウントダウン
				for (int i = 0; i < timerCnt.length; i++){
					if (!inventory.get(i).isEmpty()){
						if (timerCnt[i] > 0){
							timerCnt[i]--;
						}else{
							timerCnt[i] = 0;
						}
					}else{
						timerCnt[i] = 0;
					}
				}
				if (this.tankCnt > 0){
					if (this.timerIce > 0){
						this.timerIce --;
					}else{
						this.timerIce = 0;
					}
				}else{
					this.timerIce = 0;
				}
			}
			// 燃料減少
			if (this.timerFule > 0){
				this.timerFule--;
			}else{
				this.timerFule = 0;
			}
		}else{
			if (this.timerFule != 0 || isInfinit){
                double d3 = (double)pos.getX() + world.rand.nextDouble() * 0.10000000149011612D;
                double d8 = (double)pos.getY() + world.rand.nextDouble();
                double d13 = (double)pos.getZ() + world.rand.nextDouble();
				world.addParticle(ParticleTypes.ITEM_SNOWBALL, d3, d8, d13, 0.0D, 0.0D, 0.0D);
			}
		}

		if (flag1)
		{
			this.markDirty();
		}

		// モデル変形
		this.prevLidAngle = this.lidAngle;
		float f1 = 0.1F;
		if (isOpen){
			if (this.lidAngle < 1.0F){
				if (this.canSounds){
					this.world.playSound((PlayerEntity)null, pos.getX(), (double)pos.getY() + 0.5D, pos.getZ(), SoundEvents.BLOCK_CHEST_LOCKED, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
					this.canSounds = false;
				}
				this.lidAngle += f1;
			}else if (this.lidAngle > 1.0F){
				this.lidAngle = 1.0F;
			}
		}else{
			if (this.lidAngle > 0.0F){
				if (this.canSounds){
					this.world.playSound((PlayerEntity)null, pos.getX(), (double)pos.getY() + 0.5D, pos.getZ(), SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
					this.canSounds = false;
				}
				this.lidAngle -= f1;
			}else if(this.lidAngle < 0){
				this.lidAngle = 0;
			}
		}
	}


	@Override
	public ITextComponent getName() {
		return new TranslationTextComponent("container.freezer");
	}

	@Override
	public boolean hasCustomName() {
		return this.freezerCustomName != null && !this.freezerCustomName.isEmpty();
	}

	@Override
	public Container createMenu(int id, PlayerInventory player) {
		 return new ContainerFreezer(player, this, id);
	}

//	@Override
//	public String getGuiID() {
//		return ModCommon.MOD_ID + ":" + ModCommon.MOD_GUI_FREEZER_NAME;
//	}

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

			if (index < this.timerCnt.length && !flag)
			{
				this.timerCnt[index] = 0;
				this.markDirty();
			}
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
    public void openInventory(PlayerEntity player)
    {
        if (!player.isSpectator())
        {
        	isOpen=true;
        	canSounds = true;
        }
    }

	@Override
    public void closeInventory(PlayerEntity player)
    {
        if (!player.isSpectator() && this.getBlockState().getBlock() instanceof BlockFreezer)
        {
        	isOpen = false;
        	canSounds = true;
        }
    }

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if (index < 27){
			if (stack.getItem() == Items.WATER_BUCKET || stack.getItem() == Items.BUCKET){
				return false;
			}
			return OriginalRecipie.Instance().canConvert(ORIGINAL_RECIPIES.RECIPIE_FREEZING, stack);
		}else if (index == ICE_IN && stack.getItem() == Items.WATER_BUCKET){
			return true;
		}else if (index == ICE_OUT && stack.getItem() == Items.BUCKET){
			return true;
		}
		return false;
	}

	public int getField(int id) {
		switch(id){
		case 0:
			return ModUtil.BooleanToInteger(isOpen);
		case FLDIDX_TNKCNT:
			return this.tankCnt;
		case FLDIDX_FUEL:
			return this.timerFule;
		case FLDIDX_INFT:
			return ModUtil.BooleanToInteger(this.isInfinit);
		case FLDIDX_ICE:
			return this.timerIce;
		case FLDIDX_FLZ:
		case FLDIDX_FLZ2:
		case FLDIDX_FLZ3:
		case FLDIDX_FLZ4:
		case FLDIDX_FLZ5:
		case FLDIDX_FLZ6:
		case FLDIDX_FLZ7:
		case FLDIDX_FLZ8:
		case FLDIDX_FLZ9:
		case FLDIDX_FLZ10:
		case FLDIDX_FLZ11:
		case FLDIDX_FLZ12:
		case FLDIDX_FLZ13:
		case FLDIDX_FLZ14:
		case FLDIDX_FLZ15:
		case FLDIDX_FLZ16:
		case FLDIDX_FLZ17:
		case FLDIDX_FLZ18:
		case FLDIDX_FLZ19:
		case FLDIDX_FLZ20:
		case FLDIDX_FLZ21:
		case FLDIDX_FLZ22:
		case FLDIDX_FLZ23:
		case FLDIDX_FLZ24:
		case FLDIDX_FLZ25:
		case FLDIDX_FLZ26:
		case FLDIDX_FLZ27:
			if (id < FLDIDX_FLZ || id > FLDIDX_FLZ27){
				return 0;
			}
			return this.timerCnt[id-FLDIDX_FLZ];
		}
		return 0;
	}

	public void setField(int id, int value) {
		switch(id){
		case 0:
			isOpen =  ModUtil.IntegerToBoolean(value);
		case FLDIDX_TNKCNT:
			this.tankCnt = value;
			break;
		case FLDIDX_FUEL:
			this.timerFule = value;
			break;
		case FLDIDX_INFT:
			this.isInfinit = ModUtil.IntegerToBoolean(value);
			break;
		case FLDIDX_ICE:
			this.timerIce = value;
			break;
		case FLDIDX_FLZ:
		case FLDIDX_FLZ2:
		case FLDIDX_FLZ3:
		case FLDIDX_FLZ4:
		case FLDIDX_FLZ5:
		case FLDIDX_FLZ6:
		case FLDIDX_FLZ7:
		case FLDIDX_FLZ8:
		case FLDIDX_FLZ9:
		case FLDIDX_FLZ10:
		case FLDIDX_FLZ11:
		case FLDIDX_FLZ12:
		case FLDIDX_FLZ13:
		case FLDIDX_FLZ14:
		case FLDIDX_FLZ15:
		case FLDIDX_FLZ16:
		case FLDIDX_FLZ17:
		case FLDIDX_FLZ18:
		case FLDIDX_FLZ19:
		case FLDIDX_FLZ20:
		case FLDIDX_FLZ21:
		case FLDIDX_FLZ22:
		case FLDIDX_FLZ23:
		case FLDIDX_FLZ24:
		case FLDIDX_FLZ25:
		case FLDIDX_FLZ26:
		case FLDIDX_FLZ27:
			if (id < FLDIDX_FLZ || id > FLDIDX_FLZ27){
			}else{
				this.timerCnt[id-FLDIDX_FLZ] = value;
			}
			break;
		case 32:
			xflag = value;
			break;
		}

	}

	public int getFieldCount() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.inventory.size(); ++i)
		{
			this.inventory.set(i, ItemStack.EMPTY);
		}
	}

	public void setCustomInventoryName(String displayName) {
		this.freezerCustomName = displayName;

	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return side == Direction.DOWN ? slotsBottom : (side == Direction.UP ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, Direction direction) {
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, Direction direction) {
		if (direction == Direction.DOWN ){
			if (index == ICE_IN && (stack.getItem() == Items.WATER_BUCKET)){
				return false;
			}else if (index > 26)
			{
				return true;
			}
		}

		return false;
	}

	@Override
    public boolean canRenderBreaking()
    {
        return true;
    }

	@Override
	public boolean isEmpty() {
		boolean ret = true;
		for (ItemStack st: this.inventory){
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
	public SUpdateTileEntityPacket getUpdatePacket()
    {
        CompoundNBT CompoundNBT = new CompoundNBT();
        return new SUpdateTileEntityPacket(this.pos, 1,  this.write(CompoundNBT));
    }

	@Override
	public ITextComponent getCustomName() {
		// TODO 自動生成されたメソッド・スタブ
		return this.getName();
	}

	@Override
	protected ITextComponent getDefaultName() {
		return this.getName();
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
