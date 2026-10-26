package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmY_2 extends C_try {
   private static byte[] break_;
   private static String[] throws_;
   private static short[] case_;
   private static boolean[] catch_;

   public rrmY_2(C_case var1) {
      super(var1, "xray");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -252061162;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmo_3();
         case "remove", "delete" -> new rrme_3();
         case "clear" -> new rrmD_2();
         case "list" -> new rrmU_2(this);
         case "stop" -> new rrma_3(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list, stop");
      })).class_(var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -96705694154325325L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 73, -126, 39, -8, 93, -50, -71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("add", "remove", "clear", "list", "stop").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         if (var3.equalsIgnoreCase("add")) {
            if (var2.case_()) {
               return var2.class_((rrmK_2)rrmK_2.staticFields917222c690e13acf9dc05da7a804490a[0]);
            }

            if (var2.case_(2)) {
               var2.throws_();
               if (var2.case_()) {
                  return new v_1().break_(Stream.of(rruK.values()).map(rruK::class_)).class_(var2.extends_()).protected_();
               }
            }
         } else if ((var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()) {
            return new v_1()
               .break_(((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_().stream().map(rrqz_3::break_))
               .break_()
               .class_(var2.extends_())
               .protected_();
         }

         return Stream.empty();
      }
   }

   private static void throws_() {
      catch_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true};
   }

   private static void finally_() {
      throws_ = new String[]{
         new String("xray"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("clear"),
         new String("list"),
         new String("stop"),
         new String("add, remove, clear, list, stop"),
         new String("add"),
         new String("remove"),
         new String("clear"),
         new String("list"),
         new String("stop"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("> %s%s add <имя> <цвет> - добавить блок в список"),
         new String("> %s%s remove <имя> - удалить блок из списка"),
         new String("> %s%s clear - очистить список блоков"),
         new String("> %s%s list - просмотреть список блоков"),
         new String("> %s%s stop - остановить работу X-Ray (повторное использование возобновит)"),
         new String(""),
         new String("Пример: %s%s add diamond_ore cyan")
      };
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
         "> %s%s stop - остановить работу X-Ray (повторное использование возобновит)".formatted(var2, var1),
         "",
         "Пример: %s%s add diamond_ore cyan".formatted(var2, var1)
      );
   }

   private static void extends_() {
      case_ = new short[4];
   }

   @Override
   public String implements_() {
      return "Команда для добавления блоков в \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().x().final_() + "\"";
   }

   private static void protected_() {
      break_ = new byte[]{-1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2, 2};
   }
}
