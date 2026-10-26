package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sh_3 extends C_try {
   private static byte[] break_;
   private static String[] throws_;
   private static short[] case_;
   private static boolean[] catch_;

   public sh_3(C_case var1) {
      super(var1, "click");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      ((C_case)this.class_[0]).float_();
      this.case_("Выполняю!");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1169788835;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1195758848365917372L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 37, -20, -29, -70, -108, 104, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("click"),
         new String("Выполняю!"),
         new String("Открывает меню с кликом"),
         new String("Команда \"click\" открывает меню где вы можете выбрать любую цель кликнув по ней."),
         new String(""),
         new String("Использование:"),
         new String("> click")
      };
   }

   private static void finally_() {
      catch_ = new boolean[]{true, false, false, false, true, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Команда \"click\" открывает меню где вы можете выбрать любую цель кликнув по ней.", "", "Использование:", "> click");
   }

   private static void extends_() {
      case_ = new short[1];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Открывает меню с кликом";
   }

   private static void protected_() {
      break_ = new byte[]{4, 2, 3};
   }
}
