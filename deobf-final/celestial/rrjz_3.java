package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjz_3 {
   private static String[] break_;
   public static Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new String[]{
         new String(" Ком снега (предмет)"), new String(" Взрывная штучка (предмет)"), new String("Взрывная трапка"), new String("Стан"), new String("Трапка")
      };
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 19, -123, -52, -44, 26, 53, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5767513170456149092L;
   }

   private static void class_() {
      protected_ = new boolean[]{false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1962822330;
   }

   private static void break_() {
      Object[] var0 = new Object[]{" Ком снега (предмет)", " Взрывная штучка (предмет)", "Взрывная трапка", "Стан", "Трапка"};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new byte[]{5, 2, 3, 4};
   }
}
