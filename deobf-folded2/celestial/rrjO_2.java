package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjO_2 {
   private static byte[] id_break;
   private static String[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;

   private static void id_byte() {
      id_byte = new String[]{
         new String("don-item"),
         new String("isSphere"),
         new String("desorientation"),
         new String("fierytornado"),
         new String("sheerdust"),
         new String("freezeball"),
         new String("stratum"),
         new String("christmasstratum"),
         new String("trap"),
         new String("christmastrap"),
         new String("gift"),
         new String("godsaura"),
         new String("isSilver")
      };
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_protected = new boolean[]{false, true};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1598753740;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{43, 54, -118, -110, 65, 49, -95, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3098776596986467479L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{
         "don-item",
         "isSphere",
         "desorientation",
         "fierytornado",
         "sheerdust",
         "freezeball",
         "stratum",
         "christmasstratum",
         "trap",
         "christmastrap",
         "gift",
         "godsaura",
         "isSilver"
      };
      id_class = var0;
   }

   private static void id_protected() {
      id_break = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }
}
