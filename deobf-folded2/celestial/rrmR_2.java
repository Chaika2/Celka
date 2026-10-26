package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmR_2 implements rruq_1 {
   private static String[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_class = new String[]{new String(" ")};
   }

   rrmR_2() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 90, 113, -66, -2, 60, -29, 112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5042298508603401248L;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_break(var1.id_break(" "), true);
   }

   private static void id_class() {
      id_break = new boolean[]{true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1224925130;
   }

   private static void id_break() {
      id_byte = new short[1];
   }
}
