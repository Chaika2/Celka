package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrye_1 {
   ;
   private static boolean[] booleans28f193d459cc3553a812ffe718ee6216;
   private static byte[] bytes28f193d459cc3553a812ffe718ee6216;
   private static String[] strings28f193d459cc3553a812ffe718ee6216;
   private static short[] shorts28f193d459cc3553a812ffe718ee6216;
   public static Object[] staticFields28f193d459cc3553a812ffe718ee6216;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrye_1(), new rrye_1(), new rrye_1(), new rrye_1(), null};
      var0[4] = new rrye_1[]{(rrye_1)var0[0], (rrye_1)var0[1], (rrye_1)var0[2], (rrye_1)var0[3]};
      staticFields28f193d459cc3553a812ffe718ee6216 = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -973064445;
   }

   private static void class_() {
      strings28f193d459cc3553a812ffe718ee6216 = new String[]{
         new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_BAD_EFFECTS")
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8030247157185750059L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, -56, -24, -70, -125, -56, -25, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      booleans28f193d459cc3553a812ffe718ee6216 = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      bytes28f193d459cc3553a812ffe718ee6216 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void protected_() {
      shorts28f193d459cc3553a812ffe718ee6216 = new short[]{4, 0, 1, 2, 3};
   }
}
