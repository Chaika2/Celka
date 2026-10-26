package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCJ implements rrCh_1 {
   private static boolean[] class_;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3669608562441584801L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -880804639;
   }

   @Override
   public rdb_3 class_() {
      return rdy_3.kN;
   }

   @Override
   public boolean class_(AutoSwap var1) {
      return var1.try_() ? true : class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-98, -47, 127, -121, 3, -80, -95, 49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Predicate<rdn_3> break_(AutoSwap var1) {
      return var1x -> var1x.break_() == this.class_() ? true : class_[3];
   }

   private static void break_() {
      class_ = new boolean[]{true, false, true, false};
   }
}
