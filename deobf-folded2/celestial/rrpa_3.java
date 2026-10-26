package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpa_3 {
   private static String[] strings056fc31e671730e3aeb58e324ad8a234;
   private static boolean[] booleans056fc31e671730e3aeb58e324ad8a234;
   private static byte[] bytes056fc31e671730e3aeb58e324ad8a234;
   public static Object[] staticFields056fc31e671730e3aeb58e324ad8a234;
   private static short[] shorts056fc31e671730e3aeb58e324ad8a234;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrpa_3(), new rrpa_3(), new rrpa_3(), null};
      var0[3] = new rrpa_3[]{(rrpa_3)var0[0], (rrpa_3)var0[1], (rrpa_3)var0[2]};
      staticFields056fc31e671730e3aeb58e324ad8a234 = var0;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3008452396654127280L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1905171461;
   }

   private static void id_class() {
      strings056fc31e671730e3aeb58e324ad8a234 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{118, -44, 7, 117, -57, -43, 72, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shorts056fc31e671730e3aeb58e324ad8a234 = new short[]{3, 0, 1, 2};
   }

   private static void id_throws() {
      bytes056fc31e671730e3aeb58e324ad8a234 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_protected() {
      booleans056fc31e671730e3aeb58e324ad8a234 = new boolean[]{false, true, false, false, true, true};
   }
}
