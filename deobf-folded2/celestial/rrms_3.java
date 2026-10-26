package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrms_3 extends C_try {
   private static String[] id_break;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public rrms_3(C_case var1) {
      super(var1, "friend", "friends");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -530749665;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmE_2();
         case "remove", "delete" -> new rrmM_2();
         case "clear" -> new rrmG_2();
         case "list" -> new rrmb_3(this);
         default -> throw new W(var2.id_throws(), "add, remove, clear, list");
      })).id_class(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6246975200740797459L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break("add", "remove", "clear", "list").id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()
            ? new v_1()
               .id_break(((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class().values().stream().map(rrZk_1::id_class))
               .id_class(var2.id_implements())
               .id_break()
               .id_protected()
            : Stream.empty();
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -11, -65, 44, 32, 68, -36, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new short[2];
   }

   private static void id_finally() {
      id_case = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> - добавить друга".formatted(var2, var1),
         "> %s%s remove/delete <имя> - удалить друга".formatted(var2, var1),
         "> %s%s clear - очистить список друзей".formatted(var2, var1),
         "> %s%s list - посмотреть список друзей".formatted(var2, var1),
         "",
         "Пример: %s%s add Smertnix".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_catch = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
   }

   @Override
   public String id_implements() {
      return "Команда для добавления друзей";
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("friend"),
         new String("friends"),
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
         new String("Команда для добавления друзей"),
         new String("> %s%s add <имя> - добавить друга"),
         new String("> %s%s remove/delete <имя> - удалить друга"),
         new String("> %s%s clear - очистить список друзей"),
         new String("> %s%s list - посмотреть список друзей"),
         new String(""),
         new String("Пример: %s%s add Smertnix")
      };
   }
}
