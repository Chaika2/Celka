package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIY extends rrIl_1 {
   private static byte[] class_;
   private static float[] break_;
   private static boolean[] byte_;
   private static String[] protected_;

   private static void int_() {
      protected_ = new String[]{new String("notification"), new String("notification")};
   }

   public rrIY() {
      super("notification", 1.0F, 1.0F, 1, NT.FILE, false, false, 16);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8680847957927081413L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -112958829;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -97, -84, -89, 119, 79, 109, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void new_() {
      break_ = new float[]{1.0F, 1.0F};
   }

   private static void package_() {
      class_ = new byte[]{16};
   }

   @Override
   public rqO_2 protected_() {
      return new rqO_2(this.native_().byte_(), "celestial/sounds/notifications/" + this.native_().break_() + ".ogg");
   }

   private static void final_() {
      byte_ = new boolean[]{true, false, false, false};
   }

   @Override
   public NY volatile_() {
      return new NY(this, false, "notification");
   }
}
