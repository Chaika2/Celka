package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAD {
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   public static Object[] break_;

   public int byte_() {
      return (Integer)this.class_[2];
   }

   public rrAD() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, -36, 104, 85, -103, 75, -30, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8151305930362557873L;
   }

   public int class_() {
      return (Integer)this.class_[5];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1674116105;
   }

   public static rrAD class_(Ml_1 var0, rJY var1, int var2, int var3, int var4, int var5) {
      ((rrAD)break_[0]).class_[0] = var0;
      ((rrAD)break_[0]).class_[1] = var1;
      rrAD var10000 = (rrAD)break_[0];
      Integer var12 = var2;
      var10000.class_[2] = var12;
      var10000 = (rrAD)break_[0];
      Integer var13 = var3;
      var10000.class_[3] = var13;
      var10000 = (rrAD)break_[0];
      Integer var14 = var4;
      var10000.class_[4] = var14;
      var10000 = (rrAD)break_[0];
      Integer var15 = var5;
      var10000.class_[5] = var15;
      return (rrAD)break_[0];
   }

   public Ml_1 break_() {
      return (Ml_1)this.class_[0];
   }

   public int throws_() {
      return (Integer)this.class_[3];
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrAD()};
      break_ = var0;
   }

   private static void catch_() {
      protected_ = new boolean[]{false, false, false, false, false, true};
   }

   private static void extends_() {
      throws_ = new byte[]{6, 2, 3, 4, 5};
   }

   public rJY case_() {
      return (rJY)this.class_[1];
   }

   private static void implements_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 0, 1, 2, 3, 4, 5};
   }

   public int protected_() {
      return (Integer)this.class_[4];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = 0;
      }
   }
}
