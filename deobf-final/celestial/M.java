package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum M implements C_switch<rX_2, rU_2> {
   ;
   private static byte[] bytes458f40b2da6139cb91242091b209a91e;
   private static String[] strings458f40b2da6139cb91242091b209a91e;
   private static boolean[] booleans458f40b2da6139cb91242091b209a91e;
   private static short[] shorts458f40b2da6139cb91242091b209a91e;
   public static Object[] staticFields458f40b2da6139cb91242091b209a91e;

   private static void byte_() {
      shorts458f40b2da6139cb91242091b209a91e = new short[]{1, 0, 0, 0, 0, 2, 0, 0};
   }

   static {
      ntfClinit();
   }

   @Override
   public Stream<String> class_(C_for var1) {
      C_static var2 = var1.class_();
      return var2.catch_(2) ? var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) : Stream.empty();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2810592119299253484L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1541553391;
   }

   public rX_2 class_(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.class_[0];
      }

      C_static var3 = var1.class_();
      return new rX_2(
         rfU_2.byte_(var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[0]).intValue())),
         rfU_2.byte_(var3.break_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0], (double)((Integer)var2.break_[2]).intValue()))
      );
   }

   private static void class_() {
      strings458f40b2da6139cb91242091b209a91e = new String[]{new String("INSTANCE")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, 61, -74, 95, 43, 66, -61, 42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleans458f40b2da6139cb91242091b209a91e = new boolean[]{true, false, false, false, true};
   }

   private static void case_() {
      bytes458f40b2da6139cb91242091b209a91e = new byte[]{2, 2};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new M(), null};
      var0[1] = new M[]{(M)var0[0]};
      staticFields458f40b2da6139cb91242091b209a91e = var0;
   }
}
