package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrus_1 {
   private static String[] strings671469053d923ac8912036fe43a40b51;
   private static byte[] bytes671469053d923ac8912036fe43a40b51;
   public static Object[] staticFields671469053d923ac8912036fe43a40b51;
   private static short[] shorts671469053d923ac8912036fe43a40b51;
   private static boolean[] booleans671469053d923ac8912036fe43a40b51;

   private static void id_byte() {
      strings671469053d923ac8912036fe43a40b51 = new String[]{new String("NONE"), new String("WAVES")};
   }

   static {
      ntfClinit();
   }

   public static rrus_1[] id_class() {
      return new rrus_1[]{(rrus_1)staticFields671469053d923ac8912036fe43a40b51[0], (rrus_1)staticFields671469053d923ac8912036fe43a40b51[1]};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 957543650;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8688122491952036637L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -120, 46, 63, 39, -120, 59, 27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytes671469053d923ac8912036fe43a40b51 = new byte[]{2, 2, 2, 3};
   }

   private static void id_catch() {
      shorts671469053d923ac8912036fe43a40b51 = new short[]{2, 0, 1, 0, 1};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrus_1(), new rrus_1(), null};
      var0[2] = new rrus_1[]{(rrus_1)var0[0], (rrus_1)var0[1]};
      staticFields671469053d923ac8912036fe43a40b51 = var0;
   }

   private static void id_protected() {
      booleans671469053d923ac8912036fe43a40b51 = new boolean[]{false, true, false, true, false, false, true, true};
   }
}
