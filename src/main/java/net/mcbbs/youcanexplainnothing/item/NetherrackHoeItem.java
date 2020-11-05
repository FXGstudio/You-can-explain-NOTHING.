
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class NetherrackHoeItem extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:netherrack_hoe")
	public static final Item block = null;
	public NetherrackHoeItem(YouCanExplainNothingModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 95;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 7;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("netherrack_hoe"));
	}
}
