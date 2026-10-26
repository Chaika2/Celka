package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum QD {
   ;
   private static short[] shorts25f7c1a34dee3bdaa6c7082af054c49d;
   private static String[] strings25f7c1a34dee3bdaa6c7082af054c49d;
   public static Object[] staticFields25f7c1a34dee3bdaa6c7082af054c49d;
   private static boolean[] booleans25f7c1a34dee3bdaa6c7082af054c49d;
   private static byte[] bytes25f7c1a34dee3bdaa6c7082af054c49d;

   private static void byte_() {
      booleans25f7c1a34dee3bdaa6c7082af054c49d = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -240356948;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, -58, -116, 61, 52, 50, 39, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      strings25f7c1a34dee3bdaa6c7082af054c49d = new String[]{new String("NONE"), new String("CREATE"), new String("BACKUP")};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8527608325206142695L;
   }

   private static void break_() {
      shorts25f7c1a34dee3bdaa6c7082af054c49d = new short[]{3, 0, 1, 2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new QD(), new QD(), new QD(), null};
      var0[3] = new QD[]{(QD)var0[0], (QD)var0[1], (QD)var0[2]};
      staticFields25f7c1a34dee3bdaa6c7082af054c49d = var0;
   }

   private static void protected_() {
      bytes25f7c1a34dee3bdaa6c7082af054c49d = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
