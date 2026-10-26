package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum EU {
   private static boolean[] booleansa09f7561b417386b8d4a4476df9929df;

   EU(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      booleansa09f7561b417386b8d4a4476df9929df = new boolean[]{true};
   }

   @Override
   public double class_(EZ var1, int var2, int var3, int var4) {
      return Gb_1.class_(var1, var2, var3, var4, var2 - 1, var4);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 369841310;
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      return new Gb_1(var1.break_(), var2, var2.native_());
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8307469420182433816L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, 1, 22, -94, -39, -98, -117, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
