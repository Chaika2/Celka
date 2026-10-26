package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrta_3 {
   private static boolean[] booleans0b9ba99d5751335787deb45ab94d73c6;
   public static Object[] staticFields0b9ba99d5751335787deb45ab94d73c6;
   private static String[] strings0b9ba99d5751335787deb45ab94d73c6;
   private static short[] shorts0b9ba99d5751335787deb45ab94d73c6;
   private static byte[] bytes0b9ba99d5751335787deb45ab94d73c6;

   static {
      ntfClinit();
   }

   private static void id_class() {
      strings0b9ba99d5751335787deb45ab94d73c6 = new String[]{new String("KEY_TYPED"), new String("FOCUS_LOST")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4009649860465393824L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -67, -26, -22, -57, 59, -45, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -613398446;
   }

   private static void id_break() {
      bytes0b9ba99d5751335787deb45ab94d73c6 = new byte[]{2, 2, 3};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrta_3(), new rrta_3(), null};
      var0[2] = new rrta_3[]{(rrta_3)var0[0], (rrta_3)var0[1]};
      staticFields0b9ba99d5751335787deb45ab94d73c6 = var0;
   }

   private static void id_case() {
      booleans0b9ba99d5751335787deb45ab94d73c6 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      shorts0b9ba99d5751335787deb45ab94d73c6 = new short[]{2, 0, 1};
   }
}
