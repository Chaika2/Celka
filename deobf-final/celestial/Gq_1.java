package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gq_1 implements Gt_1 {
   private static int[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      byte_ = new short[]{1, 1, 0, 0, 0, 0, 2, 1, 0};
   }

   Gq_1(GH var1) {
      this.protected_();
      this.class_[1] = var1;
      C_super var7 = GH.class_((GH)this.class_[1]).strictfp_().byte_().break_();
      this.class_[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6148643338742963247L;
   }

   @Override
   public int class_() {
      return Integer.MAX_VALUE;
   }

   @Override
   public GI class_(int var1, int var2) {
      int var3 = var1 << 4;
      int var4 = var2 << 4;
      if (((C_super)this.class_[0]).break_(var3, var4)) {
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0];
      } else if (!((SI)((C_super)this.class_[0])).byte_(var3, var4)) {
         C_class.interface_().execute(() -> ((SI)((C_super)this.class_[0])).protected_(var3 >> 9, var4 >> 9));
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[2];
      } else {
         return (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[1];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -78, -120, -122, 110, -33, 61, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 438987694;
   }

   private static void break_() {
      break_ = new int[]{Integer.MAX_VALUE};
   }

   private static void throws_() {
      protected_ = new byte[]{4, 4, 9, 9, 2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
