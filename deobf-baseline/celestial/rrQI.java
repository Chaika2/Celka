package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQI {
   private static String[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new String[]{new String("This is a utility class and cannot be instantiated"), new String("celestial/images/account/widgets.png")};
   }

   private rrQI() {
      throw new UnsupportedOperationException(id_break[0]);
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{14, -5, 101, -115, 24, -67, 24, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8511318686669828203L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1603885810;
   }

   private static void id_class() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rqO_2(id_break[1])};
      id_class = var0;
   }
}
