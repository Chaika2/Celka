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
   public double id_class(EZ var1, int var2, int var3, int var4) {
      return Gr_1.id_class(var1, var2, var3, var4, var2 - booleans82dbb89706383b24a38b1bf56dadcae8[2], var4);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6612079529000096382L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -425780460;
   }

   @Override
   public Ev_1 id_class(EZ var1, rU_2 var2) {
      return new Gr_1(
         var1.id_break(),
         var2,
         new rU_2(
            (Integer)var2.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[0]] - booleans82dbb89706383b24a38b1bf56dadcae8[0],
            (Integer)var2.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[1]] + booleans82dbb89706383b24a38b1bf56dadcae8[1],
            (Integer)var2.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[2]]
         )
      );
   }

   private static void id_class() {
      booleans82dbb89706383b24a38b1bf56dadcae8 = new boolean[]{true, true, true};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -75, -71, -17, -50, 67, 121, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shorts82dbb89706383b24a38b1bf56dadcae8 = new short[]{0, 1, 2};
   }
}
