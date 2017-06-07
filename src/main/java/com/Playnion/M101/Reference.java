package com.Playnion.M101;

import net.minecraft.block.Block;
import scala.deprecatedInheritance;
import scala.reflect.internal.Trees.This;

public class Reference {

	public static final String MOD_ID = "pmm";
	public static final String NAME = "Mod 101";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION = "[1.11.2]";


public static final String CLIENT_PROXY_CLASS = "com.Playnion.M101.Proxy.ClientProxy";
public static final String SERVER_PROXY_CLASS = "com.Playnion.M101.Proxy.ServerProxy";

public static enum M101Items {
	OBSIDIANINGOT("obsidianingot", "ItemObsidianingot"),
	RUBY("ruby", "ItemRuby");
	
	private String unlocalizedName;
	private String registryName;

	M101Items(String unlocalizedName, String registryName){
	this.unlocalizedName = unlocalizedName;
	this.registryName = registryName;
	}
		
	public String getUnlocalizedName(){	
		return unlocalizedName;
	}
	public String getRegistryName(){
		return registryName;
	}
	
	}

public static enum M101Blocks {
	
	RUBYBLOCK("rubyblock", "BlockRuby");
	
	private String unlocalizedName;
	private String registryName;

	private M101Blocks(String unlocalizedName, String registryName) {
	this.unlocalizedName = unlocalizedName;
	this.registryName = registryName;
	}
		
	public String getUnlocalizedName(){	
		return unlocalizedName;
	}
	public String getRegistryName(){
		return registryName;
	}
	
	}
}

