package com.severalcircles.colors.system.records;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class RecordKeeper {
    public static void newRecord(Record record, int newValue) {
        Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "New Record!\n");
        switch (record) {
            case SERVER_ONLINE:
                Bukkit.broadcastMessage(ChatColor.BLUE + "Longest server uptime in server history!");
                Bukkit.broadcastMessage(ChatColor.GREEN + "" + newValue / 60 / 60 + " hours");
        }
    }
}
