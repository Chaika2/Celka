package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sV_2 extends C_try {
   private static boolean[] break_;
   private static short[] throws_;
   private static String[] case_;
   private static byte[] catch_;

   public sV_2(C_case var1) {
      super(var1, "help");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(1);
      ((C_case)this.class_[0]).switch_().class_().byte_().forEach(var1x -> {
         if (!var1x.case_()) {
            String var2x = String.join(case_[6], var1x.break_());
            String var3 = var1x.break_().get(0);
            rgN_2 var4 = new rgN_2(" - " + var1x.implements_());
            var4.class_(var4.class_().class_(rgF_2.GRAY));
            rVe_1 var5 = rrfu_3.class_((Object)var2x).break_();
            var5.class_(var5.class_().class_(rgF_2.WHITE));
            rgN_2 var6 = new rgN_2("");
            var6.class_(var6.class_().class_(rgF_2.GRAY));
            var6.break_(String.join("\n", var1x.catch_()));
            rVe_1 var7 = rrfu_3.class_((Object)var3).break_();
            var7.class_(var7.class_().class_(rgF_2.GRAY));
            var7.class_(var4);
            var7.class_(var7.class_().class_(new rgy_3(rgp_3.class_, var6)));
            var7.class_(var7.class_().class_(new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + var3 + " ")));
            this.class_(new rVi_1[]{var7});
         }
      });
      this.case_("Изменить префикс команд: " + (String)C_class.instanceof_().protected_.class_[0] + "prefix <новый префикс>");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -918085630;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1541806790823489471L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, 66, 19, -93, -42, -55, -126, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   private static void throws_() {
      catch_ = new byte[]{4, 2, 3};
   }

   private static void finally_() {
      case_ = new String[]{
         new String("help"),
         new String("Просмотр всех команд"),
         new String("С помощью этой команды вы можете просмотреть подробную информацию о том, как использовать команды Celestial."),
         new String("Использование:"),
         new String("> help - Перечисляет все команды и их краткие описания."),
         new String("> help <команда> - Отображает информацию по определенной команде."),
         new String("/"),
         new String(""),
         new String("\n")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "С помощью этой команды вы можете просмотреть подробную информацию о том, как использовать команды Celestial.",
         "Использование:",
         "> help - Перечисляет все команды и их краткие описания.",
         "> help <команда> - Отображает информацию по определенной команде."
      );
   }

   private static void extends_() {
      throws_ = new short[3];
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Просмотр всех команд";
   }

   private static void protected_() {
      break_ = new boolean[]{true, false, true, false, true, true, false, true, false};
   }
}
