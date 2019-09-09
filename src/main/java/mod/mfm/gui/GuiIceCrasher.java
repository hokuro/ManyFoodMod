package mod.mfm.gui;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.inventory.ContainerIceCrasher;
import mod.mfm.tileentity.TileEntityIceCrasher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GuiIceCrasher extends ContainerScreen<ContainerIceCrasher> {
    private static final ResourceLocation tex = new ResourceLocation("drf:textures/gui/container/icecrasher.png");
    private  PlayerInventory playerInventory;
    private  ContainerIceCrasher tileFlapeMaker;

	public GuiIceCrasher(ContainerIceCrasher container, PlayerInventory playerInv, ITextComponent title) {
		super(container,playerInv,title);
        this.playerInventory = playerInv;
        this.tileFlapeMaker = container;
	}

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        String s = this.getTitle().getFormattedText();
        this.font.drawString(s, this.xSize / 2 - this.font.getStringWidth(s) / 2, 6, 4210752);
        this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getInstance().getTextureManager().bindTexture(tex);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.blit(i, j, 0, 0, this.xSize, this.ySize);

        int l = this.getCrushProgressScaled(16);
        this.blit(i + 54, j + 35, 176, 0, 19, l);


        l = this.getCrushProgressScaled(23);
        this.blit(i + 78, j + 35, 176, 17, l, 17);
	}

    private int getCrushProgressScaled(int pixels)
    {
        int i = this.tileFlapeMaker.getField(0);
        return i == 0?0:i * pixels / TileEntityIceCrasher.CRUSH_TIME_MAX;
    }
}
