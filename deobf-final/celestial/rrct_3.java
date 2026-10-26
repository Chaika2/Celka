package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrct_3 implements rrcT_2<Boolean> {
   private static String[] class_;
   private static boolean[] break_;
   private static byte[] byte_;

   boolean byte_(rrNd_1 var1, List<String> var2) {
      List var3 = var1.extends_();
      if (var3 != null && !var3.isEmpty()) {
         if (var2 != null && !var2.isEmpty()) {
            for (String var5 : var3) {
               boolean var6 = false;

               for (String var8 : var2) {
                  if (var8.equalsIgnoreCase(var5)) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  return false;
               }
            }

            return break_[16];
         } else {
            return break_[12];
         }
      } else {
         return break_[11];
      }
   }

   private static void byte_() {
      class_ = new String[]{new String("display"), new String("Lore"), new String("Lore")};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1422222625;
   }

   @Override
   public rrfI_2<Boolean> class_(rrNd_1 var1, rrNw_1 var2) {
      return new rrcw_3(this, var2, var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3590631374609447695L;
   }

   boolean class_(rrNd_1 var1, List<String> var2) {
      List var3 = var1.try_();
      if (var3 != null && !var3.isEmpty()) {
         if (var2 != null && !var2.isEmpty()) {
            if (var3.size() != var2.size()) {
               return false;
            } else {
               for (String var5 : var3) {
                  boolean var6 = false;

                  for (String var8 : var2) {
                     if (var8.equalsIgnoreCase(var5)) {
                        var6 = true;
                        break;
                     }
                  }

                  if (!var6) {
                     return false;
                  }
               }

               return break_[6];
            }
         } else {
            return break_[1];
         }
      } else {
         return break_[0];
      }
   }

   private static void class_() {
      byte_ = new byte[]{9, 8};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -128, -23, 114, -54, 106, 75, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   List<String> class_(rdn_3 var1) {
      rcd_3 var2 = var1.package_();
      rcd_3 var3 = var2.int_("display");
      if (var3.protected_("Lore") != 9) {
         return null;
      } else {
         rcy_3 var4 = var3.protected_("Lore", 8);
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 < var4.size(); var6++) {
            String var7 = break_(var4.implements_(var6));
            if (var7 != null) {
               var5.add(var7.toLowerCase());
            }
         }

         return var5;
      }
   }

   private static String break_(String var0) {
      try {
         rVi_1 var1 = rgB_2.class_(var0);
         return var1.byte_();
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   boolean break_(rrNd_1 var1, List<String> var2) {
      List var3 = var1.int_();
      if (var3 != null && !var3.isEmpty()) {
         if (var2 != null && !var2.isEmpty()) {
            for (String var5 : var3) {
               for (String var7 : var2) {
                  if (var7.contains(var5.toLowerCase())) {
                     return false;
                  }
               }
            }

            return break_[10];
         } else {
            return break_[8];
         }
      } else {
         return break_[7];
      }
   }

   private static void break_() {
      break_ = new boolean[]{true, false, false, false, true, false, true, true, true, false, true, true, false, false, true, false, true, false};
   }
}
