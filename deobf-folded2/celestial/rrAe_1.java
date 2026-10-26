package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAe_1 extends Om_1 {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -980017614;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, 111, 104, -60, 80, -10, -92, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5692083173991842482L;
   }

   public static rrAe_1 id_class() {
      ((rrAe_1)id_class[0]).id_class(false);
      return (rrAe_1)id_class[0];
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAe_1()};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new short[2];
   }
}
