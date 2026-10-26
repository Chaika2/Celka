package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCX implements rrCh_1 {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1678643005;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -7, 63, -63, -102, 90, 78, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_class(AutoSwap var1) {
      return var1.id_try() ? true : id_class[1];
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.du;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7219940493330674692L;
   }

   @Override
   public Predicate<rdn_3> id_break(AutoSwap var1) {
      return var0 -> var0.id_break() == rdy_3.du ? true : id_class[3];
   }

   private static void id_break() {
      id_class = new boolean[]{true, false, true, false};
   }
}
