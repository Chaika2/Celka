package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFv_1 implements rrqr_3 {
   private static byte[] break_;
   public Object[] class_;
   private static float[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   public rrFv_1(rrFZ var1, rVi_1 var2, rVi_1 var3) {
      this.finally_();
      this.class_[4] = var1;
      AnimValue var9 = new AnimValue(0.5F, false);
      this.class_[3] = var9;
      this.class_[0] = var2;
      this.class_[1] = var3;
      String var12 = var3.getString();
      this.class_[2] = var12;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1710678850;
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[3]).class_(var1);
   }

   public rVi_1 class_() {
      return (rVi_1)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 86, -91, 105, -30, 40, 31, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3696293320021037213L;
   }

   @Override
   public AnimValue break_() {
      return (AnimValue)this.class_[3];
   }

   @Override
   public boolean throws_() {
      return true;
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public boolean catch_() {
      return ((HudWidget)((rrFZ)this.class_[4]).class_[0]).super_();
   }

   private static void extends_() {
      protected_ = new short[]{4, 3, 0, 1, 2, 0, 1, 3, 3, 4, 0, 2};
   }

   public rVi_1 case_() {
      return (rVi_1)this.class_[1];
   }

   private static void implements_() {
      throws_ = new boolean[]{false, true};
   }

   @Override
   public String private_() {
      return (String)this.class_[2];
   }

   private static void volatile_() {
      break_ = new byte[]{5};
   }

   private static void native_() {
      byte_ = new float[]{0.5F};
   }
}
