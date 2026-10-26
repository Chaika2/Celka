package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLC {
   public Object[] class_;
   private static boolean[] byte_;
   private static short[] protected_;
   public static Object[] break_;
   private static byte[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLC()};
      break_ = var0;
   }

   public rrLC() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public iB_2 class_() {
      return (iB_2)this.class_[0];
   }

   public static rrLC class_(iB_2 var0, rLY var1) {
      ((rrLC)break_[0]).class_[0] = var0;
      ((rrLC)break_[0]).class_[1] = var1;
      return (rrLC)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -692210037;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 46, 106, 35, 0, -98, 93, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2933657813591755572L;
   }

   public static void break_(iB_2 var0, rLY var1) {
      rrLC var2 = class_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
   }

   public rLY break_() {
      return (rLY)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, true};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }
}
