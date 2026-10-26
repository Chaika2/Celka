package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLa_1 {
   private static byte[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] break_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public rrLa_1() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4559259143583947058L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -47, 65, -47, 117, -42, 70, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -243824677;
   }

   public static rrLa_1 class_(rdn_3 var0, rrLi_1 var1) {
      ((rrLa_1)class_[0]).break_[0] = var0;
      ((rrLa_1)class_[0]).break_[1] = var1;
      return (rrLa_1)class_[0];
   }

   public rdn_3 class_() {
      return (rdn_3)this.break_[0];
   }

   public static void break_(rdn_3 var0, rrLi_1 var1) {
      QY.instanceof_().class_(() -> {
         rrLa_1 var2 = class_(var0, var1);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
      });
   }

   public rrLi_1 break_() {
      return (rrLi_1)this.break_[1];
   }

   private static void throws_() {
      protected_ = new boolean[]{false, true};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLa_1()};
      class_ = var0;
   }

   private static void case_() {
      throws_ = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 0};
   }

   private static void protected_() {
      byte_ = new byte[]{2};
   }
}
