package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrAd_1 {
   ;
   private static boolean[] booleanseafc2f5d275533c69a39185d3a872ac0;
   private static short[] shortseafc2f5d275533c69a39185d3a872ac0;
   private static byte[] byteseafc2f5d275533c69a39185d3a872ac0;
   public static Object[] staticFieldseafc2f5d275533c69a39185d3a872ac0;
   private static String[] stringseafc2f5d275533c69a39185d3a872ac0;

   private static void byte_() {
      stringseafc2f5d275533c69a39185d3a872ac0 = new String[]{new String("LIQUID"), new String("ENTITY"), new String("BLOCKS"), new String("BUBBLE_COLUMN")};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 124, 106, 13, -77, -90, -6, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8992587340632831109L;
   }

   private static void class_() {
      shortseafc2f5d275533c69a39185d3a872ac0 = new short[]{4, 0, 1, 2, 3};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1129365299;
   }

   private static void break_() {
      booleanseafc2f5d275533c69a39185d3a872ac0 = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrAd_1(), new rrAd_1(), new rrAd_1(), new rrAd_1(), null};
      var0[4] = new rrAd_1[]{(rrAd_1)var0[0], (rrAd_1)var0[1], (rrAd_1)var0[2], (rrAd_1)var0[3]};
      staticFieldseafc2f5d275533c69a39185d3a872ac0 = var0;
   }

   private static void case_() {
      byteseafc2f5d275533c69a39185d3a872ac0 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }
}
