package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Eq_1 {
   private static boolean[] booleans2542617fbc4030e69ab9da0e5b26aa6e;
   private static short[] shorts2542617fbc4030e69ab9da0e5b26aa6e;

   Eq_1(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GP.class_(var1, var2, var3, var4, var2, var4 - 1, var5);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3325462221217759565L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1160129269;
   }

   private static void class_() {
      shorts2542617fbc4030e69ab9da0e5b26aa6e = new short[]{0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 2};
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.class_(var1, (Integer)var2.break_[0], (Integer)var2.break_[1], (Integer)var2.break_[2], var3);
      return (Ev_1)(var3.class_[1] == var2.break_[1] - 1
         ? new GP(var1.break_(), var2, new rU_2((Integer)var3.class_[0], (Integer)var3.class_[1], (Integer)var3.class_[2]))
         : new Gs_1(var1.break_(), var2, new rU_2((Integer)var3.class_[0], (Integer)var3.class_[1], (Integer)var3.class_[2])));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{1, -52, -49, -30, 33, -96, 58, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleans2542617fbc4030e69ab9da0e5b26aa6e = new boolean[]{true, true};
   }
}
