package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rg_3 extends rI_2 {
   private static boolean[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 99, -46, 108, -85, 14, 26, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rg_3(rq_3 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2383087879787692054L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1633993895;
   }

   @Override
   public boolean break_(int var1, int var2, int var3, xc_3 var4) {
      return var1 != 0 && var3 != 0 && var1 != this.break_() - 1 && var3 != this.byte_() - 1 ? byte_[3] : byte_[2];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, true, true, false};
   }
}
