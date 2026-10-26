package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum S implements C_switch<rU_2, rU_2> {
   private static byte[] bytes2b61d3be194f3208a61ab56674f124f7;
   private static short[] shorts2b61d3be194f3208a61ab56674f124f7;
   public static Object[] staticFields2b61d3be194f3208a61ab56674f124f7;
   private static boolean[] booleans2b61d3be194f3208a61ab56674f124f7;
   private static String[] strings2b61d3be194f3208a61ab56674f124f7;

   private static void id_byte() {
      booleans2b61d3be194f3208a61ab56674f124f7 = new boolean[]{true, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3893767195395885767L;
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      C_static var2 = var1.id_class();
      if (var2.id_final() && !var2.id_break(bytes2b61d3be194f3208a61ab56674f124f7[0])) {
         while (
            var2.id_break(bytes2b61d3be194f3208a61ab56674f124f7[1])
               && var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[8]]) != null
         ) {
            var2.id_throws();
         }

         return var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[9]]);
      } else {
         return Stream.empty();
      }
   }

   private static void id_class() {
      shorts2b61d3be194f3208a61ab56674f124f7 = new short[]{1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, -25, -93, -4, -68, 125, 86, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1427068237;
   }

   public rU_2 id_class(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.id_class[shorts2b61d3be194f3208a61ab56674f124f7[1]];
      }

      C_static var3 = var1.id_class();
      return new rU_2(
         var3.id_break(
            (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[2]],
            (double)((Integer)var2.id_break[shorts2b61d3be194f3208a61ab56674f124f7[3]]).intValue()
         ),
         var3.id_break(
            (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[4]],
            (double)((Integer)var2.id_break[shorts2b61d3be194f3208a61ab56674f124f7[5]]).intValue()
         ),
         var3.id_break(
            (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2b61d3be194f3208a61ab56674f124f7[6]],
            (double)((Integer)var2.id_break[shorts2b61d3be194f3208a61ab56674f124f7[7]]).intValue()
         )
      );
   }

   private static void id_break() {
      strings2b61d3be194f3208a61ab56674f124f7 = new String[]{new String("INSTANCE")};
   }

   private static void id_throws() {
      bytes2b61d3be194f3208a61ab56674f124f7 = new byte[]{4, 2, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new S(), null};
      var0[1] = new S[]{(S)var0[0]};
      staticFields2b61d3be194f3208a61ab56674f124f7 = var0;
   }
}
