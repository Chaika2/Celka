package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class rrWl_1 {
   public static void id_class(rjV_2 var0, rrWC[] var1, int var2) {
      float var3 = (float)(var2 >> 24 & 0xFF) / 255.0F;
      float var4 = (float)(var2 >> 16 & 0xFF) / 255.0F;
      float var5 = (float)(var2 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var2 & 0xFF) / 255.0F;
      lD_2 var7 = yb_3.id_class().id_byte();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var7.id_class(7, ju_3.id_this);

      for (int var8 = 0; var8 < var1.length; var8++) {
         rrWC var9 = var1[var8];
         if (var9 != null) {
            int var10 = var9.id_class();
            int var11 = var9.id_break();
            int var12 = var9.id_byte();
            int var13 = var9.id_protected();
            if (var10 < var12) {
               int var14 = var10;
               var10 = var12;
               var12 = var14;
            }

            if (var11 < var13) {
               int var15 = var11;
               var11 = var13;
               var13 = var15;
            }

            var7.id_class(var0, (float)var10, (float)var13, 0.0F).id_class(var4, var5, var6, var3).id_class();
            var7.id_class(var0, (float)var12, (float)var13, 0.0F).id_class(var4, var5, var6, var3).id_class();
            var7.id_class(var0, (float)var12, (float)var11, 0.0F).id_class(var4, var5, var6, var3).id_class();
            var7.id_class(var0, (float)var10, (float)var11, 0.0F).id_class(var4, var5, var6, var3).id_class();
         }
      }

      var7.id_finally();
      yk_3.id_class(var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public static int id_class(LZ var0) {
      return LN.id_class(var0);
   }

   public static int id_break(LZ var0) {
      return LN.id_break(var0);
   }
}
