package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SX implements Bw_1 {
   private static boolean[] class_;
   private static short[] break_;

   static {
      ntfClinit();
   }

   @Override
   public Bt_1 class_(String var1) {
      var1 = var1.toLowerCase();

      for (String var5 : (String[])BH.class_[0]) {
         if (var1.contains(var5)) {
            return new SJ();
         }
      }

      for (String var16 : (String[])BH.class_[1]) {
         if (var1.contains(var16)) {
            return new Sd_1();
         }
      }

      for (String var17 : (String[])BH.class_[2]) {
         if (var1.contains(var17)) {
            return new Sk_1();
         }
      }

      for (String var18 : (String[])BH.class_[3]) {
         if (var1.contains(var18)) {
            return new SW();
         }
      }

      return null;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -684867440;
   }

   private static void class_() {
      class_ = new boolean[4];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1493947366313965655L;
   }

   private static void break_() {
      break_ = new short[]{0, 1, 2, 3};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -50, 81, 86, -22, 59, -1, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
