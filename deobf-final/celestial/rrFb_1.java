package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFb_1 implements rrFE {
   private static float[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;

   @Override
   public String byte_() {
      return (String)this.class_[0];
   }

   public rrFb_1(rrFs_1 var1, String var2, String var3) {
      this.finally_();
      this.class_[3] = var1;
      AnimValue var9 = new AnimValue(0.5F, false);
      this.class_[2] = var9;
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public AnimValue class_() {
      return (AnimValue)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -581733409953449915L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 31, 91, -38, 40, 103, 28, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1778175768;
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[2]).class_(var1);
   }

   @Override
   public String break_() {
      return (String)this.class_[1];
   }

   @Override
   public boolean throws_() {
      return ((rrFS)((rrFs_1)this.class_[3]).class_[0]).super_();
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      protected_ = new short[]{3, 2, 0, 1, 0, 1, 2, 2, 3, 0};
   }

   private static void case_() {
      break_ = new float[]{0.5F};
   }

   private static void implements_() {
      throws_ = new boolean[]{false, true};
   }

   @Override
   public boolean protected_() {
      return true;
   }

   private static void private_() {
      byte_ = new byte[]{4};
   }
}
