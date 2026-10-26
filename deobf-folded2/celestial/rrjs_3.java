package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjs_3 extends rrjx_3 {
   private static String[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_class;

   public rrjs_3(int var1) {
      super((String[])id_class[0], var1);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5885501936202316508L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 638129450;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -127, -49, 13, 37, 113, -87, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new short[1];
   }

   private static void id_catch() {
      id_throws = new byte[]{2};
   }

   private static void id_case() {
      id_byte = new String[]{new String("an"), new String("anarchy")};
   }

   private static void id_protected() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{"an", "anarchy"};
      var0[0] = var2;
      id_class = var0;
   }

   private static void id_private() {
      id_case = new boolean[]{false, true, false, true};
   }
}
