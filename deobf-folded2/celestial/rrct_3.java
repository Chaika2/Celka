package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrct_3 implements rrcT_2<Boolean> {
   private static String[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   boolean id_byte(rrNd_1 var1, List<String> var2) {
      List var3 = var1.id_extends();
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

            return id_break[16];
         } else {
            return id_break[12];
         }
      } else {
         return id_break[11];
      }
   }

   private static void id_byte() {
      id_class = new String[]{new String("display"), new String("Lore"), new String("Lore")};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1422222625;
   }

   @Override
   public rrfI_2<Boolean> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcw_3(this, var2, var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3590631374609447695L;
   }

   boolean id_class(rrNd_1 var1, List<String> var2) {
      List var3 = var1.id_try();
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

               return id_break[6];
            }
         } else {
            return id_break[1];
         }
      } else {
         return id_break[0];
      }
   }

   private static void id_class() {
      id_byte = new byte[]{9, 8};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -128, -23, 114, -54, 106, 75, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   List<String> id_class(rdn_3 var1) {
      rcd_3 var2 = var1.id_package();
      rcd_3 var3 = var2.id_int("display");
      if (var3.id_protected("Lore") != 9) {
         return null;
      } else {
         rcy_3 var4 = var3.id_protected("Lore", 8);
         ArrayList var5 = new ArrayList();

         for (int var6 = 0; var6 < var4.size(); var6++) {
            String var7 = id_break(var4.id_implements(var6));
            if (var7 != null) {
               var5.add(var7.toLowerCase());
            }
         }

         return var5;
      }
   }

   private static String id_break(String var0) {
      try {
         rVi_1 var1 = rgB_2.id_class(var0);
         return var1.id_byte();
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   boolean id_break(rrNd_1 var1, List<String> var2) {
      List var3 = var1.id_int();
      if (var3 != null && !var3.isEmpty()) {
         if (var2 != null && !var2.isEmpty()) {
            for (String var5 : var3) {
               for (String var7 : var2) {
                  if (var7.contains(var5.toLowerCase())) {
                     return false;
                  }
               }
            }

            return id_break[10];
         } else {
            return id_break[8];
         }
      } else {
         return id_break[7];
      }
   }

   private static void id_break() {
      id_break = new boolean[]{true, false, false, false, true, false, true, true, true, false, true, true, false, false, true, false, true, false};
   }
}
