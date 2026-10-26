package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrHX {
   ;
   private static byte[] bytesf71f99cac23234318e24f4e142924a57;
   private static String[] stringsf71f99cac23234318e24f4e142924a57;
   private static short[] shortsf71f99cac23234318e24f4e142924a57;
   public static Object[] staticFieldsf71f99cac23234318e24f4e142924a57;
   private static boolean[] booleansf71f99cac23234318e24f4e142924a57;

   private static void byte_() {
      booleansf71f99cac23234318e24f4e142924a57 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, -61, 82, 22, 32, 105, 77, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      stringsf71f99cac23234318e24f4e142924a57 = new String[]{new String("BLOCK_PRIORITY"), new String("BLOCK_HARDNESS"), new String("DISTANCE")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -983839721;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3458310100812878955L;
   }

   private static void break_() {
      bytesf71f99cac23234318e24f4e142924a57 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrHX(), new rrHX(), new rrHX(), null};
      var0[3] = new rrHX[]{(rrHX)var0[0], (rrHX)var0[1], (rrHX)var0[2]};
      staticFieldsf71f99cac23234318e24f4e142924a57 = var0;
   }

   private static void case_() {
      shortsf71f99cac23234318e24f4e142924a57 = new short[]{3, 0, 1, 2};
   }
}
