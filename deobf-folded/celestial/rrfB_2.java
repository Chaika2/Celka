package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfB_2 {
   private static byte[] bytesfc18f9297f253886af5bb346ef27734e;
   public static Object[] staticFieldsfc18f9297f253886af5bb346ef27734e;
   private static boolean[] booleansfc18f9297f253886af5bb346ef27734e;
   private static String[] stringsfc18f9297f253886af5bb346ef27734e;
   private static short[] shortsfc18f9297f253886af5bb346ef27734e;

   private static void id_byte() {
      shortsfc18f9297f253886af5bb346ef27734e = new short[]{3, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -724077364;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8399641110768912452L;
   }

   private static void id_class() {
      bytesfc18f9297f253886af5bb346ef27734e = new byte[]{3, 2, 2, 2, 3, 4};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 68, -107, -106, -27, 73, -90, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrfB_2(), new rrfB_2(), new rrfB_2(), null};
      var0[3] = new rrfB_2[]{(rrfB_2)var0[0], (rrfB_2)var0[1], (rrfB_2)var0[2]};
      staticFieldsfc18f9297f253886af5bb346ef27734e = var0;
   }

   private static void id_throws() {
      booleansfc18f9297f253886af5bb346ef27734e = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      stringsfc18f9297f253886af5bb346ef27734e = new String[]{new String("DEFAULT"), new String("DEFAULT_MOREPACKETS"), new String("TO_PLAYER")};
   }
}
