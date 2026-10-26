package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmF_2 extends C_try {
   private static String[] break_;
   private static short[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;

   public rrmF_2(C_case var1) {
      super(var1, "staff");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8827193524046009597L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1412327816;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmL_2();
         case "remove", "delete" -> new rrml_3();
         case "clear" -> new rrmA_2();
         case "list" -> new rrmn_3(this);
         case "reload" -> new rrmC_2();
         default -> throw new W(var2.throws_(), "add, remove, clear, list, reload");
      })).class_(var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -45, -86, 48, 3, 78, 93, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("add", "remove", "clear", "list", "reload").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()
            ? new v_1()
               .break_(((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).byte_().stream())
               .class_(var2.implements_())
               .break_()
               .protected_()
            : Stream.empty();
      }
   }

   private static void throws_() {
      break_ = new String[]{
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

   private static void finally_() {
      case_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
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

   private static void extends_() {
      catch_ = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }

   @Override
   public String implements_() {
      return "Команда для добавления уникального персонала";
   }

   private static void protected_() {
      throws_ = new short[2];
   }
}
