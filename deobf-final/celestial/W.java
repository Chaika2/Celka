package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class W extends d_1 {
   private static boolean[] break_;
   private static byte[] byte_;
   private static String[] protected_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public W(C_import var1, Throwable var2) {
      super(var1, var2.getMessage());
   }

   public W(C_import var1, String var2) {
      super(var1, String.format("Ожидается %s", var2));
   }

   public W(C_import var1, String var2, Throwable var3) {
      super(var1, String.format("Ожидается %s", var2), var3);
   }

   public W(C_import var1, String var2, String var3) {
      super(var1, String.format("Ожидалось %s, но вместо этого получено %s", var2, var3));
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1250116677;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3299893787230363687L;
   }

   private static void class_() {
      break_ = new boolean[]{true, false, true, false, false, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, -69, -121, -21, -36, -55, -38, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new String[]{new String("Ожидается %s"), new String("Ожидается %s"), new String("Ожидалось %s, но вместо этого получено %s")};
   }
}
