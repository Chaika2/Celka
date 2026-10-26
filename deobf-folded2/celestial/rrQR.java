package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQR {
   private static short[] shorts390584fa19b23798828925cb0991ad90;
   private static boolean[] booleans390584fa19b23798828925cb0991ad90;
   private static byte[] bytes390584fa19b23798828925cb0991ad90;
   public static Object[] staticFields390584fa19b23798828925cb0991ad90;
   private static String[] strings390584fa19b23798828925cb0991ad90;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrQR(), new rrQR(), new rrQR(), new rrQR(), null};
      var0[4] = new rrQR[]{(rrQR)var0[0], (rrQR)var0[1], (rrQR)var0[2], (rrQR)var0[3]};
      staticFields390584fa19b23798828925cb0991ad90 = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, 42, -42, 109, 100, -105, -99, 5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      booleans390584fa19b23798828925cb0991ad90 = new boolean[]{false, true, false, false, true, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5173376864132656377L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 345357603;
   }

   private static void id_throws() {
      bytes390584fa19b23798828925cb0991ad90 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void id_case() {
      strings390584fa19b23798828925cb0991ad90 = new String[]{new String("VALID"), new String("INVALID"), new String("OFFLINE"), new String("UNKNOWN")};
   }

   private static void id_protected() {
      shorts390584fa19b23798828925cb0991ad90 = new short[]{4, 0, 1, 2, 3};
   }
}
