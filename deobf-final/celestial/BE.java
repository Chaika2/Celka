package celestial;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BE extends Pv_1 {
   private static short[] break_;
   private static boolean[] byte_;

   public BE(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 935633354;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1032986157444075874L;
   }

   private static void class_() {
      byte_ = new boolean[1];
   }

   @Override
   public void class_(rrFU var1) {
      try {
         BG[] var2 = (BG[])BG.staticFieldsd25d445181413210921a2969c1bcd756[break_[0]];
         int var3 = var2.length;

         for (int var4 = byte_[0]; var4 < var3; var4++) {
            BG var5 = var2[var4];
            URI var6 = URI.create(var5.class_());
            rrbb_3.class_(var6);
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   private static void break_() {
      break_ = new short[]{4};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -3, -80, 19, 120, 42, 57, -40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
