package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpO_2 {
   private static byte[] bytes4014939632583c5ba36d4475b7d8caf4;
   public static Object[] staticFields4014939632583c5ba36d4475b7d8caf4;
   private static short[] shorts4014939632583c5ba36d4475b7d8caf4;
   private static String[] strings4014939632583c5ba36d4475b7d8caf4;
   private static boolean[] booleans4014939632583c5ba36d4475b7d8caf4;

   private static void id_byte() {
      bytes4014939632583c5ba36d4475b7d8caf4 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-106, 10, 14, -84, -121, 111, -80, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3672786054111097450L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1753246972;
   }

   private static void id_break() {
      booleans4014939632583c5ba36d4475b7d8caf4 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      strings4014939632583c5ba36d4475b7d8caf4 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void id_case() {
      shorts4014939632583c5ba36d4475b7d8caf4 = new short[]{3, 0, 1, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrpO_2(), new rrpO_2(), new rrpO_2(), null};
      var0[3] = new rrpO_2[]{(rrpO_2)var0[0], (rrpO_2)var0[1], (rrpO_2)var0[2]};
      staticFields4014939632583c5ba36d4475b7d8caf4 = var0;
   }
}
