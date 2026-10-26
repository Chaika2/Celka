package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLI {
   public static Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   public iB_2 byte_() {
      return (iB_2)this.break_[0];
   }

   public rrLI() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1919238544;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8464193706500080951L;
   }

   public boolean class_() {
      return (Boolean)this.break_[2];
   }

   public static rrLI class_(iB_2 var0, rLY var1, boolean var2) {
      ((rrLI)class_[0]).break_[0] = var0;
      ((rrLI)class_[0]).break_[1] = var1;
      rrLI var10000 = (rrLI)class_[0];
      Boolean var9 = var2;
      var10000.break_[2] = var9;
      return (rrLI)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 100, -28, 122, 127, -95, -26, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void break_(iB_2 var0, rLY var1, boolean var2) {
      rrLI var3 = class_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
   }

   public rLY break_() {
      return (rLY)this.break_[1];
   }

   private static void throws_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLI()};
      class_ = var0;
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = false;
      }
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void private_() {
      throws_ = new byte[]{3, 2};
   }
}
