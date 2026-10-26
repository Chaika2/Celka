package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum h_1 implements C_switch<rjU_2, rjU_2> {
   ;
   private static short[] shortse900d351c8b53997a0ceaa72eeab0b7d;
   public static Object[] staticFieldse900d351c8b53997a0ceaa72eeab0b7d;
   private static boolean[] booleanse900d351c8b53997a0ceaa72eeab0b7d;
   private static byte[] bytese900d351c8b53997a0ceaa72eeab0b7d;
   private static String[] stringse900d351c8b53997a0ceaa72eeab0b7d;

   private static void byte_() {
      bytese900d351c8b53997a0ceaa72eeab0b7d = new byte[]{4, 2, 2};
   }

   static {
      ntfClinit();
   }

   public rjU_2 class_(C_for var1, rjU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = rjU_2.class_;
      }

      C_static var3 = var1.class_();
      return new rjU_2(
         var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], var2.break_),
         var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], var2.byte_),
         var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], var2.protected_)
      );
   }

   @Override
   public Stream<String> class_(C_for var1) throws x_1 {
      C_static var2 = var1.class_();
      if (var2.final_() && !var2.break_(4)) {
         while (var2.break_(2) && var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) != null) {
            var2.throws_();
         }

         return var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]);
      } else {
         return Stream.empty();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9218339072657601409L;
   }

   private static void class_() {
      booleanse900d351c8b53997a0ceaa72eeab0b7d = new boolean[]{true, false, false, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 916359205;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, -94, -22, 36, 31, 64, 48, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new h_1(), null};
      var0[1] = new h_1[]{(h_1)var0[0]};
      staticFieldse900d351c8b53997a0ceaa72eeab0b7d = var0;
   }

   private static void throws_() {
      shortse900d351c8b53997a0ceaa72eeab0b7d = new short[]{1, 0, 0, 0, 0, 0, 0};
   }

   private static void case_() {
      stringse900d351c8b53997a0ceaa72eeab0b7d = new String[]{new String("INSTANCE")};
   }
}
