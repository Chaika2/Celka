package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFy_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] throws_;

   private static void byte_() {
      protected_ = new boolean[]{false, true};
   }

   public rrFy_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static rrFy_1 class_(Aw_1 var0, Set<String> var1) {
      ((rrFy_1)class_[0]).break_[0] = var0;
      ((rrFy_1)class_[0]).break_[1] = var1;
      return (rrFy_1)class_[0];
   }

   public Aw_1 class_() {
      return (Aw_1)this.break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{83, -110, -82, 83, -83, -117, -6, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1577481003;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2964067095178621392L;
   }

   public Set<String> break_() {
      return (Set<String>)this.break_[1];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrFy_1()};
      class_ = var0;
   }

   private static void catch_() {
      byte_ = new byte[]{2};
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
