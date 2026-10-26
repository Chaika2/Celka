package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmW_2 extends C_try {
   private static boolean[] break_;
   private static String[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public rrmW_2(C_case var1) {
      super(var1, "nuker");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1373056493;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9197390664580066008L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmz_3();
         case "remove", "delete" -> new rrmu_3();
         case "clear" -> new rrmN_2();
         case "list" -> new rrmc_3(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list");
      })).class_(var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 10, -126, -95, -12, 112, -25, -26}, "DES");
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
               return var2.class_((rrmQ_2)rrmQ_2.staticFieldsfc1bbf6223bd333fa50da06439bdcc78[0]);
            }
         } else if ((var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()) {
            return new v_1()
               .break_(((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).byte_().stream().map(var0 -> ri_3.class_(var0)))
               .break_()
               .class_(var2.extends_())
               .protected_();
         }

         return Stream.empty();
      }
   }

   private static void throws_() {
      catch_ = new byte[]{-1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
   }

   private static void finally_() {
      throws_ = new String[]{
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
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s add <имя> - добавить блок в список".formatted(var2, var1),
         "> %s%s remove <имя> - удалить блок из списка".formatted(var2, var1),
         "> %s%s clear - очистить список блоков".formatted(var2, var1),
         "> %s%s list - просмотреть список блоков".formatted(var2, var1),
         "",
         "Пример: %s%s add diamond_ore".formatted(var2, var1)
      );
   }

   private static void extends_() {
      case_ = new short[4];
   }

   @Override
   public String implements_() {
      return "Команда для добавления блоков в \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().class_().final_() + "\"";
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }
}
