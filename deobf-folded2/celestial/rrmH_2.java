package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmH_2 extends C_try {
   private static byte[] id_break;
   private static String[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public rrmH_2(C_case var1) {
      super(var1, "staffprefix");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmy_3();
         case "remove", "delete" -> new rrmt_3();
         case "clear" -> new rrmp_3();
         case "list" -> new rrmq_3(this);
         case "reload" -> new rrmT_2();
         default -> throw new W(var2.id_throws(), "add, remove, clear, list, reload");
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1567521990;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1860417350045007539L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break("add", "remove", "clear", "list", "reload").id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()
            ? new v_1()
               .id_break(((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_class().stream())
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, -121, -98, 127, 26, -38, 70, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new short[2];
   }

   private static void id_finally() {
      id_throws = new String[]{
         new String("staffprefix"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("clear"),
         new String("list"),
         new String("reload"),
         new String("add, remove, clear, list, reload"),
         new String("add"),
         new String("remove"),
         new String("clear"),
         new String("list"),
         new String("reload"),
         new String("remove"),
         new String("delete"),
         new String("Команда для добавления уникальных префиксов персонала"),
         new String("> %s%s add <имя> - добавить префикс"),
         new String("> %s%s remove/delete <имя> - удалить префикс"),
         new String("> %s%s clear - очистить список префиксов"),
         new String("> %s%s list - посмотреть список префиксов"),
         new String("> %s%s reload - обновить список префиксов"),
         new String(""),
         new String("Пример: %s%s add Гл. Админ")
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> - добавить префикс".formatted(var2, var1),
         "> %s%s remove/delete <имя> - удалить префикс".formatted(var2, var1),
         "> %s%s clear - очистить список префиксов".formatted(var2, var1),
         "> %s%s list - посмотреть список префиксов".formatted(var2, var1),
         "> %s%s reload - обновить список префиксов".formatted(var2, var1),
         "",
         "Пример: %s%s add Гл. Админ".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_catch = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public String id_implements() {
      return "Команда для добавления уникальных префиксов персонала";
   }

   private static void id_protected() {
      id_break = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }
}
