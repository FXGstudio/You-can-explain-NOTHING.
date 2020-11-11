package net.mcbbs.youcanexplainnothing.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Map;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ProcedureTechnetiumArmorHelmetTickEvent extends ElementsYouCanExplainNothingMod.ModElement {
	public ProcedureTechnetiumArmorHelmetTickEvent(ElementsYouCanExplainNothingMod instance) {
		super(instance, 117);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TechnetiumArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_WALL, (float) 0.01);
	}
}
