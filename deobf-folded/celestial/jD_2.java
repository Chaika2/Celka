package celestial;

import com.google.common.cache.CacheLoader;
import com.google.common.collect.ImmutableMap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.properties.Property;
import java.util.Map;
import java.util.UUID;

class jD_2 extends CacheLoader<String, Map<Type, MinecraftProfileTexture>> {
   jD_2(SkinProvider var1, MinecraftSessionService var2) {
      this.id_class = var2;
   }

   public Map<Type, MinecraftProfileTexture> id_class(String var1) {
      GameProfile var2 = new GameProfile((UUID)null, "dummy_mcdummyface");
      var2.getProperties().put("textures", new Property("textures", var1, ""));

      try {
         return this.id_class.getTextures(var2, false);
      } catch (Throwable var4) {
         return ImmutableMap.of();
      }
   }
}
