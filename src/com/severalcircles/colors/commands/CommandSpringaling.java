package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class CommandSpringaling implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
//        boolean isPlayer = true;
        Player player = (Player) commandSender;
        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            player.sendMessage("Player not found");
            System.out.println("Player not found");
            return true;
        }
        if (!player.hasPermission("com.severalcircles.colors.spring")) {
            player.sendMessage(ChatColor.YELLOW + "Argumento incorecto");
            return true;
        }
        target.setHealth(1.0);
        target.sendMessage(ChatColor.DARK_RED + "You have been selected for the spring boi experience. DONT JUMP!");
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 100));
        return true;
    }

}