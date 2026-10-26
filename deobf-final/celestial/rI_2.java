package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rI_2 extends rl_3 {
   public Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   public rI_2(rq_3 var1) {
      super(var1.break_(), var1.class_(), var1.byte_());
      this.case_();
      this.break_[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.case_();
      return ((rq_3)this.break_[0]).class_(var1, var2, var3, var4, var5);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1707320765;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3623981078272605745L;
   }

   @Override
   public boolean class_(int var1, int var2, int var3, xc_3 var4) {
      this.case_();
      return ((rq_3)this.break_[0]).class_(var1, var2, var3, var4) && this.break_(var1, var2, var3, var4) ? true : protected_[1];
   }

   public abstract boolean break_(int var1, int var2, int var3, xc_3 var4);

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 100, -1, -52, -118, -98, 40, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new short[3];
   }

   private static void catch_() {
      protected_ = new boolean[]{true, false, true};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
