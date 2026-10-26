package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum w_1 {
   ;
   private static byte[] bytesa114f317008a3fe78339d2b3c5e6fe39;
   private static String[] stringsa114f317008a3fe78339d2b3c5e6fe39;
   private static boolean[] booleansa114f317008a3fe78339d2b3c5e6fe39;
   public static Object[] staticFieldsa114f317008a3fe78339d2b3c5e6fe39;
   private static short[] shortsa114f317008a3fe78339d2b3c5e6fe39;

   private static void byte_() {
      stringsa114f317008a3fe78339d2b3c5e6fe39 = new String[]{new String("MOTION_UPDATE"), new String("JUMP")};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 71, -104, -92, 105, -28, 49, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2097736394644923999L;
   }

   private static void class_() {
      shortsa114f317008a3fe78339d2b3c5e6fe39 = new short[]{2, 0, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1461391097;
   }

   private static void throws_() {
      bytesa114f317008a3fe78339d2b3c5e6fe39 = new byte[]{2, 2, 3};
   }

   private static void case_() {
      booleansa114f317008a3fe78339d2b3c5e6fe39 = new boolean[]{false, true, false, false, true, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new w_1(), new w_1(), null};
      var0[2] = new w_1[]{(w_1)var0[0], (w_1)var0[1]};
      staticFieldsa114f317008a3fe78339d2b3c5e6fe39 = var0;
   }
}
