package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.item.EntityXPOrb;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureIonRailgunWhileBulletFlyingTick extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureIonRailgunWhileBulletFlyingTick(ElementsYouCanExplainNothingMod instance) {
		super(instance, 93);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IonRailgunWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IonRailgunWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IonRailgunWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IonRailgunWhileBulletFlyingTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.spawnEntity(new EntityXPOrb(world, x, y, z, (int) 2));
		}
	}
}
