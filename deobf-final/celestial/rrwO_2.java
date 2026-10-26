package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwO_2 {
   private static float[] break_;
   public static Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   private static void byte_() {
      throws_ = new byte[]{3, 2, 3, 2};
   }

   private rrwO_2() {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      protected_ = new short[]{0, 1, 4, 4, 0, 2, 5, 5, 1, 3};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1130893836;
   }

   public static rrwh_3 class_(rrtN_2 var0, rrtu_3 var1, float var2, float var3, float var4, float var5) {
      float var6 = var0.implements_();
      float var7 = var0.ao_();
      float var8 = var0.import_();
      float[] var9 = new float[]{var2, var2 + var6 / 2.0F, var2 + var6};
      float[] var10 = new float[]{var3, var3 + var7 / 2.0F, var3 + var7};
      List var11 = break_(var0, var1, var4, var8);
      List var12 = class_(var0, var1, var5, var8);
      rrwh_3 var13 = new rrwh_3();
      Float var27 = var2;
      var13.class_[0] = var27;
      Float var28 = var3;
      var13.class_[1] = var28;
      float var14 = 5.0F;

      for (float var16 : var11) {
         for (float var20 : var9) {
            float var21 = var16 - var20;
            if (Math.abs(var21) <= 4.0F && Math.abs(var21) < Math.abs(var14)) {
               var14 = var21;
               Float var29 = var16;
               var13.class_[4] = var29;
            }
         }
      }

      if ((Float)var13.class_[4] != null) {
         Float var30 = var2 + var14;
         var13.class_[0] = var30;
         Boolean var31 = true;
         var13.class_[2] = var31;
      }

      float var35 = break_[4];

      for (float var37 : var12) {
         for (float var41 : var10) {
            float var22 = var37 - var41;
            if (Math.abs(var22) <= 4.0F && Math.abs(var22) < Math.abs(var35)) {
               var35 = var22;
               Float var32 = var37;
               var13.class_[5] = var32;
            }
         }
      }

      if ((Float)var13.class_[5] != null) {
         Float var33 = var3 + var35;
         var13.class_[1] = var33;
         Boolean var34 = true;
         var13.class_[3] = var34;
      }

      return var13;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -101, -128, -128, -43, -70, 35, -128}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1817861102095534634L;
   }

   private static List<Float> class_(rrtN_2 var0, rrtu_3 var1, float var2, float var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var3);
      var4.add(var2 / 2.0F);
      var4.add(var2 - var3);

      for (rrtN_2 var6 : var1.class_()) {
         if (var6 != var0 && var6 instanceof rrvj_1 && var6.aq_()) {
            float var7 = var6.abstract_();
            float var8 = var6.ao_();
            var4.add(var7);
            var4.add(var7 + var8 / 2.0F);
            var4.add(var7 + var8);
         }
      }

      return var4;
   }

   private static void break_() {
      byte_ = new boolean[]{false, true, false, true, false, true, false, true, true, false};
   }

   private static List<Float> break_(rrtN_2 var0, rrtu_3 var1, float var2, float var3) {
      ArrayList var4 = new ArrayList();
      var4.add(var3);
      var4.add(var2 / 2.0F);
      var4.add(var2 - var3);

      for (rrtN_2 var6 : var1.class_()) {
         if (var6 != var0 && var6 instanceof rrvj_1 && var6.aq_()) {
            float var7 = var6.default_();
            float var8 = var6.implements_();
            var4.add(var7);
            var4.add(var7 + var8 / 2.0F);
            var4.add(var7 + var8);
         }
      }

      return var4;
   }

   private static void throws_() {
      break_ = new float[]{2.0F, 2.0F, 5.0F, 4.0F, 5.0F, 4.0F, 2.0F, 2.0F, 2.0F, 2.0F, 4.0F};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{0.0F};
      class_ = var0;
   }
}
