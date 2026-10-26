package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcU_2 extends rrfI_2<Boolean> {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static String[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcU_2(rrcD_2 var1, rrNw_1 var2) {
      this.throws_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -839121486;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1916070708354913941L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 44, 8, -15, 64, 29, -107, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean break_() {
      this.throws_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      return !var2.continue_().getString().equals("[★] Серебро") && !var2.protected_("isSilver") ? break_[1] : break_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      break_ = new boolean[]{true, false, true};
   }

   private static void case_() {
      protected_ = new String[]{new String("[★] Серебро"), new String("isSilver")};
   }

   private static void protected_() {
      byte_ = new short[3];
   }
}
