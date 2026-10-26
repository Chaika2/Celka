package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmf_3 extends C_try {
   private static short[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static String[] catch_;

   public rrmf_3(C_case var1) {
      super(var1, "way", "waypoint", "waypoints", "gps");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4205368710298853079L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmj_3();
         case "remove", "delete" -> new rrmR_2();
         case "clear" -> new rrmV_2();
         case "list" -> new rrmg_3(this);
         default -> throw new W(var2.throws_(), "add, remove, clear, list");
      })).class_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -301820135;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -88, -73, -2, -32, 46, -37, -119}, "DES");
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
         if (var3.equalsIgnoreCase("add") && var2.break_(2)) {
            var2.throws_();
            return var2.class_((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[0]);
         } else {
            return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.case_()
               ? new v_1()
                  .break_(((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).byte_().stream().map(rrjD_2::byte_))
                  .class_(var2.implements_())
                  .break_()
                  .protected_()
               : Stream.empty();
         }
      }
   }

   private static void throws_() {
      case_ = new byte[]{4, 2, 3, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
   }

   private static void finally_() {
      throws_ = new boolean[]{
         false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true, false, true
      };
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s add <имя> - добавить вейпоинт на вашу позицию".formatted(var2, var1),
         "> %s%s add <имя> <x y z> - добавить вейпоинт на указанную позицию".formatted(var2, var1),
         "> %s%s add <x y z> - добавить вейпоинт на указанную позицию без имени".formatted(var2, var1),
         "> %s%s remove <имя> - удалить вейпоинт".formatted(var2, var1),
         "> %s%s clear - удалить все вейпоинты".formatted(var2, var1),
         "> %s%s list - посмотреть список вейпоинтов".formatted(var2, var1),
         "",
         "Пример: %s%s add home 1000 70 -1000".formatted(var2, var1)
      );
   }

   private static void extends_() {
      catch_ = new String[]{
         new String("way"),
         new String("waypoint"),
         new String("waypoints"),
         new String("gps"),
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
         new String("Команда для добавления путей"),
         new String("> %s%s add <имя> - добавить вейпоинт на вашу позицию"),
         new String("> %s%s add <имя> <x y z> - добавить вейпоинт на указанную позицию"),
         new String("> %s%s add <x y z> - добавить вейпоинт на указанную позицию без имени"),
         new String("> %s%s remove <имя> - удалить вейпоинт"),
         new String("> %s%s clear - удалить все вейпоинты"),
         new String("> %s%s list - посмотреть список вейпоинтов"),
         new String(""),
         new String("Пример: %s%s add home 1000 70 -1000")
      };
   }

   @Override
   public String implements_() {
      return "Команда для добавления путей";
   }

   private static void protected_() {
      break_ = new short[3];
   }
}
