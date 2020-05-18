package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandSans implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        Player target = Bukkit.getPlayer(args[0]);
        Bukkit.broadcastMessage(ChatColor.BLUE + "getttttttttttt dunked on!");
        player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
        return false;
    }
}

//sans is about to jump you in a dark alley way if you're not careful :flushed: