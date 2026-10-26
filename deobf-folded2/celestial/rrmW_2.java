package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmW_2 extends C_try {
   private static boolean[] id_break;
   private static String[] id_throws;
   private static short[] id_case;
   private static byte[] id_catch;

   public rrmW_2(C_case var1) {
      super(var1, "nuker");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1373056493;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9197390664580066008L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmz_3();
         case "remove", "delete" -> new rrmu_3();
         case "clear" -> new rrmN_2();
         case "list" -> new rrmc_3(this);
         default -> throw new W(var2.id_throws(), "add, remove, clear, list");
      })).id_class(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 10, -126, -95, -12, 112, -25, -26}, "DES");
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
               return var2.id_class((rrmQ_2)rrmQ_2.staticFieldsfc1bbf6223bd333fa50da06439bdcc78[0]);
            }
         } else if ((var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()) {
            return new v_1()
               .id_break(((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).id_byte().stream().map(var0 -> ri_3.id_class(var0)))
               .id_break()
               .id_class(var2.id_extends())
               .id_protected();
         }

         return Stream.empty();
      }
   }

   private static void id_throws() {
      id_catch = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
   }

   private static void id_finally() {
      id_throws = new String[]{
         new String("nuker"),
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
         new String("> %s%s add <имя> - добавить блок в список"),
         new String("> %s%s remove <имя> - удалить блок из списка"),
         new String("> %s%s clear - очистить список блоков"),
         new String("> %s%s list - просмотреть список блоков"),
         new String(""),
         new String("Пример: %s%s add diamond_ore")
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s add <имя> - добавить блок в список".formatted(var2, var1),
         "> %s%s remove <имя> - удалить блок из списка".formatted(var2, var1),
         "> %s%s clear - очистить список блоков".formatted(var2, var1),
         "> %s%s list - просмотреть список блоков".formatted(var2, var1),
         "",
         "Пример: %s%s add diamond_ore".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_case = new short[4];
   }

   @Override
   public String id_implements() {
      return "Команда для добавления блоков в \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_class().id_final() + "\"";
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }
}
