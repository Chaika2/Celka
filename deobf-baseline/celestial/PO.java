package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum PO {
   private static byte[] bytes76a2616475a7392d96bc61fb714cace1;
   public static Object[] staticFields76a2616475a7392d96bc61fb714cace1;
   private static String[] strings76a2616475a7392d96bc61fb714cace1;
   private static boolean[] booleans76a2616475a7392d96bc61fb714cace1;
   private static short[] shorts76a2616475a7392d96bc61fb714cace1;

   private static void id_byte() {
      booleans76a2616475a7392d96bc61fb714cace1 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 818472478;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -50, 55, 43, 45, 33, 91, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      shorts76a2616475a7392d96bc61fb714cace1 = new short[]{5, 0, 1, 2, 3, 4};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4365061730912836325L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new PO(), new PO(), new PO(), new PO(), new PO(), null};
      var0[5] = new PO[]{(PO)var0[0], (PO)var0[1], (PO)var0[2], (PO)var0[3], (PO)var0[4]};
      staticFields76a2616475a7392d96bc61fb714cace1 = var0;
   }

   private static void id_throws() {
      bytes76a2616475a7392d96bc61fb714cace1 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
   }

   private static void id_protected() {
      strings76a2616475a7392d96bc61fb714cace1 = new String[]{
         new String("SUCCESS_TO_GOAL"), new String("SUCCESS_SEGMENT"), new String("FAILURE"), new String("CANCELLATION"), new String("EXCEPTION")
      };
   }
}
