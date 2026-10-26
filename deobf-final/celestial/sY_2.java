package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sY_2 extends C_try {
   private static String[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static short[] catch_;

   public sY_2(C_case var1) {
      super(var1, "mine");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      int var3 = var2.byte_(Integer.class, Integer.valueOf(0));
      var2.private_(1);
      ArrayList var4 = new ArrayList();

      while (var2.final_()) {
         var4.add((re_3)var2.break_((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[0]));
      }

      ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[0]).class_((Ps_1)this.class_[1]);
      this.case_(String.format("Копаем %s", var4));
      ((C_case)this.class_[0]).case_().class_(var3, var4.toArray(new re_3[0]));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1759180990;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7640027867007280878L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return var2.class_((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[0]);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -84, 60, 93, 53, 118, -89, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new short[]{0, 0, 1, 0, 0};
   }

   private static void finally_() {
      break_ = new String[]{
         new String("mine"),
         new String("Копаем %s"),
         new String("Копает выбранные блоки"),
         new String("Команда \"mine\" позволяет указать Baritone искать и добывать выбранные блоки."),
         new String(""),
         new String("Указанные блоки могут быть рудами или любыми другими блоками."),
         new String(""),
         new String("Использование:"),
         new String("> mine diamond_ore - Копает все алмазы которые найдет.")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"mine\" позволяет указать Baritone искать и добывать выбранные блоки.",
         "",
         "Указанные блоки могут быть рудами или любыми другими блоками.",
         "",
         "Использование:",
         "> mine diamond_ore - Копает все алмазы которые найдет."
      );
   }

   private static void extends_() {
      throws_ = new boolean[]{true, false, false, true, true, false, false, false, true, true};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Копает выбранные блоки";
   }

   private static void protected_() {
      case_ = new byte[]{6, 2, 3, 4, 5};
   }
}
