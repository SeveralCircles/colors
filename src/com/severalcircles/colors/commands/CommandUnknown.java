package com.severalcircles.colors.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
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
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 2400, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 3600, 1));
                break;
            case 1:
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2400, 1));
                break;
            case 2:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2400, 1));
                break;
            case 3:
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2400, 2));
                break;
            case 4:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 2400, 1));
                break;
            case 5:
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 2400, 1));
                break;
            case 6:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 1));
                break;
            case 7:
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 50));
                break;
            case 8:
                player.getWorld().spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 80, 100));
                break;
            case 9:
                for (int i = 0; i < 10; i++) {
                    player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
                }
                player.getWorld().spawnEntity(player.getLocation(), EntityType.GIANT);
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 1500, 10));
                break;
            case 10:
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 2400, 1));
                break;
            case 11:
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 3600, 1));
                break;
            case 12:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 1000, 1));
                break;
            case 13:
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 1200, 1));
                player.getWorld().spawnEntity(player.getLocation(), EntityType.BAT);
                break;
            case 14:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3600, 1));
                break;
            case 15:
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 4800, 1));
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 4800, 1));
                break;
            case 16:
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 5));
                break;
            case 17:
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 1200, 10));
                break;
            case 18:
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 500, 100));
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
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 48000, 1));
                break;

        }
        return true;
    }
    }


