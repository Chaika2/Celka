package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;
import java.util.Map;

public class ps_3 implements yD_2 {
   private final Map<Integer, rLC> class_ = Maps.newHashMap();
   private final Map<Integer, Float> break_ = Maps.newHashMap();
   private final Map<Integer, Long> byte_ = Maps.newHashMap();

   public static void class_(rLC var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      RenderSystem.lineWidth(6.0F);
      break_(var0, var1, var2, var3, var4, var6, var8);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   public static void class_(rLC var0, double var1, double var3, double var5) {
      yb_3 var7 = yb_3.class_();
      lD_2 var8 = var7.byte_();
      var8.class_(3, ju_3.this_);

      for (int var9 = 0; var9 < var0.throws_(); var9++) {
         rLq_1 var10 = var0.class_(var9);
         if (!(class_(var10.byte_(), var1, var3, var5) > 80.0F)) {
            float var11 = (float)var9 / (float)var0.throws_() * 0.33F;
            int var12 = var9 == 0 ? 0 : rfU_2.case_(var11, 0.9F, 0.9F);
            int var13 = var12 >> 16 & 0xFF;
            int var14 = var12 >> 8 & 0xFF;
            int var15 = var12 & 0xFF;
            var8.class_((double)var10.class_ - var1 + 0.5, (double)var10.break_ - var3 + 0.5, (double)var10.byte_ - var5 + 0.5)
               .break_(var13, var14, var15, 255)
               .class_();
         }
      }

      var7.break_();
   }

   private static float class_(rfH_2 var0, double var1, double var3, double var5) {
      return (float)(Math.abs((double)var0.b_() - var1) + Math.abs((double)var0.c_() - var3) + Math.abs((double)var0.d_() - var5));
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      if (!this.class_.isEmpty()) {
         long var9 = rqR_2.break_();

         for (Integer var12 : this.class_.keySet()) {
            rLC var13 = this.class_.get(var12);
            float var14 = this.break_.get(var12);
            class_(var13, var14, true, true, var3, var5, var7);
         }

         for (Integer var18 : this.byte_.keySet().toArray(new Integer[0])) {
            if (var9 - this.byte_.get(var18) > 5000L) {
               this.class_.remove(var18);
               this.byte_.remove(var18);
            }
         }
      }
   }

   public void class_(int var1, rLC var2, float var3) {
      this.class_.put(var1, var2);
      this.byte_.put(var1, rqR_2.break_());
      this.break_.put(var1, var3);
   }

   private static void break_(rLC var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      class_(var0, var4, var6, var8);
      rfH_2 var10 = var0.volatile_();
      if (class_(var10, var4, var6, var8) <= 80.0F) {
         yK_2.class_(
            new rfl_3(
                  (double)((float)var10.b_() + 0.25F),
                  (double)((float)var10.c_() + 0.25F),
                  (double)var10.d_() + 0.25,
                  (double)((float)var10.b_() + 0.75F),
                  (double)((float)var10.c_() + 0.75F),
                  (double)((float)var10.d_() + 0.75F)
               )
               .protected_(-var4, -var6, -var8),
            0.0F,
            1.0F,
            0.0F,
            0.5F
         );

         for (int var11 = 0; var11 < var0.throws_(); var11++) {
            rLq_1 var12 = var0.class_(var11);
            if (class_(var12.byte_(), var4, var6, var8) <= 80.0F) {
               float var13 = var11 == var0.case_() ? 1.0F : 0.0F;
               float var14 = var11 == var0.case_() ? 0.0F : 1.0F;
               yK_2.class_(
                  new rfl_3(
                        (double)((float)var12.class_ + 0.5F - var1),
                        (double)((float)var12.break_ + 0.01F * (float)var11),
                        (double)((float)var12.byte_ + 0.5F - var1),
                        (double)((float)var12.class_ + 0.5F + var1),
                        (double)((float)var12.break_ + 0.25F + 0.01F * (float)var11),
                        (double)((float)var12.byte_ + 0.5F + var1)
                     )
                     .protected_(-var4, -var6, -var8),
                  var13,
                  0.0F,
                  var14,
                  0.5F
               );
            }
         }
      }

      if (var2) {
         for (rLq_1 var23 : var0.native_()) {
            if (class_(var23.byte_(), var4, var6, var8) <= 80.0F) {
               yK_2.class_(
                  new rfl_3(
                        (double)((float)var23.class_ + 0.5F - var1 / 2.0F),
                        (double)((float)var23.break_ + 0.01F),
                        (double)((float)var23.byte_ + 0.5F - var1 / 2.0F),
                        (double)((float)var23.class_ + 0.5F + var1 / 2.0F),
                        (double)var23.break_ + 0.1,
                        (double)((float)var23.byte_ + 0.5F + var1 / 2.0F)
                     )
                     .protected_(-var4, -var6, -var8),
                  1.0F,
                  0.8F,
                  0.8F,
                  0.5F
               );
            }
         }

         for (rLq_1 var24 : var0.extends_()) {
            if (class_(var24.byte_(), var4, var6, var8) <= 80.0F) {
               yK_2.class_(
                  new rfl_3(
                        (double)((float)var24.class_ + 0.5F - var1 / 2.0F),
                        (double)((float)var24.break_ + 0.01F),
                        (double)((float)var24.byte_ + 0.5F - var1 / 2.0F),
                        (double)((float)var24.class_ + 0.5F + var1 / 2.0F),
                        (double)var24.break_ + 0.1,
                        (double)((float)var24.byte_ + 0.5F + var1 / 2.0F)
                     )
                     .protected_(-var4, -var6, -var8),
                  0.8F,
                  1.0F,
                  1.0F,
                  0.5F
               );
            }
         }
      }

      if (var3) {
         for (int var17 = 0; var17 < var0.throws_(); var17++) {
            rLq_1 var20 = var0.class_(var17);
            if (class_(var20.byte_(), var4, var6, var8) <= 80.0F) {
               yK_2.class_(
                  String.format("%s", var20.native_),
                  (double)var20.class_ + 0.5,
                  (double)var20.break_ + 0.75,
                  (double)var20.byte_ + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
               yK_2.class_(
                  String.format(Locale.ROOT, "%.2f", var20.extends_),
                  (double)var20.class_ + 0.5,
                  (double)var20.break_ + 0.25,
                  (double)var20.byte_ + 0.5,
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
