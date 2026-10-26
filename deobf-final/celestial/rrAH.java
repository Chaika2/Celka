package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAH {
   public static Object[] class_;
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   private static float[] case_;

   public float byte_() {
      return (Float)this.break_[1];
   }

   public rrAH() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1244815905599929273L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2000202130;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 31, -57, 54, 1, 95, -102, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[2] = var6;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[0] = var6;
   }

   public float class_() {
      return (Float)this.break_[0];
   }

   public static rrAH class_(float var0, float var1, boolean var2) {
      rrAH var10000 = (rrAH)class_[0];
      Float var7 = var0;
      var10000.break_[0] = var7;
      var10000 = (rrAH)class_[0];
      Float var8 = var1;
      var10000.break_[1] = var8;
      var10000 = (rrAH)class_[0];
      Boolean var9 = var2;
      var10000.break_[2] = var9;
      return (rrAH)class_[0];
   }

   public boolean break_() {
      return (Boolean)this.break_[2];
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.break_[1] = var6;
   }

   private static void throws_() {
      throws_ = new byte[]{3, 2};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrAH()};
      class_ = var0;
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = false;
      }
   }

   private static void implements_() {
      protected_ = new boolean[]{false, false, true, false, true};
   }

   private static void protected_() {
      case_ = new float[2];
   }

   private static void private_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 2};
   }
}
