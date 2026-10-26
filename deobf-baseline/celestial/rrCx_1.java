package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCx_1 implements rrCh_1 {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 105, 79, 121, 75, 90, 84, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8860461993623623668L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -701033904;
   }

   @Override
   public boolean id_class(AutoSwap var1) {
      return var1.id_try() ? id_class[0] : id_class[1];
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.dJ;
   }

   private static void id_break() {
      id_class = new boolean[]{true, false};
   }

   @Override
   public Predicate<rdn_3> id_break(AutoSwap var1) {
      return var0 -> rrjS_2.id_break(var0);
   }
}
