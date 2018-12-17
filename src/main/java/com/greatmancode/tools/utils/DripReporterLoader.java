package com.greatmancode.tools.utils;

import au.com.addstar.dripreporter.DripReporterApi;

import com.greatmancode.tools.interfaces.BukkitLoader;
import com.greatmancode.tools.interfaces.Loader;

import org.bukkit.Bukkit;

/**
 * Created for use for the Add5tar MC Minecraft server
 * Created by benjamincharlton on 18/12/2018.
 */
public class DripReporterLoader {

    private static DripReporterApi api;
    public static boolean enabled = false;

    public static boolean hookDripReporterApi(Loader loader) {
        if (loader instanceof BukkitLoader) {
            if (Bukkit.getPluginManager().isPluginEnabled("DripReporter")) {
               api = (DripReporterApi) Bukkit.getPluginManager().getPlugin("DripReporter");
               enabled = true;
               return enabled;
            }
        }
        return enabled;
    }

    public static DripReporterApi getApi(){
        return api;
    }
}
