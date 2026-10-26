package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZC extends rruy_1 {
   private static float[] id_protected;

   private static void id_int() {
      id_protected = new float[]{0.7F, 0.3F};
   }

   public rrZC(
      Supplier<String> var1,
      rrZO var2,
      Supplier<Integer> var3,
      Supplier<rjK_2> var4,
      Supplier<rqO_2> var5,
      Supplier<rjK_2> var6,
      Supplier<rjK_2> var7,
      Supplier<Integer> var8
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 90060134;
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3961291990749462021L;
   }

   public static String id_throws(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, -40, 120, 64, 48, -9, -126, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_finally() {
      return id_protected[0] + id_protected[1] * this.id_protected();
   }
}
