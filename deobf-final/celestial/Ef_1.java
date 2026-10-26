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

   private static void class_() {
      booleans3354f9d77e04380c822bc583237cbfb8 = new boolean[]{true, true};
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.class_(var1, (Integer)var2.break_[0], (Integer)var2.break_[1], (Integer)var2.break_[2], var3);
      return new GB(var1.break_(), var2, rpr_3.SOUTH, rpr_3.WEST, (Integer)var3.class_[1] - (Integer)var2.break_[1]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -38817057;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8016125296700215870L;
   }

   @Override
   public void class_(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GB.class_(var1, var2, var3, var4, var2 - 1, var4 + 1, var5);
   }

   private static void break_() {
      shorts3354f9d77e04380c822bc583237cbfb8 = new short[]{0, 1, 2, 1, 1};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, -14, 10, 75, 51, -91, -44, -102}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
