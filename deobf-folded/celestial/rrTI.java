package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTI {
   private static byte[] bytes26dd9f437bcd34c68d5b38988a1a3f7f;
   public static Object[] staticFields26dd9f437bcd34c68d5b38988a1a3f7f;
   private static short[] shorts26dd9f437bcd34c68d5b38988a1a3f7f;
   private static boolean[] booleans26dd9f437bcd34c68d5b38988a1a3f7f;
   private static String[] strings26dd9f437bcd34c68d5b38988a1a3f7f;

   private static void id_byte() {
      shorts26dd9f437bcd34c68d5b38988a1a3f7f = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -58, -23, 42, -38, -65, -20, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1017115787;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new rrTI(), new rrTI(), null};
      var0[2] = new rrTI[]{(rrTI)var0[0], (rrTI)var0[1]};
      staticFields26dd9f437bcd34c68d5b38988a1a3f7f = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4676322999143026940L;
   }

   private static void id_throws() {
      booleans26dd9f437bcd34c68d5b38988a1a3f7f = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      strings26dd9f437bcd34c68d5b38988a1a3f7f = new String[]{new String("DEFAULT"), new String("FORCE")};
   }

   private static void id_protected() {
      bytes26dd9f437bcd34c68d5b38988a1a3f7f = new byte[]{2, 2, 3};
   }
}
