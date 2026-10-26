package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlx_3 extends rrTF<WaterSpeed> {
   private static short[] class_;
   private static float[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rrlx_3(WaterSpeed var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -308531360;
   }

   @EventTarget
   public void class_(rrLd_1 var1) {
      if (!((cb_3)import_.class_[57]).break_(rLD.interface_)) {
         if (var1.class_() != 0) {
            var1.class_(0.022F - (((cb_3)import_.class_[57]).throws_[41] % 2 == 0 ? 5.0E-5F : break_[2]));
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2519820296593917357L;
   }

   @EventTarget
   public void class_(rrAn_1 var1) {
      if (((cb_3)import_.class_[57]).rT()) {
         var1.break_(false);
      }
   }

   private static void class_() {
      class_ = new short[]{57, 57, 41, 57, 57};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, -120, -124, 51, 44, 114, 98, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLZ var1) {
      if (var1.class_() instanceof rmD_2 var3 && var3.break_() == rmU_2.PRESS_SHIFT_KEY && ((cb_3)import_.class_[57]).rT()) {
         var1.class_(true);
      }
   }

   private static void break_() {
      break_ = new float[]{0.022F, 5.0E-5F, 1.0E-4F};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true};
   }
}
