package com.severalcircles.colors.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class CommandSans implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
        return false;
    }
}
