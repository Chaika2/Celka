package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryF {
   private static byte[] bytesfd087588ab503ef5ba48903746a1e506;
   private static boolean[] booleansfd087588ab503ef5ba48903746a1e506;
   private static short[] shortsfd087588ab503ef5ba48903746a1e506;
   private static String[] stringsfd087588ab503ef5ba48903746a1e506;
   public static Object[] staticFieldsfd087588ab503ef5ba48903746a1e506;

   private static void id_byte() {
      bytesfd087588ab503ef5ba48903746a1e506 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      stringsfd087588ab503ef5ba48903746a1e506 = new String[]{new String("VALID"), new String("FRIEND"), new String("BLACKLISTED")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2643775169687203128L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, 97, 114, -48, 6, 34, 20, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2034388886;
   }

   private static void id_break() {
      booleansfd087588ab503ef5ba48903746a1e506 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      shortsfd087588ab503ef5ba48903746a1e506 = new short[]{3, 0, 1, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rryF(), new rryF(), new rryF(), null};
      var0[3] = new rryF[]{(rryF)var0[0], (rryF)var0[1], (rryF)var0[2]};
      staticFieldsfd087588ab503ef5ba48903746a1e506 = var0;
   }
}
