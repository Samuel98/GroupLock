package uk.co.jacekk.bukkit.grouplock;

import java.util.Arrays;

import uk.co.jacekk.bukkit.baseplugin.config.PluginConfigKey;

public class Config {
	
	public static final PluginConfigKey IGNORE_WORLDS	= new PluginConfigKey("ignore-worlds",	Arrays.asList("world_nether", "world_the_end"));
	
}
