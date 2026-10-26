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

   private static void id_class() {
      booleans3c1b809b7322379d8c06e37e3e843031 = new boolean[]{true};
   }

   @Override
   public boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      return C_class.id_instanceof().PG.id_class[shorts3c1b809b7322379d8c06e37e3e843031[0]] ? var1.id_byte(var2.id_break()).id_break() instanceof zW_2 : true;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 681579647;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1809480625349044239L;
   }

   private static void id_break() {
      shorts3c1b809b7322379d8c06e37e3e843031 = new short[1];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 86, 17, 76, -106, 97, 82, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
