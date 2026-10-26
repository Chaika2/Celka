package celestial;

import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bI_2 implements rRq_1 {
   private static short[] break_;
   private static boolean[] byte_;
   public Object[] class_;

   @Override
   public xc_3 byte_(rfH_2 var1) {
      return ((bw_3)this.class_[0]).class_(var1.b_(), var1.c_(), var1.d_());
   }

   private static void byte_() {
      byte_ = new boolean[]{true};
   }

   public bI_2(bw_3 var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new short[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8231955920765995561L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1400817779;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 53, 29, -108, -45, 72, -17, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Nullable
   @Override
   public ryO_2 class_(rfH_2 var1) {
      return null;
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.byte_(var1).volatile_();
   }
}
