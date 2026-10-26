package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract sealed class rrLi_1 permits rrAr_1, rrAP {
   private static short[] class_;

   static {
      ntfClinit();
   }

   public static rrAr_1 class_(int var0) {
      return new rrAr_1(var0);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -125, -76, 125, 42, 45, -128, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAP class_() {
      return (rrAP)rrAP.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3850551724540349510L;
   }

   private static void break_() {
      class_ = new short[1];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1142798334;
   }
}
