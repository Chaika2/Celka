package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTQ extends HashMap<rxL_2, float[]> {
   private static boolean[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static float[] protected_;

   private static void byte_() {
      protected_ = new float[]{0.596F, 0.403F, 0.682F, 255.0F, 255.0F, 255.0F};
   }

   public rrTQ() {
      this.put(null, new float[]{0.596F, 0.403F, 0.682F});

      for (rxL_2 var4 : rxL_2.VALUES) {
         this.put(
            var4,
            new float[]{
               (float)(var4.private_() >> 16 & 0xFF) / 255.0F, (float)(var4.private_() >> 8 & 0xFF) / 255.0F, (float)(var4.private_() & 0xFF) / 255.0F
            }
         );
      }
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5330046297907382735L;
   }

   private static void class_() {
      byte_ = new byte[]{3, 2, 3, 16, 8, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -73, -47, 54, -95, -57, -47, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -442572708;
   }

   private static void break_() {
      break_ = new short[]{255, 255, 255};
   }

   private static void protected_() {
      class_ = new boolean[]{false, true, false, false, true};
   }
}
