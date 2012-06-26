package uk.co.jacekk.bukkit.grouplock;

import java.util.Arrays;

import uk.co.jacekk.bukkit.baseplugin.config.PluginConfigKey;

public enum Config implements PluginConfigKey {
	
	IGNORE_WORLDS(	"ignore-worlds", Arrays.asList("world_nether", "world_the_end"));
	
	private String key;
	private Object defaultValue;
	
	private Config(String key, Object defaultValue){
		this.key = key;
		this.defaultValue = defaultValue;
	}
	
	public String getKey(){
		return this.key;
	}
	
	public Object getDefault(){
		return this.defaultValue;
	}
	
}
