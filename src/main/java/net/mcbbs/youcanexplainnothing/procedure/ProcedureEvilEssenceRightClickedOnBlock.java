package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.effect.EntityLightningBolt;

import net.mcbbs.youcanexplainnothing.item.ItemLightning;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Random;
import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureEvilEssenceRightClickedOnBlock extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureEvilEssenceRightClickedOnBlock(ElementsYouCanExplainNothingMod instance) {
		super(instance, 57);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure EvilEssenceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EvilEssenceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EvilEssenceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EvilEssenceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EvilEssenceRightClickedOnBlock!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setItemDamage(0);
			}
		}
		world.addWeatherEffect(new EntityLightningBolt(world, (int) x, (int) y, (int) z, false));
		if (!world.isRemote) {
			EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemLightning.block, (int) (1)));
			entityToSpawn.setPickupDelay(10);
			world.spawnEntity(entityToSpawn);
		}
	}
}
