package com.severalcircles.colors.commands;

import com.severalcircles.colors.system.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class CommandUnknown implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        int randomNumber = (int) Math.round(Math.random() * 20);
        System.out.println(randomNumber);
        switch (randomNumber) {
            case 0:
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 120, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 300, 1));
            case 1:
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 1));
            case 2:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 1));
            case 3:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 120, 2));
            case 4:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 120, 1));
            case 5:
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 180, 1));
            case 6:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 120, 1));
            case 7:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 120, 50));
            case 8:
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 5, 100));
            case 9:
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 120, 1));
            case 10:
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 120, 1));
            case 11:
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 120, 1));
            case 12:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20, 1));
            case 13:
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 120, 1));
                player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT);
            case 14:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 120, 1));
            case 15:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 120, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 120, 1));
            case 16:
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 120, 10));
            case 17:
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 15, 10));
            case 18:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 30, 100));
                Bukkit.broadcastMessage(ChatColor.DARK_RED + "ACTIVATE INSTANT KILL MODE");
            case 19:
                for (int i = 0; i < 420; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.EXPERIENCE_ORB);
                }
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);
                player.sendMessage(ChatColor.YELLOW + "You've been greeted by the good luck pig");
            case 20:
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PLAYER);


        }
        return true;
    }
    }


