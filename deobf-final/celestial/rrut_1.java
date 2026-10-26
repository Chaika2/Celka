package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrut_1 extends C_try {
   private static byte[] break_;
   private static boolean[] throws_;
   private static short[] case_;
   private static String[] catch_;

   public rrut_1(C_case var1) {
      super(var1, "autobuy");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2904340654643968808L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.extends_().toLowerCase();

      ((rruq_1)(switch (var3) {
         case "save" -> new rruI();
         case "reload" -> new rruw_1();
         default -> throw new W(var2.throws_(), "save", "reload");
      })).class_(var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 510550283;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return var2.case_() ? new v_1().break_("save", "reload").class_(var2.extends_()).protected_() : Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 69, 117, 106, -87, 42, -6, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new boolean[]{true, false, false, true, false, true, false, false, true, false, true};
   }

   private static void finally_() {
      catch_ = new String[]{
         new String("autobuy"),
         new String("save"),
         new String("reload"),
         new String("save"),
         new String("reload"),
         new String("save"),
         new String("reload"),
         new String("Команда для работы с авто. покупкой"),
         new String("> %s%s save - сохраняет настройку предметов авто. покупки"),
         new String("> %s%s reload - перезагружает настройку предметов для авто. покупки")
      };
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s save - сохраняет настройку предметов авто. покупки".formatted(var2, var1),
         "> %s%s reload - перезагружает настройку предметов для авто. покупки".formatted(var2, var1)
      );
   }

   private static void extends_() {
      case_ = new short[1];
   }

   @Override
   public String implements_() {
      return "Команда для работы с авто. покупкой";
   }

   private static void protected_() {
      break_ = new byte[]{-1, 2, 2, 2};
   }
}
