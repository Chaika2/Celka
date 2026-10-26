package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjb_3 {
   private static String[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public static Object[] class_;

   private static void byte_() {
      break_ = new String[]{
         new String("\\[✠] Регион успешно создан! #(\\d+)"),
         new String("\\[\\$] Ваш баланс:\\s+\\$([\\d,]+)"),
         new String("\\[⚔] Баланс клана:\\s+(.*)"),
         new String("\\[\\$] Вы подобрали \\$(\\d+)[.\\d]+ с моба(?:\\s?\\(Буст \\+(\\d+)[.\\d]+\\$\\))?"),
         new String("\\[✔] Успешная авто-продажа (.+) \\d+ шт. за ([\\d,]+)\\$"),
         new String("/ah\\s+(sell|dsell)\\s+(.*)"),
         new String("/ah\\s+(.*)"),
         new String("/duel\\s+(?:stats|statistics)\\s+(.*)"),
         new String("/clan\\s+(invest|withdraw)\\s+(.*)"),
         new String("/(epay|pay)\\s+(.*)\\s+(.*)"),
         new String("/clan\\s+create(?:\\s+(.*))?"),
         new String("/b\\s+(\\S+)(?:\\s+(.*))?"),
         new String("(\\d+ (сек|секунд))"),
         new String("Вы были кикнуты при подключении к серверу"),
         new String("[⚔] Ошибка, клан с таким названием уже существует!"),
         new String("[⚔] Супер! Вы успешно создали клан:"),
         new String("[⚔] Ошибка: Ты уже состоишь в клане!")
      };
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 575938005;
   }

   private static void class_() {
      Object[] var0 = new Object[]{
         "Вы были кикнуты при подключении к серверу",
         "[⚔] Ошибка, клан с таким названием уже существует!",
         "[⚔] Супер! Вы успешно создали клан:",
         "[⚔] Ошибка: Ты уже состоишь в клане!",
         Pattern.compile("\\[✠] Регион успешно создан! #(\\d+)"),
         Pattern.compile("\\[\\$] Ваш баланс:\\s+\\$([\\d,]+)"),
         Pattern.compile("\\[⚔] Баланс клана:\\s+(.*)"),
         Pattern.compile("\\[\\$] Вы подобрали \\$(\\d+)[.\\d]+ с моба(?:\\s?\\(Буст \\+(\\d+)[.\\d]+\\$\\))?"),
         Pattern.compile("\\[✔] Успешная авто-продажа (.+) \\d+ шт. за ([\\d,]+)\\$"),
         Pattern.compile("/ah\\s+(sell|dsell)\\s+(.*)"),
         Pattern.compile("/ah\\s+(.*)"),
         Pattern.compile("/duel\\s+(?:stats|statistics)\\s+(.*)"),
         Pattern.compile("/clan\\s+(invest|withdraw)\\s+(.*)"),
         Pattern.compile("/(epay|pay)\\s+(.*)\\s+(.*)"),
         Pattern.compile("/clan\\s+create(?:\\s+(.*))?"),
         Pattern.compile("/b\\s+(\\S+)(?:\\s+(.*))?"),
         Pattern.compile("(\\d+ (сек|секунд))")
      };
      class_ = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, 84, -72, -116, -117, 15, 92, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9184631882091772574L;
   }

   private static void break_() {
      protected_ = new boolean[]{false, true};
   }

   private static void protected_() {
      byte_ = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2, 3};
   }
}
