package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnG_2 {
   public Object[] class_;
   public static Object[] break_;
   private static float[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   public Ml_1 byte_() {
      return (Ml_1)this.class_[1];
   }

   public rrnG_2() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1947432229;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8449881996058233727L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 104, -8, -57, -33, -37, 13, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(vm_3 var1) {
      this.class_[0] = var1;
   }

   public static rrnG_2 class_(vm_3 var0, Ml_1 var1, int var2, int var3, float var4) {
      ((rrnG_2)break_[0]).class_[0] = var0;
      ((rrnG_2)break_[0]).class_[1] = var1;
      rrnG_2 var10000 = (rrnG_2)break_[0];
      Integer var11 = var2;
      var10000.class_[2] = var11;
      var10000 = (rrnG_2)break_[0];
      Integer var12 = var3;
      var10000.class_[3] = var12;
      var10000 = (rrnG_2)break_[0];
      Float var13 = var4;
      var10000.class_[4] = var13;
      return (rrnG_2)break_[0];
   }

   public int class_() {
      return (Integer)this.class_[3];
   }

   public vm_3 break_() {
      return (vm_3)this.class_[0];
   }

   public int throws_() {
      return (Integer)this.class_[2];
   }

   private static void finally_() {
      case_ = new boolean[]{false, false, false, true};
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 1, 2, 3, 4, 0};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{new rrnG_2()};
      break_ = var0;
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0.0F;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{5, 2, 3, 4};
   }

   public float protected_() {
      return (Float)this.class_[4];
   }

   private static void private_() {
      byte_ = new float[1];
   }
}
