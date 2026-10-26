package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum GR {
   private static boolean[] booleanse9b3c193080c31c68abf3eb579fb5f49;
   private static short[] shortse9b3c193080c31c68abf3eb579fb5f49;

   GR(xd_3 var3, Predicate var4) {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1758872915187584620L;
   }

   @Override
   public boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      return C_class.instanceof_().PG.class_[0] ? var1.byte_(var2.break_()).break_() instanceof xL_2 : booleanse9b3c193080c31c68abf3eb579fb5f49[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1227117403;
   }

   private static void class_() {
      shortse9b3c193080c31c68abf3eb579fb5f49 = new short[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{116, -82, 28, -66, -109, -63, -45, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleanse9b3c193080c31c68abf3eb579fb5f49 = new boolean[]{true};
   }
}
