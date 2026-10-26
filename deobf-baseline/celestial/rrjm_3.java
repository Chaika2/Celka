package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjm_3 {
   public static Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_throws = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 104, 90, 79, 75, 83, 61, 61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static List<rdn_3> id_class(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      if (var1 == null) {
         return Collections.emptyList();
      } else {
         boolean var2 = (rrfq_3)rrfp_3.id_class[id_break[0]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[1]]
               && var0.id_protected(id_protected[0])
            ? id_throws[0]
            : id_throws[1];
         rcy_3 var3;
         if (var2) {
            var3 = var1.id_protected(id_protected[1], id_byte[0]);
         } else {
            rcd_3 var4 = var1.id_int(id_protected[2]);
            if (!var4.id_throws(id_protected[3])) {
               return Collections.emptyList();
            }

            var3 = var4.id_protected(id_protected[4], id_byte[1]);
         }

         int var9 = var3.size();
         if (var9 == 0) {
            return Collections.emptyList();
         } else {
            ArrayList var5 = new ArrayList(var9);

            for (int var6 = id_throws[2]; var6 < var9; var6++) {
               rcd_3 var7 = var3.id_class(var6);
               rdn_3 var8 = rdn_3.id_class(!var2 ? var7 : var7.id_int(id_protected[5]));
               var5.add(var8);
            }

            return var5;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1712483114;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6043935709428606692L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{id_protected[6], id_protected[7], 10};
      id_class = var0;
   }

   private static void id_break() {
      id_byte = new byte[]{10, 10, 3, 2, 10};
   }

   private static void id_throws() {
      id_break = new short[]{1, 6};
   }

   private static void id_protected() {
      id_protected = new String[]{
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
