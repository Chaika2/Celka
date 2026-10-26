package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum H {
   ;
   private static short[] shorts1fafa9bf76ed3352892023b88da3732d;
   private static boolean[] booleans1fafa9bf76ed3352892023b88da3732d;
   private static byte[] bytes1fafa9bf76ed3352892023b88da3732d;
   private static String[] strings1fafa9bf76ed3352892023b88da3732d;
   public static Object[] staticFields1fafa9bf76ed3352892023b88da3732d;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8498418239063526031L;
   }

   private static void class_() {
      booleans1fafa9bf76ed3352892023b88da3732d = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -22, 32, 83, 110, 118, 53, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1828270068;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new H(), new H(), new H(), new H(), null};
      var0[4] = new H[]{(H)var0[0], (H)var0[1], (H)var0[2], (H)var0[3]};
      staticFields1fafa9bf76ed3352892023b88da3732d = var0;
   }

   private static void throws_() {
      bytes1fafa9bf76ed3352892023b88da3732d = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void case_() {
      strings1fafa9bf76ed3352892023b88da3732d = new String[]{
         new String("LOAD"), new String("UNLOAD"), new String("POPULATE_FULL"), new String("POPULATE_PARTIAL")
      };
   }

   private static void protected_() {
      shorts1fafa9bf76ed3352892023b88da3732d = new short[]{4, 0, 1, 2, 3};
   }
}
