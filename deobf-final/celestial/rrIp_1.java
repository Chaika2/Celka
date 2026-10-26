package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrIp_1 extends rrIl_1 {
   private static float[] class_;
   private static boolean[] break_;
   private static String[] byte_;
   private static byte[] protected_;

   private static void int_() {
      byte_ = new String[]{new String("hitsound")};
   }

   public rrIp_1(String var1) {
      super(var1, 1.0F, 1.0F, 1, NT.FILE, false, false, 16);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1062640643;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5987554055632379146L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -95, -4, 27, -97, 68, -52, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void new_() {
      protected_ = new byte[]{16};
   }

   private static void package_() {
      break_ = new boolean[]{true, false, false, false};
   }

   @Override
   public rqO_2 protected_() {
      return new rqO_2(this.native_().byte_(), "celestial/sounds/hitsounds/" + this.native_().break_() + ".ogg");
   }

   private static void final_() {
      class_ = new float[]{1.0F, 1.0F};
   }

   @Override
   public NY volatile_() {
      return new NY(this, false, "hitsound");
   }
}
