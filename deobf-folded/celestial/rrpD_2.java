package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpD_2 {
   private static short[] shortsb8f0ef75cc3a3659b008178ccc081710;
   public static Object[] staticFieldsb8f0ef75cc3a3659b008178ccc081710;
   private static String[] stringsb8f0ef75cc3a3659b008178ccc081710;
   private static byte[] bytesb8f0ef75cc3a3659b008178ccc081710;
   private static boolean[] booleansb8f0ef75cc3a3659b008178ccc081710;

   private static void id_byte() {
      stringsb8f0ef75cc3a3659b008178ccc081710 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      shortsb8f0ef75cc3a3659b008178ccc081710 = new short[]{3, 0, 1, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2732673865939551031L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 610148243;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, 46, -19, -100, -86, 48, -25, -64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytesb8f0ef75cc3a3659b008178ccc081710 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrpD_2(), new rrpD_2(), new rrpD_2(), null};
      var0[3] = new rrpD_2[]{(rrpD_2)var0[0], (rrpD_2)var0[1], (rrpD_2)var0[2]};
      staticFieldsb8f0ef75cc3a3659b008178ccc081710 = var0;
   }

   private static void id_case() {
      booleansb8f0ef75cc3a3659b008178ccc081710 = new boolean[]{false, true, false, false, true, true};
   }
}
