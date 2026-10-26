package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sk_1 extends Bn_1 {
   private static short[] id_byte;
   private static String[] id_protected;

   public Sk_1() {
      super(id_protected[0], (Pattern[])BH.id_class[id_byte[0]]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1761217104;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6503357853110467861L;
   }

   private static void id_catch() {
      id_protected = new String[]{new String("Талисман")};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, 43, 76, -44, -122, 22, -118, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_byte = new short[]{6};
   }
}
