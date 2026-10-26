package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwB_2 implements rrtn_3 {
   private static float[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public String byte_() {
      return ((rrIk_1)this.class_[0]).throws_();
   }

   public rrwB_2(rrIk_1 var1) {
      this.finally_();
      rruv_1 var6 = (rruv_1)rruv_1.class_[0];
      this.class_[3] = var6;
      this.class_[0] = var1;
      AnimValue var8 = new AnimValue(0.3F, false);
      this.class_[1] = var8;
      AnimValue var9 = new AnimValue(0.6F, false);
      this.class_[2] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{26, 90, -111, -84, 38, 114, -11, -37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rruv_1 class_() {
      return (rruv_1)this.class_[3];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -11779306;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2894118401006318794L;
   }

   public void class_(rruv_1 var1) {
      this.class_[3] = var1;
   }

   public AnimValue break_() {
      return (AnimValue)this.class_[1];
   }

   public AnimValue throws_() {
      return (AnimValue)this.class_[2];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      break_ = new float[]{0.3F, 0.6F};
   }

   private static void extends_() {
      byte_ = new short[]{0, 3, 0, 1, 2, 3, 3, 0, 0, 0, 1, 2};
   }

   public rrIk_1 case_() {
      return (rrIk_1)this.class_[0];
   }

   private static void implements_() {
      throws_ = new byte[]{4};
   }

   public boolean protected_() {
      return ((rrIk_1)this.class_[0]).class_();
   }

   private static void private_() {
      protected_ = new boolean[2];
   }
}
