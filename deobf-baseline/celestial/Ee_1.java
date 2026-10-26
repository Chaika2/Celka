package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Ee_1 {
   private static boolean[] booleans7441ccf2084636e1a5659d2f20aec6ff;
   private static short[] shorts7441ccf2084636e1a5659d2f20aec6ff;

   Ee_1(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6715607405715782704L;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      return new Gr_1(
         var1.id_break(),
         var2,
         new rU_2(
            (Integer)var2.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[0]],
            (Integer)var2.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[1]] + booleans7441ccf2084636e1a5659d2f20aec6ff[0],
            (Integer)var2.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[2]] - booleans7441ccf2084636e1a5659d2f20aec6ff[1]
         )
      );
   }

   @Override
   public double id_class(EZ var1, int var2, int var3, int var4) {
      return Gr_1.id_class(var1, var2, var3, var4, var2, var4 - booleans7441ccf2084636e1a5659d2f20aec6ff[2]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 775504854;
   }

   private static void id_class() {
      shorts7441ccf2084636e1a5659d2f20aec6ff = new short[]{0, 1, 2};
   }

   private static void id_break() {
      booleans7441ccf2084636e1a5659d2f20aec6ff = new boolean[]{true, true, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 9, 98, 46, -36, 118, -42, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
