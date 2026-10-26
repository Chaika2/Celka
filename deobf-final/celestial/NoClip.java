package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoClip extends Module implements rrnZ_2 {
   private static boolean[] break_;
   private static String[] byte_;
   private static double[] protected_;
   private static short[] throws_;

   public NoClip() {
      super("No Clip", "Позволяет проходить сквозь\nблоки", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new short[]{3, 57, 57};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5469382177533792819L;
   }

   @EventTarget
   public void class_(rrLz_1 var1) {
      if (((cb_3)import_.class_[57]).BW()) {
         rjU_2 var2 = var1.catch_();
         if (var1.private_()) {
            var1.protected_(true);
         }

         if (var1.catch_().byte_ > 0.0 || ((cb_3)import_.class_[57]).h()) {
            var1.break_(true);
         }

         var2.byte_ = Math.min(var2.byte_, 99999.0);
      }
   }

   @Override
   public void class_() {
      this.byte_(false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 838209568;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{21, -50, -91, -32, 25, 102, -100, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      break_ = new boolean[]{true, true, false};
   }

   private static void new_() {
      protected_ = new double[]{0.0, 99999.0};
   }

   private static void super_() {
      byte_ = new String[]{new String("No Clip"), new String("Позволяет проходить сквозь\nблоки")};
   }
}
