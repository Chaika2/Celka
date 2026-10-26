package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmf_3 extends C_try {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   public rrmf_3(C_case var1) {
      super(var1, "way", "waypoint", "waypoints", "gps");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4205368710298853079L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "add" -> new rrmj_3();
         case "remove", "delete" -> new rrmR_2();
         case "clear" -> new rrmV_2();
         case "list" -> new rrmg_3(this);
         default -> throw new W(var2.id_throws(), "add, remove, clear, list");
      })).id_class(var2);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -301820135;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{57, -88, -73, -2, -32, 46, -37, -119}, "DES");
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
         if (var3.equalsIgnoreCase("add") && var2.id_break(2)) {
            var2.id_throws();
            return var2.id_class((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[0]);
         } else {
            return (var3.equalsIgnoreCase("remove") || var3.equalsIgnoreCase("delete")) && var2.id_case()
               ? new v_1()
                  .id_break(((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).id_byte().stream().map(rrjD_2::id_byte))
                  .id_class(var2.id_implements())
                  .id_break()
                  .id_protected()
               : Stream.empty();
         }
      }
   }

   private static void id_throws() {
      id_case = new byte[]{4, 2, 3, -1, 2, 3, 4, 4, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2};
   }

   private static void id_finally() {
      id_throws = new boolean[]{
         false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true, false, true
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
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

   private static void id_extends() {
      id_catch = new String[]{
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
   public String id_implements() {
      return "Команда для добавления путей";
   }

   private static void id_protected() {
      id_break = new short[3];
   }
}
