package UJT.winesmoker.old_blocks.item;

import UJT.winesmoker.old_blocks.Old_blocks;
import UJT.winesmoker.old_blocks.block.Modblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Old_blocks.MODID);

    public static final RegistryObject<CreativeModeTab> OLD_BLOCKS_TAB = CREATIVE_MODE_TABS.register("old_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Modblocks.EMERALD_BLOCK_OLD.get()))
                    .title(Component.translatable("creativetab.old_blocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Modblocks.EMERALD_BLOCK_OLD.get());
                        pOutput.accept(Modblocks.OAK_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.OAK_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.OAK_PLANKS_SLAB_OLD.get());
                        pOutput.accept(Modblocks.ACACIA_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.ACACIA_PLANKS_SLAB_OLD.get());
                        pOutput.accept(Modblocks.ACACIA_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.DARK_OAK_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.DARK_OAK_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.DARK_OAK_PLANKS_SLAB_OLD.get());
                        pOutput.accept(Modblocks.BIRCH_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.BIRCH_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.BIRCH_PLANKS_SLAB_OLD.get());
                        pOutput.accept(Modblocks.SPRUCE_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.SPRUCE_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.SPRUCE_PLANKS_SLAB_OLD.get());
                        pOutput.accept(Modblocks.JUNGLE_PLANKS_OLD.get());
                        pOutput.accept(Modblocks.JUNGLE_PLANKS_STAIRS_OLD.get());
                        pOutput.accept(Modblocks.JUNGLE_PLANKS_SLAB_OLD.get());
                        //pOutput.accept(Modblocks.MYBLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}