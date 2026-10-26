package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwM_2 {
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   public Object[] class_;

   public float byte_() {
      return (Float)this.class_[2];
   }

   public rrwM_2(rrwE_2 var1, float var2, float var3) {
      this.case_();
      this.class_[0] = var1;
      Float var9 = var2;
      this.class_[1] = var9;
      Float var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   public float class_() {
      return (Float)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7941298500987496453L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1009973538;
   }

   public void class_(rrwE_2 var1) {
      this.class_[0] = var1;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 85, -8, -108, -20, 85, -4, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float class_(float var1, float var2) {
      return ((rrwE_2)this.class_[0]).class_(var1, var2) + (Float)this.class_[1];
   }

   public float break_(float var1, float var2) {
      return ((rrwE_2)this.class_[0]).break_(var1, var2) + (Float)this.class_[2];
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
   }

   public rrwE_2 break_() {
      return (rrwE_2)this.class_[0];
   }

   private static void throws_() {
      byte_ = new byte[]{3, 2};
   }

   private static void catch_() {
      break_ = new boolean[]{true};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
      }
   }

   private static void protected_() {
      throws_ = new float[2];
   }

   private static void private_() {
      protected_ = new short[]{0, 1, 2, 0, 1, 0, 2, 0, 1, 2, 0, 1, 2};
   }
}
