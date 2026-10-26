package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BK extends Bn_1 {
   private static String[] id_byte;
   private static short[] id_protected;

   public BK() {
      super(id_byte[0], (Pattern[])Bl_1.id_class[22]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4052151549022397423L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 716227273;
   }

   private static void id_catch() {
      id_byte = new String[]{new String("Горящий череп")};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{103, 63, -36, -35, 101, 91, 98, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_protected = new short[]{22};
   }
}
