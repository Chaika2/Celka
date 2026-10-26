package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjz_3 {
   private static String[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new String[]{
         new String(" Ком снега (предмет)"), new String(" Взрывная штучка (предмет)"), new String("Взрывная трапка"), new String("Стан"), new String("Трапка")
      };
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 19, -123, -52, -44, 26, 53, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5767513170456149092L;
   }

   private static void id_class() {
      id_protected = new boolean[]{false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1962822330;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{" Ком снега (предмет)", " Взрывная штучка (предмет)", "Взрывная трапка", "Стан", "Трапка"};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new byte[]{5, 2, 3, 4};
   }
}
