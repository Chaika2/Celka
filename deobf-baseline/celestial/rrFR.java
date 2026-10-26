package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFR extends Om_1 {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static short[] id_byte;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 58, 85, -79, 36, 121, -76, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1625025688;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6678178352284776814L;
   }

   public static rrFR id_class() {
      ((rrFR)id_class[id_byte[0]]).id_class(id_break[0]);
      return (rrFR)id_class[id_byte[1]];
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrFR()};
      id_class = var0;
   }

   private static void id_throws() {
      id_break = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      id_byte = new short[2];
   }
}
