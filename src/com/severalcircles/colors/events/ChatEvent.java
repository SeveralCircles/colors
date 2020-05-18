package com.severalcircles.colors.events;

import com.severalcircles.colors.system.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        if ((int) Math.round(Math.random() * Main.random) == 69) {
            player.sendMessage(ChatColor.GOLD + "Jesus loves you");
        }
    }

}
