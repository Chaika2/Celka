package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PY extends LinkedHashMap<String, String> {
   private static String[] id_class;

   public PY() {
      this.put(id_class[0], id_class[1]);
      this.put(id_class[2], id_class[3]);
      this.put(id_class[4], id_class[5]);
      this.put(id_class[6], id_class[7]);
      this.put(id_class[8], id_class[9]);
      this.put(id_class[10], id_class[11]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -902361814;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 65, 33, -111, -2, 48, -15, -71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new String[]{
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8141469803582020663L;
   }
}
