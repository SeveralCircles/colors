package com.severalcircles.colors.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDeathEvent;


public class SadEvent {
    @EventHandler
    public void onEntityDie(EntityDeathEvent event) {

        event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.COW);
        event.getEntity().getWorld().spawnEntity(event.getEntity().getLocation(), EntityType.COW);
    }

}


