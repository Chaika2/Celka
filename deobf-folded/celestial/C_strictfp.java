package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_strictfp implements C_double<rpr_3> {
   private static byte[] bytes1f0c66f23770348389d783dc475286cf;
   public static Object[] staticFields1f0c66f23770348389d783dc475286cf;
   private static boolean[] booleans1f0c66f23770348389d783dc475286cf;
   private static short[] shorts1f0c66f23770348389d783dc475286cf;
   private static String[] strings1f0c66f23770348389d783dc475286cf;

   private static void id_byte() {
      strings1f0c66f23770348389d783dc475286cf = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8000147447658153574L;
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      return new v_1()
         .id_break(Stream.of(rpr_3.values()).map(rpr_3::id_volatile).map(String::toLowerCase))
         .id_class(var1.id_class().id_extends())
         .id_protected();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 574122554;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new C_strictfp(), null};
      var0[1] = new C_strictfp[]{(C_strictfp)var0[0]};
      staticFields1f0c66f23770348389d783dc475286cf = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -97, 42, -93, -46, 40, -42, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rpr_3 id_break(C_for var1) throws x_1 {
      return rpr_3.valueOf(var1.id_class().id_extends().toUpperCase(Locale.US));
   }

   private static void id_throws() {
      booleans1f0c66f23770348389d783dc475286cf = new boolean[]{true, false, false, false, true};
   }

   private static void id_case() {
      bytes1f0c66f23770348389d783dc475286cf = new byte[]{2};
   }

   private static void id_protected() {
      shorts1f0c66f23770348389d783dc475286cf = new short[]{1, 0};
   }
}
