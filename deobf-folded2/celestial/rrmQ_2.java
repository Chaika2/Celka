package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrmQ_2 implements C_double<xd_3> {
   private static boolean[] booleansfc1bbf6223bd333fa50da06439bdcc78;
   private static String[] stringsfc1bbf6223bd333fa50da06439bdcc78;
   private static short[] shortsfc1bbf6223bd333fa50da06439bdcc78;
   public static Object[] staticFieldsfc1bbf6223bd333fa50da06439bdcc78;
   private static byte[] bytesfc1bbf6223bd333fa50da06439bdcc78;

   private static void id_byte() {
      stringsfc1bbf6223bd333fa50da06439bdcc78 = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1533563206052873230L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 663397276;
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      C_static var2 = var1.id_class();
      String var3 = var2.id_extends();
      return new v_1().id_break(rVL.id_strictfp.id_protected().stream().map(Object::toString)).id_break(var3).id_break().id_protected();
   }

   private static void id_class() {
      shortsfc1bbf6223bd333fa50da06439bdcc78 = new short[]{1, 0};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 9, -92, -71, 28, -34, 48, 80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
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

   private static void id_throws() {
      bytesfc1bbf6223bd333fa50da06439bdcc78 = new byte[]{2};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrmQ_2(), null};
      var0[1] = new rrmQ_2[]{(rrmQ_2)var0[0]};
      staticFieldsfc1bbf6223bd333fa50da06439bdcc78 = var0;
   }

   private static void id_protected() {
      booleansfc1bbf6223bd333fa50da06439bdcc78 = new boolean[]{true, false, false, false, true};
   }
}
