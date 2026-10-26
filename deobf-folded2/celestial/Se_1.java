package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Se_1 {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      Object[] var0 = new Object[1];
      C_abstract[] var2 = new C_abstract[]{new sP_2(), new sB_2(), new sr_3(), new Si_1(), new Sa_1()};
      var0[0] = Arrays.asList(var2);
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -2, -85, 110, 100, 83, -68, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506626920;
   }

   private static void id_class() {
      id_byte = new byte[]{5, 2, 3, 4};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8111605554744570262L;
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, true, false, false, false, false, false, true};
   }
}
