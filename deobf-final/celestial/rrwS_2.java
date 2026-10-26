package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwS_2 implements rrtn_3 {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   public String byte_() {
      return (String)this.class_[1];
   }

   public rrwS_2(Setting<?> var1, String var2) {
      this.catch_();
      rruv_1 var7 = (rruv_1)rruv_1.class_[0];
      this.class_[2] = var7;
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public void class_(rruv_1 var1) {
      this.class_[2] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 236025536;
   }

   @Override
   public rruv_1 class_() {
      return (rruv_1)this.class_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, 82, -110, -76, -10, 11, 66, -9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7504822640467380365L;
   }

   public boolean break_() {
      return ((String)this.class_[1]).equals(((Setting)this.class_[0]).byte_());
   }

   private static void throws_() {
      byte_ = new short[]{0, 2, 0, 1, 2, 2, 1, 0, 0, 1};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      break_ = new byte[]{3};
   }

   public Setting<?> protected_() {
      return (Setting<?>)this.class_[0];
   }
}
