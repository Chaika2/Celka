package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PR extends EnumMap<PK, Pattern> {
   private static short[] id_class;
   private static String[] id_break;

   public PR(Class var1) {
      super(var1);
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[0]], Pattern.compile(id_break[0]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[1]], Pattern.compile(id_break[1]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[2]], Pattern.compile(id_break[2]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[3]], Pattern.compile(id_break[3]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[4]], Pattern.compile(id_break[4]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[5]], Pattern.compile(id_break[5]));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_class[6]], Pattern.compile(id_break[6]));
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new short[]{0, 1, 2, 3, 4, 5, 6};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8963098304401369266L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1059581240;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, -40, 88, 117, 29, 33, 69, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new String[]{
         new String("СолоЛайт #(\\d+)"),
         new String("ДуоЛайт #(\\d+)"),
         new String("ТриоЛайт #(\\d+)"),
         new String("КланЛайт #(\\d+)"),
         new String("Лайт #(\\d+)"),
         new String("Классик #(\\d+)"),
         new String("Лобби #(\\d+)")
      };
   }
}
