package UJT.winesmoker.old_blocks.item;

import UJT.winesmoker.old_blocks.Old_blocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Old_blocks.MODID);
    // like this:  public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("YOURITEM",
    //            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}