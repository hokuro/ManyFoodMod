package mod.mfm.gui;

import java.util.ArrayList;
import java.util.List;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.inventory.ContainerFreezer;
import mod.mfm.tileentity.TileEntityFreezer;
import mod.mfm.util.ModUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GuiFreezer  extends ContainerScreen<ContainerFreezer> {
    private static final ResourceLocation tex = new ResourceLocation("mfm:textures/gui/container/freezer.png");
    private ContainerFreezer tileFreezer;

	public GuiFreezer(ContainerFreezer container, PlayerInventory playerInv, ITextComponent title) {
		super(container,playerInv,title);
        this.tileFreezer = container;
        int i = 222;
        int j = i - 108;
        this.xSize = 211;
        this.ySize = 222;
	}

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = this.getTitle().getFormattedText();
        this.font.drawString(s, this.xSize / 2 - this.font.getStringWidth(s) / 2, 6, 4210752);

        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        if ((mouseX > (x + 22) && mouseX < (x + 22 + 7)) &&
        		(mouseY > (y + 73) && mouseY < (y + 73 + 42))){
        	drawToolTip(tileFreezer,mouseX-x,mouseY);
        }
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks){
    	super.render(mouseX, mouseY, partialTicks);


    	GlStateManager.pushMatrix();
    	GlStateManager.disableDepthTest();
        GlStateManager.color4f(5.0F, 5.0F, 5.0F, 1.0F);
        Minecraft.getInstance().getTextureManager().bindTexture(tex);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;


        // タンク容量
        int tankCnt = tileFreezer.getField(TileEntityFreezer.FLDIDX_TNKCNT);
        int iceTimer = tileFreezer.getField(TileEntityFreezer.FLDIDX_ICE);
        int fuel = tileFreezer.getField(TileEntityFreezer.FLDIDX_FUEL);
        boolean infinit = ModUtil.IntegerToBoolean(tileFreezer.getField(TileEntityFreezer.FLDIDX_INFT));

        // 冷凍室バー
		for (int i = 0; i < 3; ++i){
			for ( int j = 0; j < 9; j++){
				this.blit(x + 44 + j * 18, y + 18 + i * 18, 212, 0, 18, 18);
				int par = tileFreezer.getFreezingTime(j+i*9) * 18 / TileEntityFreezer.FREEZING_TIME_MAX;
				this.blit(x + 44 + j * 18, y + 18 + i * 18, 212, 18, par, 18);
			}
		}

		// 燃料バー
		this.blit(x + 17, y + 18, 212, 0, 18, 18);
		int par = infinit?18:18 * fuel/TileEntityFreezer.FREEZING_FULE_TIME;
		this.blit(x + 17, y + 18, 212, 18, par, 18);

		// 製氷室バー
		this.blit(x + 17, y + 44 + 18 * 4, 212, 0, 18, 18);
		this.blit(x + 17, y + 44 + 18 * 4, 212, 18, 18 * iceTimer/TileEntityFreezer.FREEZING_TIME_MAX, 18);

		// タンク
		this.blit(x + 22, y + 73, 212, 37, 7, (int)(42 * (1.0D-((double)tankCnt/TileEntityFreezer.TANK_MAX))));
    	GlStateManager.enableDepthTest();
    	GlStateManager.popMatrix();
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getInstance().getTextureManager().bindTexture(tex);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(i, j, 0, 0, this.xSize, this.ySize);
	}

    protected void drawToolTip(ContainerFreezer container, int x, int y)
    {
    	int tankCnt = container.getField(TileEntityFreezer.FLDIDX_TNKCNT);
    	List<String> list = new ArrayList<String>();
    	list.add(Integer.toString(tankCnt) + "/" + Integer.toString(TileEntityFreezer.TANK_MAX));
    	this.renderTooltip(list, x, y, Minecraft.getInstance().fontRenderer);
    }
}
