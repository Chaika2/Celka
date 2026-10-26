package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFe_1 {
   public static Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public Object[] break_;

   private static void byte_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1};
   }

   public rrFe_1() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4524410086231133147L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{39, -34, 112, -69, 36, 117, -83, -103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void class_(rrNV var0, rrFa_1 var1) {
      rrFe_1 var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -775082190;
   }

   public rrNV class_() {
      return (rrNV)this.break_[0];
   }

   public rrFa_1 break_() {
      return (rrFa_1)this.break_[1];
   }

   private static rrFe_1 break_(rrNV var0, rrFa_1 var1) {
      ((rrFe_1)class_[0]).break_[0] = var0;
      ((rrFe_1)class_[0]).break_[1] = var1;
      return (rrFe_1)class_[0];
   }

   private static void throws_() {
      throws_ = new boolean[]{false, true};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrFe_1()};
      class_ = var0;
   }

   private static void case_() {
      protected_ = new byte[]{2};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
