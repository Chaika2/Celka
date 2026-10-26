package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum s_1 implements C_switch<Double, Double> {
   private static double[] doubles2f6c75eddeaf3dec901642e9ef998dc8;
   public static Object[] staticFields2f6c75eddeaf3dec901642e9ef998dc8;
   private static short[] shorts2f6c75eddeaf3dec901642e9ef998dc8;
   private static boolean[] booleans2f6c75eddeaf3dec901642e9ef998dc8;
   private static byte[] bytes2f6c75eddeaf3dec901642e9ef998dc8;
   private static String[] strings2f6c75eddeaf3dec901642e9ef998dc8;

   private static void id_byte() {
      bytes2f6c75eddeaf3dec901642e9ef998dc8 = new byte[]{2, 2, 2, 2, 2, 3, 2, 4};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506073602;
   }

   public Double id_class(C_for var1, Double var2) throws x_1 {
      if (var2 == null) {
         var2 = doubles2f6c75eddeaf3dec901642e9ef998dc8[0];
      }

      Matcher var3 = ((Pattern)staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[1]]).matcher(var1.id_class().id_extends());
      if (!var3.matches()) {
         throw new IllegalArgumentException(strings2f6c75eddeaf3dec901642e9ef998dc8[0]);
      } else {
         boolean var4 = !var3.group(booleans2f6c75eddeaf3dec901642e9ef998dc8[0]).isEmpty()
            ? booleans2f6c75eddeaf3dec901642e9ef998dc8[1]
            : booleans2f6c75eddeaf3dec901642e9ef998dc8[2];
         double var5 = var3.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[0]).isEmpty()
            ? doubles2f6c75eddeaf3dec901642e9ef998dc8[1]
            : Double.parseDouble(
               var3.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[1])
                  .replaceAll(
                     (String)staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts2f6c75eddeaf3dec901642e9ef998dc8[2]],
                     strings2f6c75eddeaf3dec901642e9ef998dc8[1]
                  )
            );
         if (var3.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[2]).toLowerCase().contains(strings2f6c75eddeaf3dec901642e9ef998dc8[2])) {
            var5 *= doubles2f6c75eddeaf3dec901642e9ef998dc8[2];
         }

         if (var3.group(bytes2f6c75eddeaf3dec901642e9ef998dc8[3]).toLowerCase().contains(strings2f6c75eddeaf3dec901642e9ef998dc8[3])) {
            var5 *= doubles2f6c75eddeaf3dec901642e9ef998dc8[3];
         }

         return var4 ? var2 + var5 : var5;
      }
   }

   @Override
   public Stream<String> id_class(C_for var1) throws x_1 {
      C_static var2 = var1.id_class();
      return !var2.id_break(bytes2f6c75eddeaf3dec901642e9ef998dc8[4]) && var2.id_extends().matches(strings2f6c75eddeaf3dec901642e9ef998dc8[4])
         ? Stream.of(strings2f6c75eddeaf3dec901642e9ef998dc8[5])
         : Stream.empty();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1496255173110260956L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{32, -89, 80, 105, 23, -12, 10, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      doubles2f6c75eddeaf3dec901642e9ef998dc8 = new double[]{0.0, 0.0, 1000.0, 1000000.0};
   }

   private static void id_throws() {
      strings2f6c75eddeaf3dec901642e9ef998dc8 = new String[]{
         new String("pattern doesn't match"),
         new String(""),
         new String("k"),
         new String("m"),
         new String("^(~|$)"),
         new String("~"),
         new String("INSTANCE"),
         new String("[kKmM]")
      };
   }

   private static void id_catch() {
      shorts2f6c75eddeaf3dec901642e9ef998dc8 = new short[]{3, 2, 1, 0};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{
         new s_1(), strings2f6c75eddeaf3dec901642e9ef998dc8[7], Pattern.compile("^(~?)([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)([kKmM]?)|)$", 0), null
      };
      var0[3] = new s_1[]{(s_1)var0[0]};
      staticFields2f6c75eddeaf3dec901642e9ef998dc8 = var0;
   }

   private static void id_protected() {
      booleans2f6c75eddeaf3dec901642e9ef998dc8 = new boolean[]{true, true, false, true, false, false, false, true, true};
   }
}
