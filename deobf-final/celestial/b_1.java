package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum b_1 implements C_switch<rS_2, rU_2> {
   ;
   private static short[] shortsdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static boolean[] booleansdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static String[] stringsdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static byte[] bytesdf0e2a18debd3d38bfaf4a483a1d8c36;
   public static Object[] staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36;

   private static void byte_() {
      stringsdf0e2a18debd3d38bfaf4a483a1d8c36 = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> class_(C_for var1) {
      C_static var2 = var1.class_();
      return var2.catch_(3) ? var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) : Stream.empty();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{48, -100, 29, -15, 105, -123, 76, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rS_2 class_(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.class_[0];
      }

      C_static var3 = var1.class_();
      return new rS_2(
         rfU_2.byte_(var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[0]).intValue())),
         rfU_2.byte_(var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[1]).intValue())),
         rfU_2.byte_(var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[2]).intValue()))
      );
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 299903013;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6422418777211115866L;
   }

   private static void break_() {
      bytesdf0e2a18debd3d38bfaf4a483a1d8c36 = new byte[]{3, 2};
   }

   private static void throws_() {
      booleansdf0e2a18debd3d38bfaf4a483a1d8c36 = new boolean[]{true, false, false, false, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new b_1(), null};
      var0[1] = new b_1[]{(b_1)var0[0]};
      staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36 = var0;
   }

   private static void protected_() {
      shortsdf0e2a18debd3d38bfaf4a483a1d8c36 = new short[]{1, 0, 0, 0, 0, 1, 0, 2, 0, 0};
   }
}
