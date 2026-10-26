package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwb_3 {
   public static Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static String[] case_;

   private static void byte_() {
      break_ = new short[]{0, 0, 4, 4, 0, 5, 5, 0, 12, 230, 200, 230, 200};
   }

   private rrwb_3() {
   }

   static {
      ntfClinit();
   }

   private static void class_(Ml_1 var0, rrtN_2 var1) {
      rrws_3 var2 = var1.short_();
      if (var2.class_()) {
         float var3 = var2.byte_();
         float var4 = var2.throws_();
         float var5 = var2.extends_();
         float var6 = var2.private_();
         float var7 = ((AnimValue)class_[12]).final_();
         int var8 = (int)(30.0F + 50.0F * var7);
         rrfD_2.class_(var0, var3, var4, var5, var6, ColorHelper.break_(rrZF.d_, var8));
         float var9 = Math.min(Math.max(Math.min(var5, var6) * 0.18F, 6.0F), 18.0F);
         float var10 = 1.0F;
         int var11 = ColorHelper.break_(rrZF.d_, 230);
         rrfD_2.class_(var0, var3, var4, var9, var10, var11);
         rrfD_2.class_(var0, var3, var4, var10, var9, var11);
         rrfD_2.class_(var0, var3 + var5 - var9, var4, var9, var10, var11);
         rrfD_2.class_(var0, var3 + var5 - var10, var4, var10, var9, var11);
         rrfD_2.class_(var0, var3, var4 + var6 - var10, var9, var10, var11);
         rrfD_2.class_(var0, var3, var4 + var6 - var9, var10, var9, var11);
         rrfD_2.class_(var0, var3 + var5 - var9, var4 + var6 - var10, var9, var10, var11);
         rrfD_2.class_(var0, var3 + var5 - var10, var4 + var6 - var9, var10, var9, var11);
         float var12 = var3 + var5 / 2.0F;
         float var13 = var4 + var6 / 2.0F;
         int var14 = ColorHelper.break_(rrZF.d_, 200);
         rrfD_2.class_(var0, var12 - 2.5F, var13 - 0.5F, 5.0F, 1.0F, var14);
         rrfD_2.class_(var0, var12 - 0.5F, var13 - 2.5F, 1.0F, 5.0F, var14);
      }
   }

   public static void class_(Ml_1 var0, rrtu_3 var1, float var2, float var3) {
      rrtN_2 var4 = class_(var1);
      if (var4 != null) {
         rrwh_3 var5 = var4.short_().implements_();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         rrfD_2.throws_(MinecraftAccessor.strictfp_);
         if (var5 != null) {
            class_(var0, var5, var2, var3);
         }

         class_(var0, var4);
         rrfD_2.break_();
         if (var4 instanceof rrvj_1 var6 && var6.return_().byte_() > 0.01F) {
            return;
         }

         float var7;
         float var8;
         rrZO var11;
         String var10000;
         label22: {
            var11 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).implements_();
            var7 = var4.default_() + var4.implements_() / 2.0F;
            var8 = var4.abstract_() - var4.au_() - 8.0F;
            if (var4 instanceof rrvj_1 var10 && var10.continue_()) {
               var10000 = "ПКМ - Отключить центрирование";
               break label22;
            }

            var10000 = case_[1];
         }

         String var9 = var10000;
         var11.byte_(var0, var9, var7, var8, rrZF.d_, false);
      }
   }

   private static rrtN_2 class_(rrtu_3 var0) {
      for (rrtN_2 var2 : var0.class_()) {
         if (var2 instanceof rrvj_1 && var2.short_().catch_()) {
            return var2;
         }
      }

      return null;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -672057470;
   }

   private static void class_(Ml_1 var0, rrwh_3 var1, float var2, float var3) {
      if ((Float)var1.class_[4] != null) {
         rrfD_2.class_(var0, (Float)var1.class_[4] - 0.25F, 0.0F, 0.5F, var3, (Integer)class_[0]);
      }

      if ((Float)var1.class_[5] != null) {
         rrfD_2.class_(var0, 0.0F, (Float)var1.class_[5] - 0.25F, var2, 0.5F, (Integer)class_[0]);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3868675602288975437L;
   }

   public static void class_(Ml_1 var0, rrtu_3 var1) {
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).implements_();

      for (rrtN_2 var4 : var1.class_()) {
         if (var4 instanceof rrvj_1) {
            rrvj_1 var5 = (rrvj_1)var4;
            if (var4.aq_()) {
               var5.else_();
               float var6 = var5.return_().byte_();
               float var7 = var5.long_();
               if (!(var6 <= 0.0F) && !(var7 <= 0.0F) && var5.break_() != null) {
                  int var8 = (int)(var6 * var7 * 255.0F);
                  int var9 = ColorHelper.break_(rrZF.d_, var8);
                  float var10 = var4.default_() + var4.implements_() / 2.0F;
                  float var11 = var4.abstract_() - var4.au_() - 8.0F;
                  var2.byte_(var0, var5.break_(), var10, var11, var9, false);
               }
            }
         }
      }
   }

   private static void class_() {
      byte_ = new byte[]{7, 12, 16, 2, 30, 3, 80, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 22, 124, 46, -108, -103, 18, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{
         -1315861,
         0.0F,
         30,
         80,
         230,
         200,
         0.0F,
         -0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         new AnimValue(0.25F, false),
         "ПКМ - Включить центрирование",
         "ПКМ - Отключить центрирование",
         0.0F
      };
      class_ = var0;
   }

   private static void throws_() {
      throws_ = new boolean[]{false, false, false, false, false, false, true};
   }

   private static void case_() {
      case_ = new String[]{
         new String("ПКМ - Отключить центрирование"),
         new String("ПКМ - Включить центрирование"),
         new String("ПКМ - Включить центрирование"),
         new String("ПКМ - Отключить центрирование")
      };
   }

   private static void protected_() {
      protected_ = new float[]{
         0.0F,
         0.0F,
         255.0F,
         2.0F,
         8.0F,
         0.01F,
         2.0F,
         8.0F,
         0.25F,
         0.0F,
         0.5F,
         0.0F,
         0.25F,
         0.5F,
         30.0F,
         50.0F,
         0.18F,
         6.0F,
         18.0F,
         1.0F,
         2.0F,
         2.0F,
         2.5F,
         0.5F,
         5.0F,
         1.0F,
         0.5F,
         2.5F,
         1.0F,
         5.0F,
         0.25F,
         0.5F,
         1.0F,
         0.18F,
         6.0F,
         18.0F,
         2.5F,
         1.0F,
         8.0F
      };
   }
}
