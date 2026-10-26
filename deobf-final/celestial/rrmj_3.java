package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmj_3 implements rruq_1 {
   private static boolean[] class_;
   private static float[] break_;
   private static double[] byte_;
   private static String[] protected_;
   private static short[] throws_;
   private static byte[] case_;

   private static void byte_() {
      byte_ = new double[2];
   }

   rrmj_3() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -66, -34, -68, 79, -32, 19, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6160871837883067820L;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      rjU_2 var2 = ((Hh_1)PP.b_.class_[16]).finally_().new_();
      if (var2 != null) {
         rjU_2 var3 = var2.class_(0.0, (double)(((cb_3)PP.b_.class_[57]).Bx() / 2.0F), 0.0);
         String var4 = !var1.case_() && !var1.case_(4) ? ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_("Untitled") : var1.extends_();
         rjU_2 var5 = var1.final_() ? var1.break_((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[0], var3) : var3;
         ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(new rrjD_2(var4, var5, rrfp_3.throws_()), true);
      }
   }

   private static void class_() {
      class_ = new boolean[]{true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1419539048;
   }

   private static void break_() {
      protected_ = new String[]{new String("Untitled")};
   }

   private static void throws_() {
      throws_ = new short[]{16, 57, 0, 0, 0};
   }

   private static void case_() {
      break_ = new float[]{2.0F};
   }

   private static void protected_() {
      case_ = new byte[]{4};
   }
}
