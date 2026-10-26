package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcl_3 extends rrfI_2<Boolean> {
   private static boolean[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static short[] protected_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rrcl_3(rrcC_2 var1, rrNw_1 var2, rrNd_1 var3) {
      this.throws_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1034178266;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -70, -66, 47, -2, -67, -69, 35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2033892290074795290L;
   }

   public Boolean break_() {
      this.throws_();
      if ((rrNw_1)this.class_[0] instanceof rrNt_1 var1) {
         List var2 = var1.break_();
         int var3 = var1.case_();
         String var4 = rrcC_2.class_(var2, var1);
         if (var4 != null) {
            return false;
         }
      }

      return break_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      break_ = new boolean[]{false, true};
   }

   private static void protected_() {
      protected_ = new short[]{0, 1, 0, 0};
   }
}
