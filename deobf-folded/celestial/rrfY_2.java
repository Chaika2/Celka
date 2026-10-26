package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfY_2 implements MinecraftAccessor {
   private static byte[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1209742531;
   }

   public static int id_byte() {
      for (int var0 = id_byte[1]; var0 < 9; var0++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var0).id_class()) {
            return var0;
         }
      }

      return -1;
   }

   static {
      ntfClinit();
   }

   public static int id_class(Class<?> var0) {
      if (var0.isInstance(((cb_3)id_import.id_class[57]).ss().id_break())) {
         return -2;
      } else if (var0.isInstance(((cb_3)id_import.id_class[57]).Sn().id_break())) {
         return -3;
      } else {
         for (int var1 = id_byte[6]; var1 < 9; var1++) {
            if (var0.isInstance(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var1).id_break())) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, 126, 89, -113, 97, 115, 35, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean id_class(rdb_3 var0) {
      return ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_finally().id_break() == var0 ? true : id_byte[12];
   }

   public static int id_class(rdb_3 var0, Predicate<rdn_3> var1) {
      int var2 = id_byte[3];

      for (int var3 = id_byte[4]; var3 < 45; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3);
         if (var4.id_break() == var0 && var1.test(var4)) {
            var2++;
         }
      }

      return var2;
   }

   public static int id_class(boolean var0, boolean var1) {
      if (var1) {
         if (((cb_3)id_import.id_class[57]).ss().id_break() == rdy_3.kc) {
            if (!rxH_2.id_protected(((cb_3)id_import.id_class[57]).ss())) {
               return -1;
            }

            return -2;
         }

         if (((cb_3)id_import.id_class[57]).Sn().id_break() == rdy_3.kc) {
            if (!rxH_2.id_protected(((cb_3)id_import.id_class[57]).Sn())) {
               return -1;
            }

            return -3;
         }
      }

      for (int var2 = var0 ? 9 : id_byte[9]; var2 < 45; var2++) {
         rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
         if (var3.id_break() == rdy_3.kc && rxH_2.id_protected(var3)) {
            return var2;
         }
      }

      return -1;
   }

   public static int id_class(boolean var0) {
      if (((cb_3)id_import.id_class[57]).ss().id_break() instanceof rxJ_2 var1) {
         if (rrjc_3.id_class(var1.id_catch())) {
            return -2;
         }
      } else if (((cb_3)id_import.id_class[57]).Sn().id_break() instanceof rxJ_2 var2 && rrjc_3.id_class(var2.id_catch())) {
         return -3;
      }

      for (int var4 = var0 ? id_byte[8] : 9; var4 < (var0 ? 9 : 45); var4++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var4).id_break() instanceof rxJ_2 var5 && rrjc_3.id_class(var5.id_catch())) {
            return var4;
         }
      }

      return -1;
   }

   public static int id_class(int var0) {
      return var0 >= 36 && var0 <= 44 ? var0 - 36 : var0;
   }

   public static int id_class() {
      for (int var0 = id_byte[10]; var0 < 36; var0++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var0).id_class()) {
            return var0;
         }
      }

      return -1;
   }

   public static int id_class(rdb_3 var0, boolean var1, boolean var2) {
      if (var2) {
         if (((cb_3)id_import.id_class[57]).ss().id_break() == var0) {
            return -2;
         }

         if (((cb_3)id_import.id_class[57]).Sn().id_break() == var0) {
            return -3;
         }
      }

      for (int var3 = var1 ? 9 : id_byte[2]; var3 < 45; var3++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3).id_break() == var0) {
            return var3;
         }
      }

      return -1;
   }

   public static boolean id_class(List<rJY> var0, boolean var1) {
      boolean var2 = id_byte[14];

      for (rJY var4 : var0) {
         if ((!var1 || var4.id_protected >= 9 && var4.id_protected <= 44) && var4.id_break()) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static int id_class(Class<?> var0, boolean var1) {
      if (var0.isInstance(((cb_3)id_import.id_class[57]).ss().id_break())) {
         return -2;
      } else if (var0.isInstance(((cb_3)id_import.id_class[57]).Sn().id_break())) {
         return -3;
      } else {
         for (int var2 = var1 ? 9 : id_byte[7]; var2 < 45; var2++) {
            if (var0.isInstance(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2).id_break())) {
               return var2;
            }
         }

         return -1;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5922225581774832999L;
   }

   public static int id_class(rdn_3 var0, rdb_3 var1, Set<String> var2) {
      if (var0 == null) {
         return -1;
      } else {
         for (int var3 = id_byte[5]; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3);
            if (var4.id_break() == var1 && rdn_3.id_break(var4, var0, var2)) {
               return var3;
            }
         }

         return -1;
      }
   }

   public static int id_break(rdb_3 var0) {
      if (((cb_3)id_import.id_class[57]).ss().id_break() == var0) {
         return -2;
      } else if (((cb_3)id_import.id_class[57]).Sn().id_break() == var0) {
         return -3;
      } else {
         for (int var1 = id_byte[0]; var1 < 9; var1++) {
            if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var1).id_break() == var0) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static int id_break() {
      for (int var0 = id_byte[13]; var0 < 45; var0++) {
         rdn_3 var1 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var0);
         rdb_3 var2 = var1.id_break();
         if (rrfH_2.id_class(var1) && !var2.id_throws(var1)) {
            return var0;
         }
      }

      return -1;
   }

   public static int id_break(int var0) {
      return var0 >= 0 && var0 < 9 ? var0 + 36 : var0;
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true};
   }

   private static void id_case() {
      id_break = new short[]{
         57, 57, 57, 1, 57, 1, 57, 57, 57, 1, 57, 1, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 57, 57, 1, 57, 1, 57, 1, 57, 1
      };
   }

   private static void id_protected() {
      id_class = new byte[]{
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
