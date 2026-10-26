package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SW extends Bn_1 {
   private static String[] id_byte;
   private static short[] id_protected;

   public SW() {
      super(id_byte[0], (Pattern[])BH.id_class[7]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5859562376537785887L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -211638340;
   }

   private static void id_catch() {
      id_byte = new String[]{new String("Торговец")};
   }

   public static String id_catch(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, -114, 39, 105, -36, 11, -95, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_protected = new short[]{7};
   }
}
