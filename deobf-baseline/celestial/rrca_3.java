package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrca_3 {
   private static byte[] bytesb97ca5f62a0f31cea6ad2f4a102e3de3;
   private static boolean[] booleansb97ca5f62a0f31cea6ad2f4a102e3de3;
   public static Object[] staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3;
   private static String[] stringsb97ca5f62a0f31cea6ad2f4a102e3de3;
   private static short[] shortsb97ca5f62a0f31cea6ad2f4a102e3de3;

   static {
      ntfClinit();
   }

   private static void id_class() {
      booleansb97ca5f62a0f31cea6ad2f4a102e3de3 = new boolean[]{false, true, false, true, false, false, true, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 14, -98, -45, 77, 50, -117, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 603440600816223690L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -494768963;
   }

   private static void id_break() {
      bytesb97ca5f62a0f31cea6ad2f4a102e3de3 = new byte[]{3, 2, 3, 2, 2, 2, 3, 4};
   }

   private static rrca_3[] id_throws() {
      rrca_3[] var10000 = new rrca_3[bytesb97ca5f62a0f31cea6ad2f4a102e3de3[0]];
      var10000[booleansb97ca5f62a0f31cea6ad2f4a102e3de3[0]] = (rrca_3)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[1]];
      var10000[booleansb97ca5f62a0f31cea6ad2f4a102e3de3[1]] = (rrca_3)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[2]];
      var10000[bytesb97ca5f62a0f31cea6ad2f4a102e3de3[1]] = (rrca_3)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[3]];
      return var10000;
   }

   private static void id_catch() {
      stringsb97ca5f62a0f31cea6ad2f4a102e3de3 = new String[]{new String("VANILLA"), new String("BASIC_SIMULATION"), new String("BASIC_SIMULATION_3D")};
   }

   private static void id_case() {
      Object[] var0 = new Object[4];
      staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3 = var0;
      var0[0] = new rrca_3();
      var0[1] = new rrca_3();
      var0[2] = new rrca_3();
      var0[3] = id_byte();
   }

   private static void id_protected() {
      shortsb97ca5f62a0f31cea6ad2f4a102e3de3 = new short[]{3, 0, 1, 2, 0, 1, 2};
   }
}
