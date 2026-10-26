package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrch_3 extends rrfI_2<rrfG_2> {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   @Override
   public boolean byte_() {
      this.catch_();
      rrfG_2 var1 = this.break_();
      return var1 == null ? false : var1.equals((rrfG_2)((rrcO_2)this.class_[1]).class_[0]);
   }

   public rrch_3(rrcO_2 var1, rrNw_1 var2) {
      this.catch_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -339473956;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, 117, -86, -10, -88, 103, -55, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2158858257501645399L;
   }

   public rrfG_2 break_() {
      this.catch_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return rrfG_2.class_(var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_());
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void case_() {
      byte_ = new short[]{1, 0, 0, 0, 1, 0};
   }

   private static void protected_() {
      break_ = new boolean[1];
   }
}
