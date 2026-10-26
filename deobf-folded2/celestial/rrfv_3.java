package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfv_3 {
   private static String[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_class = new String[]{new String(""), new String("раз"), new String("раза"), new String("раз")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6772511872497708255L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1644303317;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -125, 54, -99, -78, -11, -106, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean id_class(String var0, boolean var1) {
      if (var1) {
         Pl_1 var2 = C_throws.id_byte().id_short();
         if (!var2.id_break()) {
            var2.id_class(new PH(var0, 2));
         }

         PH var3 = var2.id_class();
         var3.id_class(1);
         if (!var3.id_throws()) {
            int var4 = var3.id_byte();
            rVi_1 var5 = new rgN_2("")
               .id_break(rgF_2.GRAY)
               .id_break(
                  "PVP Safe: Напишите "
                     + rgF_2.RED
                     + "\""
                     + var3.id_break()
                     + "\""
                     + rgF_2.GRAY
                     + " еще "
                     + rgF_2.RED
                     + var4
                     + " "
                     + rql_3.id_class((long)var4, "раз", "раза", "раз")
                     + rgF_2.GRAY
                     + " для подтверждения"
               );
            rrfu_3.id_class(var5);
            return true;
         }

         var2.id_byte();
      }

      return id_byte[4];
   }

   private static void id_class() {
      id_break = new byte[]{2, 3, 2};
   }

   private static void id_break() {
      id_byte = new boolean[]{true, false, true, true, false};
   }
}
