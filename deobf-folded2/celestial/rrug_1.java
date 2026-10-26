package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrug_1 extends C_try {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;

   public rrug_1(C_case var1) {
      super(var1, "blockesp");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rruR();
         case "remove", "delete" -> new rrue_1();
         case "clear" -> new rruo_1();
         case "list" -> new rruU(this);
         default -> throw new W(var2.id_throws(), "add, remove, clear, list");
      })).id_class(var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6728146266041747726L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1451788778;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -102, 96, 58, 93, -38, 14, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      if (var2.id_case()) {
         return new v_1().id_break("add", "remove", "clear", "list").id_class(var2.id_extends()).id_protected();
      } else {
         String var3 = var2.id_extends();
         if (var3.equalsIgnoreCase("add")) {
            if (var2.id_case()) {
               return var2.id_class((rruY)rruY.staticFieldsa8884e3b339234dd911c10ea97845ed5[0]);
            }

            if (var2.id_case(2)) {
               var2.id_throws();
               if (var2.id_case()) {
                  return var2.id_class((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[0]);
               }
            }
         } else if ((var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()) {
            return new v_1()
               .id_break(((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).id_byte().stream().map(rrqU_2::id_byte))
               .id_break()
               .id_class(var2.id_extends())
               .id_protected();
         }

         return Stream.empty();
      }
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("blockesp"),
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
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("> %s%s add <имя> <цвет> - добавить блок в список"),
         new String("> %s%s remove <имя> - удалить блок из списка"),
         new String("> %s%s clear - очистить список блоков"),
         new String("> %s%s list - просмотреть список блоков"),
         new String(""),
         new String("Пример: %s%s add diamond_ore cyan")
      };
   }

   private static void id_finally() {
      id_catch = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> <цвет> - добавить блок в список".formatted(var2, var1),
         "> %s%s remove <имя> - удалить блок из списка".formatted(var2, var1),
         "> %s%s clear - очистить список блоков".formatted(var2, var1),
         "> %s%s list - просмотреть список блоков".formatted(var2, var1),
         "",
         "Пример: %s%s add diamond_ore cyan".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_throws = new short[5];
   }

   @Override
   public String id_implements() {
      return "Команда для добавления кастомных блоков в \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().J().id_final() + "\"";
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }
}
