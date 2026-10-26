package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruQ {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   public rruN byte_() {
      return (rruN)this.class_[2];
   }

   public rruQ(rVi_1 var1, rruN var2) {
      this(var1, null, var2);
   }

   public rruQ(rVi_1 var1, rVi_1 var2, rruN var3) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -3, -2, 81, -103, 34, 86, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1137903977;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8934430967774506953L;
   }

   public rVi_1 class_() {
      return (rVi_1)this.class_[0];
   }

   public rVi_1 break_() {
      return (rVi_1)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new byte[]{3};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2};
   }
}
