package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureRPGWhileBulletFlyingTick extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureRPGWhileBulletFlyingTick(ElementsYouCanExplainNothingMod instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.spawnParticle(EnumParticleTypes.SPIT, x, y, z, 0, 1, 0);
	}
}
