package com.severalcircles.colors.events;

import com.severalcircles.colors.system.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GuiltTripEvent {
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        if ((int) Math.round(Math.random() * Main.random) == 69) {
            Player.getWorld().spawnEntity(Player.getLocation(), EntityType.COW);
        }
    }

}