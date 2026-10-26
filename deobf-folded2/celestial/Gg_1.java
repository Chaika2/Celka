package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Gg_1 {
   private static boolean[] booleansb884524ca0633de0836cca46c5ab830f;
   private static short[] shortsb884524ca0633de0836cca46c5ab830f;

   Gg_1(xd_3 var3, Predicate var4) {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 935918802;
   }

   @Override
   public boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      return C_class.id_instanceof().PG.id_class[0] ? var1.id_byte(var2.id_break()).id_break() instanceof xP_2 : booleansb884524ca0633de0836cca46c5ab830f[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2031943490228034368L;
   }

   private static void id_class() {
      shortsb884524ca0633de0836cca46c5ab830f = new short[1];
   }

   private static void id_break() {
      booleansb884524ca0633de0836cca46c5ab830f = new boolean[]{true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 113, -92, -84, 96, -59, -6, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
