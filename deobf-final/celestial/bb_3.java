package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bb_3 implements D {
   private static boolean[] class_;
   private static short[] break_;
   private static byte[] protected_;
   public Object[] byte_;

   public C_class byte_() {
      return (C_class)this.byte_[0];
   }

   public bb_3(C_class var1, bM_2 var2) {
      this.catch_();
      this.byte_[0] = var1;
      this.byte_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7621457038902490479L;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.byte_[2] = var6;
      if ((Boolean)this.byte_[2]) {
         ((bM_2)this.byte_[1]).break_(this);
      } else {
         ((bM_2)this.byte_[1]).byte_(this);
      }
   }

   public void class_(rVi_1 var1) {
      ((bM_2)this.byte_[1]).class_(this, var1);
   }

   public void class_() {
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -426340028;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -24, -125, -29, 56, 126, 95, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public bM_2 break_() {
      return (bM_2)this.byte_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{3, 2};
   }

   private void catch_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
         var1[2] = false;
      }
   }

   private static void case_() {
      break_ = new short[]{0, 1, 1, 2, 2, 1, 1, 0, 1, 2};
   }

   public boolean protected_() {
      return (Boolean)this.byte_[2];
   }

   private static void private_() {
      class_ = new boolean[1];
   }
}
