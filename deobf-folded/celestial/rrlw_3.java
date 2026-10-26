package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrlw_3 {
   private static String[] stringsff97087b8aec3a608f6e6f0bcbd5ed33;
   private static boolean[] booleansff97087b8aec3a608f6e6f0bcbd5ed33;
   private static byte[] bytesff97087b8aec3a608f6e6f0bcbd5ed33;
   public static Object[] staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33;
   private static short[] shortsff97087b8aec3a608f6e6f0bcbd5ed33;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrlw_3(), new rrlw_3(), null};
      var0[2] = new rrlw_3[]{(rrlw_3)var0[0], (rrlw_3)var0[1]};
      staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33 = var0;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1355454913;
   }

   private static void id_class() {
      shortsff97087b8aec3a608f6e6f0bcbd5ed33 = new short[]{2, 0, 1};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 21712913933586047L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{102, -88, -16, -12, -124, 36, 10, 118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleansff97087b8aec3a608f6e6f0bcbd5ed33 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_throws() {
      bytesff97087b8aec3a608f6e6f0bcbd5ed33 = new byte[]{2, 2, 3};
   }

   private static void id_protected() {
      stringsff97087b8aec3a608f6e6f0bcbd5ed33 = new String[]{new String("WAITING_FOR_ACCEPT"), new String("ACCEPTED")};
   }
}
