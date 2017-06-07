package init;

import com.Playnion.M101.blocks.BlockRuby;

import items.ItemObsidianingot;
import items.ItemRuby;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block rubyblock;
	
	
	public static void init(){
		rubyblock = new BlockRuby();
	}
	
	
	public static void registrer(){
		registerBlock(rubyblock);
	}
	
	private static void registerBlock(Block block){
		GameRegistry.register(rubyblock);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	
	public static void registerRenders(){
	registerRender(rubyblock);
	}
	
	private static void registerRender(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
