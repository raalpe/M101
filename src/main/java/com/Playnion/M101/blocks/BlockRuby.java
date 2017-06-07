package com.Playnion.M101.blocks;

import com.Playnion.M101.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.IRON);
		
		
		setUnlocalizedName(Reference.M101Blocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.M101Blocks.RUBYBLOCK.getRegistryName());
		setHardness(9.0f);
		setHarvestLevel("pickaxe", 2);
		setResistance(75);
	}

}
