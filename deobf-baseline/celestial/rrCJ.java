package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCJ implements rrCh_1 {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3669608562441584801L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -880804639;
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.kN;
   }

   @Override
   public boolean id_class(AutoSwap var1) {
      return var1.id_try() ? id_class[0] : id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, -47, 127, -121, 3, -80, -95, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Predicate<rdn_3> id_break(AutoSwap var1) {
      return var1x -> var1x.id_break() == this.id_class() ? id_class[2] : id_class[3];
   }

   private static void id_break() {
      id_class = new boolean[]{true, false, true, false};
   }
}
