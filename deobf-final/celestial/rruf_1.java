package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruf_1 extends C_try {
   private static String[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static short[] catch_;

   public rruf_1(C_case var1) {
      super(var1, "bind");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7446882825252697563L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1431519803;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "resetall" -> new rruV();
         case "list" -> new rruj_1(this);
         default -> throw new W(var2.throws_(), "resetall, list");
      })).class_(var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -98, 28, -42, -117, -81, 102, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return var2.case_() ? new v_1().break_("resetall", "list").class_(var2.extends_()).protected_() : Stream.empty();
   }

   private static void throws_() {
      catch_ = new short[1];
   }

   private static void finally_() {
      throws_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s resetall - сбрасывает все бинды на дефолтные значения".formatted(var2, var1), "> %s%s list - посмотреть список биндов".formatted(var2, var1)
      );
   }

   private static void extends_() {
      break_ = new String[]{
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
   public String implements_() {
      return "Команда для настройки биндов";
   }

   private static void protected_() {
      case_ = new byte[]{-1, 2, 2, 2};
   }
}
