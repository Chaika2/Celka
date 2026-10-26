package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pv_1 implements C_native {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[]{0, 1};
   }

   public Pv_1(C_class var1) {
      this.break_();
      this.class_[0] = var1;
      Ps_1 var7 = var1.throw_();
      this.class_[1] = var7;
      var1.break_(this);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 37, 1, 90, 103, 120, -122, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2286592272953112526L;
   }

   private static void class_() {
      break_ = new byte[]{2};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1893602366;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
