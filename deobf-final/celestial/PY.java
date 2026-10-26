package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PY extends LinkedHashMap<String, String> {
   private static String[] class_;

   public PY() {
      this.put("sololite", "СолоЛайт");
      this.put("duolite", "ДуоЛайт");
      this.put("triolite", "ТриоЛайт");
      this.put("clanlite", "КланЛайт");
      this.put("lite120", "Лайт120");
      this.put("classic", "Классик");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -902361814;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 65, 33, -111, -2, 48, -15, -71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new String[]{
         new String("sololite"),
         new String("СолоЛайт"),
         new String("duolite"),
         new String("ДуоЛайт"),
         new String("triolite"),
         new String("ТриоЛайт"),
         new String("clanlite"),
         new String("КланЛайт"),
         new String("lite120"),
         new String("Лайт120"),
         new String("classic"),
         new String("Классик")
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8141469803582020663L;
   }
}
