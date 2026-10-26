package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrtP_2 {
   private static boolean[] booleans2f7653125b2938db917a91704c972442;
   public static Object[] staticFields2f7653125b2938db917a91704c972442;
   private static byte[] bytes2f7653125b2938db917a91704c972442;
   private static String[] strings2f7653125b2938db917a91704c972442;
   private static short[] shorts2f7653125b2938db917a91704c972442;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrtP_2(), new rrtP_2(), null};
      var0[2] = new rrtP_2[]{(rrtP_2)var0[0], (rrtP_2)var0[1]};
      staticFields2f7653125b2938db917a91704c972442 = var0;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2082314931;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6048564516391188381L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, 26, 25, 88, -29, -87, -47, -62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      bytes2f7653125b2938db917a91704c972442 = new byte[]{2, 2, 3};
   }

   private static void id_throws() {
      strings2f7653125b2938db917a91704c972442 = new String[]{new String("CLIENT"), new String("SERVER")};
   }

   private static void id_case() {
      booleans2f7653125b2938db917a91704c972442 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      shorts2f7653125b2938db917a91704c972442 = new short[]{2, 0, 1};
   }
}
