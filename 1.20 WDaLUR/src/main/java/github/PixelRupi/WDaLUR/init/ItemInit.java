package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
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
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 5), 0.99f) // czas jest w 1/20 sekundy
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 5), 1.0f)
                            .build())
                    .rarity(Rarity.EPIC)
            ));
}
