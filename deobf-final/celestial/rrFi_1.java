package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFi_1 {
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;
   public static Object[] break_;
   private static boolean[] throws_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrFi_1()};
      break_ = var0;
   }

   public rrFi_1() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   public static rrFi_1 class_(rdn_3 var0, List<rLY> var1) {
      rrFi_1 var2 = break_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var2);
      return var2;
   }

   public void class_(List<rLY> var1) {
      this.class_[1] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7763043736827534224L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 83, -106, -100, -123, -95, -70, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1352340895;
   }

   public void class_(rdn_3 var1) {
      this.class_[0] = var1;
   }

   public rdn_3 class_() {
      return (rdn_3)this.class_[0];
   }

   private static rrFi_1 break_(rdn_3 var0, List<rLY> var1) {
      ((rrFi_1)break_[0]).class_[0] = var0;
      ((rrFi_1)break_[0]).class_[1] = var1;
      return (rrFi_1)break_[0];
   }

   public List<rLY> break_() {
      return (List<rLY>)this.class_[1];
   }

   private static void throws_() {
      byte_ = new byte[]{2};
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      throws_ = new boolean[]{false, true};
   }
}
