package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rj_3 extends rI_2 {
   private static boolean[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -11, -62, 21, 21, 31, -37, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rj_3(rq_3 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1391612676286864264L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 201064957;
   }

   @Override
   public boolean break_(int var1, int var2, int var3, xc_3 var4) {
      return var1 != 0 && var2 != 0 && var3 != 0 && var1 != this.break_() - 1 && var2 != this.class_() - 1 && var3 != this.byte_() - 1 ? byte_[4] : byte_[3];
   }

   private static void throws_() {
      byte_ = new boolean[]{true, true, true, true, false};
   }
}
