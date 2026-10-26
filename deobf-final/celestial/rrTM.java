package celestial;

import java.nio.charset.StandardCharsets;
import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTM {
   public static Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new byte[]{
         9,
         9,
         11,
         2,
         13,
         3,
         15,
         4,
         17,
         5,
         19,
         6,
         21,
         7,
         23,
         8,
         7,
         7,
         45,
         10,
         45,
         2,
         13,
         45,
         3,
         16,
         45,
         4,
         19,
         45,
         5,
         22,
         45,
         6,
         45,
         8,
         10,
         4,
         10,
         2,
         7,
         10,
         3,
         10,
         10,
         4,
         13,
         10,
         5,
         16,
         10,
         6,
         19,
         10,
         7,
         22,
         10,
         2,
         3,
         17,
         30,
         17,
         30,
         2,
         17,
         30,
         3,
         17,
         30,
         4,
         15,
         30,
         5,
         19,
         30,
         6,
         7
      };
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 741361243878679634L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1485892583;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -14, -76, 19, 21, 37, -29, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new boolean[]{
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false
      };
   }

   private static void break_() {
      Object[] var0 = new Object[7];
      rrTE[] var2 = new rrTE[]{
         rrTE.class_(LocalTime.of(9, 0)),
         rrTE.class_(LocalTime.of(11, 0)),
         rrTE.class_(LocalTime.of(13, 0)),
         rrTE.class_(LocalTime.of(15, 0)),
         rrTE.class_(LocalTime.of(17, 0)),
         rrTE.class_(LocalTime.of(19, 0)),
         rrTE.class_(LocalTime.of(21, 0)),
         rrTE.class_(LocalTime.of(23, 0)),
         rrTE.class_(LocalTime.of(1, 0))
      };
      var0[0] = var2;
      rrTE[] var3 = new rrTE[]{
         rrTE.class_(LocalTime.of(7, 45)),
         rrTE.class_(LocalTime.of(10, 45)),
         rrTE.class_(LocalTime.of(13, 45)),
         rrTE.class_(LocalTime.of(16, 45)),
         rrTE.class_(LocalTime.of(19, 45)),
         rrTE.class_(LocalTime.of(22, 45)),
         rrTE.class_(LocalTime.of(1, 45))
      };
      var0[1] = var3;
      rrTE[] var4 = new rrTE[]{
         rrTE.class_(LocalTime.of(1, 10)),
         rrTE.class_(LocalTime.of(4, 10)),
         rrTE.class_(LocalTime.of(7, 10)),
         rrTE.class_(LocalTime.of(10, 10)),
         rrTE.class_(LocalTime.of(13, 10)),
         rrTE.class_(LocalTime.of(16, 10)),
         rrTE.class_(LocalTime.of(19, 10)),
         rrTE.class_(LocalTime.of(22, 10))
      };
      var0[2] = var4;
      rrTE[] var5 = new rrTE[]{
         rrTE.class_(Enum.valueOf(DayOfWeek.class, "MONDAY"), LocalTime.of(17, 30)),
         rrTE.class_(Enum.valueOf(DayOfWeek.class, "WEDNESDAY"), LocalTime.of(17, 30)),
         rrTE.class_(Enum.valueOf(DayOfWeek.class, "FRIDAY"), LocalTime.of(17, 30))
      };
      var0[3] = var5;
      rrTE[] var6 = new rrTE[]{rrTE.class_(Enum.valueOf(DayOfWeek.class, "SUNDAY"), LocalTime.of(17, 30))};
      var0[4] = var6;
      rrTE[] var7 = new rrTE[]{rrTE.class_(LocalTime.of(15, 30))};
      var0[5] = var7;
      rrTE[] var8 = new rrTE[]{rrTE.class_(LocalTime.of(19, 30))};
      var0[6] = var8;
      class_ = var0;
   }
}
