package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmX_2 extends C_try {
   private static boolean[] break_;
   private static byte[] throws_;
   private static String[] case_;
   private static short[] catch_;

   public rrmX_2(C_case var1) {
      super(var1, "macro", "macros");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmJ_2();
         case "remove", "delete" -> new rrmk_3();
         case "clear" -> new rrmx_3();
         case "list" -> new rrmd_3(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list");
      })).class_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1418360071;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3404341564998629113L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("add", "remove", "clear", "list").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         return !var3.equalsIgnoreCase("remove") && !var3.equalsIgnoreCase("delete")
            ? Stream.empty()
            : new v_1()
               .break_(((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[0]).byte_().stream().map(rrvm_1::byte_))
               .class_(var2.implements_())
               .break_()
               .protected_();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{114, 17, -120, 101, 108, -8, 108, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2};
   }

   private static void finally_() {
      break_ = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
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

   private static void extends_() {
      catch_ = new short[2];
   }

   @Override
   public String implements_() {
      return "Команда для добавления макросов";
   }

   private static void protected_() {
      case_ = new String[]{
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
