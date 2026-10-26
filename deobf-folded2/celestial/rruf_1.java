package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruf_1 extends C_try {
   private static String[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public rruf_1(C_case var1) {
      super(var1, "bind");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7446882825252697563L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1431519803;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_extends().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "resetall" -> new rruV();
         case "list" -> new rruj_1(this);
         default -> throw new W(var2.id_throws(), "resetall, list");
      })).id_class(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -98, 28, -42, -117, -81, 102, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return var2.id_case() ? new v_1().id_break("resetall", "list").id_class(var2.id_extends()).id_protected() : Stream.empty();
   }

   private static void id_throws() {
      id_catch = new short[1];
   }

   private static void id_finally() {
      id_throws = new boolean[]{true, false, false, true, false, true, false, false, true, false, true};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s resetall - сбрасывает все бинды на дефолтные значения".formatted(var2, var1), "> %s%s list - посмотреть список биндов".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_break = new String[]{
         new String("bind"),
         new String("resetall"),
         new String("list"),
         new String("resetall, list"),
         new String("resetall"),
         new String("list"),
         new String("Команда для настройки биндов"),
         new String("> %s%s resetall - сбрасывает все бинды на дефолтные значения"),
         new String("> %s%s list - посмотреть список биндов")
      };
   }

   @Override
   public String id_implements() {
      return "Команда для настройки биндов";
   }

   private static void id_protected() {
      id_case = new byte[]{-1, 2, 2, 2};
   }
}
