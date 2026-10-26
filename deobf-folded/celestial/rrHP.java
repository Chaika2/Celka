package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrHP {
   public static Object[] staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889;
   private static short[] shortsd1f2ea7d9a9f3838978754e1a2c8b889;
   private static String[] stringsd1f2ea7d9a9f3838978754e1a2c8b889;
   private static byte[] bytesd1f2ea7d9a9f3838978754e1a2c8b889;
   private static boolean[] booleansd1f2ea7d9a9f3838978754e1a2c8b889;

   private static void id_byte() {
      shortsd1f2ea7d9a9f3838978754e1a2c8b889 = new short[]{3, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, -79, -5, 57, -49, -119, 75, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -606346386;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4272408043468728188L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new rrHP(), new rrHP(), new rrHP(), null};
      var0[3] = new rrHP[]{(rrHP)var0[0], (rrHP)var0[1], (rrHP)var0[2]};
      staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889 = var0;
   }

   private static void id_break() {
      stringsd1f2ea7d9a9f3838978754e1a2c8b889 = new String[]{new String("NOT_INVENTORY"), new String("STANDING"), new String("OK")};
   }

   private static void id_throws() {
      bytesd1f2ea7d9a9f3838978754e1a2c8b889 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_protected() {
      booleansd1f2ea7d9a9f3838978754e1a2c8b889 = new boolean[]{false, true, false, false, true, true};
   }
}
