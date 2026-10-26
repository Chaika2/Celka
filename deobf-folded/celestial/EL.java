package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum EL {
   private static byte[] bytese3b1cfc58f9d3b6596ccfd637c5fdb13;
   public static Object[] staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13;
   private static boolean[] booleanse3b1cfc58f9d3b6596ccfd637c5fdb13;
   private static short[] shortse3b1cfc58f9d3b6596ccfd637c5fdb13;
   private static String[] stringse3b1cfc58f9d3b6596ccfd637c5fdb13;

   private static void id_byte() {
      stringse3b1cfc58f9d3b6596ccfd637c5fdb13 = new String[]{new String("READY_TO_PLACE"), new String("ATTEMPTING"), new String("NO_OPTION")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6254783495588322129L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 571293167;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, 61, -18, 44, -67, -30, -81, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      booleanse3b1cfc58f9d3b6596ccfd637c5fdb13 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_break() {
      bytese3b1cfc58f9d3b6596ccfd637c5fdb13 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void id_throws() {
      shortse3b1cfc58f9d3b6596ccfd637c5fdb13 = new short[]{3, 0, 1, 2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new EL(), new EL(), new EL(), null};
      var0[3] = new EL[]{(EL)var0[0], (EL)var0[1], (EL)var0[2]};
      staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13 = var0;
   }
}
