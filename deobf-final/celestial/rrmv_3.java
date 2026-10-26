package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmv_3 extends C_instanceof {
   private static boolean[] throws_;
   private static String[] case_;
   private static byte[] catch_;
   private static long[] private_;
   private static short[] implements_;

   public rrmv_3(C_case var1) {
      super(var1, Duration.ofMinutes(2L), "report", "rep");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.class_(" ", 0);
      if (var3.isEmpty()) {
         rrfu_3.byte_("Укажите содержимое репорта");
      } else {
         ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0]).class_((rrZr_1)rrQJ.class_[5], var3, () -> rrfu_3.byte_("Репорт успешно отправлен"));
         super.class_(var1, var2);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 612186268;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3099951084991375098L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void finally_() {
      private_ = new long[]{2L};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of("> %s%s <содержимое>".formatted(var2, var1));
   }

   private static void extends_() {
      catch_ = new byte[]{2, 2};
   }

   @Override
   public String implements_() {
      return "Команда для отправления репортов";
   }

   private static void package_() {
      case_ = new String[]{
         new String("report"),
         new String("rep"),
         new String(" "),
         new String("Укажите содержимое репорта"),
         new String("Команда для отправления репортов"),
         new String("> %s%s <содержимое>"),
         new String("Репорт успешно отправлен")
      };
   }

   public static String private_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 65, -86, -26, 80, -31, -87, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void final_() {
      throws_ = new boolean[]{false, true, false, false, false, true};
   }

   private static void volatile_() {
      implements_ = new short[]{0, 5, 0};
   }
}
