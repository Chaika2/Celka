package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rj_3 extends rI_2 {
   private static boolean[] id_byte;

   public static String id_byte(String var0) throws Exception {
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1391612676286864264L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 201064957;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3, xc_3 var4) {
      return var1 != 0 && var2 != 0 && var3 != 0 && var1 != this.id_break() - 1 && var2 != this.id_class() - 1 && var3 != this.id_byte() - 1
         ? id_byte[4]
         : true;
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, true, true, true, false};
   }
}
