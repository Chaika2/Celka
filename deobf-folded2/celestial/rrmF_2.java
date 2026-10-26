package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmF_2 extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public rrmF_2(C_case var1) {
      super(var1, "staff");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8827193524046009597L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412327816;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmL_2();
         case "remove", "delete" -> new rrml_3();
         case "clear" -> new rrmA_2();
         case "list" -> new rrmn_3(this);
         case "reload" -> new rrmC_2();
         default -> throw new W(var2.id_throws(), "add, remove, clear, list, reload");
      })).id_class(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -45, -86, 48, 3, 78, 93, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break("add", "remove", "clear", "list", "reload").id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()
            ? new v_1()
               .id_break(((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).id_byte().stream())
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   private static void id_throws() {
      id_break = new String[]{
         new String("staff"),
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
         new String("Команда для добавления уникального персонала"),
         new String("> %s%s add <имя> - добавить персонала"),
         new String("> %s%s remove/delete <имя> - удалить персонала"),
         new String("> %s%s clear - очистить список персонала"),
         new String("> %s%s list - посмотреть список персонала"),
         new String("> %s%s reload - обновить список персонала"),
         new String(""),
         new String("Пример: %s%s add Smertnix")
      };
   }

   private static void id_finally() {
      id_case = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> - добавить персонала".formatted(var2, var1),
         "> %s%s remove/delete <имя> - удалить персонала".formatted(var2, var1),
         "> %s%s clear - очистить список персонала".formatted(var2, var1),
         "> %s%s list - посмотреть список персонала".formatted(var2, var1),
         "> %s%s reload - обновить список персонала".formatted(var2, var1),
         "",
         "Пример: %s%s add Smertnix".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_catch = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public String id_implements() {
      return "Команда для добавления уникального персонала";
   }

   private static void id_protected() {
      id_throws = new short[2];
   }
}
