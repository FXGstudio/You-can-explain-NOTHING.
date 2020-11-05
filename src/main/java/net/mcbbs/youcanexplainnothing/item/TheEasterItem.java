
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcbbs.youcanexplainnothing.itemgroup.NothingSurfaceItemGroup;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class TheEasterItem extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:the_easter")
	public static final Item block = null;
	public TheEasterItem(YouCanExplainNothingModElements instance) {
		super(instance, 120);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, YouCanExplainNothingModElements.sounds.get(new ResourceLocation("you_can_explain_nothing:the_easter")),
					new Item.Properties().group(NothingSurfaceItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("the_easter");
		}
	}
}
