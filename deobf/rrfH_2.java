package celestial;

import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.util.Map;
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
      return !var0.id_super() && !var0.id_synchronized() && var0 != rdy_3.JA && var0 != rdy_3.hi && var0 != rdy_3.OM && var0 != rdy_3.kU && var0 != rdy_3.kN && var0 != rdy_3.dc ? false : true;
   }

   public static double id_byte(rdn_3 var0) {
      double var1 = id_byte[0];
      rdb_3 var4 = var0.id_break();
      if (var4 instanceof rxS_2 var3) {
         rdB_2 var5 = var3.id_throws();
         var1 += (double)var5.id_case();
      }

      return var1;
   }

   public rrfH_2() {
   }

   static {
      ntfClinit();
   }

   public static Pair<rdn_3, rpm_3> id_class(iB_2 var0, Predicate<rdn_3> var1) {
      rpm_3[] var2 = rpm_3.values();
      int var3 = var2.length;

      for(int var4 = false; var4 < var3; ++var4) {
         rpm_3 var5 = var2[var4];
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
      rpm_3[] var2 = rpm_3.values();
      int var3 = var2.length;

      for(int var4 = false; var4 < var3; ++var4) {
         rpm_3 var5 = var2[var4];
         if (var0.id_protected(var5).id_break() == var1) {
            return var5;
         }
      }

      return null;
   }

   public static rdb_3 id_class(rdb_3 var0, rXQ var1) {
      rdb_3 var10000;
      if (var0 instanceof rxS_2 var2) {
         if (var2.id_byte() == var1) {
            var10000 = var0;
            return var10000;
         }
      }

      var10000 = null;
      return var10000;
   }

   public static rpm_3 id_class(iB_2 var0, rdb_3... var1) {
      rpm_3[] var2 = rpm_3.values();
      int var3 = var2.length;

      for(int var4 = false; var4 < var3; ++var4) {
         rpm_3 var5 = var2[var4];
         rdb_3[] var6 = var1;
         int var7 = var1.length;

         for(int var8 = false; var8 < var7; ++var8) {
            rdb_3 var9 = var6[var8];
            if (var0.id_protected(var5).id_break() == var9) {
               return var5;
            }
         }
      }

      return null;
   }

   public static rdn_3[] id_class(iB_2 var0) {
      rdn_3[] var10000 = new rdn_3[2];
      var10000[0] = var0.ss();
      var10000[1] = var0.Sn();
      return var10000;
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
      boolean var10000;
      if (var0 instanceof rxS_2 var1) {
         if (var1.id_throws() == rxE_2.NETHERITE) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6448581990372966157L;
   }

   @SafeVarargs
   public static boolean id_class(rdn_3 var0, Pair<Integer, ev_3>... var1) {
      if (!var0.id_public()) {
         return false;
      } else {
         Pair[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = false; var4 < var3; ++var4) {
            Pair var5 = var2[var4];

            for(Map.Entry var7 : var0.id_static().entrySet()) {
               if (var7.getKey() == var5.getRight() && (Integer)var7.getValue() >= (Integer)var5.getLeft()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static boolean id_class(rdn_3 var0) {
      rdb_3 var1 = var0.id_break();
      return var1 != rdy_3.hy && var1 != rdy_3.hp ? false : true;
   }

   public static boolean id_break(rdn_3 var0) {
      if (var0.id_break() != rdy_3.JA) {
         return false;
      } else {
         for(rLY var2 : rAB.id_class(var0)) {
            if (var2.id_class() == rLD.id_case) {
               return true;
            }
         }

         return false;
      }
   }

   private static void id_break() {
      id_class = new boolean[]{false, false, false, false, false, true, true, false, true, false, false, true, false, true, false, true, false, false, false, true, false};
   }

   public static boolean id_break(rdb_3 var0) {
      return var0 == rdy_3.kk ? true : false;
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_break();
      id_class();
      id_byte();
   }
}
