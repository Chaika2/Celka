package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLo_1 {
   public static Object[] class_;
   public Object[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;

   private static void byte_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   public rrLo_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -152963854642222419L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1513698364;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{2, 79, -60, 101, -18, -45, -33, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rLY class_() {
      return (rLY)this.break_[1];
   }

   public static void class_(iB_2 var0, rLY var1) {
      rrLo_1 var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
   }

   public iB_2 break_() {
      return (iB_2)this.break_[0];
   }

   public static rrLo_1 break_(iB_2 var0, rLY var1) {
      ((rrLo_1)class_[0]).break_[0] = var0;
      ((rrLo_1)class_[0]).break_[1] = var1;
      return (rrLo_1)class_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLo_1()};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      protected_ = new boolean[]{false, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
