package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pu_1 {
   private static double[] class_;

   private Pu_1() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9138865955873514656L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, -43, -120, -69, 64, 117, 117, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new double[]{2.0, 2.0, 2.0, 0.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
   }

   public static double class_(an_3 var0, rfH_2 var1) {
      return class_(var1, var0.Ps().break_, var0.Ps().byte_, var0.Ps().protected_);
   }

   public static double class_(rfH_2 var0, double var1, double var3, double var5) {
      double var7 = (double)var0.b_() + 0.5 - var1;
      double var9 = (double)var0.c_() + 0.5 - var3;
      double var11 = (double)var0.d_() + 0.5 - var5;
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public static rjU_2 class_(rfH_2 var0) {
      return new rjU_2((double)var0.b_() + 0.5, (double)var0.c_() + 0.5, (double)var0.d_() + 0.5);
   }

   public static rjU_2 class_(rYB var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      rjC_2 var3 = var2.extends_(var0, var1);
      if (var3.break_()) {
         return class_(var1);
      } else {
         double var4 = (var3.break_(rpB_2.X) + var3.byte_(rpB_2.X)) / 2.0;
         double var6 = (var3.break_(rpB_2.Y) + var3.byte_(rpB_2.Y)) / 2.0;
         double var8 = (var3.break_(rpB_2.Z) + var3.byte_(rpB_2.Z)) / 2.0;
         if (!Double.isNaN(var4) && !Double.isNaN(var6) && !Double.isNaN(var8)) {
            if (var2.break_() instanceof Jj_1) {
               var6 = 0.0;
            }

            return new rjU_2((double)var1.b_() + var4, (double)var1.c_() + var6, (double)var1.d_() + var8);
         } else {
            throw new IllegalStateException(var2 + " " + var1 + " " + var3);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1783521423;
   }

   public static double break_(an_3 var0, rfH_2 var1) {
      return class_(var1, var0.Ps().break_, (double)var1.c_() + 0.5, var0.Ps().protected_);
   }
}
