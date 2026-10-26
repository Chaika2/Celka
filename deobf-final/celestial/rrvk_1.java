package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvk_1 {
   private static float[] break_;
   public static Object[] class_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      throws_ = new boolean[]{false, false, true, false};
   }

   static {
      ntfClinit();
   }

   public static float class_() {
      vm_3 var1 = (vm_3)MinecraftAccessor.import_.class_[73];
      return var1 instanceof rrZv_1 var0 ? var0.package_().byte_() : break_[0];
   }

   public static void class_(Ml_1 var0, Runnable var1, float var2) {
      if (ClickGuiTheme.throws_()) {
         BlurShader.class_(var0, var1, var2);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7802045383651904679L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 261342526;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -72, 83, 71, 11, -59, 80, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      protected_ = new short[]{73};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0, 0};
      class_ = var0;
   }

   private static void case_() {
      break_ = new float[]{1.0F};
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
