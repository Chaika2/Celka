package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnd_3 {
   public static Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   private static void byte_() {
      throws_ = new byte[]{2};
   }

   public rrnd_3() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -124, -56, 58, -25, 18, 15, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rjU_2 var0, int var1) {
      rrnd_3 var2 = break_(var0, var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1698678631;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6592760529786525274L;
   }

   public int class_() {
      return (Integer)this.break_[1];
   }

   private static rrnd_3 break_(rjU_2 var0, int var1) {
      ((rrnd_3)class_[0]).break_[0] = var0;
      rrnd_3 var10000 = (rrnd_3)class_[0];
      Integer var7 = var1;
      var10000.break_[1] = var7;
      return (rrnd_3)class_[0];
   }

   public rjU_2 break_() {
      return (rjU_2)this.break_[0];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[1] = 0;
      }
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true, false, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrnd_3()};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }
}
