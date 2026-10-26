package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rryv_1 {
   private static short[] class_;
   private static boolean[] break_;

   public boolean byte_() {
      return this.class_() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[2] ? true : break_[5];
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8562890644460602199L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1630636971;
   }

   public abstract rryF class_();

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -94, 69, -113, -107, -72, -5, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      class_ = new short[]{0, 1, 2};
   }

   public boolean throws_() {
      return this.class_() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[1] ? true : break_[3];
   }

   private static void case_() {
      break_ = new boolean[]{true, false, true, false, true, false};
   }

   public boolean protected_() {
      return this.class_() == (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[0] ? true : break_[1];
   }
}
