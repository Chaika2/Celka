package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SkinProvider {
   private final fY_2 class_;
   private final File break_;
   private final MinecraftSessionService byte_;
   private final LoadingCache<String, Map<Type, MinecraftProfileTexture>> protected_;

   public SkinProvider(fY_2 var1, File var2, MinecraftSessionService var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new jD_2(this, var3));
   }

   private rqO_2 class_(MinecraftProfileTexture var1, Type var2, jU_2 var3) {
      String var4 = Hashing.sha1().hashUnencodedChars(var1.getHash()).toString();
      rqO_2 var5 = new rqO_2("skins/" + var4);
      ff_3 var6 = this.class_.break_(var5);
      if (var6 != null) {
         if (var3 != null) {
            var3.onSkinTextureAvailable(var2, var5, var1);
         }
      } else {
         File var7 = new File(this.break_, var4.length() > 2 ? var4.substring(0, 2) : "xx");
         File var8 = new File(var7, var4);
         fd_3 var9 = new fd_3(var8, var1.getUrl(), jH_2.class_(), var2 == Type.SKIN, () -> {
            if (var3 != null) {
               var3.onSkinTextureAvailable(var2, var5, var1);
            }
         });
         this.class_.class_(var5, var9);
      }

      return var5;
   }

   public rqO_2 class_(MinecraftProfileTexture var1, Type var2) {
      return this.class_(var1, var2, (jU_2)null);
   }

   public void class_(GameProfile var1, jU_2 var2, boolean var3) {
      Runnable var4 = () -> {
         HashMap var4x = Maps.newHashMap();

         try {
            var4x.putAll(this.byte_.getTextures(var1, var3));
         } catch (InsecurePublicKeyException var7) {
         }

         if (var4x.isEmpty()) {
            var1.getProperties().clear();
            if (var1.getId().equals(QY.instanceof_().while_().throws_().getId())) {
               var1.getProperties().putAll(QY.instanceof_().byte_());
               var4x.putAll(this.byte_.getTextures(var1, false));
            } else {
               this.byte_.fillProfileProperties(var1, var3);

               try {
                  var4x.putAll(this.byte_.getTextures(var1, var3));
               } catch (InsecurePublicKeyException var6) {
               }
            }
         }

         QY.instanceof_().execute(() -> RenderSystem.recordRenderCall(() -> ImmutableList.of(Type.SKIN, Type.CAPE).forEach(var3xx -> {
                  if (var4x.containsKey(var3xx)) {
                     this.class_((MinecraftProfileTexture)var4x.get(var3xx), var3xx, var2);
                  }
               })));
      };
      rqR_2.case_().execute(var4);
   }

   public Map<Type, MinecraftProfileTexture> class_(GameProfile var1) {
      Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
      return (Map<Type, MinecraftProfileTexture>)(var2 == null ? ImmutableMap.of() : (Map)this.protected_.getUnchecked(var2.getValue()));
   }
}
