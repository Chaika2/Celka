package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlO_2 extends rrTF<Spider> {
   private static short[] break_;
   public Object[] class_;
   private static double[] byte_;
   private static boolean[] protected_;

   private static void byte_() {
      break_ = new short[]{0, 57, 23, 0, 57, 0};
   }

   public rrlO_2(Spider var1) {
      super(var1);
      this.break_();
      rrfw_3 var6 = new rrfw_3();
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.break_();
      if ((Boolean)((cb_3)import_.class_[57]).throws_[23] && rrfj_3.catch_() && ((rrfw_3)this.class_[0]).class_(150.0)) {
         var1.break_(true);
         ((cb_3)import_.class_[57]).sl();
         ((rrfw_3)this.class_[0]).class_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5637964548593704514L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1876021831;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, 96, -106, -111, -76, 60, -93, -81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new double[]{150.0};
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true};
   }
}
