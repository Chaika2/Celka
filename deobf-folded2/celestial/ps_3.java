package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;
import java.util.Map;

public class ps_3 implements yD_2 {
   private final Map<Integer, rLC> id_class = Maps.newHashMap();
   private final Map<Integer, Float> id_break = Maps.newHashMap();
   private final Map<Integer, Long> id_byte = Maps.newHashMap();

   public static void id_class(rLC var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(6.0F);
      id_break(var0, var1, var2, var3, var4, var6, var8);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   public static void id_class(rLC var0, double var1, double var3, double var5) {
      yb_3 var7 = yb_3.id_class();
      lD_2 var8 = var7.id_byte();
      var8.id_class(3, ju_3.id_this);

      for (int var9 = 0; var9 < var0.id_throws(); var9++) {
         rLq_1 var10 = var0.id_class(var9);
         if (!(id_class(var10.id_byte(), var1, var3, var5) > 80.0F)) {
            float var11 = (float)var9 / (float)var0.id_throws() * 0.33F;
            int var12 = var9 == 0 ? 0 : rfU_2.id_case(var11, 0.9F, 0.9F);
            int var13 = var12 >> 16 & 0xFF;
            int var14 = var12 >> 8 & 0xFF;
            int var15 = var12 & 0xFF;
            var8.id_class((double)var10.id_class - var1 + 0.5, (double)var10.id_break - var3 + 0.5, (double)var10.id_byte - var5 + 0.5)
               .id_break(var13, var14, var15, 255)
               .id_class();
         }
      }

      var7.id_break();
   }

   private static float id_class(rfH_2 var0, double var1, double var3, double var5) {
      return (float)(Math.abs((double)var0.b_() - var1) + Math.abs((double)var0.c_() - var3) + Math.abs((double)var0.d_() - var5));
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      if (!this.id_class.isEmpty()) {
         long var9 = rqR_2.id_break();

         for (Integer var12 : this.id_class.keySet()) {
            rLC var13 = this.id_class.get(var12);
            float var14 = this.id_break.get(var12);
            id_class(var13, var14, true, true, var3, var5, var7);
         }

         for (Integer var18 : this.id_byte.keySet().toArray(new Integer[0])) {
            if (var9 - this.id_byte.get(var18) > 5000L) {
               this.id_class.remove(var18);
               this.id_byte.remove(var18);
            }
         }
      }
   }

   public void id_class(int var1, rLC var2, float var3) {
      this.id_class.put(var1, var2);
      this.id_byte.put(var1, rqR_2.id_break());
      this.id_break.put(var1, var3);
   }

   private static void id_break(rLC var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      id_class(var0, var4, var6, var8);
      rfH_2 var10 = var0.id_volatile();
      if (id_class(var10, var4, var6, var8) <= 80.0F) {
         yK_2.id_class(
            new rfl_3(
                  (double)((float)var10.b_() + 0.25F),
                  (double)((float)var10.c_() + 0.25F),
                  (double)var10.d_() + 0.25,
                  (double)((float)var10.b_() + 0.75F),
                  (double)((float)var10.c_() + 0.75F),
                  (double)((float)var10.d_() + 0.75F)
               )
               .id_protected(-var4, -var6, -var8),
            0.0F,
            1.0F,
            0.0F,
            0.5F
         );

         for (int var11 = 0; var11 < var0.id_throws(); var11++) {
            rLq_1 var12 = var0.id_class(var11);
            if (id_class(var12.id_byte(), var4, var6, var8) <= 80.0F) {
               float var13 = var11 == var0.id_case() ? 1.0F : 0.0F;
               float var14 = var11 == var0.id_case() ? 0.0F : 1.0F;
               yK_2.id_class(
                  new rfl_3(
                        (double)((float)var12.id_class + 0.5F - var1),
                        (double)((float)var12.id_break + 0.01F * (float)var11),
                        (double)((float)var12.id_byte + 0.5F - var1),
                        (double)((float)var12.id_class + 0.5F + var1),
                        (double)((float)var12.id_break + 0.25F + 0.01F * (float)var11),
                        (double)((float)var12.id_byte + 0.5F + var1)
                     )
                     .id_protected(-var4, -var6, -var8),
                  var13,
                  0.0F,
                  var14,
                  0.5F
               );
            }
         }
      }

      if (var2) {
         for (rLq_1 var23 : var0.id_native()) {
            if (id_class(var23.id_byte(), var4, var6, var8) <= 80.0F) {
               yK_2.id_class(
                  new rfl_3(
                        (double)((float)var23.id_class + 0.5F - var1 / 2.0F),
                        (double)((float)var23.id_break + 0.01F),
                        (double)((float)var23.id_byte + 0.5F - var1 / 2.0F),
                        (double)((float)var23.id_class + 0.5F + var1 / 2.0F),
                        (double)var23.id_break + 0.1,
                        (double)((float)var23.id_byte + 0.5F + var1 / 2.0F)
                     )
                     .id_protected(-var4, -var6, -var8),
                  1.0F,
                  0.8F,
                  0.8F,
                  0.5F
               );
            }
         }

         for (rLq_1 var24 : var0.id_extends()) {
            if (id_class(var24.id_byte(), var4, var6, var8) <= 80.0F) {
               yK_2.id_class(
                  new rfl_3(
                        (double)((float)var24.id_class + 0.5F - var1 / 2.0F),
                        (double)((float)var24.id_break + 0.01F),
                        (double)((float)var24.id_byte + 0.5F - var1 / 2.0F),
                        (double)((float)var24.id_class + 0.5F + var1 / 2.0F),
                        (double)var24.id_break + 0.1,
                        (double)((float)var24.id_byte + 0.5F + var1 / 2.0F)
                     )
                     .id_protected(-var4, -var6, -var8),
                  0.8F,
                  1.0F,
                  1.0F,
                  0.5F
               );
            }
         }
      }

      if (var3) {
         for (int var17 = 0; var17 < var0.id_throws(); var17++) {
            rLq_1 var20 = var0.id_class(var17);
            if (id_class(var20.id_byte(), var4, var6, var8) <= 80.0F) {
               yK_2.id_class(
                  String.format("%s", var20.id_native),
                  (double)var20.id_class + 0.5,
                  (double)var20.id_break + 0.75,
                  (double)var20.id_byte + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
               yK_2.id_class(
                  String.format(Locale.ROOT, "%.2f", var20.id_extends),
                  (double)var20.id_class + 0.5,
                  (double)var20.id_break + 0.25,
                  (double)var20.id_byte + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
            }
         }
      }
   }
}
