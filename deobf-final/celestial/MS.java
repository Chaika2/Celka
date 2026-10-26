package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MS implements PP, Ps_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] throws_;

   @Override
   public rjG_2 byte_() {
      return Ph_1.class_(this.catch_(), this.protected_(), this.native_().case_());
   }

   private static void int_() {
      throws_ = new short[]{0, 57, 0, 56, 0};
   }

   public MS(C_class var1) {
      this.continue_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 308757507;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6484411511757351161L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-120, -1, 72, 88, -99, -110, 43, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public QY throws_() {
      return b_;
   }

   @Override
   public cb_3 catch_() {
      return (cb_3)b_.class_[57];
   }

   @Override
   public rYB case_() {
      return (gm_3)b_.class_[56];
   }

   private void continue_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void new_() {
      break_ = new boolean[]{true};
   }

   @Override
   public C_return package_() {
      return C_throws.class_().break_().implements_().class_();
   }

   @Override
   public PX protected_() {
      return ((C_class)this.class_[0]).private_().protected_().orElseGet(() -> Ps_1.super.protected_());
   }

   @Override
   public PE native_() {
      return (Ms_1)Ms_1.staticFields347bd646f08b343d83dca157cd270e07[0];
   }
}
