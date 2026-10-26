package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruR implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new boolean[]{false, true};
   }

   rruR() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-114, 37, -30, -79, -29, -1, -7, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2359317265975959412L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 670489735;
   }

   private static void class_() {
      class_ = new short[2];
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.extends_();
      int var3 = var1.case_(0) ? -1 : var1.break_((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[0]);
      ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).class_(new rrqU_2(ri_3.class_(var2), var3), var2, true);
   }

   private static void break_() {
      byte_ = new byte[]{-1};
   }
}
