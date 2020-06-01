package com.severalcircles.colors.commands;

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
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 12000, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 30000, 1));
                break;
            case 1:
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 12000, 1));
                break;
            case 2:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 12000, 1));
                break;
            case 3:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 12000, 2));
                break;
            case 4:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 1));
                break;
            case 5:
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 18000, 1));
                break;
            case 6:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 1));
                break;
            case 7:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 50));
                break;
            case 8:
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 500, 100));
                break;
            case 9:
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 600000, 1));
                break;
            case 10:
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 12000, 1));
                break;
            case 11:
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 12000, 1));
                break;
            case 12:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 2000, 1));
                break;
            case 13:
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 12000, 1));
                player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT);
                break;
            case 14:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 12000, 1));
                break;
            case 15:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 12000, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 12000, 1));
                break;
            case 16:
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 10));
                break;
            case 17:
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1500, 10));
                break;
            case 18:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3000, 100));
                Bukkit.broadcastMessage(ChatColor.DARK_RED + "ACTIVATE INSTANT KILL MODE");
                break;
            case 19:
                for (int i = 0; i < 420; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.EXPERIENCE_ORB);
                }
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);
                player.sendMessage(ChatColor.YELLOW + "You've been greeted by the good luck pig");
                break;
            case 20:
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PLAYER);
                break;

        }
        return true;
    }
    }


