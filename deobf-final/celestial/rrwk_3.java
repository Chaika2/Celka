package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwk_3 extends Pv_1 {
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public abstract rrfq_3 byte_();

   public rrwk_3(C_class var1) {
      super(var1);
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public void class_(boolean var1) {
      this.protected_();
      Boolean var6 = var1;
      this.break_[0] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7634164818494878225L;
   }

   @Override
   public void class_(rrFK var1) {
      this.class_(false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -675616049;
   }

   public boolean class_() {
      this.protected_();
      return (Boolean)this.break_[0];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -48, 21, 47, -5, 59, -71, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean break_() {
      this.protected_();
      return !this.break_[0] && !((Ps_1)this.class_[1]).throws_().finally_() && (rrfq_3)rrfp_3.class_[1] == this.byte_() ? true : protected_[1];
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, false, true, false, false};
   }

   private static void case_() {
      byte_ = new short[]{0, 1, 1, 0, 0};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }
}
