package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFc_1 implements rrFz_1 {
   private static short[] break_;
   private static float[] byte_;
   public Object[] class_;
   private static byte[] protected_;
   private static boolean[] throws_;

   @Override
   public boolean byte_() {
      return true;
   }

   public rrFc_1(rrFk_1 var1, String var2, String var3, String var4) {
      this.extends_();
      this.class_[4] = var1;
      AnimValue var10 = new AnimValue(0.5F, false);
      this.class_[3] = var10;
      this.class_[0] = var2;
      this.class_[1] = var3;
      this.class_[2] = var4;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{59, 7, 82, 101, 46, -3, -47, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2011812485;
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[3]).class_(var1);
   }

   @Override
   public AnimValue class_() {
      return (AnimValue)this.class_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -233107418784869349L;
   }

   @Override
   public String break_() {
      return (String)this.class_[2];
   }

   @Override
   public boolean throws_() {
      return ((rrFd_1)((rrFk_1)this.class_[4]).break_[0]).super_();
   }

   private static void finally_() {
      throws_ = new boolean[]{false, true};
   }

   private static void catch_() {
      protected_ = new byte[]{5};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
      }
   }

   public String case_() {
      return (String)this.class_[1];
   }

   private static void implements_() {
      break_ = new short[]{4, 3, 0, 1, 2, 0, 1, 3, 4, 0, 1, 2, 3};
   }

   @Override
   public String protected_() {
      return (String)this.class_[0] + " " + rgF_2.RED + (String)this.class_[1];
   }

   private static void private_() {
      byte_ = new float[]{0.5F};
   }
}
