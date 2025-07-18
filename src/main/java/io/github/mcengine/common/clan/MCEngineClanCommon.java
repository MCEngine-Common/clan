package io.github.mcengine.common.clan;

import org.bukkit.plugin.Plugin;

/**
 * Common logic handler for the MCEngine Clan plugin.
 * Handles database backend initialization and provides access to clan data methods.
 */
public class MCEngineClanCommon {

    /**
     * Singleton instance of the Clan Common manager.
     */
    private static MCEngineClanCommon instance;

    /**
     * The Bukkit plugin instance.
     */
    private final Plugin plugin;

    /**
     * Constructs a new Clan Common handler.
     * Initializes the appropriate database backend based on plugin config.
     *
     * Supported database types (config key: {@code database.type}):
     * <ul>
     *     <li>{@code sqlite}</li>
     *     <li>{@code mysql}</li>
     * </ul>
     *
     * @param plugin the Bukkit plugin instance
     */
    public MCEngineClanCommon(Plugin plugin) {
        instance = this;
        this.plugin = plugin;
    }

    /**
     * Returns the singleton instance of the clan common handler.
     *
     * @return {@link MCEngineClanCommon} global instance
     */
    public static MCEngineClanCommon getApi() {
        return instance;
    }

    /**
     * Gets the associated plugin instance.
     *
     * @return Bukkit plugin instance
     */
    public Plugin getPlugin() {
        return plugin;
    }
}
