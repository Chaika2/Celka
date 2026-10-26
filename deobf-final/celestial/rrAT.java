package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAT {
   private static boolean[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] protected_;
   private static byte[] throws_;

   public List<rJY> byte_() {
      return (List<rJY>)this.class_[1];
   }

   public rrAT() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static void class_(rJr_1 var0, List<rJY> var1, int var2) {
      rrAT var3 = break_(var0, var1, var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, 8, 39, 71, -95, -16, 0, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 584240663;
   }

   public rJr_1 class_() {
      return (rJr_1)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8691768938729903830L;
   }

   public static rrAT break_(rJr_1 var0, List<rJY> var1, int var2) {
      ((rrAT)break_[0]).class_[0] = var0;
      ((rrAT)break_[0]).class_[1] = var1;
      rrAT var10000 = (rrAT)break_[0];
      Integer var9 = var2;
      var10000.class_[2] = var9;
      return (rrAT)break_[0];
   }

   public int break_() {
      return (Integer)this.class_[2];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }

   private static void catch_() {
      throws_ = new byte[]{3, 2};
   }

   private static void case_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAT()};
      break_ = var0;
   }
}
