package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCK extends rrTF<Flight> {
   private static float[] class_;

   public rrCK(Flight var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5309789042226583512L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 813178784;
   }

   @EventTarget
   public void class_(rrAs_1 var1) {
      var1.class_((double)(this.continue_().super_().byte_() / 10.0F));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-125, 27, -89, 25, -62, 24, 69, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new float[]{10.0F};
   }
}
