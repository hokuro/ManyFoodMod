package mod.mfm.gui;

import com.mojang.blaze3d.platform.GlStateManager;

import mod.mfm.inventory.ContainerMillStone;
import mod.mfm.tileentity.TileEntityMillStone;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GuiMillStone extends ContainerScreen<ContainerMillStone> {
	  private static final ResourceLocation texture = new ResourceLocation("drf:textures/gui/container/millstone.png");
	    private PlayerInventory playerInventory;
	    private ContainerMillStone tileMill;

	    public GuiMillStone(ContainerMillStone container, PlayerInventory playerInv, ITextComponent titleIn) {
			super(container,playerInv,titleIn);
	        this.playerInventory = playerInv;
	        this.tileMill = container;
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
	        Minecraft.getInstance().getTextureManager().bindTexture(texture);
	        int i = (this.width - this.xSize) / 2;
	        int j = (this.height - this.ySize) / 2;
	        this.blit(i, j, 0, 0, this.xSize, this.ySize);

	        int l = this.getCrushProgressScaled(16);
	        this.blit(i + 77, j + 35, 176, 0, 20, l);
		}

	    private int getCrushProgressScaled(int pixels)
	    {
	        int i = this.tileMill.getField(0);
		    return i == 0?0:i * pixels / TileEntityMillStone.MILL_TIME_MAX;
	    }
}
