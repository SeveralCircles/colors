package com.severalcircles.colors;

import com.severalcircles.colors.commands.CommandAbout;
import com.severalcircles.colors.commands.CommandNedry;
import com.severalcircles.colors.commands.CommandPersona;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Enabling commands...");
        this.getCommand("about").setExecutor(new CommandAbout());
        this.getCommand("persona").setExecutor(new CommandPersona());
        this.getCommand("help").setExecutor(new CommandNedry());
    }

    @Override
    public void onDisable() {
        System.out.println("See ya later!");
    }
}
//Look, it's from Bowser
//It's me, Jerry Seinfeild from Garfeild Kart
//Joker Persona 5
// Testing codacy