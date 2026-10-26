package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryc_1 {
   ;
   private static short[] shorts7b9d953229a23ea8afc65e6592cc33c5;
   private static byte[] bytes7b9d953229a23ea8afc65e6592cc33c5;
   private static String[] strings7b9d953229a23ea8afc65e6592cc33c5;
   public static Object[] staticFields7b9d953229a23ea8afc65e6592cc33c5;
   private static boolean[] booleans7b9d953229a23ea8afc65e6592cc33c5;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -497532735;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rryc_1(), new rryc_1(), null};
      var0[2] = new rryc_1[]{(rryc_1)var0[0], (rryc_1)var0[1]};
      staticFields7b9d953229a23ea8afc65e6592cc33c5 = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-18, -61, -13, -30, -102, 114, -122, 106}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4480576042061579356L;
   }

   private static void break_() {
      bytes7b9d953229a23ea8afc65e6592cc33c5 = new byte[]{2, 2, 3};
   }

   private static void throws_() {
      shorts7b9d953229a23ea8afc65e6592cc33c5 = new short[]{2, 0, 1};
   }

   private static void case_() {
      booleans7b9d953229a23ea8afc65e6592cc33c5 = new boolean[]{false, true, false, false, true, true};
   }

   private static void protected_() {
      strings7b9d953229a23ea8afc65e6592cc33c5 = new String[]{new String("SELECT_TEAMMATES"), new String("START_SEARCH")};
   }
}
