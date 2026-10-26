package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTG {
   public static Object[] class_;
   private static long[] break_;
   private static float[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      protected_ = new String[]{new String("Неизвестно"), new String("Europe/Moscow")};
   }

   static {
      ntfClinit();
   }

   private static LocalDateTime class_(rrTE var0, LocalDateTime var1) {
      LocalTime var2 = var0.class_();
      LocalDateTime var3 = var1.withHour(var2.getHour()).withMinute(var2.getMinute()).withSecond(0);
      if (var0.break_() != null) {
         var3 = var3.with(var0.break_());
      }

      return var3;
   }

   public static LocalDateTime class_(rrTE[] var0, LocalDateTime var1) {
      LocalDateTime var2 = null;

      for (rrTE var6 : var0) {
         LocalDateTime var7 = class_(var6, var1);
         if (var7.isAfter(var1.minusSeconds(1L)) && (var2 == null || var7.isBefore(var2))) {
            var2 = var7;
         }
      }

      if (var2 == null) {
         rrTE var8 = var0[0];
         if (var8.break_() != null) {
            var2 = class_(var8, var1.plusWeeks(1L));
         } else {
            var2 = class_(var8, var1.plusDays(1L));
         }
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8909185031847984086L;
   }

   public static String class_(LocalDateTime var0, LocalDateTime var1) {
      return var1 == null ? "Неизвестно" : rql_3.class_(Duration.between(var0, var1));
   }

   private static void class_() {
      break_ = new long[]{1L, 1L, 1L, 1L};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1054332347;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -80, -89, 122, 8, -89, -85, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new boolean[]{false, false, false, false, false, true};
   }

   public static float break_(LocalDateTime var0, LocalDateTime var1) {
      if (var1 != null && !var0.isAfter(var1)) {
         Duration var2 = Duration.between(var0, var1);
         Duration var3 = Duration.between(var0, var0.plusDays(1L));
         float var4 = 1.0F - (float)var2.toMillis() / (float)var3.toMillis();
         return rfU_2.class_(var4, 0.0F, 1.0F);
      } else {
         return byte_[0];
      }
   }

   private static void throws_() {
      byte_ = new float[]{0.0F, 1.0F, 0.0F, 1.0F};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{ZoneId.of("Europe/Moscow")};
      class_ = var0;
   }
}
