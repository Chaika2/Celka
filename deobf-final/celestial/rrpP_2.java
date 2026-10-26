package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpP_2 {
   ;
   private static String[] stringsc884105b69f333058e091d3dfd5ffa8a;
   public static Object[] staticFieldsc884105b69f333058e091d3dfd5ffa8a;
   private static short[] shortsc884105b69f333058e091d3dfd5ffa8a;
   private static boolean[] booleansc884105b69f333058e091d3dfd5ffa8a;
   private static byte[] bytesc884105b69f333058e091d3dfd5ffa8a;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrpP_2(), new rrpP_2(), new rrpP_2(), null};
      var0[3] = new rrpP_2[]{(rrpP_2)var0[0], (rrpP_2)var0[1], (rrpP_2)var0[2]};
      staticFieldsc884105b69f333058e091d3dfd5ffa8a = var0;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6405004886430334626L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1941781531;
   }

   private static void class_() {
      shortsc884105b69f333058e091d3dfd5ffa8a = new short[]{3, 0, 1, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -23, -15, 123, -126, -116, -119, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      stringsc884105b69f333058e091d3dfd5ffa8a = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void case_() {
      booleansc884105b69f333058e091d3dfd5ffa8a = new boolean[]{false, true, false, false, true, true};
   }

   private static void protected_() {
      bytesc884105b69f333058e091d3dfd5ffa8a = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
