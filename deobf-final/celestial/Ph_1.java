package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ph_1 implements MinecraftAccessor {
   private static double[] class_;
   private static float[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, false, true, false, true};
   }

   private Ph_1() {
   }

   static {
      ntfClinit();
   }

   public static an_3 class_(PX var0, float var1, boolean var2, Predicate<an_3> var3) {
      return class_(((cb_3)import_.class_[57]).new_(1.0F), ((cb_3)import_.class_[57]).byte_(var0.protected_(), var0.throws_()), var0, var1, var2, var3);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2473134615690766259L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-19, 108, 103, -110, 35, -22, 70, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 5808968;
   }

   public static an_3 class_(an_3 var0, rjU_2 var1, PX var2, float var3, boolean var4) {
      return class_(var0, var1, var2, var3, var4, null);
   }

   public static rjU_2 class_(an_3 var0) {
      return new rjU_2(var0.rx(), var0.re() + (double)var0.byte_(iM_2.CROUCHING), var0.BO());
   }

   public static rjG_2 class_(rjU_2 var0, rjU_2 var1, rjS_2 var2, boolean var3) {
      return ((gm_3)import_.class_[56]).class_(new rjB_2(var0, var1, var2, rjs_3.NONE, (cb_3)import_.class_[57]), var3);
   }

   private static void class_() {
      break_ = new float[]{1.0F, 1.0F};
   }

   public static rjG_2 class_(an_3 var0, PX var1, double var2, boolean var4, Predicate<xc_3> var5) {
      rjU_2 var6;
      if (var4) {
         var6 = class_(var0);
      } else {
         var6 = var0.new_(1.0F);
      }

      rjU_2 var7 = PJ.class_(var1);
      rjU_2 var8 = var6.break_(var7.break_ * var2, var7.byte_ * var2, var7.protected_ * var2);
      rjB_2 var9 = new rjB_2(var6, var8, rjS_2.OUTLINE, rjs_3.NONE, var0);
      var9.class_(var5);
      return ((rYB)var0.throws_[7]).class_(var9);
   }

   public static an_3 class_(an_3 var0, rjU_2 var1, PX var2, float var3, boolean var4, Predicate<xc_3> var5) {
      if (var0 == null) {
         return null;
      } else {
         Object var6 = var4 ? null : PJ.class_(var2, (double)var3, false, var5);
         double var7 = (double)(var3 * var3);
         if (var6 != null) {
            var7 = ((rjG_2)var6).case_().case_(var1);
         }

         rjU_2 var9 = PJ.class_(var2);
         rjU_2 var10 = var1.break_(var9.break_ * (double)var3, var9.byte_ * (double)var3, var9.protected_ * (double)var3);
         rfo_3 var11 = rhj_3.class_((cb_3)import_.class_[57], var0, var1, var10, var7);
         if (var11 == null) {
            return null;
         } else {
            an_3 var12 = var11.class_();
            rjU_2 var13 = var11.case_();
            double var14 = var1.case_(var13);
            if (var14 < var7 || var6 == null) {
               var6 = var11;
            }

            return ((rjG_2)var6).byte_() == rjM_2.ENTITY ? var12 : null;
         }
      }
   }

   public static rjG_2 class_(an_3 var0, PX var1, double var2) {
      return class_(var0, var1, var2, false);
   }

   public static rjG_2 class_(an_3 var0, PX var1, double var2, boolean var4) {
      return class_(var0, var1, var2, var4, var0x -> true);
   }

   public static an_3 class_(rjU_2 var0, rjU_2 var1, PX var2, float var3, boolean var4, Predicate<an_3> var5) {
      rjG_2 var6 = var4 ? null : PJ.class_(var2, (double)var3, false);
      double var7 = (double)(var3 * var3);
      if (var6 != null) {
         var7 = var6.case_().implements_(var0);
      }

      rjU_2 var9 = var0.break_(var1.break_ * var7, var1.byte_ * var7, var1.protected_ * var7);
      rfl_3 var10 = ((cb_3)import_.class_[57]).rN().break_(var1.class_(var7)).class_(1.0);
      rfo_3 var11 = rhj_3.class_(
         (cb_3)import_.class_[57], var0, var9, var10, var1x -> var1x.native_() || !var1x.rY() || var5 != null && !var5.test(var1x) ? byte_[4] : byte_[3], var7
      );
      return var11 == null ? null : var11.class_();
   }

   private static void break_() {
      class_ = new double[]{1.0};
   }

   private static void protected_() {
      protected_ = new short[]{7, 56, 57, 57, 57, 57, 57, 57};
   }
}
