package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum M implements C_switch<rX_2, rU_2> {
   private static byte[] bytes458f40b2da6139cb91242091b209a91e;
   private static String[] strings458f40b2da6139cb91242091b209a91e;
   private static boolean[] booleans458f40b2da6139cb91242091b209a91e;
   private static short[] shorts458f40b2da6139cb91242091b209a91e;
   public static Object[] staticFields458f40b2da6139cb91242091b209a91e;

   private static void id_byte() {
      shorts458f40b2da6139cb91242091b209a91e = new short[]{1, 0, 0, 0, 0, 2, 0, 0};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> id_class(C_for var1) {
      C_static var2 = var1.id_class();
      return var2.id_catch(bytes458f40b2da6139cb91242091b209a91e[0])
         ? var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[6]])
         : Stream.empty();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2810592119299253484L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1541553391;
   }

   public rX_2 id_class(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.id_class[shorts458f40b2da6139cb91242091b209a91e[1]];
      }

      C_static var3 = var1.id_class();
      return new rX_2(
         rfU_2.id_byte(
            var3.id_break(
               (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[2]],
               (double)((Integer)var2.id_break[shorts458f40b2da6139cb91242091b209a91e[3]]).intValue()
            )
         ),
         rfU_2.id_byte(
            var3.id_break(
               (s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shorts458f40b2da6139cb91242091b209a91e[4]],
               (double)((Integer)var2.id_break[shorts458f40b2da6139cb91242091b209a91e[5]]).intValue()
            )
         )
      );
   }

   private static void id_class() {
      strings458f40b2da6139cb91242091b209a91e = new String[]{new String("INSTANCE")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, 61, -74, 95, 43, 66, -61, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      booleans458f40b2da6139cb91242091b209a91e = new boolean[]{true, false, false, false, true};
   }

   private static void id_case() {
      bytes458f40b2da6139cb91242091b209a91e = new byte[]{2, 2};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new M(), null};
      var0[1] = new M[]{(M)var0[0]};
      staticFields458f40b2da6139cb91242091b209a91e = var0;
   }
}
