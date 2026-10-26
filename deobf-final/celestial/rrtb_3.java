package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrtb_3 {
   ;
   private static byte[] bytes37d12a728fd138a98f39979b8f11d1be;
   private static String[] strings37d12a728fd138a98f39979b8f11d1be;
   private static boolean[] booleans37d12a728fd138a98f39979b8f11d1be;
   private static short[] shorts37d12a728fd138a98f39979b8f11d1be;
   public static Object[] staticFields37d12a728fd138a98f39979b8f11d1be;

   private static void byte_() {
      booleans37d12a728fd138a98f39979b8f11d1be = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4165735301900290587L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1192423455;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, -14, 1, -20, -96, 79, 16, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      shorts37d12a728fd138a98f39979b8f11d1be = new short[]{2, 0, 1};
   }

   private static void break_() {
      strings37d12a728fd138a98f39979b8f11d1be = new String[]{new String("READY"), new String("RECONNECTING")};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrtb_3(), new rrtb_3(), null};
      var0[2] = new rrtb_3[]{(rrtb_3)var0[0], (rrtb_3)var0[1]};
      staticFields37d12a728fd138a98f39979b8f11d1be = var0;
   }

   private static void protected_() {
      bytes37d12a728fd138a98f39979b8f11d1be = new byte[]{2, 2, 3};
   }
}
