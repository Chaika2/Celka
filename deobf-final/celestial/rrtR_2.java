package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtR_2 {
   private static boolean[] break_;
   public static Object[] class_;
   private static String[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{
         Pattern.compile("[a-zA-Zа-яА-Я]+"),
         Pattern.compile("[0-9]+"),
         Pattern.compile("[a-zA-Zа-яА-Я0-9]+"),
         Pattern.compile("[a-zA-Z0-9]+"),
         Pattern.compile("[a-zA-Zа-яА-Я0-9 ]+"),
         Pattern.compile("[\\wа-яА-Я0-9-!@#$%^&~*<>,/\";\\[\\]{}()_+` ]+"),
         Pattern.compile("[\\wа-яА-Я0-9-!@#$%^&~*,\\[\\]{}()_+` ]+"),
         Pattern.compile("^[a-zA-Z0-9_]+$"),
         Pattern.compile("[a-zA-Z0-9!\\-=*@#$%^&()+/<>?_]+")
      };
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -103, 13, -106, -5, -88, 77, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6760022108469491463L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1313187149;
   }

   private static void class_() {
      protected_ = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void break_() {
      break_ = new boolean[]{false, true};
   }

   private static void protected_() {
      byte_ = new String[]{
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
