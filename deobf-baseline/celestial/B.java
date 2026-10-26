package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum B implements C_double<rhd_3> {
   private static String[] strings08d11b4a38f53d99ba3c071826b34fcc;
   private static short[] shorts08d11b4a38f53d99ba3c071826b34fcc;
   public static Object[] staticFields08d11b4a38f53d99ba3c071826b34fcc;
   private static boolean[] booleans08d11b4a38f53d99ba3c071826b34fcc;
   private static byte[] bytes08d11b4a38f53d99ba3c071826b34fcc;

   private static void id_byte() {
      strings08d11b4a38f53d99ba3c071826b34fcc = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -61, 116, -7, 54, -127, -125, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      return new v_1()
         .id_break(id_protected(var1).stream().map(rhd_3::g).map(rgP_2::getString))
         .id_class(var1.id_class().id_extends())
         .id_break()
         .id_protected();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5103930358681918390L;
   }

   private static void id_class() {
      booleans08d11b4a38f53d99ba3c071826b34fcc = new boolean[]{true, false, false, false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1064782393;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new B(), null};
      var0[1] = new B[]{(B)var0[0]};
      staticFields08d11b4a38f53d99ba3c071826b34fcc = var0;
   }

   public rhd_3 id_break(C_for var1) throws x_1 {
      String var2 = var1.id_class().id_extends();
      return id_protected(var1).stream().filter(var1x -> var1x.g().getString().equalsIgnoreCase(var2)).findFirst().orElse(null);
   }

   private static void id_throws() {
      bytes08d11b4a38f53d99ba3c071826b34fcc = new byte[]{2};
   }

   private static void id_case() {
      shorts08d11b4a38f53d99ba3c071826b34fcc = new short[]{1, 0};
   }

   private static List<? extends rhd_3> id_protected(C_for var0) {
      return var0.id_break().id_throw().id_case().id_continue();
   }
}
