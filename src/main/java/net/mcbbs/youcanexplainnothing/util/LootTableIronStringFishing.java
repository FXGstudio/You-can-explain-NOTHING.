
package net.mcbbs.youcanexplainnothing.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class LootTableIronStringFishing extends ElementsYouCanExplainNothingMod.ModElement {
	public LootTableIronStringFishing(ElementsYouCanExplainNothingMod instance) {
		super(instance, 270);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("you_can_explain_nothing", "iron_string_fishing"));
	}
}
