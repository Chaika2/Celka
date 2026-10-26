package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rp_3 extends rl_3 {
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;

   public rp_3(int var1, int var2, int var3, re_3 var4) {
      super(var1, var2, var3);
      this.private_();
      this.break_[0] = var4;
   }

   public rp_3(int var1, int var2, int var3, xc_3 var4) {
      this(var1, var2, var3, new re_3(var4.break_()));
   }

   static {
      ntfClinit();
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      this.private_();
      if (((re_3)this.break_[0]).class_(var4)) {
         return var4;
      } else {
         for (xc_3 var7 : var5) {
            if (((re_3)this.break_[0]).class_(var7)) {
               return var7;
            }
         }

         return ((re_3)this.break_[0]).protected_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4531202822019734618L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 87677214;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 94, 41, -114, -61, 21, 106, -110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public re_3 throws_() {
      this.private_();
      return (re_3)this.break_[0];
   }

   private static void catch_() {
      byte_ = new short[5];
   }

   private static void case_() {
      protected_ = new boolean[]{true};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
