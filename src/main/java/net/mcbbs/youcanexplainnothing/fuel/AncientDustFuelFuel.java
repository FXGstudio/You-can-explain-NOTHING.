
package net.mcbbs.youcanexplainnothing.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.AncientDustItem;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class AncientDustFuelFuel extends YouCanExplainNothingModElements.ModElement {
	public AncientDustFuelFuel(YouCanExplainNothingModElements instance) {
		super(instance, 62);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AncientDustItem.block, (int) (1)).getItem())
			event.setBurnTime(800);
	}
}
