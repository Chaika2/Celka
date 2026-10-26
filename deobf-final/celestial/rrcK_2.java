package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcK_2 extends rrfI_2<Boolean> {
   public Object[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcK_2(rrco_3 var1, rrNw_1 var2) {
      this.case_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2045146456;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1302274677736625231L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 73, -74, -103, -61, -93, -88, 55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean break_() {
      this.case_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return (var1 == null ? ((rrNw_1)this.class_[0]).protected_().break_() : var1.class_().break_()) instanceof rxJ_2 var3
         ? var3.catch_() instanceof Wp_1
         : byte_[0];
   }

   private static void throws_() {
      break_ = new short[3];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true};
   }
}
