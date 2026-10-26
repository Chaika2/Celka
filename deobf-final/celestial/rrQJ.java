package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQJ {
   public static Object[] class_;
   private static byte[] break_;
   private static String[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new String[]{new String("Celestial"), new String("Celestial"), new String("1.16.5"), new String("1.1"), new String("25/05/2026")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4498224296214547753L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, 49, -15, 92, 19, -40, 113, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new byte[]{6, 2, 3, 4};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1008673676;
   }

   private static void break_() {
      Object[] var0 = new Object[]{"Celestial", new String("CELESTIAL"), "1.16.5", "1.1", "25/05/2026", null};
      class_ = var0;
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false};
   }
}
