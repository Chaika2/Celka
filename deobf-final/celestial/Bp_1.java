package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bp_1 {
   private static boolean[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public static Object[] class_;
   public Object[] break_;

   public Bq_1 byte_() {
      return (Bq_1)this.break_[0];
   }

   public Bp_1() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -82, 4, -113, -9, 44, 64, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 170856849;
   }

   public BT class_() {
      return (BT)this.break_[2];
   }

   public static Bp_1 class_(Bq_1 var0, Bt_1 var1, BT var2) {
      ((Bp_1)class_[0]).break_[0] = var0;
      ((Bp_1)class_[0]).break_[1] = var1;
      ((Bp_1)class_[0]).break_[2] = var2;
      return (Bp_1)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1909701072573517804L;
   }

   public Bt_1 break_() {
      return (Bt_1)this.break_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new Bp_1()};
      class_ = var0;
   }

   private static void case_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void private_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }
}
