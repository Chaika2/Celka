package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcM_2 extends rrfI_2<rrfE_2> {
   private static boolean[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static short[] protected_;

   @Override
   public boolean byte_() {
      this.case_();
      return this.break_() == (rrfE_2)((rrcb_3)this.class_[1]).class_[0] ? true : break_[1];
   }

   public rrcM_2(rrcb_3 var1, rrNw_1 var2) {
      this.case_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9017068998005378584L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 774149698;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 4, -115, -108, -46, 107, -89, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfE_2 break_() {
      this.case_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return rrfE_2.class_(var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_());
   }

   private static void throws_() {
      break_ = new boolean[]{true, false};
   }

   private static void catch_() {
      byte_ = new byte[]{2};
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
