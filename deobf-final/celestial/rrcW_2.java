package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcW_2 extends rrfI_2<rrfh_3> {
   private static short[] break_;
   private static boolean[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   @Override
   public boolean byte_() {
      this.protected_();
      return this.break_() == (rrfh_3)((rrck_3)this.class_[1]).class_[0] ? true : byte_[1];
   }

   public rrcW_2(rrck_3 var1, rrNw_1 var2) {
      this.protected_();
      this.class_[1] = var1;
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 117, -1, -7, 81, 74, 122, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -437765393;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5707784649450404947L;
   }

   public rrfh_3 break_() {
      this.protected_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      return rrfh_3.class_(var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_());
   }

   private static void throws_() {
      break_ = new short[]{1, 0, 0, 0, 1, 0};
   }

   private static void catch_() {
      byte_ = new boolean[]{true, false};
   }

   private static void case_() {
      protected_ = new byte[]{2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
