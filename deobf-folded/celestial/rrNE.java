package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNE {
   private static boolean[] booleansf494c4277fc533979058c6d61fda001b;
   private static short[] shortsf494c4277fc533979058c6d61fda001b;
   private static String[] stringsf494c4277fc533979058c6d61fda001b;
   public static Object[] staticFieldsf494c4277fc533979058c6d61fda001b;
   private static byte[] bytesf494c4277fc533979058c6d61fda001b;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrNE(), new rrNE(), null};
      var0[2] = new rrNE[]{(rrNE)var0[0], (rrNE)var0[1]};
      staticFieldsf494c4277fc533979058c6d61fda001b = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -13, -25, 68, 48, 47, 113, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 557489315061470827L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 405330972;
   }

   private static void id_class() {
      booleansf494c4277fc533979058c6d61fda001b = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_break() {
      bytesf494c4277fc533979058c6d61fda001b = new byte[]{2, 2, 3};
   }

   private static void id_case() {
      shortsf494c4277fc533979058c6d61fda001b = new short[]{2, 0, 1};
   }

   private static void id_protected() {
      stringsf494c4277fc533979058c6d61fda001b = new String[]{new String("FORWARD"), new String("BACKWARD")};
   }
}
