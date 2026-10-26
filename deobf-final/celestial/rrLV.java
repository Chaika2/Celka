package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLV {
   private static short[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;
   private static byte[] throws_;
   public Object[] break_;

   public Fu_1<?> byte_() {
      return (Fu_1<?>)this.break_[1];
   }

   public rrLV() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1900245063;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 81, 87, 32, 7, 85, -47, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrLg_1 class_() {
      return (rrLg_1)this.break_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -318823910668061936L;
   }

   public static void class_(rdn_3 var0, Fu_1<?> var1, rrLg_1 var2) {
      rrLV var3 = break_(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
   }

   private static rrLV break_(rdn_3 var0, Fu_1<?> var1, rrLg_1 var2) {
      ((rrLV)class_[0]).break_[0] = var0;
      ((rrLV)class_[0]).break_[1] = var1;
      ((rrLV)class_[0]).break_[2] = var2;
      return (rrLV)class_[0];
   }

   public rdn_3 break_() {
      return (rdn_3)this.break_[0];
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrLV()};
      class_ = var0;
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      throws_ = new byte[]{3};
   }

   private static void private_() {
      protected_ = new boolean[]{false, true};
   }
}
