package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum EI {
   private static short[] shortsf9676270e1423956913eb0ad474f0e83;
   private static boolean[] booleansf9676270e1423956913eb0ad474f0e83;

   EI(int var3, int var4, int var5, boolean var6, boolean var7) {
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      GB.class_(var1, var2, var3, var4, var2 + 1, var4 + 1, var5);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5028526694719007486L;
   }

   private static void class_() {
      booleansf9676270e1423956913eb0ad474f0e83 = new boolean[]{true, true};
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      Mr_1 var3 = new Mr_1();
      this.class_(var1, (Integer)var2.break_[0], (Integer)var2.break_[1], (Integer)var2.break_[2], var3);
      return new GB(var1.break_(), var2, rpr_3.SOUTH, rpr_3.EAST, (Integer)var3.class_[1] - (Integer)var2.break_[1]);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 280333703;
   }

   private static void break_() {
      shortsf9676270e1423956913eb0ad474f0e83 = new short[]{0, 1, 2, 1, 1};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, 102, 85, 52, 79, -93, 26, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
