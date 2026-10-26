package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rruY implements C_double<xd_3> {
   ;
   private static short[] shortsa8884e3b339234dd911c10ea97845ed5;
   private static byte[] bytesa8884e3b339234dd911c10ea97845ed5;
   private static String[] stringsa8884e3b339234dd911c10ea97845ed5;
   private static boolean[] booleansa8884e3b339234dd911c10ea97845ed5;
   public static Object[] staticFieldsa8884e3b339234dd911c10ea97845ed5;

   private static void byte_() {
      bytesa8884e3b339234dd911c10ea97845ed5 = new byte[]{2};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      C_static var2 = var1.class_();
      String var3 = var2.extends_();
      return new v_1().break_(rVL.strictfp_.protected_().stream().map(Object::toString)).break_(var3).break_().protected_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412489865;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -86, -41, 75, -51, 8, 92, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9045162887762896462L;
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

   private static void break_() {
      Object[] var0 = new Object[]{new rruY(), null};
      var0[1] = new rruY[]{(rruY)var0[0]};
      staticFieldsa8884e3b339234dd911c10ea97845ed5 = var0;
   }

   private static void throws_() {
      booleansa8884e3b339234dd911c10ea97845ed5 = new boolean[]{true, false, false, false, true};
   }

   private static void case_() {
      shortsa8884e3b339234dd911c10ea97845ed5 = new short[]{1, 0};
   }

   private static void protected_() {
      stringsa8884e3b339234dd911c10ea97845ed5 = new String[]{new String("INSTANCE")};
   }
}
