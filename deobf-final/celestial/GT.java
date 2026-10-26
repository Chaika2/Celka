package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GT implements Gt_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      break_ = new byte[]{2};
   }

   GT(GH var1, Gt_1 var2, Gt_1 var3) {
      this.protected_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -101, -80, 7, 46, -46, -122, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4000026578023414206L;
   }

   @Override
   public int class_() {
      return Math.min(((Gt_1)this.class_[0]).class_(), ((Gt_1)this.class_[1]).class_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2044465182;
   }

   @Override
   public GI class_(int var1, int var2) {
      return ((Gt_1)this.class_[0]).class_(var1, var2) == (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0]
         ? (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0]
         : ((Gt_1)this.class_[1]).class_(var1, var2);
   }

   private static void break_() {
      byte_ = new short[]{0, 1, 0, 0, 0, 1, 0, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
