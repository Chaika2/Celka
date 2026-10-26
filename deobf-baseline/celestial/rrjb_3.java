package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjb_3 {
   private static String[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;

   private static void id_byte() {
      id_break = new String[]{
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

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 575938005;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{
         id_break[13],
         id_break[14],
         id_break[15],
         id_break[16],
         Pattern.compile(id_break[0]),
         Pattern.compile(id_break[1]),
         Pattern.compile(id_break[2]),
         Pattern.compile(id_break[3]),
         Pattern.compile(id_break[4]),
         Pattern.compile(id_break[5]),
         Pattern.compile(id_break[6]),
         Pattern.compile(id_break[7]),
         Pattern.compile(id_break[8]),
         Pattern.compile(id_break[9]),
         Pattern.compile(id_break[10]),
         Pattern.compile(id_break[11]),
         Pattern.compile(id_break[12])
      };
      id_class = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, 84, -72, -116, -117, 15, 92, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9184631882091772574L;
   }

   private static void id_break() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_byte = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2, 3};
   }
}
