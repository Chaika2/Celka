package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNL {
   ;
   private static boolean[] booleans3858487aa6f43a4fb3e2f43fe4958927;
   private static byte[] bytes3858487aa6f43a4fb3e2f43fe4958927;
   public static Object[] staticFields3858487aa6f43a4fb3e2f43fe4958927;
   private static String[] strings3858487aa6f43a4fb3e2f43fe4958927;
   private static short[] shorts3858487aa6f43a4fb3e2f43fe4958927;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrNL(), new rrNL(), new rrNL(), null};
      var0[3] = new rrNL[]{(rrNL)var0[0], (rrNL)var0[1], (rrNL)var0[2]};
      staticFields3858487aa6f43a4fb3e2f43fe4958927 = var0;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      bytes3858487aa6f43a4fb3e2f43fe4958927 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6462043517115129206L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-54, -88, -97, 39, -69, -92, -58, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 948895429;
   }

   private static void break_() {
      shorts3858487aa6f43a4fb3e2f43fe4958927 = new short[]{3, 0, 1, 2};
   }

   private static void throws_() {
      strings3858487aa6f43a4fb3e2f43fe4958927 = new String[]{new String("WAITING"), new String("SUCCESSFULLY_PURCHASED"), new String("ALREADY_PURCHASED")};
   }

   private static void case_() {
      booleans3858487aa6f43a4fb3e2f43fe4958927 = new boolean[]{false, true, false, false, true, true};
   }
}
