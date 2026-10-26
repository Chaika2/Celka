package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Si_1 implements C_float<Double> {
   ;
   private static byte[] bytes723689ef04ae388e9b4d79e790173501;
   private static short[] shorts723689ef04ae388e9b4d79e790173501;
   private static String[] strings723689ef04ae388e9b4d79e790173501;
   public static Object[] staticFields723689ef04ae388e9b4d79e790173501;
   private static boolean[] booleans723689ef04ae388e9b4d79e790173501;

   private static void byte_() {
      shorts723689ef04ae388e9b4d79e790173501 = new short[]{1, 0};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1935398681078119582L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, -6, -59, -109, 85, 47, -72, -66}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1543939843;
   }

   @Override
   public Class<Double> class_() {
      return Double.class;
   }

   public Double break_(C_import var1) throws RuntimeException {
      String var2 = var1.break_();
      if (!var2.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
         throw new IllegalArgumentException("failed double format check");
      } else {
         return Double.parseDouble(var2);
      }
   }

   private static void break_() {
      booleans723689ef04ae388e9b4d79e790173501 = new boolean[]{true, false, false, false, true};
   }

   private static void throws_() {
      strings723689ef04ae388e9b4d79e790173501 = new String[]{
         new String("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$"), new String("failed double format check"), new String("INSTANCE")
      };
   }

   private static void case_() {
      bytes723689ef04ae388e9b4d79e790173501 = new byte[]{2};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new Si_1(), null};
      var0[1] = new Si_1[]{(Si_1)var0[0]};
      staticFields723689ef04ae388e9b4d79e790173501 = var0;
   }
}
