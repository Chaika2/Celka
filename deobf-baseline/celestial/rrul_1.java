package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrul_1 {
   public static Object[] staticFields9897caebb88b3588975198b6a548d1f7;
   private static boolean[] booleans9897caebb88b3588975198b6a548d1f7;
   private static short[] shorts9897caebb88b3588975198b6a548d1f7;
   private static String[] strings9897caebb88b3588975198b6a548d1f7;
   private static byte[] bytes9897caebb88b3588975198b6a548d1f7;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrul_1(), new rrul_1(), null};
      var0[2] = new rrul_1[]{(rrul_1)var0[0], (rrul_1)var0[1]};
      staticFields9897caebb88b3588975198b6a548d1f7 = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-100, 58, -39, -11, -43, -40, -56, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5359458675111175182L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1682153510;
   }

   private static void id_class() {
      strings9897caebb88b3588975198b6a548d1f7 = new String[]{new String("TO_DARKER"), new String("TO_BRIGHTER")};
   }

   private static void id_break() {
      booleans9897caebb88b3588975198b6a548d1f7 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      shorts9897caebb88b3588975198b6a548d1f7 = new short[]{2, 0, 1};
   }

   private static void id_protected() {
      bytes9897caebb88b3588975198b6a548d1f7 = new byte[]{2, 2, 3};
   }
}
