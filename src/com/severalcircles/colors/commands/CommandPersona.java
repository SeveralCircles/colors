package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandPersona implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        int chatspam = 0;
        while (chatspam<3000) {
            Bukkit.broadcastMessage(ChatColor.DARK_RED + "Joker Persona");
            chatspam++;
        }
        return true;
    }
}
