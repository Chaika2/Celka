package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Gx_1 {
   ;
   private static boolean[] booleans5eb6de38577e3355bf35a0696e0b0ac4;
   private static short[] shorts5eb6de38577e3355bf35a0696e0b0ac4;
   private static String[] strings5eb6de38577e3355bf35a0696e0b0ac4;
   private static byte[] bytes5eb6de38577e3355bf35a0696e0b0ac4;
   public static Object[] staticFields5eb6de38577e3355bf35a0696e0b0ac4;

   private static void byte_() {
      bytes5eb6de38577e3355bf35a0696e0b0ac4 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      booleans5eb6de38577e3355bf35a0696e0b0ac4 = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, -7, 67, -128, 92, 99, -3, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1238272185555721349L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -818287079;
   }

   private static void break_() {
      shorts5eb6de38577e3355bf35a0696e0b0ac4 = new short[]{3, 0, 1, 2};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new Gx_1(), new Gx_1(), new Gx_1(), null};
      var0[3] = new Gx_1[]{(Gx_1)var0[0], (Gx_1)var0[1], (Gx_1)var0[2]};
      staticFields5eb6de38577e3355bf35a0696e0b0ac4 = var0;
   }

   private static void protected_() {
      strings5eb6de38577e3355bf35a0696e0b0ac4 = new String[]{new String("YES"), new String("MAYBE"), new String("NO")};
   }
}
