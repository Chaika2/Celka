package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrFD {
   ;
   private static byte[] bytes1658baa549203f63991cdcef51acf497;
   private static short[] shorts1658baa549203f63991cdcef51acf497;
   public static Object[] staticFields1658baa549203f63991cdcef51acf497;
   private static String[] strings1658baa549203f63991cdcef51acf497;
   private static boolean[] booleans1658baa549203f63991cdcef51acf497;

   private static void byte_() {
      shorts1658baa549203f63991cdcef51acf497 = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      booleans1658baa549203f63991cdcef51acf497 = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 124, 120, 113, 104, 55, 23, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -532532408;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 310731735963177956L;
   }

   private static void break_() {
      bytes1658baa549203f63991cdcef51acf497 = new byte[]{2, 2, 3};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrFD(), new rrFD(), null};
      var0[2] = new rrFD[]{(rrFD)var0[0], (rrFD)var0[1]};
      staticFields1658baa549203f63991cdcef51acf497 = var0;
   }

   private static void protected_() {
      strings1658baa549203f63991cdcef51acf497 = new String[]{new String("CONNECTING"), new String("DISCONNECTING")};
   }
}
