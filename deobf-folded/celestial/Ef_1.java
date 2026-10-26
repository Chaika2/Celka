package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Ef_1 {
   private static boolean[] booleans3354f9d77e04380c822bc583237cbfb8;
   private static short[] shorts3354f9d77e04380c822bc583237cbfb8;

   Ef_1(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      booleans3354f9d77e04380c822bc583237cbfb8 = new boolean[]{true, true};
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.id_class(var1, (Integer)var2.id_break[shorts3354f9d77e04380c822bc583237cbfb8[0]], (Integer)var2.id_break[1], (Integer)var2.id_break[2], var3);
      return new GB(var1.id_break(), var2, rpr_3.SOUTH, rpr_3.WEST, (Integer)var3.id_class[1] - (Integer)var2.id_break[1]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38817057;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8016125296700215870L;
   }

   @Override
   public void id_class(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GB.id_class(var1, var2, var3, var4, var2 - 1, var4 + 1, var5);
   }

   private static void id_break() {
      shorts3354f9d77e04380c822bc583237cbfb8 = new short[]{0, 1, 2, 1, 1};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, -14, 10, 75, 51, -91, -44, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
