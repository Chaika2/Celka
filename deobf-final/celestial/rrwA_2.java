package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwA_2 extends rrwp_3 {
   private static byte[] extends_;
   private static String[] native_;

   public rrwA_2() {
      super("FunTime", "mc.funtime.su", -1, "Most Popular");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1301166446;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7516218109850198568L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -62, -39, -127, -97, 70, -103, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      native_ = new String[]{new String("FunTime"), new String("mc.funtime.su"), new String("Most Popular")};
   }

   public rrwA_2 case_() {
      rrwA_2 var1 = new rrwA_2();
      var1.class_(this);
      return var1;
   }

   private static void native_() {
      extends_ = new byte[]{-1};
   }
}
