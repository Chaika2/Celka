package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum EK {
   private static boolean[] booleanse9b89556140633d1961d70e473c4e93e;

   EK(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5446860324417628425L;
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      return new Gb_1(var1.break_(), var2, var2.volatile_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -727544062;
   }

   @Override
   public double class_(EZ var1, int var2, int var3, int var4) {
      return Gb_1.class_(var1, var2, var3, var4, var2, var4 + 1);
   }

   private static void class_() {
      booleanse9b89556140633d1961d70e473c4e93e = new boolean[]{true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -85, 82, 39, -81, -110, 14, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
