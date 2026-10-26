package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;

public class rryJ extends rrTF<AntiAfk> {
   private static double[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }

   public rryJ(AntiAfk var1) {
      super(var1);
      this.byte_();
      rrfw_3 var6 = new rrfw_3();
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 56, -68, 2, 27, 126, 114, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3255846481776113086L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 233872460;
   }

   private static void class_() {
      byte_ = new boolean[]{true, true};
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.byte_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!rrfj_3.catch_() && !rrfZ_2.byte_()) {
            if (((rrfw_3)this.class_[0]).class_(10000.0)) {
               ((cb_3)import_.class_[57]).case_("/ho" + RandomStringUtils.randomAlphabetic(1).toLowerCase() + "me");
               ((rrfw_3)this.class_[0]).class_();
            }
         } else {
            ((rrfw_3)this.class_[0]).class_();
         }
      }
   }

   private static void break_() {
      break_ = new double[]{10000.0};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 0, 57, 0, 0, 0};
   }

   @Override
   public boolean aK_() {
      this.byte_();
      ((rrfw_3)this.class_[0]).class_();
      return super.aK_();
   }
}
