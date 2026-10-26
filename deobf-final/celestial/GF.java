package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GF extends rS_2 {
   private static boolean[] break_;
   private static int[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   private static short[] case_;

   private static void byte_() {
      byte_ = new int[]{1910811835};
   }

   public GF(rfH_2 var1) {
      super(var1.final_());
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format(
         "GoalPlace{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 1910811835;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 864662254;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      return (double)((Integer)this.class_[1] * 100) + super.class_(var1, var2, var3);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5442381948491353447L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -87, 6, -49, -44, 89, -115, -65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new byte[]{100, 3, 2};
   }

   private static void catch_() {
      break_ = new boolean[]{false, true};
   }

   private static void case_() {
      case_ = new short[]{1, 0, 1, 2};
   }

   private static void protected_() {
      protected_ = new String[]{new String("GoalPlace{x=%s,y=%s,z=%s}")};
   }
}
