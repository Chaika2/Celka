package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrmQ_2 implements C_double<xd_3> {
   ;
   private static boolean[] booleansfc1bbf6223bd333fa50da06439bdcc78;
   private static String[] stringsfc1bbf6223bd333fa50da06439bdcc78;
   private static short[] shortsfc1bbf6223bd333fa50da06439bdcc78;
   public static Object[] staticFieldsfc1bbf6223bd333fa50da06439bdcc78;
   private static byte[] bytesfc1bbf6223bd333fa50da06439bdcc78;

   private static void byte_() {
      stringsfc1bbf6223bd333fa50da06439bdcc78 = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1533563206052873230L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 663397276;
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      C_static var2 = var1.class_();
      String var3 = var2.extends_();
      return new v_1().break_(rVL.strictfp_.protected_().stream().map(Object::toString)).break_(var3).break_().protected_();
   }

   private static void class_() {
      shortsfc1bbf6223bd333fa50da06439bdcc78 = new short[]{1, 0};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, 9, -92, -71, 28, -34, 48, 80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public xd_3 break_(C_for var1) throws x_1 {
      rqO_2 var2 = new rqO_2(var1.class_().extends_());
      xd_3 var3;
      if ((var3 = rVL.strictfp_.break_(var2).orElse(null)) == null) {
         throw new IllegalArgumentException("Неизвестный блок: " + var2);
      } else {
         return var3;
      }
   }

   private static void throws_() {
      bytesfc1bbf6223bd333fa50da06439bdcc78 = new byte[]{2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrmQ_2(), null};
      var0[1] = new rrmQ_2[]{(rrmQ_2)var0[0]};
      staticFieldsfc1bbf6223bd333fa50da06439bdcc78 = var0;
   }

   private static void protected_() {
      booleansfc1bbf6223bd333fa50da06439bdcc78 = new boolean[]{true, false, false, false, true};
   }
}
