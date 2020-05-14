package com.severalcircles.colors.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAbout implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        // Casts the instance of commandSender to an instance of Player to give us more options
        Player player = (Player) commandSender;
        player.sendMessage(ChatColor.GOLD + "Colors\n" + ChatColor.DARK_RED + "Version: Red 1\n" + ChatColor.GREEN + "By Aidan, Mo and Tyler, May 2020");
        return true;
    }
}
