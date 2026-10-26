package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract sealed class rrLi_1 permits rrAr_1, rrAP {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   public static rrAr_1 id_class(int var0) {
      return new rrAr_1(var0);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -125, -76, 125, 42, 45, -128, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAP id_class() {
      return (rrAP)rrAP.id_class[id_class[0]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3850551724540349510L;
   }

   private static void id_break() {
      id_class = new short[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1142798334;
   }
}
