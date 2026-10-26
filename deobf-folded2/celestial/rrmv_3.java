package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmv_3 extends C_instanceof {
   private static boolean[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;
   private static long[] id_private;
   private static short[] id_implements;

   public rrmv_3(C_case var1) {
      super(var1, Duration.ofMinutes(2L), "report", "rep");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_class(" ", 0);
      if (var3.isEmpty()) {
         rrfu_3.id_byte("Укажите содержимое репорта");
      } else {
         ((rrvu_1)rrvu_1.staticFields795d62f6fe74334786edf14455ec3bfd[0])
            .id_class((rrZr_1)rrQJ.id_class[5], var3, () -> rrfu_3.id_byte("Репорт успешно отправлен"));
         super.id_class(var1, var2);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 612186268;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3099951084991375098L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void id_finally() {
      id_private = new long[]{2L};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of("> %s%s <содержимое>".formatted(var2, var1));
   }

   private static void id_extends() {
      id_catch = new byte[]{2, 2};
   }

   @Override
   public String id_implements() {
      return "Команда для отправления репортов";
   }

   private static void id_package() {
      id_case = new String[]{
         new String("report"),
         new String("rep"),
         new String(" "),
         new String("Укажите содержимое репорта"),
         new String("Команда для отправления репортов"),
         new String("> %s%s <содержимое>"),
         new String("Репорт успешно отправлен")
      };
   }

   public static String id_private(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 65, -86, -26, 80, -31, -87, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_throws = new boolean[]{false, true, false, false, false, true};
   }

   private static void id_volatile() {
      id_implements = new short[]{0, 5, 0};
   }
}
