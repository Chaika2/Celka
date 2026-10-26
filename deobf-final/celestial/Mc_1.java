package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mc_1 implements rw_3 {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   @Override
   public int byte_() {
      return ((ML)this.class_[0]).class_().byte_();
   }

   public Mc_1(ML var1) {
      this.throws_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 91, -18, -44, 83, 99, 26, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1730221494;
   }

   @Override
   public int class_() {
      return ((ML)this.class_[0]).class_().break_();
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3) {
      return ((ML)this.class_[0]).class_().class_(new rfH_2(var1, var2, var3));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5561258149904380313L;
   }

   @Override
   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      return this.class_(var1, var2, var3);
   }

   @Override
   public int break_() {
      return ((ML)this.class_[0]).class_().class_();
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new short[5];
   }

   private static void case_() {
      break_ = new boolean[]{true};
   }
}
