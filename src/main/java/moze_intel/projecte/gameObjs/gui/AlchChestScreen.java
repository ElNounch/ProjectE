package moze_intel.projecte.gameObjs.gui;

import com.mojang.blaze3d.platform.GlStateManager;
import moze_intel.projecte.PECore;
import moze_intel.projecte.gameObjs.container.AlchChestContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlchChestScreen extends ContainerScreen<AlchChestContainer> {

	private static final ResourceLocation texture = new ResourceLocation(PECore.MODID, "textures/gui/alchchest.png");

	public AlchChestScreen(AlchChestContainer container, PlayerInventory invPlayer, ITextComponent title) {
		super(container, invPlayer, title);
		this.xSize = 255;
		this.ySize = 230;
	}

	@Override
	public void render(int mouseX, int mouseY, float partialTicks) {
		this.renderBackground();
		super.render(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GlStateManager.color4f(1, 1, 1, 1);
		Minecraft.getInstance().textureManager.bindTexture(texture);
		this.blit(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}