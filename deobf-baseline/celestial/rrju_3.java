package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrju_3 {
   private static String[] stringsaad619fe5d0133909138b6cd23b7fdf1;
   private static short[] shortsaad619fe5d0133909138b6cd23b7fdf1;
   private static byte[] bytesaad619fe5d0133909138b6cd23b7fdf1;
   public static Object[] staticFieldsaad619fe5d0133909138b6cd23b7fdf1;
   private static boolean[] booleansaad619fe5d0133909138b6cd23b7fdf1;

   private static void id_byte() {
      bytesaad619fe5d0133909138b6cd23b7fdf1 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1610512018;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{79, 109, -17, -26, -13, -63, 73, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8884735387108354024L;
   }

   private static void id_break() {
      stringsaad619fe5d0133909138b6cd23b7fdf1 = new String[]{new String("CLOSEST"), new String("FURTHEST"), new String("NONE")};
   }

   private static void id_throws() {
      booleansaad619fe5d0133909138b6cd23b7fdf1 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      shortsaad619fe5d0133909138b6cd23b7fdf1 = new short[]{3, 0, 1, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrju_3(), new rrju_3(), new rrju_3(), null};
      var0[3] = new rrju_3[]{(rrju_3)var0[0], (rrju_3)var0[1], (rrju_3)var0[2]};
      staticFieldsaad619fe5d0133909138b6cd23b7fdf1 = var0;
   }
}
