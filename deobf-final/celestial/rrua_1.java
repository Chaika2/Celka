package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrua_1 extends C_try {
   private static byte[] break_;
   private static boolean[] throws_;
   private static short[] case_;
   private static String[] catch_;

   public rrua_1(C_case var1) {
      super(var1, "duel");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2070474338504659207L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();
      byte var6 = -1;
      switch (var3.hashCode()) {
         case 1333012765:
            if (var3.equals("blacklist")) {
               var6 = 0;
            }
         default:
            switch (var6) {
               case 0:
                  String var7 = var2.extends_();

                  ((rruq_1)(switch (var7) {
                     case "add" -> new rrui_1();
                     case "remove", "delete" -> new rrmS_2();
                     case "note" -> new rrmB_2(this);
                     case "clear" -> new rrmr_3();
                     case "list" -> new rrmP_2(this);
                     default -> throw new W(var2.throws_(), "add, remove, clear, list");
                  })).class_(var2);
                  return;
               default:
                  throw new W(var2.throws_(), "blacklist");
            }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1944617046;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, -116, 120, 24, -29, 64, -43, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_("blacklist").class_(var2.extends_()).protected_();
      } else {
         String var3 = var2.extends_();
         if (var3.equalsIgnoreCase("blacklist")) {
            if (var2.native_()) {
               return new v_1().break_("add", "remove", "note", "clear", "list").class_(var2.extends_()).protected_();
            }

            String var4 = var2.extends_();
            if ((var4.equalsIgnoreCase("remove") || var4.equalsIgnoreCase("delete") || var4.equalsIgnoreCase("note")) && var2.case_()) {
               return new v_1()
                  .break_(((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[0]).break_().stream().map(rryk_1::break_))
                  .class_(var2.implements_())
                  .break_()
                  .protected_();
            }
         }

         return Stream.empty();
      }
   }

   private static void throws_() {
      throws_ = new boolean[]{
         true, false, false, false, true, true, false, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true
      };
   }

   private static void finally_() {
      case_ = new short[3];
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s blacklist add <имя> <заметка> - добавить игрока в чёрный список".formatted(var2, var1),
         "> %s%s blacklist remove/delete <имя> - удалить игрока из чёрного списка".formatted(var2, var1),
         "> %s%s blacklist note <имя> - посмотреть заметку игрока в чёрном списке".formatted(var2, var1),
         "> %s%s blacklist clear - очистить чёрный список".formatted(var2, var1),
         "> %s%s blacklist list - посмотреть чёрный список".formatted(var2, var1),
         "",
         "Пример: %s%s blacklist add Smertnix Слишком сильный ;(".formatted(var2, var1)
      );
   }

   private static void extends_() {
      catch_ = new String[]{
         new String("duel"),
         new String("blacklist"),
         new String("add"),
         new String("remove"),
         new String("delete"),
         new String("note"),
         new String("clear"),
         new String("list"),
         new String("add, remove, clear, list"),
         new String("blacklist"),
         new String("blacklist"),
         new String("blacklist"),
         new String("add"),
         new String("remove"),
         new String("note"),
         new String("clear"),
         new String("list"),
         new String("remove"),
         new String("delete"),
         new String("note"),
         new String("> %s%s blacklist add <имя> <заметка> - добавить игрока в чёрный список"),
         new String("> %s%s blacklist remove/delete <имя> - удалить игрока из чёрного списка"),
         new String("> %s%s blacklist note <имя> - посмотреть заметку игрока в чёрном списке"),
         new String("> %s%s blacklist clear - очистить чёрный список"),
         new String("> %s%s blacklist list - посмотреть чёрный список"),
         new String(""),
         new String("Пример: %s%s blacklist add Smertnix Слишком сильный ;(")
      };
   }

   @Override
   public String implements_() {
      return "Команда для управления функцией \"" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().implements_().final_() + "\"";
   }

   private static void protected_() {
      break_ = new byte[]{-1, -1, 2, 3, 4, 5, 5, 2, 3, 4, 2, 2, 2, 2, 2, 2};
   }
}
