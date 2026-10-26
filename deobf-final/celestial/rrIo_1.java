package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIo_1 {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static long[] protected_;
   private static short[] throws_;

   public rrfw_3 byte_() {
      return (rrfw_3)this.class_[1];
   }

   public rrIo_1(Runnable var1, long var2, int var4) {
      this.finally_();
      rrfw_3 var9 = new rrfw_3();
      this.class_[1] = var9;
      this.class_[0] = var1;
      Long var11 = var2;
      this.class_[2] = var11;
      Integer var12 = var4;
      this.class_[3] = var12;
   }

   public rrIo_1(Runnable var1, long var2) {
      this(var1, var2, 1);
   }

   static {
      ntfClinit();
   }

   public int class_() {
      return (Integer)this.class_[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{16, 95, 81, 95, 14, -38, 49, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1698046026;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2909589133474120779L;
   }

   public long break_() {
      return (Long)this.class_[2];
   }

   public boolean throws_() {
      return (Boolean)this.class_[5];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
         var1[2] = 0L;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = false;
      }
   }

   public Runnable catch_() {
      return (Runnable)this.class_[0];
   }

   private static void extends_() {
      protected_ = new long[1];
   }

   public void case_() {
      Boolean var5 = true;
      this.class_[5] = var5;
   }

   private static void implements_() {
      break_ = new boolean[]{true, true, true, false, false, false};
   }

   public int protected_() {
      return (Integer)this.class_[4];
   }

   public void private_() {
      if (((rrfw_3)this.class_[1]).class_((double)((Long)this.class_[2]).longValue())) {
         ((Runnable)this.class_[0]).run();
         ((rrfw_3)this.class_[1]).class_();
         int var10002 = (Integer)this.class_[4] + 1;
         Integer var5 = var10002;
         this.class_[4] = var5;
         if (var10002 >= (Integer)this.class_[3]) {
            this.case_();
         }
      }
   }

   private static void volatile_() {
      throws_ = new short[]{1, 0, 2, 3, 1, 2, 0, 1, 4, 4, 3, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void native_() {
      byte_ = new byte[]{6, 2, 3, 4, 5};
   }
}
