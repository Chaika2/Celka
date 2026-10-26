package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pu_1 {
   private static double[] id_class;

   private Pu_1() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9138865955873514656L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-14, -43, -120, -69, 64, 117, 117, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new double[]{2.0, 2.0, 2.0, 0.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
   }

   public static double id_class(an_3 var0, rfH_2 var1) {
      return id_class(var1, var0.Ps().id_break, var0.Ps().id_byte, var0.Ps().id_protected);
   }

   public static double id_class(rfH_2 var0, double var1, double var3, double var5) {
      double var7 = (double)var0.b_() + 0.5 - var1;
      double var9 = (double)var0.c_() + 0.5 - var3;
      double var11 = (double)var0.d_() + 0.5 - var5;
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public static rjU_2 id_class(rfH_2 var0) {
      return new rjU_2((double)var0.b_() + 0.5, (double)var0.c_() + 0.5, (double)var0.d_() + 0.5);
   }

   public static rjU_2 id_class(rYB var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      rjC_2 var3 = var2.id_extends(var0, var1);
      if (var3.id_break()) {
         return id_class(var1);
      } else {
         double var4 = (var3.id_break(rpB_2.X) + var3.id_byte(rpB_2.X)) / 2.0;
         double var6 = (var3.id_break(rpB_2.Y) + var3.id_byte(rpB_2.Y)) / 2.0;
         double var8 = (var3.id_break(rpB_2.Z) + var3.id_byte(rpB_2.Z)) / 2.0;
         if (!Double.isNaN(var4) && !Double.isNaN(var6) && !Double.isNaN(var8)) {
            if (var2.id_break() instanceof Jj_1) {
               var6 = 0.0;
            }

            return new rjU_2((double)var1.b_() + var4, (double)var1.c_() + var6, (double)var1.d_() + var8);
         } else {
            throw new IllegalStateException(var2 + " " + var1 + " " + var3);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1783521423;
   }

   public static double id_break(an_3 var0, rfH_2 var1) {
      return id_class(var1, var0.Ps().id_break, (double)var1.c_() + 0.5, var0.Ps().id_protected);
   }
}
