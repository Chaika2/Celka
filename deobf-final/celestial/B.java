package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum B implements C_double<rhd_3> {
   ;
   private static String[] strings08d11b4a38f53d99ba3c071826b34fcc;
   private static short[] shorts08d11b4a38f53d99ba3c071826b34fcc;
   public static Object[] staticFields08d11b4a38f53d99ba3c071826b34fcc;
   private static boolean[] booleans08d11b4a38f53d99ba3c071826b34fcc;
   private static byte[] bytes08d11b4a38f53d99ba3c071826b34fcc;

   private static void byte_() {
      strings08d11b4a38f53d99ba3c071826b34fcc = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -61, 116, -7, 54, -127, -125, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      return new v_1().break_(protected_(var1).stream().map(rhd_3::g).map(rgP_2::getString)).class_(var1.class_().extends_()).break_().protected_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5103930358681918390L;
   }

   private static void class_() {
      booleans08d11b4a38f53d99ba3c071826b34fcc = new boolean[]{true, false, false, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1064782393;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new B(), null};
      var0[1] = new B[]{(B)var0[0]};
      staticFields08d11b4a38f53d99ba3c071826b34fcc = var0;
   }

   public rhd_3 break_(C_for var1) throws x_1 {
      String var2 = var1.class_().extends_();
      return protected_(var1).stream().filter(var1x -> var1x.g().getString().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private static void throws_() {
      bytes08d11b4a38f53d99ba3c071826b34fcc = new byte[]{2};
   }

   private static void case_() {
      shorts08d11b4a38f53d99ba3c071826b34fcc = new short[]{1, 0};
   }

   private static List<? extends rhd_3> protected_(C_for var0) {
      return var0.break_().throw_().case_().continue_();
   }
}
