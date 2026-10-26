package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmX_2 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static short[] id_catch;

   public rrmX_2(C_case var1) {
      super(var1, "macro", "macros");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmJ_2();
         case "remove", "delete" -> new rrmk_3();
         case "clear" -> new rrmx_3();
         case "list" -> new rrmd_3(this);
         default -> throw new W(var2.id_throws(), "add, remove, clear, list");
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1418360071;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3404341564998629113L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break("add", "remove", "clear", "list").id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return !var3.equalsIgnoreCase("remove") && !var3.equalsIgnoreCase("delete")
            ? Stream.empty()
            : new v_1()
               .id_break(((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).id_byte().stream().map(rrvm_1::id_byte))
               .id_class(var2.id_implements())
               .id_break()
               .id_protected();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 17, -120, 101, 108, -8, 108, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   private static void id_finally() {
      id_break = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> <команда> - добавить макрос".formatted(var2, var1),
         "> %s%s remove/delete <имя> - удалить макрос".formatted(var2, var1),
         "> %s%s clear - очистить список макросов".formatted(var2, var1),
         "> %s%s list - посмотреть список макросов".formatted(var2, var1),
         "",
         "Пример: %s%s test /home home".formatted(var2, var1),
         "",
         "После ввода команды %s%s add, вам нужно будет нажать клавишу, на которую вы хотите привязать макрос".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_catch = new short[2];
   }

   @Override
   public String id_implements() {
      return "Команда для добавления макросов";
   }

   private static void id_protected() {
      id_case = new String[]{
         new String("macro"),
         new String("macros"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("clear"),
         new String("list"),
         new String("add, remove, clear, list"),
         new String("add"),
         new String("remove"),
         new String("clear"),
         new String("list"),
         new String("remove"),
         new String("delete"),
         new String("Команда для добавления макросов"),
         new String("> %s%s add <имя> <команда> - добавить макрос"),
         new String("> %s%s remove/delete <имя> - удалить макрос"),
         new String("> %s%s clear - очистить список макросов"),
         new String("> %s%s list - посмотреть список макросов"),
         new String(""),
         new String("Пример: %s%s test /home home"),
         new String(""),
         new String("После ввода команды %s%s add, вам нужно будет нажать клавишу, на которую вы хотите привязать макрос")
      };
   }
}
