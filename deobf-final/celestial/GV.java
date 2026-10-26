package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum GV {
   private static short[] shorts3c1b809b7322379d8c06e37e3e843031;
   private static boolean[] booleans3c1b809b7322379d8c06e37e3e843031;

   GV(xd_3 var3, Predicate var4) {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      booleans3c1b809b7322379d8c06e37e3e843031 = new boolean[]{true};
   }

   @Override
   public boolean class_(rYB var1, rfH_2 var2, xc_3 var3) {
      return C_class.instanceof_().PG.class_[0] ? var1.byte_(var2.break_()).break_() instanceof zW_2 : booleans3c1b809b7322379d8c06e37e3e843031[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 681579647;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1809480625349044239L;
   }

   private static void break_() {
      shorts3c1b809b7322379d8c06e37e3e843031 = new short[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 86, 17, 76, -106, 97, 82, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
