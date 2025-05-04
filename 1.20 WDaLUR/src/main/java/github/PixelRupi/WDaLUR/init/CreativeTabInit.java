package github.PixelRupi.WDaLUR.init;

import github.PixelRupi.WDaLUR.WDaLUR;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WDaLUR.MODID);

    public static final RegistryObject<CreativeModeTab> WDaLUR_TAB = TABS.register("wdalur_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.WDaLUR_tab"))
                    //.icon(() -> new ItemStack(ItemInit.FUEL_ROD_TEST.get()))
                    .icon((ItemInit.FUEL_ROD_TEST.get()::getDefaultInstance))
                    .displayItems((displayParams, output) -> {
                        output.accept(ItemInit.FUEL_ROD_TEST.get());
                        output.accept(ItemInit.EXAMPLE_BLOCK_ITEM.get());
                    })
                    .build()
    );
}
