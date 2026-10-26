package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtR_2 {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static String[] id_byte;
   private static byte[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{
         Pattern.compile(id_byte[0]),
         Pattern.compile(id_byte[1]),
         Pattern.compile(id_byte[2]),
         Pattern.compile(id_byte[3]),
         Pattern.compile(id_byte[4]),
         Pattern.compile(id_byte[5]),
         Pattern.compile(id_byte[6]),
         Pattern.compile(id_byte[7]),
         Pattern.compile(id_byte[8])
      };
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -103, 13, -106, -5, -88, 77, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6760022108469491463L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1313187149;
   }

   private static void id_class() {
      id_protected = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void id_break() {
      id_break = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_byte = new String[]{
         new String("[a-zA-Zа-яА-Я]+"),
         new String("[0-9]+"),
         new String("[a-zA-Zа-яА-Я0-9]+"),
         new String("[a-zA-Z0-9]+"),
         new String("[a-zA-Zа-яА-Я0-9 ]+"),
         new String("[\\wа-яА-Я0-9-!@#$%^&~*<>,/\";\\[\\]{}()_+` ]+"),
         new String("[\\wа-яА-Я0-9-!@#$%^&~*,\\[\\]{}()_+` ]+"),
         new String("^[a-zA-Z0-9_]+$"),
         new String("[a-zA-Z0-9!\\-=*@#$%^&()+/<>?_]+")
      };
   }
}
