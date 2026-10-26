package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrug_1 extends C_try {
   private static boolean[] break_;
   private static short[] throws_;
   private static String[] case_;
   private static byte[] catch_;

   public rrug_1(C_case var1) {
      super(var1, "blockesp");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rruR();
         case "remove", "delete" -> new rrue_1();
         case "clear" -> new rruo_1();
         case "list" -> new rruU(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list");
      })).class_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6728146266041747726L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1451788778;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -102, 96, 58, 93, -38, 14, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("add", "remove", "clear", "list").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         if (var3.equalsIgnoreCase("add")) {
            if (var2.case_()) {
               return var2.class_((rruY)rruY.staticFieldsa8884e3b339234dd911c10ea97845ed5[0]);
            }

            if (var2.case_(2)) {
               var2.throws_();
               if (var2.case_()) {
                  return var2.class_((rruD)rruD.staticFieldsba29985e322c382da8479b6f59b746b0[0]);
               }
            }
         } else if ((var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()) {
            return new v_1()
               .break_(((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[0]).byte_().stream().map(rrqU_2::byte_))
               .break_()
               .class_(var2.extends_())
               .protected_();
         }

         return Stream.empty();
      }
   }

   private static void throws_() {
      case_ = new String[]{
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

   private static void finally_() {
      catch_ = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s add <имя> <цвет> - добавить блок в список".formatted(var2, var1),
         "> %s%s remove <имя> - удалить блок из списка".formatted(var2, var1),
         "> %s%s clear - очистить список блоков".formatted(var2, var1),
         "> %s%s list - просмотреть список блоков".formatted(var2, var1),
         "",
         "Пример: %s%s add diamond_ore cyan".formatted(var2, var1)
      );
   }

   private static void extends_() {
      throws_ = new short[5];
   }

   @Override
   public String implements_() {
      return "Команда для добавления кастомных блоков в \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().J().final_() + "\"";
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }
}
