package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandDoomsday implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        boolean isPlayer = true;
        Player player = (Player) commandSender;

        if (isPlayer) {
            if (!player.hasPermission("com.severalcircles.colors.magicword")) {
                player.sendMessage(ChatColor.YELLOW + "Ah Ah Ah! You didn't say the magic word!");

                int wither = 0;
                while (wither < 69) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.WITHER);
                    wither++;
                }
            }
        }
        return true;
    }
}


