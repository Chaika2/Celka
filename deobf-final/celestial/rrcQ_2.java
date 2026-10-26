package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcQ_2 extends rrfI_2<Boolean> {
   private static byte[] break_;
   private static float[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static boolean[] throws_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcQ_2(rrcz_3 var1, rrNw_1 var2, rrNd_1 var3) {
      this.protected_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -81, -124, 79, -114, -2, -12, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1039155112;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6398868611017966626L;
   }

   public Boolean break_() {
      this.protected_();
      rJY var1 = ((rrNw_1)this.class_[0]).throws_();
      rdn_3 var2 = var1 == null ? ((rrNw_1)this.class_[0]).protected_() : var1.class_();
      if (((rrNd_1)this.class_[1]).throws_() && ((rrNd_1)this.class_[1]).return_() && var2.throws_()) {
         int var3 = var2.private_();
         int var4 = var3 - var2.catch_();
         int var5 = (int)((float)var4 / (float)var3 * 100.0F);
         return var5 >= ((rrNd_1)this.class_[1]).public_() ? true : throws_[2];
      } else {
         return throws_[0];
      }
   }

   private static void throws_() {
      byte_ = new float[]{100.0F};
   }

   private static void catch_() {
      throws_ = new boolean[]{true, true, false};
   }

   private static void case_() {
      protected_ = new short[]{0, 1, 0, 0, 1, 1, 1};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      break_ = new byte[]{2};
   }
}
