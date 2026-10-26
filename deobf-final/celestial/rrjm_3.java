package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjm_3 {
   public static Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static String[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      throws_ = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 104, 90, 79, 75, 83, 61, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static List<rdn_3> class_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      if (var1 == null) {
         return Collections.emptyList();
      } else {
         boolean var2 = (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6] && var0.protected_("backpack-inventory")
            ? true
            : throws_[1];
         rcy_3 var3;
         if (var2) {
            var3 = var1.protected_("backpack-inventory", 10);
         } else {
            rcd_3 var4 = var1.int_("BlockEntityTag");
            if (!var4.throws_("Items")) {
               return Collections.emptyList();
            }

            var3 = var4.protected_("Items", 10);
         }

         int var9 = var3.size();
         if (var9 == 0) {
            return Collections.emptyList();
         } else {
            ArrayList var5 = new ArrayList(var9);

            for (int var6 = 0; var6 < var9; var6++) {
               rcd_3 var7 = var3.class_(var6);
               rdn_3 var8 = rdn_3.class_(!var2 ? var7 : var7.int_("item"));
               var5.add(var8);
            }

            return var5;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1712483114;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6043935709428606692L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{"BlockEntityTag", "Items", 10};
      class_ = var0;
   }

   private static void break_() {
      byte_ = new byte[]{10, 10, 3, 2, 10};
   }

   private static void throws_() {
      break_ = new short[]{1, 6};
   }

   private static void protected_() {
      protected_ = new String[]{
         new String("backpack-inventory"),
         new String("backpack-inventory"),
         new String("BlockEntityTag"),
         new String("Items"),
         new String("Items"),
         new String("item"),
         new String("BlockEntityTag"),
         new String("Items")
      };
   }
}
