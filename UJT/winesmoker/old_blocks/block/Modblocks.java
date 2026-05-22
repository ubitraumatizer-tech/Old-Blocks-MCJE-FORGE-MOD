package UJT.winesmoker.old_blocks.block;

import UJT.winesmoker.old_blocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import UJT.winesmoker.old_blocks.Old_blocks;

import java.util.function.Supplier;

public class Modblocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Old_blocks.MODID);

    public static final RegistryObject<Block> EMERALD_BLOCK_OLD = registerBlock("emerald_block_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.METAL)));;

    public static final RegistryObject<Block> OAK_PLANKS_OLD = registerBlock("oak_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_PLANKS_STAIRS_OLD = registerBlock("oak_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.OAK_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OAK_PLANKS_SLAB_OLD = registerBlock("oak_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> ACACIA_PLANKS_OLD = registerBlock("acacia_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_PLANKS_STAIRS_OLD = registerBlock("acacia_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.ACACIA_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_PLANKS_SLAB_OLD = registerBlock("acacia_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> BIRCH_PLANKS_OLD = registerBlock("birch_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_PLANKS_STAIRS_OLD = registerBlock("birch_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.BIRCH_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_PLANKS_SLAB_OLD = registerBlock("birch_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> SPRUCE_PLANKS_OLD = registerBlock("spruce_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_PLANKS_STAIRS_OLD = registerBlock("spruce_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.SPRUCE_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_PLANKS_SLAB_OLD = registerBlock("spruce_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> JUNGLE_PLANKS_OLD = registerBlock("jungle_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_PLANKS_STAIRS_OLD = registerBlock("jungle_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.JUNGLE_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_PLANKS_SLAB_OLD = registerBlock("jungle_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD)));



    public static final RegistryObject<Block> DARK_OAK_PLANKS_OLD = registerBlock("dark_oak_planks_old",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_STAIRS_OLD = registerBlock("dark_oak_planks_stairs_old",
            () -> new StairBlock(() -> Modblocks.DARK_OAK_PLANKS_OLD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_SLAB_OLD = registerBlock("dark_oak_planks_slab_old",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD)));



    //"acacia_planks_old" "acacia_planks_stairs_old" "acacia_planks_slab_old"
    //acacia_planks_old acacia_planks_stairs_old acacia_planks_slab_old



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
