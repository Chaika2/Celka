package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfY_2 implements MinecraftAccessor {
   private static byte[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1209742531;
   }

   public static int byte_() {
      for (int var0 = 0; var0 < 9; var0++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var0).class_()) {
            return var0;
         }
      }

      return class_[5];
   }

   static {
      ntfClinit();
   }

   public static int class_(Class<?> var0) {
      if (var0.isInstance(((cb_3)import_.class_[57]).ss().break_())) {
         return -2;
      } else if (var0.isInstance(((cb_3)import_.class_[57]).Sn().break_())) {
         return -3;
      } else {
         for (int var1 = byte_[6]; var1 < 9; var1++) {
            if (var0.isInstance(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1).break_())) {
               return var1;
            }
         }

         return class_[18];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, 126, 89, -113, 97, 115, 35, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean class_(rdb_3 var0) {
      return ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).finally_().break_() == var0 ? true : byte_[12];
   }

   public static int class_(rdb_3 var0, Predicate<rdn_3> var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 45; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3);
         if (var4.break_() == var0 && var1.test(var4)) {
            var2++;
         }
      }

      return var2;
   }

   public static int class_(boolean var0, boolean var1) {
      if (var1) {
         if (((cb_3)import_.class_[57]).ss().break_() == rdy_3.kc) {
            if (!rxH_2.protected_(((cb_3)import_.class_[57]).ss())) {
               return -1;
            }

            return class_[31];
         }

         if (((cb_3)import_.class_[57]).Sn().break_() == rdy_3.kc) {
            if (!rxH_2.protected_(((cb_3)import_.class_[57]).Sn())) {
               return -1;
            }

            return class_[33];
         }
      }

      for (int var2 = var0 ? 9 : byte_[9]; var2 < 45; var2++) {
         rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
         if (var3.break_() == rdy_3.kc && rxH_2.protected_(var3)) {
            return var2;
         }
      }

      return class_[36];
   }

   public static int class_(boolean var0) {
      if (((cb_3)import_.class_[57]).ss().break_() instanceof rxJ_2 var1) {
         if (rrjc_3.class_(var1.catch_())) {
            return -2;
         }
      } else if (((cb_3)import_.class_[57]).Sn().break_() instanceof rxJ_2 var2 && rrjc_3.class_(var2.catch_())) {
         return -3;
      }

      for (int var4 = var0 ? 0 : class_[26]; var4 < (var0 ? 9 : class_[28]); var4++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var4).break_() instanceof rxJ_2 var5 && rrjc_3.class_(var5.catch_())) {
            return var4;
         }
      }

      return class_[29];
   }

   public static int class_(int var0) {
      return var0 >= 36 && var0 <= 44 ? var0 - 36 : var0;
   }

   public static int class_() {
      for (int var0 = 0; var0 < 36; var0++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var0).class_()) {
            return var0;
         }
      }

      return class_[38];
   }

   public static int class_(rdb_3 var0, boolean var1, boolean var2) {
      if (var2) {
         if (((cb_3)import_.class_[57]).ss().break_() == var0) {
            return -2;
         }

         if (((cb_3)import_.class_[57]).Sn().break_() == var0) {
            return -3;
         }
      }

      for (int var3 = var1 ? 9 : byte_[2]; var3 < 45; var3++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3).break_() == var0) {
            return var3;
         }
      }

      return class_[10];
   }

   public static boolean class_(List<rJY> var0, boolean var1) {
      boolean var2 = false;

      for (rJY var4 : var0) {
         if ((!var1 || var4.protected_ >= 9 && var4.protected_ <= 44) && var4.break_()) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static int class_(Class<?> var0, boolean var1) {
      if (var0.isInstance(((cb_3)import_.class_[57]).ss().break_())) {
         return -2;
      } else if (var0.isInstance(((cb_3)import_.class_[57]).Sn().break_())) {
         return -3;
      } else {
         for (int var2 = var1 ? 9 : byte_[7]; var2 < 45; var2++) {
            if (var0.isInstance(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2).break_())) {
               return var2;
            }
         }

         return class_[23];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5922225581774832999L;
   }

   public static int class_(rdn_3 var0, rdb_3 var1, Set<String> var2) {
      if (var0 == null) {
         return -1;
      } else {
         for (int var3 = byte_[5]; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3);
            if (var4.break_() == var1 && rdn_3.break_(var4, var0, var2)) {
               return var3;
            }
         }

         return class_[14];
      }
   }

   public static int break_(rdb_3 var0) {
      if (((cb_3)import_.class_[57]).ss().break_() == var0) {
         return -2;
      } else if (((cb_3)import_.class_[57]).Sn().break_() == var0) {
         return -3;
      } else {
         for (int var1 = byte_[0]; var1 < 9; var1++) {
            if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var1).break_() == var0) {
               return var1;
            }
         }

         return class_[3];
      }
   }

   public static int break_() {
      for (int var0 = 0; var0 < 45; var0++) {
         rdn_3 var1 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var0);
         rdb_3 var2 = var1.break_();
         if (rrfH_2.class_(var1) && !var2.throws_(var1)) {
            return var0;
         }
      }

      return class_[45];
   }

   public static int break_(int var0) {
      return var0 >= 0 && var0 < 9 ? var0 + 36 : var0;
   }

   private static void throws_() {
      byte_ = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true};
   }

   private static void case_() {
      break_ = new short[]{
         57, 57, 57, 1, 57, 1, 57, 57, 57, 1, 57, 1, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 57, 57, 1, 57, 1, 57, 1, 57, 1
      };
   }

   private static void protected_() {
      class_ = new byte[]{
         -2,
         -3,
         9,
         -1,
         9,
         -1,
         -2,
         -3,
         9,
         45,
         -1,
         45,
         -1,
         45,
         -1,
         -2,
         -3,
         9,
         -1,
         -2,
         -3,
         9,
         45,
         -1,
         -2,
         -3,
         9,
         9,
         45,
         -1,
         -1,
         -2,
         -1,
         -3,
         9,
         45,
         -1,
         36,
         -1,
         9,
         36,
         36,
         44,
         36,
         45,
         -1,
         9,
         44
      };
   }
}
