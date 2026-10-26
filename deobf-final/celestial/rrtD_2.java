package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtD_2 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   public int byte_() {
      return (Integer)((Supplier)this.class_[0]).get();
   }

   rrtD_2(Supplier<Integer> var1, Supplier<Integer> var2, Supplier<Integer> var3) {
      this.case_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   public int class_() {
      return (Integer)((Supplier)this.class_[1]).get();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -111461021;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6101253259508718890L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 98, 110, 102, -59, -62, -81, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int break_() {
      return (Integer)((Supplier)this.class_[2]).get();
   }

   private static void throws_() {
      byte_ = new byte[]{3};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new short[]{0, 1, 2, 0, 1, 2};
   }
}
