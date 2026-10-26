package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrms_3 extends C_try {
   private static String[] break_;
   private static short[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;

   public rrms_3(C_case var1) {
      super(var1, "friend", "friends");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -530749665;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmE_2();
         case "remove", "delete" -> new rrmM_2();
         case "clear" -> new rrmG_2();
         case "list" -> new rrmb_3(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list");
      })).class_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6246975200740797459L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("add", "remove", "clear", "list").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()
            ? new v_1()
               .break_(((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_().values().stream().map(rrZk_1::class_))
               .class_(var2.implements_())
               .break_()
               .protected_()
            : Stream.empty();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -11, -65, 44, 32, 68, -36, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new short[2];
   }

   private static void finally_() {
      case_ = new boolean[]{false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s add <имя> - добавить друга".formatted(var2, var1),
         "> %s%s remove/delete <имя> - удалить друга".formatted(var2, var1),
         "> %s%s clear - очистить список друзей".formatted(var2, var1),
         "> %s%s list - посмотреть список друзей".formatted(var2, var1),
         "",
         "Пример: %s%s add Smertnix".formatted(var2, var1)
      );
   }

   private static void extends_() {
      catch_ = new byte[]{2, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2};
   }

   @Override
   public String implements_() {
      return "Команда для добавления друзей";
   }

   private static void protected_() {
      break_ = new String[]{
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
