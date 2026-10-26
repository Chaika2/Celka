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
   public static Object[] id_class;
   private static long[] id_break;
   private static float[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_protected = new String[]{new String("Неизвестно"), new String("Europe/Moscow")};
   }

   static {
      ntfClinit();
   }

   private static LocalDateTime id_class(rrTE var0, LocalDateTime var1) {
      LocalTime var2 = var0.id_class();
      LocalDateTime var3 = var1.withHour(var2.getHour()).withMinute(var2.getMinute()).withSecond(0);
      if (var0.id_break() != null) {
         var3 = var3.with(var0.id_break());
      }

      return var3;
   }

   public static LocalDateTime id_class(rrTE[] var0, LocalDateTime var1) {
      LocalDateTime var2 = null;

      for (rrTE var6 : var0) {
         LocalDateTime var7 = id_class(var6, var1);
         if (var7.isAfter(var1.minusSeconds(1L)) && (var2 == null || var7.isBefore(var2))) {
            var2 = var7;
         }
      }

      if (var2 == null) {
         rrTE var8 = var0[0];
         if (var8.id_break() != null) {
            var2 = id_class(var8, var1.plusWeeks(1L));
         } else {
            var2 = id_class(var8, var1.plusDays(1L));
         }
      }

      return var2;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8909185031847984086L;
   }

   public static String id_class(LocalDateTime var0, LocalDateTime var1) {
      return var1 == null ? "Неизвестно" : rql_3.id_class(Duration.between(var0, var1));
   }

   private static void id_class() {
      id_break = new long[]{1L, 1L, 1L, 1L};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1054332347;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -80, -89, 122, 8, -89, -85, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_throws = new boolean[]{false, false, false, false, false, true};
   }

   public static float id_break(LocalDateTime var0, LocalDateTime var1) {
      if (var1 != null && !var0.isAfter(var1)) {
         Duration var2 = Duration.between(var0, var1);
         Duration var3 = Duration.between(var0, var0.plusDays(1L));
         float var4 = 1.0F - (float)var2.toMillis() / (float)var3.toMillis();
         return rfU_2.id_class(var4, 0.0F, 1.0F);
      } else {
         return id_byte[0];
      }
   }

   private static void id_throws() {
      id_byte = new float[]{0.0F, 1.0F, 0.0F, 1.0F};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{ZoneId.of("Europe/Moscow")};
      id_class = var0;
   }
}
