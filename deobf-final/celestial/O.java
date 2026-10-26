package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum O implements C_switch<rJ_2, rU_2> {
   ;
   private static short[] shortse82c5f6cc67b3e92817497b25f379c73;
   private static boolean[] booleanse82c5f6cc67b3e92817497b25f379c73;
   private static String[] stringse82c5f6cc67b3e92817497b25f379c73;
   private static byte[] bytese82c5f6cc67b3e92817497b25f379c73;
   public static Object[] staticFieldse82c5f6cc67b3e92817497b25f379c73;

   private static void byte_() {
      booleanse82c5f6cc67b3e92817497b25f379c73 = new boolean[]{true, true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1360599101690633255L;
   }

   public rJ_2 class_(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.class_[0];
      }

      return new rJ_2(rfU_2.byte_(var1.class_().break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[1]).intValue())));
   }

   @Override
   public Stream<String> class_(C_for var1) {
      C_static var2 = var1.class_();
      return var2.catch_(1) ? var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) : Stream.empty();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -935563553;
   }

   private static void class_() {
      shortse82c5f6cc67b3e92817497b25f379c73 = new short[]{1, 0, 0, 1, 0, 0};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, 119, -6, -85, 79, 93, -110, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      stringse82c5f6cc67b3e92817497b25f379c73 = new String[]{new String("INSTANCE")};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new O(), null};
      var0[1] = new O[]{(O)var0[0]};
      staticFieldse82c5f6cc67b3e92817497b25f379c73 = var0;
   }

   private static void case_() {
      bytese82c5f6cc67b3e92817497b25f379c73 = new byte[]{2};
   }
}
