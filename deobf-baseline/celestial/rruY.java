package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruY implements C_double<xd_3> {
   private static short[] shortsa8884e3b339234dd911c10ea97845ed5;
   private static byte[] bytesa8884e3b339234dd911c10ea97845ed5;
   private static String[] stringsa8884e3b339234dd911c10ea97845ed5;
   private static boolean[] booleansa8884e3b339234dd911c10ea97845ed5;
   public static Object[] staticFieldsa8884e3b339234dd911c10ea97845ed5;

   private static void id_byte() {
      bytesa8884e3b339234dd911c10ea97845ed5 = new byte[]{2};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      C_static var2 = var1.id_class();
      String var3 = var2.id_extends();
      return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(var3).id_break().id_protected();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412489865;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -86, -41, 75, -51, 8, 92, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9045162887762896462L;
   }

   public xd_3 id_break(C_for var1) throws x_1 {
      rqO_2 var2 = new rqO_2(var1.id_class().id_extends());
      xd_3 var3;
      if ((var3 = rVL.id_strictfp.id_break(var2).orElse(null)) == null) {
         throw new IllegalArgumentException("Неизвестный блок: " + var2);
      } else {
         return var3;
      }
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rruY(), null};
      var0[1] = new rruY[]{(rruY)var0[0]};
      staticFieldsa8884e3b339234dd911c10ea97845ed5 = var0;
   }

   private static void id_throws() {
      booleansa8884e3b339234dd911c10ea97845ed5 = new boolean[]{true, false, false, false, true};
   }

   private static void id_case() {
      shortsa8884e3b339234dd911c10ea97845ed5 = new short[]{1, 0};
   }

   private static void id_protected() {
      stringsa8884e3b339234dd911c10ea97845ed5 = new String[]{new String("INSTANCE")};
   }
}
