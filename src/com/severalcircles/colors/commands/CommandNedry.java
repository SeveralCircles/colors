package com.severalcircles.colors.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandNedry implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player= (Player) commandSender;
        int chatspam = 0;
        while (chatspam<3000) {
            player.sendMessage(ChatColor.YELLOW + "Ah Ah Ah! You didn't say the magic word!");
            chatspam++;
        }
        return true;
    }
}
