package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmo_3 implements rruq_1 {
   private static short[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{false, true};
   }

   rrmo_3() {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -748854037;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      String var2 = var1.extends_();
      int var3 = var1.case_(0) ? -1 : var1.break_((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[0]);
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).class_(new rrqz_3(ri_3.class_(var2), var3), var2, true);
   }

   private static void class_() {
      break_ = new byte[]{-1};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 76, -21, 42, -8, 24, -54, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6608011646610890651L;
   }

   private static void break_() {
      class_ = new short[2];
   }
}
