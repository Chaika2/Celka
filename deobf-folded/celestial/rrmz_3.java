package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmz_3 implements rruq_1 {
   private static short[] id_class;
   private static boolean[] id_break;

   rrmz_3() {
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new short[1];
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      String var2 = var1.id_extends();
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_class[0]]).id_class(ri_3.id_class(var2), var2, true);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5322903036832160501L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 484001369;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, 76, 100, 75, -93, 81, -42, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{true};
   }
}
