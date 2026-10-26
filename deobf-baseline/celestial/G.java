package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum G implements C_switch<rP_2, rU_2> {
   private static short[] shortscbb17f97fc8b35a5b5d18fc81c3fa5eb;
   private static boolean[] booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb;
   private static byte[] bytescbb17f97fc8b35a5b5d18fc81c3fa5eb;
   private static String[] stringscbb17f97fc8b35a5b5d18fc81c3fa5eb;
   public static Object[] staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb;

   private static void id_byte() {
      stringscbb17f97fc8b35a5b5d18fc81c3fa5eb = new String[]{new String("INSTANCE")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1362580371086484351L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, 50, 121, 72, 4, 40, -85, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rP_2 id_class(C_for var1, rU_2 var2) throws x_1 {
      if (var2 == null) {
         var2 = (rU_2)rU_2.id_class[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[1]];
      }

      C_static var3 = var1.id_class();
      rS_2 var4 = var3.id_byte((b_1)b_1.staticFieldsdf0e2a18debd3d38bfaf4a483a1d8c36[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[2]], var2);
      if (var4 != null) {
         return var4;
      } else {
         rX_2 var5 = var3.id_byte((M)M.staticFields458f40b2da6139cb91242091b209a91e[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[3]], var2);
         if (var5 != null) {
            return var5;
         } else {
            rJ_2 var6 = var3.id_byte((O)O.staticFieldse82c5f6cc67b3e92817497b25f379c73[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[4]], var2);
            return (rP_2)(var6 != null ? var6 : new rS_2(var2));
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -31784704;
   }

   private static void id_class() {
      shortscbb17f97fc8b35a5b5d18fc81c3fa5eb = new short[]{1, 0, 0, 0, 0, 0, 0};
   }

   @Override
   public Stream<String> id_class(C_for var1) {
      return var1.id_class().id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[shortscbb17f97fc8b35a5b5d18fc81c3fa5eb[5]]);
   }

   private static void id_throws() {
      bytescbb17f97fc8b35a5b5d18fc81c3fa5eb = new byte[]{2};
   }

   private static void id_case() {
      booleanscbb17f97fc8b35a5b5d18fc81c3fa5eb = new boolean[]{true, false, false, false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new G(), null};
      var0[1] = new G[]{(G)var0[0]};
      staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb = var0;
   }
}
