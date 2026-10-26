package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum ED {
   private static boolean[] booleansc670709b195231fba943ce97a7da6469;

   ED(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1054023728;
   }

   @Override
   public double id_class(EZ var1, int var2, int var3, int var4) {
      return Gb_1.id_class(var1, var2, var3, var4, var2 + 1, var4);
   }

   private static void id_class() {
      booleansc670709b195231fba943ce97a7da6469 = new boolean[]{true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 306285494713484727L;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      return new Gb_1(var1.id_break(), var2, var2.id_throws());
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, -88, 23, -71, -12, 93, 2, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
