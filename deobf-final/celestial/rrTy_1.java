package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTy_1 extends rrTC {
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 5, -121, 78, -58, 38, 79, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTy_1(rrTT var1) {
      super(var1.this_());
      this.implements_();
      this.byte_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6089154769574187913L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984997610;
   }

   @Override
   public PX throws_() {
      this.implements_();
      return ((rrTT)this.byte_[0]).new_().orElseGet(() -> ((cb_3)import_.class_[57]).rO());
   }

   private static void catch_() {
      throws_ = new short[]{0, 0, 57};
   }

   private static void case_() {
      protected_ = new boolean[]{true};
   }

   private void implements_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[1];
         Object[] var1 = this.byte_;
      }
   }
}
