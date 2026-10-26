package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrur_1 {
   private static short[] shorts11cf60dc087237409ab550ffa4a0389b;
   private static boolean[] booleans11cf60dc087237409ab550ffa4a0389b;
   private static byte[] bytes11cf60dc087237409ab550ffa4a0389b;
   private static String[] strings11cf60dc087237409ab550ffa4a0389b;
   public static Object[] staticFields11cf60dc087237409ab550ffa4a0389b;

   private static void id_byte() {
      strings11cf60dc087237409ab550ffa4a0389b = new String[]{new String("BLOCKY"), new String("SMOOTH")};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, -3, -110, 108, 33, 10, 52, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1702799280;
   }

   public static rrur_1[] id_class() {
      return new rrur_1[]{(rrur_1)staticFields11cf60dc087237409ab550ffa4a0389b[0], (rrur_1)staticFields11cf60dc087237409ab550ffa4a0389b[1]};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2241262814943013314L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrur_1(), new rrur_1(), null};
      var0[2] = new rrur_1[]{(rrur_1)var0[0], (rrur_1)var0[1]};
      staticFields11cf60dc087237409ab550ffa4a0389b = var0;
   }

   private static void id_throws() {
      booleans11cf60dc087237409ab550ffa4a0389b = new boolean[]{false, true, false, true, false, false, true, true};
   }

   private static void id_catch() {
      shorts11cf60dc087237409ab550ffa4a0389b = new short[]{2, 0, 1, 0, 1};
   }

   private static void id_case() {
      bytes11cf60dc087237409ab550ffa4a0389b = new byte[]{2, 2, 2, 3};
   }
}
