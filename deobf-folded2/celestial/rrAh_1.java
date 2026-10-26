package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAh_1 extends Om_1 {
   public static Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 239140996;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{124, 123, -18, 44, -118, 5, 55, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2895470977129552283L;
   }

   public static rrAh_1 id_class() {
      ((rrAh_1)id_class[0]).id_class(false);
      return (rrAh_1)id_class[0];
   }

   private static void id_break() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrAh_1()};
      id_class = var0;
   }

   private static void id_protected() {
      id_break = new short[2];
   }
}
