package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAF {
   public static Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] break_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   public rrAF() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 599268648;
   }

   public boolean class_() {
      return (Boolean)this.break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5212190196675896342L;
   }

   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.break_[0] = var6;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, 93, -29, 105, 81, 95, -25, 99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAF break_(boolean var0) {
      rrAF var10000 = (rrAF)class_[0];
      Boolean var5 = var0;
      var10000.break_[0] = var5;
      return (rrAF)class_[0];
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrAF()};
      class_ = var0;
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, false, false, true};
   }

   private static void protected_() {
      protected_ = new short[5];
   }
}
