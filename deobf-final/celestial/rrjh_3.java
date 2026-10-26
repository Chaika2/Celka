package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjh_3 {
   private static String[] break_;
   private static byte[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;

   private static void byte_() {
      protected_ = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3905589146162429213L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{
         "[★] Дезориентация",
         "[★] Огненный смерч",
         "[★] Явная пыль",
         "[★] Снежок заморозка",
         "[★] Пласт",
         "[★] Новогодний пласт",
         "[★] Трапка",
         "[★] Новогодняя ловушка",
         "[★] Божья аура",
         "[★] Зелье Радиации",
         "[★] Зелье Гнева",
         "[★] Хлопушка",
         "[★] Зелье Палладина",
         "[★] Зелье Ассасина",
         "[★] Снотворное",
         "[★] Святая вода"
      };
      class_ = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, -94, -50, -102, -94, 40, 47, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1893320520;
   }

   private static void break_() {
      byte_ = new byte[]{16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   }

   private static void protected_() {
      break_ = new String[]{
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
