package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNa_1 implements rrNI {
   ;
   private static boolean[] booleans477bc35efba33c1cba244cd88c6fd655;
   public static Object[] staticFields477bc35efba33c1cba244cd88c6fd655;
   private static short[] shorts477bc35efba33c1cba244cd88c6fd655;
   private static byte[] bytes477bc35efba33c1cba244cd88c6fd655;
   private static String[] strings477bc35efba33c1cba244cd88c6fd655;

   private static void byte_() {
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

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1265090127;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8505180688812436451L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{10, -71, -114, -89, 60, -9, -123, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      bytes477bc35efba33c1cba244cd88c6fd655 = new byte[]{-1, 10, 9, 8, -1, 58, -1, 2};
   }

   private static void break_() {
      shorts477bc35efba33c1cba244cd88c6fd655 = new short[]{1, 0};
   }

   public rrNt_1 break_(rJY var1) {
      rdn_3 var2 = var1.class_();
      if (!var2.final_()) {
         return null;
      } else {
         rcd_3 var3 = var2.package_();
         String var4 = null;
         int var5 = -1;
         if (var3.byte_("display", 10)) {
            rcd_3 var6 = var3.int_("display");
            if (var6.protected_("Lore") == 9) {
               rcy_3 var7 = var6.protected_("Lore", 8);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  String var9 = rgB_2.class_(var7.implements_(var8)).getString();
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

   private static void throws_() {
      Object[] var0 = new Object[]{new rrNa_1(), null};
      var0[1] = new rrNa_1[]{(rrNa_1)var0[0]};
      staticFields477bc35efba33c1cba244cd88c6fd655 = var0;
   }

   private static void protected_() {
      booleans477bc35efba33c1cba244cd88c6fd655 = new boolean[]{false, true, true, false, false, false, true};
   }
}
