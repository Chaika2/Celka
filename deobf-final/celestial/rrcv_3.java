package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcv_3 extends rrfI_2<Boolean> {
   public Object[] class_;
   private static boolean[] break_;
   private static String[] byte_;
   private static short[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcv_3(rrcZ_2 var1, rrNw_1 var2) {
      this.protected_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 403156390;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3457369534934745651L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, -14, 63, -23, -6, 40, -58, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Boolean break_() {
      this.protected_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      return var2.continue_().getString().contains("★");
   }

   private static void throws_() {
      protected_ = new short[3];
   }

   private static void catch_() {
      break_ = new boolean[]{true};
   }

   private static void case_() {
      byte_ = new String[]{new String("★")};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
