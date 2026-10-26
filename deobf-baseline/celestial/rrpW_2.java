package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpW_2 {
   private static boolean[] booleans1ac742ac88213c01994e700cd2890005;
   public static Object[] staticFields1ac742ac88213c01994e700cd2890005;
   private static String[] strings1ac742ac88213c01994e700cd2890005;
   private static short[] shorts1ac742ac88213c01994e700cd2890005;
   private static byte[] bytes1ac742ac88213c01994e700cd2890005;

   private static void id_byte() {
      booleans1ac742ac88213c01994e700cd2890005 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 865455332148745645L;
   }

   private static void id_class() {
      strings1ac742ac88213c01994e700cd2890005 = new String[]{
         new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 316618795;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 43, 93, -93, 70, 76, 124, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytes1ac742ac88213c01994e700cd2890005 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void id_throws() {
      shorts1ac742ac88213c01994e700cd2890005 = new short[]{4, 0, 1, 2, 3};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrpW_2(), new rrpW_2(), new rrpW_2(), new rrpW_2(), null};
      var0[4] = new rrpW_2[]{(rrpW_2)var0[0], (rrpW_2)var0[1], (rrpW_2)var0[2], (rrpW_2)var0[3]};
      staticFields1ac742ac88213c01994e700cd2890005 = var0;
   }
}
