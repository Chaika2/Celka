package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfv_3 {
   private static String[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      class_ = new String[]{new String(""), new String("раз"), new String("раза"), new String("раз")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6772511872497708255L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1644303317;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{88, -125, 54, -99, -78, -11, -106, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static boolean class_(String var0, boolean var1) {
      if (var1) {
         Pl_1 var2 = C_throws.byte_().short_();
         if (!var2.break_()) {
            var2.class_(new PH(var0, 2));
         }

         PH var3 = var2.class_();
         var3.class_(1);
         if (!var3.throws_()) {
            int var4 = var3.byte_();
            rVi_1 var5 = new rgN_2("")
               .break_(rgF_2.GRAY)
               .break_(
                  "PVP Safe: Напишите "
                     + rgF_2.RED
                     + "\""
                     + var3.break_()
                     + "\""
                     + rgF_2.GRAY
                     + " еще "
                     + rgF_2.RED
                     + var4
                     + " "
                     + rql_3.class_((long)var4, "раз", "раза", "раз")
                     + rgF_2.GRAY
                     + " для подтверждения"
               );
            rrfu_3.class_(var5);
            return true;
         }

         var2.byte_();
      }

      return byte_[4];
   }

   private static void class_() {
      break_ = new byte[]{2, 3, 2};
   }

   private static void break_() {
      byte_ = new boolean[]{true, false, true, true, false};
   }
}
