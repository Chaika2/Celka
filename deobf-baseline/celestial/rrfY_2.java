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
      for (int var0 = id_byte[1]; var0 < id_class[4]; var0++) {
         if (((rhz_3)((cb_3)id_import.id_class[id_break[4]]).id_implements[id_break[5]]).id_extends(var0).id_class()) {
            return var0;
         }
      }

      return id_class[5];
   }

   static {
      ntfClinit();
   }

   public static int id_class(Class<?> var0) {
      if (var0.isInstance(((cb_3)id_import.id_class[id_break[14]]).ss().id_break())) {
         return id_class[15];
      } else if (var0.isInstance(((cb_3)id_import.id_class[id_break[15]]).Sn().id_break())) {
         return id_class[16];
      } else {
         for (int var1 = id_byte[6]; var1 < id_class[17]; var1++) {
            if (var0.isInstance(((rhz_3)((cb_3)id_import.id_class[id_break[16]]).id_implements[id_break[17]]).id_extends(var1).id_break())) {
               return var1;
            }
         }

         return id_class[18];
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
      return ((rhz_3)((cb_3)id_import.id_class[id_break[34]]).id_implements[id_break[35]]).id_finally().id_break() == var0 ? id_byte[11] : id_byte[12];
   }

   public static int id_class(rdb_3 var0, Predicate<rdn_3> var1) {
      int var2 = id_byte[3];

      for (int var3 = id_byte[4]; var3 < id_class[11]; var3++) {
         rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_break[10]]).id_implements[id_break[11]]).id_extends(var3);
         if (var4.id_break() == var0 && var1.test(var4)) {
            var2++;
         }
      }

      return var2;
   }

   public static int id_class(boolean var0, boolean var1) {
      if (var1) {
         if (((cb_3)id_import.id_class[id_break[26]]).ss().id_break() == rdy_3.kc) {
            if (!rxH_2.id_protected(((cb_3)id_import.id_class[id_break[27]]).ss())) {
               return id_class[30];
            }

            return id_class[31];
         }

         if (((cb_3)id_import.id_class[id_break[28]]).Sn().id_break() == rdy_3.kc) {
            if (!rxH_2.id_protected(((cb_3)id_import.id_class[id_break[29]]).Sn())) {
               return id_class[32];
            }

            return id_class[33];
         }
      }

      for (int var2 = var0 ? id_class[34] : id_byte[9]; var2 < id_class[35]; var2++) {
         rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_break[30]]).id_implements[id_break[31]]).id_extends(var2);
         if (var3.id_break() == rdy_3.kc && rxH_2.id_protected(var3)) {
            return var2;
         }
      }

      return id_class[36];
   }

   public static int id_class(boolean var0) {
      if (((cb_3)id_import.id_class[id_break[22]]).ss().id_break() instanceof rxJ_2 var1) {
         if (rrjc_3.id_class(var1.id_catch())) {
            return id_class[24];
         }
      } else if (((cb_3)id_import.id_class[id_break[23]]).Sn().id_break() instanceof rxJ_2 var2 && rrjc_3.id_class(var2.id_catch())) {
         return id_class[25];
      }

      for (int var4 = var0 ? id_byte[8] : id_class[26]; var4 < (var0 ? id_class[27] : id_class[28]); var4++) {
         if (((rhz_3)((cb_3)id_import.id_class[id_break[24]]).id_implements[id_break[25]]).id_extends(var4).id_break() instanceof rxJ_2 var5
            && rrjc_3.id_class(var5.id_catch())) {
            return var4;
         }
      }

      return id_class[29];
   }

   public static int id_class(int var0) {
      return var0 >= id_class[41] && var0 <= id_class[42] ? var0 - id_class[43] : var0;
   }

   public static int id_class() {
      for (int var0 = id_byte[10]; var0 < id_class[37]; var0++) {
         if (((rhz_3)((cb_3)id_import.id_class[id_break[32]]).id_implements[id_break[33]]).id_extends(var0).id_class()) {
            return var0;
         }
      }

      return id_class[38];
   }

   public static int id_class(rdb_3 var0, boolean var1, boolean var2) {
      if (var2) {
         if (((cb_3)id_import.id_class[id_break[6]]).ss().id_break() == var0) {
            return id_class[6];
         }

         if (((cb_3)id_import.id_class[id_break[7]]).Sn().id_break() == var0) {
            return id_class[7];
         }
      }

      for (int var3 = var1 ? id_class[8] : id_byte[2]; var3 < id_class[9]; var3++) {
         if (((rhz_3)((cb_3)id_import.id_class[id_break[8]]).id_implements[id_break[9]]).id_extends(var3).id_break() == var0) {
            return var3;
         }
      }

      return id_class[10];
   }

   public static boolean id_class(List<rJY> var0, boolean var1) {
      boolean var2 = id_byte[14];

      for (rJY var4 : var0) {
         if ((!var1 || var4.id_protected >= id_class[46] && var4.id_protected <= id_class[47]) && var4.id_break()) {
            var2 = id_byte[15];
            break;
         }
      }

      return var2;
   }

   public static int id_class(Class<?> var0, boolean var1) {
      if (var0.isInstance(((cb_3)id_import.id_class[id_break[18]]).ss().id_break())) {
         return id_class[19];
      } else if (var0.isInstance(((cb_3)id_import.id_class[id_break[19]]).Sn().id_break())) {
         return id_class[20];
      } else {
         for (int var2 = var1 ? id_class[21] : id_byte[7]; var2 < id_class[22]; var2++) {
            if (var0.isInstance(((rhz_3)((cb_3)id_import.id_class[id_break[20]]).id_implements[id_break[21]]).id_extends(var2).id_break())) {
               return var2;
            }
         }

         return id_class[23];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5922225581774832999L;
   }

   public static int id_class(rdn_3 var0, rdb_3 var1, Set<String> var2) {
      if (var0 == null) {
         return id_class[12];
      } else {
         for (int var3 = id_byte[5]; var3 < id_class[13]; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_break[12]]).id_implements[id_break[13]]).id_extends(var3);
            if (var4.id_break() == var1 && rdn_3.id_break(var4, var0, var2)) {
               return var3;
            }
         }

         return id_class[14];
      }
   }

   public static int id_break(rdb_3 var0) {
      if (((cb_3)id_import.id_class[id_break[0]]).ss().id_break() == var0) {
         return id_class[0];
      } else if (((cb_3)id_import.id_class[id_break[1]]).Sn().id_break() == var0) {
         return id_class[1];
      } else {
         for (int var1 = id_byte[0]; var1 < id_class[2]; var1++) {
            if (((rhz_3)((cb_3)id_import.id_class[id_break[2]]).id_implements[id_break[3]]).id_extends(var1).id_break() == var0) {
               return var1;
            }
         }

         return id_class[3];
      }
   }

   public static int id_break() {
      for (int var0 = id_byte[13]; var0 < id_class[44]; var0++) {
         rdn_3 var1 = ((rhz_3)((cb_3)id_import.id_class[id_break[36]]).id_implements[id_break[37]]).id_extends(var0);
         rdb_3 var2 = var1.id_break();
         if (rrfH_2.id_class(var1) && !var2.id_throws(var1)) {
            return var0;
         }
      }

      return id_class[45];
   }

   public static int id_break(int var0) {
      return var0 >= 0 && var0 < id_class[39] ? var0 + id_class[40] : var0;
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
