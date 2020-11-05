package net.mcbbs.youcanexplainnothing.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.Map;

@YouCanExplainNothingModElements.ModElement.Tag
public class TechnetiumArmorHelmetTickEventProcedure extends YouCanExplainNothingModElements.ModElement {
	public TechnetiumArmorHelmetTickEventProcedure(YouCanExplainNothingModElements instance) {
		super(instance, 117);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure TechnetiumArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_WALL, (float) 0.01);
	}
}
