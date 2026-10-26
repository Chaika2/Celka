/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 */
package celestial;

import celestial.manager.SkinProvider;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableMap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.Map;
import java.util.UUID;

public class jD_2
extends CacheLoader<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> {
    public final /* synthetic */ MinecraftSessionService id_class;

    public jD_2(SkinProvider skinProvider, MinecraftSessionService minecraftSessionService) {
        this.id_class = minecraftSessionService;
    }

    public /* synthetic */ Object load(Object object) throws Exception {
        return this.id_class((String)object);
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> id_class(String string) {
        GameProfile gameProfile = new GameProfile((UUID)null, "dummy_mcdummyface");
        gameProfile.getProperties().put((Object)"textures", (Object)new Property("textures", string, ""));
        try {
            return this.id_class.getTextures(gameProfile, false);
        }
        catch (Throwable throwable) {
            return ImmutableMap.of();
        }
    }
}

