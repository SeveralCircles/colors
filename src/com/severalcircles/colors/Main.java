package com.severalcircles.colors;

import com.severalcircles.colors.commands.CommandAbout;
import com.severalcircles.colors.commands.CommandNedry;
import com.severalcircles.colors.commands.CommandPersona;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main extends JavaPlugin {
    public static Main plugin;
    public static int random;
    private File playerConfigFile;
    private FileConfiguration playerConfig;

    @Override
    public void onEnable() {
        plugin = this;
        try {
            System.out.println("Build number: " + classBuildTimeMillis());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        System.out.println("Setting up config...");
        this.saveDefaultConfig();
        createPlayerConfig();
        Player[] onlinePlayers = (Player[]) Bukkit.getOnlinePlayers().toArray();
        for (int i = onlinePlayers.length; i > -1; i--) {
            if (playerConfig.get(onlinePlayers[i].getName() + ".iv").equals(null)) {
                System.out.println("Player " + onlinePlayers[i].getName() + " does not have unique individual values assigned. Assigning now.");
                // Generate unique individual values
                playerConfig.createSection(onlinePlayers[i].getName() + ".iv");
                playerConfig.set(onlinePlayers[i].getName() + ".iv", (int) Math.round(Math.random() * 100000));
            }
        }
        System.out.println("Loading config...");
        random = this.getConfig().getInt("random");
        if (!this.getConfig().getBoolean("enablePlugin")) {
            System.out.println("Plugin disabled in config. Disabling.");
            getServer().getPluginManager().disablePlugin(this);
        }
        System.out.println("Enabling commands...");
        this.getCommand("about").setExecutor(new CommandAbout());
        this.getCommand("persona").setExecutor(new CommandPersona());
        this.getCommand("access").setExecutor(new CommandNedry());
    }

    @Override
    public void onDisable() {
        System.out.println("See ya later!");
    }

    //Look, it's from Bowser
//It's me, Jerry Seinfeild from Garfeild Kart
//Joker Persona 5
// Testing codacy
    private long classBuildTimeMillis() throws URISyntaxException, IllegalStateException, IllegalArgumentException {
        URL resource = getClass().getResource(getClass().getSimpleName() + ".class");
        if (resource == null) {
            throw new IllegalStateException("Failed to find class file for class: " +
                    getClass().getName());
        }

        if (resource.getProtocol().equals("file")) {

            return new File(resource.toURI()).lastModified();

        } else if (resource.getProtocol().equals("jar")) {

            String path = resource.getPath();
            return new File(path.substring(5, path.indexOf("!"))).lastModified();

        } else {

            throw new IllegalArgumentException("Unhandled url protocol: " +
                    resource.getProtocol() + " for class: " +
                    getClass().getName() + " resource: " + resource.toString());
        }
    }

    private void createPlayerConfig() {
        playerConfigFile = new File(getDataFolder(), "players.yml");
        if (!playerConfigFile.exists()) {
            playerConfigFile.getParentFile().mkdirs();
            saveResource("players.yml", false);
        }

        playerConfig = new YamlConfiguration();
        try {
            playerConfig.load(playerConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}