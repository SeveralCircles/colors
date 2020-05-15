package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandNedry implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        boolean isPlayer = true;
        Player player = (Player) commandSender;
        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            player.sendMessage("Player not found");
            System.out.println("Player not found");
            return true;
        }
        if (isPlayer) {
            if (!player.hasPermission("com.severalcircles.colors.magicword")) {
                player.sendMessage(ChatColor.YELLOW + "Ah Ah Ah! You didn't say the magic word!");
            }
        }
        target.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
        target.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
        target.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
        int chatspam = 0;
        while (chatspam < 3000) {
            target.sendMessage(ChatColor.YELLOW + "Ah Ah Ah! You didn't say the magic word!");
            chatspam++;
        }
        return true;
    }
}
