package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfH_2 implements MinecraftAccessor {
   private static boolean[] class_;
   private static byte[] break_;
   private static double[] byte_;

   private static void byte_() {
      break_ = new byte[]{2};
   }

   public static boolean byte_(rdb_3 var0) {
      return !var0.super_()
            && !var0.synchronized_()
            && var0 != rdy_3.JA
            && var0 != rdy_3.hi
            && var0 != rdy_3.OM
            && var0 != rdy_3.kU
            && var0 != rdy_3.kN
            && var0 != rdy_3.dc
         ? class_[14]
         : class_[13];
   }

   public static double byte_(rdn_3 var0) {
      double var1 = 0.0;
      if (var0.break_() instanceof rxS_2 var3) {
         rdB_2 var5 = var3.throws_();
         var1 += (double)var5.case_();
      }

      return var1;
   }

   static {
      ntfClinit();
   }

   public static Pair<rdn_3, rpm_3> class_(iB_2 var0, Predicate<rdn_3> var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         rdn_3 var6 = var0.protected_(var5);
         if (var1.test(var6)) {
            return Pair.of(var6, var5);
         }
      }

      return null;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1827538890;
   }

   public static rpm_3 class_(iB_2 var0, rdb_3 var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         if (var0.protected_(var5).break_() == var1) {
            return var5;
         }
      }

      return null;
   }

   public static rdb_3 class_(rdb_3 var0, rXQ var1) {
      if (var0 instanceof rxS_2 var2 && var2.byte_() == var1) {
         return var0;
      }

      return null;
   }

   public static rpm_3 class_(iB_2 var0, rdb_3... var1) {
      for (rpm_3 var5 : rpm_3.values()) {
         for (rdb_3 var9 : var1) {
            if (var0.protected_(var5).break_() == var9) {
               return var5;
            }
         }
      }

      return null;
   }

   public static rdn_3[] class_(iB_2 var0) {
      return new rdn_3[]{var0.ss(), var0.Sn()};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -26, -85, -95, -60, 43, 33, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new double[1];
   }

   public static boolean class_(rdb_3 var0) {
      if (var0 instanceof rxS_2 var1 && var1.throws_() == rxE_2.NETHERITE) {
         return true;
      }

      return class_[16];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6448581990372966157L;
   }

   @SafeVarargs
   public static boolean class_(rdn_3 var0, Pair<Integer, ev_3>... var1) {
      if (!var0.public_()) {
         return false;
      } else {
         for (Pair var5 : var1) {
            for (Entry var7 : var0.static_().entrySet()) {
               if (var7.getKey() == var5.getRight() && (Integer)var7.getValue() >= (Integer)var5.getLeft()) {
                  return true;
               }
            }
         }

         return class_[20];
      }
   }

   public static boolean class_(rdn_3 var0) {
      rdb_3 var1 = var0.break_();
      return var1 != rdy_3.hy && var1 != rdy_3.hp ? class_[7] : class_[6];
   }

   public static boolean break_(rdn_3 var0) {
      if (var0.break_() != rdy_3.JA) {
         return false;
      } else {
         for (rLY var2 : rAB.class_(var0)) {
            if (var2.class_() == rLD.case_) {
               return true;
            }
         }

         return class_[12];
      }
   }

   private static void break_() {
      class_ = new boolean[]{
         false, false, false, false, false, true, true, false, true, false, false, true, false, true, false, true, false, false, false, true, false
      };
   }

   public static boolean break_(rdb_3 var0) {
      return var0 == rdy_3.kk ? true : class_[9];
   }
}
