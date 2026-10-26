package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrtX_2 {
   private static String[] stringsdadd6b8236373470b3196397455fa876;
   private static boolean[] booleansdadd6b8236373470b3196397455fa876;
   private static short[] shortsdadd6b8236373470b3196397455fa876;
   private static byte[] bytesdadd6b8236373470b3196397455fa876;
   public static Object[] staticFieldsdadd6b8236373470b3196397455fa876;

   private static void id_byte() {
      stringsdadd6b8236373470b3196397455fa876 = new String[]{new String("SUCCESS"), new String("ERROR"), new String("INFO")};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, -107, -105, 40, -90, 54, 37, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3689872113150203368L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1671627783;
   }

   private static void id_class() {
      shortsdadd6b8236373470b3196397455fa876 = new short[]{3, 0, 1, 2};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrtX_2(), new rrtX_2(), new rrtX_2(), null};
      var0[3] = new rrtX_2[]{(rrtX_2)var0[0], (rrtX_2)var0[1], (rrtX_2)var0[2]};
      staticFieldsdadd6b8236373470b3196397455fa876 = var0;
   }

   private static void id_case() {
      bytesdadd6b8236373470b3196397455fa876 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_protected() {
      booleansdadd6b8236373470b3196397455fa876 = new boolean[]{false, true, false, false, true, true};
   }
}
