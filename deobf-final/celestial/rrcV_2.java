package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcV_2 extends rrfI_2<rrcg_3> {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;

   @Override
   public boolean byte_() {
      return this.break_().equals((rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[0]);
   }

   public rrcV_2(rrcj_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.case_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{64, -30, 2, -15, 53, 76, 2, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1538988262;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -312621187014179853L;
   }

   public rrcg_3 break_() {
      this.case_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      int var3 = ((rrNw_1)this.class_[0]).case_();
      if (var3 > ((rrNd_1)this.class_[1]).else_() * var2.char_()) {
         return (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[1];
      } else {
         return (long)var3 > C_throws.byte_().native_().byte_()
            ? (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[2]
            : (rrcg_3)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[0];
      }
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 0, 0, 1, 1, 2, 0, 0};
   }
}
