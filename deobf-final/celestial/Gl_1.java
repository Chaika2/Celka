package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Gl_1 {
   ;
   public static Object[] staticFields1a1463d15ff638568fa2d9ee62dd2289;
   private static String[] strings1a1463d15ff638568fa2d9ee62dd2289;
   private static short[] shorts1a1463d15ff638568fa2d9ee62dd2289;
   private static boolean[] booleans1a1463d15ff638568fa2d9ee62dd2289;
   private static byte[] bytes1a1463d15ff638568fa2d9ee62dd2289;

   private static void byte_() {
      Object[] var0 = new Object[]{new Gl_1(), new Gl_1(), new Gl_1(), new Gl_1(), null};
      var0[4] = new Gl_1[]{(Gl_1)var0[0], (Gl_1)var0[1], (Gl_1)var0[2], (Gl_1)var0[3]};
      staticFields1a1463d15ff638568fa2d9ee62dd2289 = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1661497584;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1506169371992990497L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -10, -120, -9, 18, 126, -17, -17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleans1a1463d15ff638568fa2d9ee62dd2289 = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      shorts1a1463d15ff638568fa2d9ee62dd2289 = new short[]{4, 0, 1, 2, 3};
   }

   private static void case_() {
      strings1a1463d15ff638568fa2d9ee62dd2289 = new String[]{new String("NONE"), new String("GOAL_SET"), new String("PATH_REQUESTED"), new String("EXECUTING")};
   }

   private static void protected_() {
      bytes1a1463d15ff638568fa2d9ee62dd2289 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }
}
