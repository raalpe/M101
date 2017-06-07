package com.Playnion.M101;

import com.Playnion.M101.Proxy.CommonProxy;

import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

	@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class M101 {
		
	@Instance
	public static M101 instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event){
		ModItems.init();
		ModItems.registrer();
		
		ModBlocks.init();
		ModBlocks.registrer();
	}
	
	public void Init (FMLInitializationEvent event){
		proxy.init();
	}
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
	
	
	
	
	
