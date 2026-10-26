package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pw_1 extends EnumMap<Pf_1, Pattern> {
   private static short[] id_class;
   private static String[] id_break;

   public Pw_1(Class var1) {
      super(var1);
      this.put((Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[0]], Pattern.compile(id_break[0]));
      this.put((Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[1]], Pattern.compile(id_break[1]));
      this.put((Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_class[2]], Pattern.compile(id_break[2]));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -87, -117, 83, 61, 50, 86, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2559583453799615485L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412228361;
   }

   private static void id_class() {
      id_break = new String[]{new String("Анархия-(\\d+)"), new String("Гриферский-(\\d+)"), new String("Хаб #(\\d+)|%SERVER_NAME_TAB%")};
   }

   private static void id_break() {
      id_class = new short[]{0, 1, 2};
   }
}
