package github.PixelRupi.WDaLUR.item;

import net.minecraft.world.item.ArmorMaterial;

import java.lang.reflect.Type;
import java.util.Properties;
import java.util.function.Supplier;

public class CustomGeckoArmorItem extends GeoArmorItem {
    public CustomGeckoArmorItem(ArmorMaterial material, Type slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return () -> new GeoArmorRenderer<>(new CustomGeckoArmorRenderer());
    }
}

