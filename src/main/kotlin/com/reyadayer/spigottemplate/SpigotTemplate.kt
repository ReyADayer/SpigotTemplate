package com.reyadayer.spigottemplate

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.annotation.plugin.ApiVersion
import org.bukkit.plugin.java.annotation.plugin.Plugin
import org.bukkit.plugin.java.annotation.plugin.author.Author

@Plugin(name = "SpigotTemplate", version = "1.0-SNAPSHOT")
@Author("ReyADayer")
@ApiVersion(ApiVersion.Target.v1_15)
class SpigotTemplate : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}