package init;

import com.Playnion.M101.Reference;

import items.ItemObsidianingot;
import items.ItemRuby;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item obsidianingot;
	public static Item ruby;
	
	public static void init(){
		obsidianingot = new ItemObsidianingot();
		ruby = new ItemRuby();
	}
	
	
	public static void registrer(){
		GameRegistry.register(obsidianingot);
		GameRegistry.register(ruby);
	}
	
	public static void registerRenders(){
		registerRender(obsidianingot);
		registerRender(ruby);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
