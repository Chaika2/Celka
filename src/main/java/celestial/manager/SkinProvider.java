/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecurePublicKeyException
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 */
package celestial.manager;

import celestial.QY;
import celestial.fY_2;
import celestial.fd_3;
import celestial.ff_3;
import celestial.jD_2;
import celestial.jH_2;
import celestial.jU_2;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SkinProvider {
    private final fY_2 id_class;
    private final File id_break;
    private final MinecraftSessionService id_byte;
    private final LoadingCache<String, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> id_protected;

    public SkinProvider(fY_2 var1, File var2, MinecraftSessionService var3) {
        this.id_class = var1;
        this.id_break = var2;
        this.id_byte = var3;
        this.id_protected = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new jD_2(this, var3));
    }

    private rqO_2 id_class(MinecraftProfileTexture var1, MinecraftProfileTexture.Type var2, jU_2 var3) {
        String var4 = Hashing.sha1().hashUnencodedChars((CharSequence)var1.getHash()).toString();
        rqO_2 var5 = new rqO_2("skins/" + var4);
        ff_3 var6 = this.id_class.id_break(var5);
        if (var6 != null) {
            if (var3 != null) {
                var3.onSkinTextureAvailable(var2, var5, var1);
            }
        } else {
            File var7 = new File(this.id_break, var4.length() > 2 ? var4.substring(0, 2) : "xx");
            File var8 = new File(var7, var4);
            fd_3 var9 = new fd_3(var8, var1.getUrl(), jH_2.id_class(), var2 == MinecraftProfileTexture.Type.SKIN, () -> {
                if (var3 != null) {
                    var3.onSkinTextureAvailable(var2, var5, var1);
                }
            });
            this.id_class.id_class(var5, var9);
        }
        return var5;
    }

    public rqO_2 id_class(MinecraftProfileTexture var1, MinecraftProfileTexture.Type var2) {
        return this.id_class(var1, var2, null);
    }

    public void id_class(GameProfile var1, jU_2 var2, boolean var3) {
        Runnable var4 = () -> {
            HashMap var4x = Maps.newHashMap();
            try {
                var4x.putAll(this.id_byte.getTextures(var1, var3));
            }
            catch (InsecurePublicKeyException insecurePublicKeyException) {
                // empty catch block
            }
            if (var4x.isEmpty()) {
                var1.getProperties().clear();
                if (var1.getId().equals(QY.id_instanceof().id_while().id_throws().getId())) {
                    var1.getProperties().putAll((Multimap)QY.id_instanceof().id_byte());
                    var4x.putAll(this.id_byte.getTextures(var1, false));
                } else {
                    this.id_byte.fillProfileProperties(var1, var3);
                    try {
                        var4x.putAll(this.id_byte.getTextures(var1, var3));
                    }
                    catch (InsecurePublicKeyException insecurePublicKeyException) {
                        // empty catch block
                    }
                }
            }
            QY.id_instanceof().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of((Object)MinecraftProfileTexture.Type.SKIN, (Object)MinecraftProfileTexture.Type.CAPE).forEach(var3xx -> {
                if (var4x.containsKey(var3xx)) {
                    this.id_class((MinecraftProfileTexture)var4x.get(var3xx), (MinecraftProfileTexture.Type)var3xx, var2);
                }
            })));
        };
        rqR_2.id_case().execute(var4);
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> id_class(GameProfile var1) {
        Property var2 = (Property)Iterables.getFirst((Iterable)var1.getProperties().get((Object)"textures"), (Object)null);
        return var2 == null ? ImmutableMap.of() : (Map)this.id_protected.getUnchecked((Object)var2.getValue());
    }
}

