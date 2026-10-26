package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpd_3 {
   private static String[] stringsf0e458d392b335c78064d20a36d4b573;
   private static boolean[] booleansf0e458d392b335c78064d20a36d4b573;
   private static byte[] bytesf0e458d392b335c78064d20a36d4b573;
   private static short[] shortsf0e458d392b335c78064d20a36d4b573;
   public static Object[] staticFieldsf0e458d392b335c78064d20a36d4b573;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -449319745;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5264700272917283264L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new rrpd_3(), new rrpd_3(), new rrpd_3(), null};
      var0[3] = new rrpd_3[]{(rrpd_3)var0[0], (rrpd_3)var0[1], (rrpd_3)var0[2]};
      staticFieldsf0e458d392b335c78064d20a36d4b573 = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, 113, -67, 97, -64, -8, -50, 100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytesf0e458d392b335c78064d20a36d4b573 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      booleansf0e458d392b335c78064d20a36d4b573 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      shortsf0e458d392b335c78064d20a36d4b573 = new short[]{3, 0, 1, 2};
   }

   private static void id_protected() {
      stringsf0e458d392b335c78064d20a36d4b573 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }
}
