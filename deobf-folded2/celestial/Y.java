package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Y {
   private static String[] strings22c81230f53b33f2a682b4198db24cc4;
   public static Object[] staticFields22c81230f53b33f2a682b4198db24cc4;
   private static short[] shorts22c81230f53b33f2a682b4198db24cc4;
   private static byte[] bytes22c81230f53b33f2a682b4198db24cc4;
   private static boolean[] booleans22c81230f53b33f2a682b4198db24cc4;

   private static void id_byte() {
      shorts22c81230f53b33f2a682b4198db24cc4 = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -933647502;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1059362666686823220L;
   }

   private static void id_class() {
      booleans22c81230f53b33f2a682b4198db24cc4 = new boolean[]{false, true, false, false, true, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, 21, -83, 100, -83, -35, -20, -48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytes22c81230f53b33f2a682b4198db24cc4 = new byte[]{2, 2, 3};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new Y(), new Y(), null};
      var0[2] = new Y[]{(Y)var0[0], (Y)var0[1]};
      staticFields22c81230f53b33f2a682b4198db24cc4 = var0;
   }

   private static void id_case() {
      strings22c81230f53b33f2a682b4198db24cc4 = new String[]{new String("PRE"), new String("POST")};
   }
}
