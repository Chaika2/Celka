package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwZ_2 {
   private static short[] id_break;
   public static Object[] id_class;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_byte = new String[]{new String("none")};
   }

   static {
      ntfClinit();
   }

   public static String id_class() {
      return ((rrwu_3)id_class[2]).id_break.isEmpty() ? "none" : ((rrwu_3)id_class[2]).id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1987366267;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5782089762875566907L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, -6, 81, -43, 10, 2, -15, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{false, new rrwu_3(), new rrwu_3(), null};
      id_class = var0;
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, false, true, false, false};
   }

   private static void id_case() {
      id_protected = new byte[]{2, 4};
   }

   private static void id_protected() {
      id_break = new short[]{2, 2};
   }
}
