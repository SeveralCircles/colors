package com.severalcircles.colors.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandPersona implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player= (Player) commandSender;
        int chatspam = 0;
        while (chatspam<3000) {
            player.sendMessage(ChatColor.DARK_RED + "Joker Persona");
            chatspam++;
        }
        return true;
    }
}
