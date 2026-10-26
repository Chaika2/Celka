package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjh_3 {
   private static String[] id_break;
   private static byte[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3905589146162429213L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{
         id_break[0],
         id_break[1],
         id_break[2],
         id_break[3],
         id_break[4],
         id_break[5],
         id_break[6],
         id_break[7],
         id_break[8],
         id_break[9],
         id_break[10],
         id_break[11],
         id_break[12],
         id_break[13],
         id_break[14],
         id_break[15]
      };
      id_class = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -94, -50, -102, -94, 40, 47, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1893320520;
   }

   private static void id_break() {
      id_byte = new byte[]{16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("[★] Дезориентация"),
         new String("[★] Огненный смерч"),
         new String("[★] Явная пыль"),
         new String("[★] Снежок заморозка"),
         new String("[★] Пласт"),
         new String("[★] Новогодний пласт"),
         new String("[★] Трапка"),
         new String("[★] Новогодняя ловушка"),
         new String("[★] Божья аура"),
         new String("[★] Зелье Радиации"),
         new String("[★] Зелье Гнева"),
         new String("[★] Хлопушка"),
         new String("[★] Зелье Палладина"),
         new String("[★] Зелье Ассасина"),
         new String("[★] Снотворное"),
         new String("[★] Святая вода")
      };
   }
}
