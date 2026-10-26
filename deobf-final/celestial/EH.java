package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum EH {
   private static short[] shorts82dbb89706383b24a38b1bf56dadcae8;
   private static boolean[] booleans82dbb89706383b24a38b1bf56dadcae8;

   EH(int var3, int var4, int var5) {
   }

   static {
      ntfClinit();
   }

   @Override
   public double class_(EZ var1, int var2, int var3, int var4) {
      return Gr_1.class_(var1, var2, var3, var4, var2 - 1, var4);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6612079529000096382L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -425780460;
   }

   @Override
   public Ev_1 class_(EZ var1, rU_2 var2) {
      return new Gr_1(var1.break_(), var2, new rU_2((Integer)var2.break_[0] - 1, (Integer)var2.break_[1] + 1, (Integer)var2.break_[2]));
   }

   private static void class_() {
      booleans82dbb89706383b24a38b1bf56dadcae8 = new boolean[]{true, true, true};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -75, -71, -17, -50, 67, 121, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      shorts82dbb89706383b24a38b1bf56dadcae8 = new short[]{0, 1, 2};
   }
}
