package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrlg_3 extends rrTF<AutoUse> {
   private static short[] class_;
   private static boolean[] break_;
   public Object[] byte_;

   private void byte_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         this.byte_[0] = false;
      }
   }

   public rrlg_3(AutoUse var1) {
      super(var1);
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public abstract boolean class_();

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1902234258;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2824705446633795L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 73, -85, 99, -30, -123, 84, -17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{false, true, true, false, true, false, false};
   }

   public boolean throws_() {
      this.byte_();
      return (Boolean)this.byte_[0];
   }

   public boolean case_() {
      bO_2 var1 = C_throws.byte_().break_();
      return !((cb_3)import_.class_[57]).implements_() && !((cb_3)import_.class_[57]).native_() && (!var1.byte_() || !var1.private_()) ? break_[1] : break_[0];
   }

   private static void implements_() {
      class_ = new short[]{57, 57, 0, 0, 0};
   }

   public void protected_() {
      this.byte_();
      Boolean var5 = false;
      this.byte_[0] = var5;
   }

   public void private_() {
      this.byte_();
      Boolean var5 = true;
      this.byte_[0] = var5;
   }
}
