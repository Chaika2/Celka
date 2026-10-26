package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcu_3 implements rrcT_2<Boolean> {
   private static boolean[] id_class;
   private static String[] id_break;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 634409755;
   }

   @Override
   public rrfI_2<Boolean> id_class(rrNd_1 var1, rrNw_1 var2) {
      return new rrcm_3(this, var2, var1);
   }

   boolean id_class(rrNd_1 var1, rdn_3 var2, List<FuntimeEnchantment> var3) {
      List var4 = var1.id_throw();
      if (var4 != null && !var4.isEmpty()) {
         if (var3.isEmpty()) {
            return id_class[1];
         } else if (var4.size() != var3.size()) {
            return id_class[2];
         } else if (var2.id_protected(id_break[0])) {
            return id_class[3];
         } else {
            for (FuntimeEnchantment var6 : var4) {
               boolean var7 = id_class[4];

               for (FuntimeEnchantment var9 : var3) {
                  if (var9.id_class().equals(var6.id_class()) && var9.id_break() >= var6.id_break()) {
                     var7 = id_class[5];
                     break;
                  }
               }

               if (!var7) {
                  return id_class[6];
               }
            }

            return id_class[7];
         }
      } else {
         return id_class[0];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -109, -82, -78, -10, 25, -70, 102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -318030172023601689L;
   }

   boolean id_class(rrNd_1 var1, List<FuntimeEnchantment> var2) {
      List var3 = var1.id_interface();
      if (var3 != null && !var3.isEmpty()) {
         if (var2.isEmpty()) {
            return id_class[11];
         } else {
            for (FuntimeEnchantment var5 : var3) {
               String var6 = var5.id_class();
               int var7 = var5.id_break();
               boolean var8 = id_class[12];

               for (FuntimeEnchantment var10 : var2) {
                  if (var10.id_class().equals(var6) && var10.id_break() >= var7) {
                     var8 = id_class[13];
                     break;
                  }
               }

               if (!var8) {
                  return id_class[14];
               }
            }

            return id_class[15];
         }
      } else {
         return id_class[10];
      }
   }

   private static void id_class() {
      id_class = new boolean[]{true, false, false, false, false, true, false, true, false, true, true, false, false, true, false, true};
   }

   private static void id_break() {
      id_break = new String[]{new String("StoredEnchantments")};
   }

   boolean id_break(rrNd_1 var1, List<FuntimeEnchantment> var2) {
      List var3 = var1.id_this();
      if (var3 != null && !var3.isEmpty()) {
         for (FuntimeEnchantment var5 : var3) {
            String var6 = var5.id_class();
            int var7 = var5.id_break();

            for (FuntimeEnchantment var9 : var2) {
               if (var9.id_class().equals(var6) && var9.id_break() >= var7) {
                  return id_class[8];
               }
            }
         }
      }

      return id_class[9];
   }
}
