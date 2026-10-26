package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrmK_2 implements C_double<xd_3> {
   ;
   private static boolean[] booleans917222c690e13acf9dc05da7a804490a;
   private static byte[] bytes917222c690e13acf9dc05da7a804490a;
   private static short[] shorts917222c690e13acf9dc05da7a804490a;
   public static Object[] staticFields917222c690e13acf9dc05da7a804490a;
   private static String[] strings917222c690e13acf9dc05da7a804490a;

   private static void byte_() {
      strings917222c690e13acf9dc05da7a804490a = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8457280748003482698L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{127, 41, 72, 88, 101, -41, -100, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -173004390;
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      C_static var2 = var1.class_();
      String var3 = var2.extends_();
      return new v_1().break_(rVL.strictfp_.protected_().stream().map(Object::toString)).break_(var3).break_().protected_();
   }

   private static void break_() {
      booleans917222c690e13acf9dc05da7a804490a = new boolean[]{true, false, false, false, true};
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
      bytes917222c690e13acf9dc05da7a804490a = new byte[]{2};
   }

   private static void case_() {
      shorts917222c690e13acf9dc05da7a804490a = new short[]{1, 0};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrmK_2(), null};
      var0[1] = new rrmK_2[]{(rrmK_2)var0[0]};
      staticFields917222c690e13acf9dc05da7a804490a = var0;
   }
}
