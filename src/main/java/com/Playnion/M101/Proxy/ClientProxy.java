package com.Playnion.M101.Proxy;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
