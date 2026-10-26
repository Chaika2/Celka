package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum C_short implements C_double<xd_3> {
   ;
   public static Object[] staticFields527f5e1fd5d43b2790a2d9e0b8d76cee;
   private static short[] shorts527f5e1fd5d43b2790a2d9e0b8d76cee;
   private static byte[] bytes527f5e1fd5d43b2790a2d9e0b8d76cee;
   private static boolean[] booleans527f5e1fd5d43b2790a2d9e0b8d76cee;
   private static String[] strings527f5e1fd5d43b2790a2d9e0b8d76cee;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5664105244381932728L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1453877565;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 107, -10, 49, 112, -45, 74, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      String var2 = var1.class_().extends_();
      return new v_1().break_(rVL.strictfp_.protected_().stream().map(Object::toString)).break_(var2).break_().protected_();
   }

   private static void class_() {
      booleans527f5e1fd5d43b2790a2d9e0b8d76cee = new boolean[]{true, false, false, false, true};
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
      strings527f5e1fd5d43b2790a2d9e0b8d76cee = new String[]{new String("INSTANCE")};
   }

   private static void throws_() {
      shorts527f5e1fd5d43b2790a2d9e0b8d76cee = new short[]{1, 0};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new C_short(), null};
      var0[1] = new C_short[]{(C_short)var0[0]};
      staticFields527f5e1fd5d43b2790a2d9e0b8d76cee = var0;
   }

   private static void protected_() {
      bytes527f5e1fd5d43b2790a2d9e0b8d76cee = new byte[]{2};
   }
}
