package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcd_3 extends rrfI_2<rrfO_2> {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;

   @Override
   public boolean byte_() {
      this.case_();
      return this.break_() == (rrfO_2)((rrcx_3)this.class_[1]).class_[0] ? true : byte_[1];
   }

   public rrcd_3(rrcx_3 var1, rrNw_1 var2) {
      this.case_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -780747861;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2476872883079553127L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-87, -92, -10, 92, 92, 86, 52, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfO_2 break_() {
      this.case_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return rrfO_2.class_(var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_());
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false};
   }

   private static void catch_() {
      break_ = new byte[]{2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      protected_ = new short[]{1, 0, 0, 0, 1, 0};
   }
}
