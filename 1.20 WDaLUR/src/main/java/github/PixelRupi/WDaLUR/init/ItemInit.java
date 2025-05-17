package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WDaLUR.MODID);
    // DeferredRegister - mapa, pozwala na rejestrowanie tylko rzeczy typu ITEM, jakby odpowiednik using namespace std z c++

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .build())
                    .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<Item> FUEL_ROD_TEST = CreativeTabInit.addToTab(ITEMS.register("fuel_rod_test",
            () -> new Item(new Item.Properties()
                    .stacksTo(32)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 5), 0.99f) // czas jest w 1/20 sekundy
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 5), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 60, 10), 1.0f)
                            .build())
                    .rarity(Rarity.COMMON)
            )));

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));
}

