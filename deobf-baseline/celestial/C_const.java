package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_const implements C_double<re_3> {
   private static boolean[] booleansa08d321dfe9f33979ad5f9dfda99c615;
   private static short[] shortsa08d321dfe9f33979ad5f9dfda99c615;
   private static byte[] bytesa08d321dfe9f33979ad5f9dfda99c615;
   public static Object[] staticFieldsa08d321dfe9f33979ad5f9dfda99c615;
   private static String[] stringsa08d321dfe9f33979ad5f9dfda99c615;

   private static void id_byte() {
      bytesa08d321dfe9f33979ad5f9dfda99c615 = new byte[]{2};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6241093722864005533L;
   }

   @Override
   public Stream<String> id_class(C_for var1) {
      return var1.id_class().id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[shortsa08d321dfe9f33979ad5f9dfda99c615[1]]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 584298466;
   }

   private static void id_class() {
      shortsa08d321dfe9f33979ad5f9dfda99c615 = new short[]{1, 0, 0};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{62, -54, -38, -61, 68, 41, 53, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public re_3 id_break(C_for var1) throws x_1 {
      return new re_3(var1.id_class().id_extends());
   }

   private static void id_break() {
      booleansa08d321dfe9f33979ad5f9dfda99c615 = new boolean[]{true, false, false, false, true};
   }

   private static void id_throws() {
      stringsa08d321dfe9f33979ad5f9dfda99c615 = new String[]{new String("INSTANCE")};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new C_const(), null};
      var0[1] = new C_const[]{(C_const)var0[0]};
      staticFieldsa08d321dfe9f33979ad5f9dfda99c615 = var0;
   }
}
