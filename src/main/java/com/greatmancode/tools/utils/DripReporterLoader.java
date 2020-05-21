package com.greatmancode.tools.utils;

import au.com.addstar.dripreporter.DripReporterApi;

import com.greatmancode.tools.interfaces.BukkitLoader;
import com.greatmancode.tools.interfaces.Loader;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

/**
 * Created for use for the Add5tar MC Minecraft server
 * Created by benjamincharlton on 18/12/2018.
 */
public class DripReporterLoader {

    private static DripReporterApi api;
    private static boolean enabled = false;

    public static boolean hookDripReporterApi(Loader loader) {
        if (loader instanceof BukkitLoader) {
            Plugin plugin = Bukkit.getPluginManager().getPlugin("DripReporter");
            if (plugin != null && plugin.isEnabled()) {
                if(plugin instanceof DripReporterApi) {
                    api = (DripReporterApi) plugin;
                    enabled = true;
                } else {
                    plugin.getLogger().warning("GreatMan Code Tools uses a non supported method of hooking DripReporter");
                    plugin.getLogger().warning("GreatMan Code Tools will not hook DripReporter.");

                }
            }
        }
        return enabled;
    }
    public static boolean isEnabled(){
        return enabled;
    }
    public static DripReporterApi getApi(){
        return api;
    }
}
