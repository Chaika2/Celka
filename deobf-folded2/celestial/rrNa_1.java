package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNa_1 implements rrNI {
   private static boolean[] booleans477bc35efba33c1cba244cd88c6fd655;
   public static Object[] staticFields477bc35efba33c1cba244cd88c6fd655;
   private static short[] shorts477bc35efba33c1cba244cd88c6fd655;
   private static byte[] bytes477bc35efba33c1cba244cd88c6fd655;
   private static String[] strings477bc35efba33c1cba244cd88c6fd655;

   private static void id_byte() {
      strings477bc35efba33c1cba244cd88c6fd655 = new String[]{
         new String("display"),
         new String("display"),
         new String("Lore"),
         new String("Lore"),
         new String("Ценa"),
         new String("Цена"),
         new String("$"),
         new String("за штуку"),
         new String("\\D"),
         new String(""),
         new String("Продавец"),
         new String("INSTANCE")
      };
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1265090127;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8505180688812436451L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, -71, -114, -89, 60, -9, -123, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      bytes477bc35efba33c1cba244cd88c6fd655 = new byte[]{-1, 10, 9, 8, -1, 58, -1, 2};
   }

   private static void id_break() {
      shorts477bc35efba33c1cba244cd88c6fd655 = new short[]{1, 0};
   }

   public rrNt_1 id_break(rJY var1) {
      rdn_3 var2 = var1.id_class();
      if (!var2.id_final()) {
         return null;
      } else {
         rcd_3 var3 = var2.id_package();
         String var4 = null;
         int var5 = -1;
         if (var3.id_byte("display", 10)) {
            rcd_3 var6 = var3.id_int("display");
            if (var6.id_protected("Lore") == 9) {
               rcy_3 var7 = var6.id_protected("Lore", 8);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  String var9 = rgB_2.id_class(var7.id_implements(var8)).getString();
                  if ((var9.contains("Ценa") || var9.contains("Цена")) && var9.contains("$") && !var9.contains("за штуку")) {
                     try {
                        var5 = Integer.parseInt(var9.replaceAll(strings477bc35efba33c1cba244cd88c6fd655[8], strings477bc35efba33c1cba244cd88c6fd655[9]));
                     } catch (NumberFormatException var11) {
                        var5 = -1;
                     }
                  } else if (var9.contains("Продавец")) {
                     var4 = var9.substring(var9.indexOf(58) + 1).trim();
                  }

                  if (var5 != -1 && var4 != null) {
                     break;
                  }
               }
            }
         }

         return new rrNt_1(var1, var4, var5);
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrNa_1(), null};
      var0[1] = new rrNa_1[]{(rrNa_1)var0[0]};
      staticFields477bc35efba33c1cba244cd88c6fd655 = var0;
   }

   private static void id_protected() {
      booleans477bc35efba33c1cba244cd88c6fd655 = new boolean[]{false, true, true, false, false, false, true};
   }
}
