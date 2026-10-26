package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryH {
   private static byte[] bytes11c0dbdf8fff34b19e0679f05309932f;
   public static Object[] staticFields11c0dbdf8fff34b19e0679f05309932f;
   private static String[] strings11c0dbdf8fff34b19e0679f05309932f;
   private static short[] shorts11c0dbdf8fff34b19e0679f05309932f;
   private static boolean[] booleans11c0dbdf8fff34b19e0679f05309932f;

   private static void id_byte() {
      booleans11c0dbdf8fff34b19e0679f05309932f = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 880399741;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-82, 52, 31, -24, -8, -83, -111, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new rryH(), new rryH(), new rryH(), null};
      var0[3] = new rryH[]{(rryH)var0[0], (rryH)var0[1], (rryH)var0[2]};
      staticFields11c0dbdf8fff34b19e0679f05309932f = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1663421140114428410L;
   }

   private static void id_break() {
      bytes11c0dbdf8fff34b19e0679f05309932f = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      strings11c0dbdf8fff34b19e0679f05309932f = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void id_case() {
      shorts11c0dbdf8fff34b19e0679f05309932f = new short[]{3, 0, 1, 2};
   }
}
