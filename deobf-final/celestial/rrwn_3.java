package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwn_3 extends rrwp_3 {
   private static String[] extends_;
   private static byte[] native_;

   public rrwn_3() {
      super("HolyWorld", "mc.holyworld.ru", -1, "Most Popular");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3298301803080652275L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -558832481;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{68, -77, -115, 26, -116, 27, 80, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void extends_() {
      extends_ = new String[]{new String("HolyWorld"), new String("mc.holyworld.ru"), new String("Most Popular")};
   }

   private static void case_() {
      native_ = new byte[]{-1};
   }
}
