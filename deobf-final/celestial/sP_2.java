package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sP_2 implements C_float<Integer> {
   ;
   private static short[] shorts5c83ec99d465346696c888af73f3fafe;
   private static String[] strings5c83ec99d465346696c888af73f3fafe;
   public static Object[] staticFields5c83ec99d465346696c888af73f3fafe;
   private static byte[] bytes5c83ec99d465346696c888af73f3fafe;
   private static boolean[] booleans5c83ec99d465346696c888af73f3fafe;

   private static void byte_() {
      shorts5c83ec99d465346696c888af73f3fafe = new short[]{1, 0};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4249468162812106725L;
   }

   @Override
   public Class<Integer> class_() {
      return Integer.class;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 251548783;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -92, 34, -52, 51, 38, 59, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Integer break_(C_import var1) throws RuntimeException {
      return Integer.parseInt(var1.break_());
   }

   private static void break_() {
      bytes5c83ec99d465346696c888af73f3fafe = new byte[]{2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new sP_2(), null};
      var0[1] = new sP_2[]{(sP_2)var0[0]};
      staticFields5c83ec99d465346696c888af73f3fafe = var0;
   }

   private static void catch_() {
      booleans5c83ec99d465346696c888af73f3fafe = new boolean[]{true, false, false, false, true};
   }

   private static void case_() {
      strings5c83ec99d465346696c888af73f3fafe = new String[]{new String("INSTANCE")};
   }
}
