package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAE extends Om_1 {
   private static byte[] byte_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] protected_;
   private static boolean[] throws_;

   public rrAE() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -840514808;
   }

   public xd_3 class_() {
      this.private_();
      return (xd_3)this.break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -316223895521349470L;
   }

   public static rrAE class_(rfH_2 var0, rdn_3 var1) {
      ((rrAE)class_[0]).break_[0] = var1;
      ((rrAE)class_[0]).break_[1] = var0;
      rrAE var10000 = (rrAE)class_[0];
      xd_3 var8 = rrjc_3.protected_(var0);
      var10000.break_[2] = var8;
      ((rrAE)class_[0]).class_(false);
      return (rrAE)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 91, 55, -119, 23, -82, -61, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rfH_2 break_() {
      this.private_();
      return (rfH_2)this.break_[1];
   }

   private static void throws_() {
      byte_ = new byte[]{3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrAE()};
      class_ = var0;
   }

   private static void case_() {
      throws_ = new boolean[]{false, false, true};
   }

   private static void implements_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   public rdn_3 protected_() {
      this.private_();
      return (rdn_3)this.break_[0];
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
