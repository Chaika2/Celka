package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum b_1 implements C_switch<rS_2, rU_2> {
   private static short[] shortsdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static boolean[] booleansdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static String[] stringsdf0e2a18debd3d38bfaf4a483a1d8c36;
   private static byte[] bytesdf0e2a18debd3d38bfaf4a483a1d8c36;
   public static Object[] staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36;

   private static void id_byte() {
      stringsdf0e2a18debd3d38bfaf4a483a1d8c36 = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> id_class(C_for var1) {
      C_static var2 = var1.id_class();
      return var2.id_catch(bytesdf0e2a18debd3d38bfaf4a483a1d8c36[0])
         ? var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[8]])
         : Stream.empty();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{48, -100, 29, -15, 105, -123, 76, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rS_2 id_class(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.id_class[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[1]];
      }

      C_static var3 = var1.id_class();
      return new rS_2(
         rfU_2.id_byte(
            var3.id_break(
               (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[2]],
               (double)((Integer)var2.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[3]]).intValue()
            )
         ),
         rfU_2.id_byte(
            var3.id_break(
               (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[4]],
               (double)((Integer)var2.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[5]]).intValue()
            )
         ),
         rfU_2.id_byte(
            var3.id_break(
               (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[6]],
               (double)((Integer)var2.id_break[shortsdf0e2a18debd3d38bfaf4a483a1d8c36[7]]).intValue()
            )
         )
      );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 299903013;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6422418777211115866L;
   }

   private static void id_break() {
      bytesdf0e2a18debd3d38bfaf4a483a1d8c36 = new byte[]{3, 2};
   }

   private static void id_throws() {
      booleansdf0e2a18debd3d38bfaf4a483a1d8c36 = new boolean[]{true, false, false, false, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new b_1(), null};
      var0[1] = new b_1[]{(b_1)var0[0]};
      staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36 = var0;
   }

   private static void id_protected() {
      shortsdf0e2a18debd3d38bfaf4a483a1d8c36 = new short[]{1, 0, 0, 0, 0, 1, 0, 2, 0, 0};
   }
}
