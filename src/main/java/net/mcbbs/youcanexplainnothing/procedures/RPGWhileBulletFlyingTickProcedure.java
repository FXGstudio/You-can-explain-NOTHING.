package net.mcbbs.youcanexplainnothing.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.Map;

@YouCanExplainNothingModElements.ModElement.Tag
public class RPGWhileBulletFlyingTickProcedure extends YouCanExplainNothingModElements.ModElement {
	public RPGWhileBulletFlyingTickProcedure(YouCanExplainNothingModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure RPGWhileBulletFlyingTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(ParticleTypes.SPIT, x, y, z, 0, 1, 0);
	}
}
