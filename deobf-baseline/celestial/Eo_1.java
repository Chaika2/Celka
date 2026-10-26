package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Eo_1 {
   private static boolean[] booleansd5fcc4e4daf23938a1a7f7ae2f130774;

   Eo_1(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   @Override
   public double id_class(EZ var1, int var2, int var3, int var4) {
      return Gb_1.id_class(var1, var2, var3, var4, var2, var4 - booleansd5fcc4e4daf23938a1a7f7ae2f130774[0]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2110463524673875089L;
   }

   private static void id_class() {
      booleansd5fcc4e4daf23938a1a7f7ae2f130774 = new boolean[]{true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -646208875;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      return new Gb_1(var1.id_break(), var2, var2.id_finally());
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{93, 10, 55, -124, 123, 106, -91, -28}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
