package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtt_3 extends rrtm_3 {
   public Object[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   public rrtt_3(rrtN_2 var1, rrtf_3<?> var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.public_();
      this.byte_[0] = var1;
      this.byte_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5800961264983759952L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1471353696;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -73, -79, -117, 69, -18, -23, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> finally_() {
      this.public_();
      return ((rrtf_3)this.byte_[1]).break_();
   }

   private static void goto_() {
      protected_ = new short[]{0, 1, 1, 0, 1};
   }

   private static void return_() {
      throws_ = new byte[]{2};
   }

   private void public_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }

   @Override
   public rrtN_2 private_() {
      this.public_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_(), this.final_(), this.new_(), this.continue_());
   }

   public rrtf_3<?> synchronized_() {
      this.public_();
      return (rrtf_3<?>)this.byte_[1];
   }
}
