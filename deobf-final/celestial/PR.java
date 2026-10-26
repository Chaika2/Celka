package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PR extends EnumMap<PK, Pattern> {
   private static short[] class_;
   private static String[] break_;

   public PR(Class var1) {
      super(var1);
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[0], Pattern.compile("СолоЛайт #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[1], Pattern.compile("ДуоЛайт #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[2], Pattern.compile("ТриоЛайт #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[3], Pattern.compile("КланЛайт #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[4], Pattern.compile("Лайт #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[5], Pattern.compile("Классик #(\\d+)"));
      this.put((PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[6], Pattern.compile("Лобби #(\\d+)"));
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new short[]{0, 1, 2, 3, 4, 5, 6};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8963098304401369266L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1059581240;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, -40, 88, 117, 29, 33, 69, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{
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
