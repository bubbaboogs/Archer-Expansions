package net.mcreator.rangerexpansions.procedures;

import net.minecraft.world.entity.Entity;

public class WarpBowWhileProjectileFlyingTickProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.startRiding(entity);
	}
}
