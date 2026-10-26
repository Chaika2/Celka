package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcu_3 implements rrcT_2<Boolean> {
   private static boolean[] class_;
   private static String[] break_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 634409755;
   }

   @Override
   public rrfI_2<Boolean> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcm_3(this, var2, var1);
   }

   boolean class_(rrNd_1 var1, rdn_3 var2, List<FuntimeEnchantment> var3) {
      List var4 = var1.throw_();
      if (var4 != null && !var4.isEmpty()) {
         if (var3.isEmpty()) {
            return false;
         } else if (var4.size() != var3.size()) {
            return false;
         } else if (var2.protected_("StoredEnchantments")) {
            return false;
         } else {
            for (FuntimeEnchantment var6 : var4) {
               boolean var7 = false;

               for (FuntimeEnchantment var9 : var3) {
                  if (var9.class_().equals(var6.class_()) && var9.break_() >= var6.break_()) {
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  return false;
               }
            }

            return class_[7];
         }
      } else {
         return class_[0];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -109, -82, -78, -10, 25, -70, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -318030172023601689L;
   }

   boolean class_(rrNd_1 var1, List<FuntimeEnchantment> var2) {
      List var3 = var1.interface_();
      if (var3 != null && !var3.isEmpty()) {
         if (var2.isEmpty()) {
            return false;
         } else {
            for (FuntimeEnchantment var5 : var3) {
               String var6 = var5.class_();
               int var7 = var5.break_();
               boolean var8 = false;

               for (FuntimeEnchantment var10 : var2) {
                  if (var10.class_().equals(var6) && var10.break_() >= var7) {
                     var8 = true;
                     break;
                  }
               }

               if (!var8) {
                  return false;
               }
            }

            return class_[15];
         }
      } else {
         return class_[10];
      }
   }

   private static void class_() {
      class_ = new boolean[]{true, false, false, false, false, true, false, true, false, true, true, false, false, true, false, true};
   }

   private static void break_() {
      break_ = new String[]{new String("StoredEnchantments")};
   }

   boolean break_(rrNd_1 var1, List<FuntimeEnchantment> var2) {
      List var3 = var1.this_();
      if (var3 != null && !var3.isEmpty()) {
         for (FuntimeEnchantment var5 : var3) {
            String var6 = var5.class_();
            int var7 = var5.break_();

            for (FuntimeEnchantment var9 : var2) {
               if (var9.class_().equals(var6) && var9.break_() >= var7) {
                  return false;
               }
            }
         }
      }

      return class_[9];
   }
}
