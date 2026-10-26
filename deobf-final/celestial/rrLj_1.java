package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLj_1 {
   private static boolean[] byte_;
   public static Object[] class_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLj_1()};
      class_ = var0;
   }

   public rrLj_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, 83, -86, -12, -104, 101, 24, -85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLj_1 class_(boolean var0, boolean var1) {
      rrLj_1 var10000 = (rrLj_1)class_[0];
      Boolean var6 = var0;
      var10000.break_[0] = var6;
      var10000 = (rrLj_1)class_[0];
      Boolean var7 = var1;
      var10000.break_[1] = var7;
      return (rrLj_1)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3048651392433928292L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2019739973;
   }

   public boolean class_() {
      return (Boolean)this.break_[1];
   }

   public boolean break_() {
      return (Boolean)this.break_[0];
   }

   private static void throws_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void catch_() {
      throws_ = new byte[]{2};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = false;
         var1[1] = false;
      }
   }

   private static void protected_() {
      byte_ = new boolean[]{false, false, false, true, false, true};
   }
}
