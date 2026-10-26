package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryI {
   private static String[] strings0877fde0314d38ca87da6306c28c77a3;
   private static byte[] bytes0877fde0314d38ca87da6306c28c77a3;
   public static Object[] staticFields0877fde0314d38ca87da6306c28c77a3;
   private static short[] shorts0877fde0314d38ca87da6306c28c77a3;
   private static boolean[] booleans0877fde0314d38ca87da6306c28c77a3;

   private static void id_byte() {
      bytes0877fde0314d38ca87da6306c28c77a3 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      shorts0877fde0314d38ca87da6306c28c77a3 = new short[]{3, 0, 1, 2};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -28410212;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1787123183023984872L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, -109, -10, 59, 14, -68, -3, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rryI(), new rryI(), new rryI(), null};
      var0[3] = new rryI[]{(rryI)var0[0], (rryI)var0[1], (rryI)var0[2]};
      staticFields0877fde0314d38ca87da6306c28c77a3 = var0;
   }

   private static void id_throws() {
      strings0877fde0314d38ca87da6306c28c77a3 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void id_case() {
      booleans0877fde0314d38ca87da6306c28c77a3 = new boolean[]{false, true, false, false, true, true};
   }
}
