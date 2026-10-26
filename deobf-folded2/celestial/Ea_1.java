package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Ea_1 {
   private static boolean[] booleans7b45469866d13c3ebf28fa6b347c1eae;
   private static short[] shorts7b45469866d13c3ebf28fa6b347c1eae;

   Ea_1(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1190811959;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      return new Gr_1(var1.id_break(), var2, new rU_2((Integer)var2.id_break[0], (Integer)var2.id_break[1] + 1, (Integer)var2.id_break[2] + 1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4169230709286478200L;
   }

   private static void id_class() {
      shorts7b45469866d13c3ebf28fa6b347c1eae = new short[]{0, 1, 2};
   }

   @Override
   public double id_class(EZ var1, int var2, int var3, int var4) {
      return Gr_1.id_class(var1, var2, var3, var4, var2, var4 + 1);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, -51, 49, -94, 72, 2, -77, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleans7b45469866d13c3ebf28fa6b347c1eae = new boolean[]{true, true, true};
   }
}
