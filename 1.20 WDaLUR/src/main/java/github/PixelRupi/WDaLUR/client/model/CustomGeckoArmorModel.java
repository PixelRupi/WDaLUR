package github.PixelRupi.WDaLUR.client.model;

import net.minecraft.resources.ResourceLocation;

public class CustomGeckoArmorModel extends GeoModel<CustomGeckoArmorItem> {
    @Override
    public ResourceLocation getModelResource(CustomGeckoArmorItem animatable) {
        return new ResourceLocation("twojamodid", "geo/custom_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CustomGeckoArmorItem animatable) {
        return new ResourceLocation("twojamodid", "textures/models/armor/custom_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CustomGeckoArmorItem animatable) {
        return new ResourceLocation("twojamodid", "animations/custom_armor.animation.json");
    }
}

