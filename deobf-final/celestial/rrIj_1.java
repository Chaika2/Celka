package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIj_1 extends rrIp_1 {
   private static String[] class_;

   public rrIj_1() {
      super("moan_3");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -585857796;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2906466429886390212L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -63, -10, 12, -54, 39, -82, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      class_ = new String[]{new String("moan_3")};
   }
}
