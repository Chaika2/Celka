package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrve_1 implements rrvU {
   private static float[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;

   @Override
   public boolean byte_() {
      return true;
   }

   public rrve_1(rrvK var1, String var2, String var3) {
      this.private_();
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
   public void class_(boolean var1) {
      ((AnimValue)this.class_[2]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5131821260646357481L;
   }

   @Override
   public String class_() {
      return (String)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 814251297;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 89, -115, 33, 108, -87, 63, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public AnimValue break_() {
      return (AnimValue)this.class_[2];
   }

   private static void throws_() {
      protected_ = new boolean[]{false, true};
   }

   private static void finally_() {
      break_ = new float[]{0.5F};
   }

   @Override
   public boolean catch_() {
      return ((rrvo_1)((rrvK)this.class_[3]).class_[0]).super_();
   }

   @Override
   public String case_() {
      return (String)this.class_[0];
   }

   private static void implements_() {
      byte_ = new short[]{3, 2, 0, 1, 0, 1, 2, 2, 3, 0};
   }

   private static void protected_() {
      throws_ = new byte[]{4};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }
}
