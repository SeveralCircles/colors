package com.severalcircles.colors.events;

import com.severalcircles.colors.system.Main;
import org.bukkit.entity.Cow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;


public class SadEvent {
    @EventHandler
    public void onEntityDie(EntityDeathEvent event) {
        if (!event.getEntity().getClass().equals(Cow.class)) return;
        if (!Main.plugin.getConfig().getBoolean("feature.hydraCow")) return;
        event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.COW);
        event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.COW);
    }

}


