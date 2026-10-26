package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class rrWl_1 {
   public static void class_(rjV_2 var0, rrWC[] var1, int var2) {
      float var3 = (float)(var2 >> 24 & 0xFF) / 255.0F;
      float var4 = (float)(var2 >> 16 & 0xFF) / 255.0F;
      float var5 = (float)(var2 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var2 & 0xFF) / 255.0F;
      lD_2 var7 = yb_3.class_().byte_();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var7.class_(7, ju_3.this_);

      for (int var8 = 0; var8 < var1.length; var8++) {
         rrWC var9 = var1[var8];
         if (var9 != null) {
            int var10 = var9.class_();
            int var11 = var9.break_();
            int var12 = var9.byte_();
            int var13 = var9.protected_();
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

            var7.class_(var0, (float)var10, (float)var13, 0.0F).class_(var4, var5, var6, var3).class_();
            var7.class_(var0, (float)var12, (float)var13, 0.0F).class_(var4, var5, var6, var3).class_();
            var7.class_(var0, (float)var12, (float)var11, 0.0F).class_(var4, var5, var6, var3).class_();
            var7.class_(var0, (float)var10, (float)var11, 0.0F).class_(var4, var5, var6, var3).class_();
         }
      }

      var7.finally_();
      yk_3.class_(var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   public static int class_(LZ var0) {
      return LN.class_(var0);
   }

   public static int break_(LZ var0) {
      return LN.break_(var0);
   }
}
