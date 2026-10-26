package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLv_1 {
   public static Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] break_;

   private static void byte_() {
      throws_ = new short[]{0, 1, 0, 0, 0, 0, 0, 0, 1, 1};
   }

   public rrLv_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8333567002400392453L;
   }

   public void class_(rgP_2 var1) {
      this.break_[1] = var1;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 47498419;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, -58, 54, -88, 94, -42, -111, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rgP_2 class_() {
      return (rgP_2)this.break_[1];
   }

   public static rrLv_1 class_(rnB_2 var0, rgP_2 var1) {
      rrLv_1 var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      return var2;
   }

   public static rrLv_1 break_(rnB_2 var0, rgP_2 var1) {
      ((rrLv_1)class_[0]).break_[1] = var1;
      ((rrLv_1)class_[0]).break_[0] = var0;
      return (rrLv_1)class_[0];
   }

   public rnB_2 break_() {
      return (rnB_2)this.break_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLv_1()};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
