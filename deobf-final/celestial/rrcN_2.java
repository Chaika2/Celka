package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcN_2 implements rrcT_2<Boolean> {
   private static boolean[] class_;
   private static String[] break_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 95239108;
   }

   boolean class_(rrNd_1 var1, rdn_3 var2, Map<ev_3, Integer> var3) {
      List var4 = var1.super_();
      if (var4 == null || var4.isEmpty()) {
         return class_[0];
      } else if (var3.isEmpty()) {
         return false;
      } else if (var4.size() != var3.size()) {
         return false;
      } else if (var2.protected_("custom-enchantments")) {
         return false;
      } else {
         for (rrfA_2 var6 : var4) {
            Integer var7 = (Integer)var3.get(var6.break_());
            if (var7 == null || var7 != var6.class_()) {
               return class_[4];
            }
         }

         return class_[5];
      }
   }

   @Override
   public rrfI_2<Boolean> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcc_3(this, var2, var1);
   }

   private static void class_() {
      break_ = new String[]{new String("custom-enchantments")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -92, -52, 41, 117, -122, -98, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   boolean class_(rrNd_1 var1, Map<ev_3, Integer> var2) {
      List var3 = var1.goto_();
      if (var3 != null && !var3.isEmpty()) {
         for (rrfA_2 var5 : var3) {
            ev_3 var6 = var5.break_();
            int var7 = var5.class_();
            if (var6 == eY_2.private_) {
               rrIk_1 var8 = var1.final_();
               if (var8 != null && var8.class_()) {
                  continue;
               }
            }

            if (var2.containsKey(var6) && (Integer)var2.get(var6) >= var7) {
               return false;
            }
         }
      }

      return class_[7];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3618396176890233706L;
   }

   private static void break_() {
      class_ = new boolean[]{true, false, false, false, false, true, false, true, true, false, false, false, true};
   }

   boolean break_(rrNd_1 var1, Map<ev_3, Integer> var2) {
      List var3 = var1.new_();
      if (var3 != null && !var3.isEmpty()) {
         if (var2.isEmpty()) {
            return false;
         } else {
            for (rrfA_2 var5 : var3) {
               ev_3 var6 = var5.break_();
               int var7 = var5.class_();
               if (!var2.containsKey(var6)) {
                  return class_[11];
               }

               int var8 = (Integer)var2.get(var6);
               if (var8 < var7) {
                  return false;
               }
            }

            return class_[12];
         }
      } else {
         return class_[8];
      }
   }
}
