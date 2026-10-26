package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gv_1 extends rE_2 {
   private static int[] break_;
   private static String[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;

   private static void byte_() {
      protected_ = new short[]{1, 0, 1, 2};
   }

   public Gv_1(rfH_2 var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format(
         "GoalBreak{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 1636324008;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8005320330672154794L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 744117733;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-102, -110, -32, 15, 27, -85, 39, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var2 > this.class_[1] ? false : super.break_(var1, var2, var3);
   }

   private static void throws_() {
      break_ = new int[]{1636324008};
   }

   private static void catch_() {
      throws_ = new byte[]{3, 2};
   }

   private static void case_() {
      case_ = new boolean[]{false, false, true};
   }

   private static void protected_() {
      byte_ = new String[]{new String("GoalBreak{x=%s,y=%s,z=%s}")};
   }
}
