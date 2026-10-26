package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum Ep_1 {
   private static boolean[] booleans9a37dad5349a3b0cbe97062398727f4e;
   private static short[] shorts9a37dad5349a3b0cbe97062398727f4e;

   Ep_1(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      shorts9a37dad5349a3b0cbe97062398727f4e = new short[]{0, 1, 2, 1, 1, 0, 1, 2, 0, 1, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 946733138281106718L;
   }

   @Override
   public void class_(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GP.class_(var1, var2, var3, var4, var2 - 1, var4, var5);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -64692853;
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.class_(var1, (Integer)var2.break_[0], (Integer)var2.break_[1], (Integer)var2.break_[2], var3);
      return (Ev_1)(var3.class_[1] == var2.break_[1] - 1
         ? new GP(var1.break_(), var2, new rU_2((Integer)var3.class_[0], (Integer)var3.class_[1], (Integer)var3.class_[2]))
         : new Gs_1(var1.break_(), var2, new rU_2((Integer)var3.class_[0], (Integer)var3.class_[1], (Integer)var3.class_[2])));
   }

   private static void break_() {
      booleans9a37dad5349a3b0cbe97062398727f4e = new boolean[]{true, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, 120, -52, -6, -85, 80, -71, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
