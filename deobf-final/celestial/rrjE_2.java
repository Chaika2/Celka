package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjE_2 {
   private static boolean[] break_;
   private static byte[] byte_;
   private static String[] protected_;
   public static Object[] class_;

   private static void byte_() {
      byte_ = new byte[]{9, 10, 11, 12, 13, 2, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2299224669544815859L;
   }

   private static void class_() {
      protected_ = new String[]{
         new String("(?:Аукцион|Аукционы)\\s+\\[(\\d+)/(\\d+)]"),
         new String("(?:Поиск|П):\\s*(.+?)\\s+\\[(\\d+)/(\\d+)]"),
         new String("(?:Аукцион|Аукционы):\\s*(\\S+)\\s+\\[(\\d+)/(\\d+)]"),
         new String("\\[⌘] Слишком много людей пишут эту команду! Попробуйте через (\\d+) сек\\."),
         new String("хранилище"),
         new String("подозрительная цена"),
         new String("подтверждение покупки"),
         new String("выбор категории"),
         new String("[⟲] Обновить"),
         new String("[Кyпить]"),
         new String("Вы успешно купили"),
         new String("У Вас не хватает Монет!"),
         new String("Этот товар уже Купили"),
         new String("[☃] После входа на режим необходимо немного подождать перед использованием аукциона"),
         new String("[❌] Данный предмет небезопасно выставлять на аукцион находясь на спавне!"),
         new String("[☃] Освободите хранилище или уберите предметы с продажи"),
         new String("\\s+\\[(\\d+)/(\\d+)]")
      };
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 15, 68, -116, 63, -97, -35, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1321905332;
   }

   private static void break_() {
      break_ = new boolean[]{true, false, false, true, true, false, false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{
         "[⟲] Обновить",
         "[Кyпить]",
         "Вы успешно купили",
         "У Вас не хватает Монет!",
         "Этот товар уже Купили",
         "[☃] После входа на режим необходимо немного подождать перед использованием аукциона",
         "[❌] Данный предмет небезопасно выставлять на аукцион находясь на спавне!",
         "[☃] Освободите хранилище или уберите предметы с продажи",
         "\\s+\\[(\\d+)/(\\d+)]",
         Pattern.compile("(?:Аукцион|Аукционы)\\s+\\[(\\d+)/(\\d+)]", 0),
         Pattern.compile("(?:Поиск|П):\\s*(.+?)\\s+\\[(\\d+)/(\\d+)]"),
         Pattern.compile("(?:Аукцион|Аукционы):\\s*(\\S+)\\s+\\[(\\d+)/(\\d+)]"),
         Pattern.compile("\\[⌘] Слишком много людей пишут эту команду! Попробуйте через (\\d+) сек\\."),
         null,
         null,
         null
      };
      String[] var2 = new String[]{"хранилище"};
      var0[13] = var2;
      String[] var3 = new String[]{"подозрительная цена", "подтверждение покупки"};
      var0[14] = var3;
      String[] var4 = new String[]{"выбор категории"};
      var0[15] = var4;
      class_ = var0;
   }
}
