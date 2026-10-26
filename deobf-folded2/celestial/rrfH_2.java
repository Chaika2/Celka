package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfH_2 implements MinecraftAccessor {
   private static boolean[] id_class;
   private static byte[] id_break;
   private static double[] id_byte;

   private static void id_byte() {
      id_break = new byte[]{2};
   }

   public static boolean id_byte(rdb_3 var0) {
      return !var0.id_super()
            && !var0.id_synchronized()
            && var0 != rdy_3.JA
            && var0 != rdy_3.hi
            && var0 != rdy_3.OM
            && var0 != rdy_3.kU
            && var0 != rdy_3.kN
            && var0 != rdy_3.dc
         ? id_class[14]
         : id_class[13];
   }

   public static double id_byte(rdn_3 var0) {
      double var1 = 0.0;
      if (var0.id_break() instanceof rxS_2 var3) {
         rdB_2 var5 = var3.id_throws();
         var1 += (double)var5.id_case();
      }

      return var1;
   }

   static {
      ntfClinit();
   }

   public static Pair<rdn_3, rpm_3> id_class(iB_2 var0, Predicate<rdn_3> var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         rdn_3 var6 = var0.id_protected(var5);
         if (var1.test(var6)) {
            return Pair.of(var6, var5);
         }
      }

      return null;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827538890;
   }

   public static rpm_3 id_class(iB_2 var0, rdb_3 var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         if (var0.id_protected(var5).id_break() == var1) {
            return var5;
         }
      }

      return null;
   }

   public static rdb_3 id_class(rdb_3 var0, rXQ var1) {
      if (var0 instanceof rxS_2 var2 && var2.id_byte() == var1) {
         return var0;
      }

      return null;
   }

   public static rpm_3 id_class(iB_2 var0, rdb_3... var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         for (rdb_3 var9 : var1) {
            if (var0.id_protected(var5).id_break() == var9) {
               return var5;
            }
         }
      }

      return null;
   }

   public static rdn_3[] id_class(iB_2 var0) {
      return new rdn_3[]{var0.ss(), var0.Sn()};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -26, -85, -95, -60, 43, 33, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new double[1];
   }

   public static boolean id_class(rdb_3 var0) {
      if (var0 instanceof rxS_2 var1 && var1.id_throws() == rxE_2.NETHERITE) {
         return true;
      }

      return id_class[16];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6448581990372966157L;
   }

   @SafeVarargs
   public static boolean id_class(rdn_3 var0, Pair<Integer, ev_3>... var1) {
      if (!var0.id_public()) {
         return false;
      } else {
         for (Pair var5 : var1) {
            for (Entry var7 : var0.id_static().entrySet()) {
               if (var7.getKey() == var5.getRight() && (Integer)var7.getValue() >= (Integer)var5.getLeft()) {
                  return true;
               }
            }
         }

         return id_class[20];
      }
   }

   public static boolean id_class(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      return var1 != rdy_3.hy && var1 != rdy_3.hp ? id_class[7] : id_class[6];
   }

   public static boolean id_break(rdn_3 var0) {
      if (var0.id_break() != rdy_3.JA) {
         return false;
      } else {
         for (rLY var2 : rAB.id_class(var0)) {
            if (var2.id_class() == rLD.id_case) {
               return true;
            }
         }

         return id_class[12];
      }
   }

   private static void id_break() {
      id_class = new boolean[]{
         false, false, false, false, false, true, true, false, true, false, false, true, false, true, false, true, false, false, false, true, false
      };
   }

   public static boolean id_break(rdb_3 var0) {
      return var0 == rdy_3.kk ? true : id_class[9];
   }
}
