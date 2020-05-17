package com.severalcircles.colors.system.protection;

import org.bukkit.ChatColor;

public class ProtectionCheckFailException extends Exception {
    public ProtectionCheckFailException(ProtectionCheck failedCheck) {
        if (failedCheck == new RunViaSpigot()) {
            System.out.println("The RunViaSpigot Colors System Protection check has failed.\nNever run Colors via the JAR always run it via Spigot.");
        }
        System.out.println(ChatColor.RED + "A Colors System protection check has failed\nFailed check: " + failedCheck.toString() + "\nPlease download the latest version of Colors from the official GitHub and avoid using out-of date\nor unofficial versions to prevent damage to the plugin or your server.");
    }

}
