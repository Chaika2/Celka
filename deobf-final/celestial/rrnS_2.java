package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnS_2 {
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static float[] case_;

   public int byte_() {
      return (Integer)this.class_[3];
   }

   public rrnS_2() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2482047001853845923L;
   }

   public static rrnS_2 class_(vm_3 var0, Ml_1 var1, int var2, int var3, float var4) {
      ((rrnS_2)break_[0]).class_[0] = var0;
      ((rrnS_2)break_[0]).class_[1] = var1;
      rrnS_2 var10000 = (rrnS_2)break_[0];
      Integer var11 = var2;
      var10000.class_[2] = var11;
      var10000 = (rrnS_2)break_[0];
      Integer var12 = var3;
      var10000.class_[3] = var12;
      var10000 = (rrnS_2)break_[0];
      Float var13 = var4;
      var10000.class_[4] = var13;
      return (rrnS_2)break_[0];
   }

   public float class_() {
      return (Float)this.class_[4];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1143632542;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, -55, -106, -9, 70, -72, -64, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public vm_3 break_() {
      return (vm_3)this.class_[0];
   }

   public Ml_1 throws_() {
      return (Ml_1)this.class_[1];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrnS_2()};
      break_ = var0;
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, false, true};
   }

   private static void extends_() {
      case_ = new float[1];
   }

   private static void case_() {
      throws_ = new byte[]{5, 2, 3, 4};
   }

   private static void implements_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 1, 2, 3, 4};
   }

   public int protected_() {
      return (Integer)this.class_[2];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0.0F;
      }
   }
}
