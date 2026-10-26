package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record rrtU_2() {
   private static boolean[] byte_;
   private static String[] protected_;
   public boolean class_;
   public String break_;

   public boolean byte_() {
      return this.class_;
   }

   public rrtU_2(boolean var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 434032724160613049L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -222524237;
   }

   public static rrtU_2 class_() {
      return new rrtU_2(true, "");
   }

   public static rrtU_2 class_(String var0) {
      return new rrtU_2(false, var0);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, -14, 79, 68, -39, -1, -41, 35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new String[]{new String("")};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true};
   }
}
