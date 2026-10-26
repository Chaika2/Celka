package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sf_3 extends C_try {
   private static short[] break_;
   private static String[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;

   public sf_3(C_case var1) {
      super(var1, "goal");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6999669426968694151L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1330502729;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      rc_3 var3 = ((C_case)this.class_[0]).import_();
      if (var2.final_() && Arrays.asList("reset", "clear", "none").contains(var2.implements_())) {
         var2.class_(1);
         if (var3.private_() != null) {
            var3.class_(null);
            this.case_("Цель очищена");
         } else {
            this.case_("Нету цели чтобы ее очистить");
         }
      } else {
         var2.class_(3);
         rU_2 var4 = ((C_case)this.class_[0]).throw_().volatile_();
         rP_2 var5 = var2.break_((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[0], var4);
         var3.class_(var5);
         this.case_(String.format("Goal: %s", var5.toString()));
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      v_1 var3 = new v_1();
      if (var2.case_()) {
         var3.break_("reset", "clear", "none", "~");
      } else if (var2.catch_(3)) {
         while (var2.break_(2) && var2.class_((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) != null) {
            var2.throws_();
            if (!var2.break_(2)) {
               var3.break_("~");
            }
         }
      }

      return var3.class_(var2.extends_()).protected_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, 88, 39, -77, 79, -53, -54, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      case_ = new boolean[]{true, false, false, true, true, true, false, false, true, true, false, false, true, true};
   }

   private static void finally_() {
      throws_ = new String[]{
         new String("goal"),
         new String("reset"),
         new String("clear"),
         new String("none"),
         new String("Цель очищена"),
         new String("Нету цели чтобы ее очистить"),
         new String("Goal: %s"),
         new String("reset"),
         new String("clear"),
         new String("none"),
         new String("~"),
         new String("~"),
         new String("Устанавливает или убирает путь до точки"),
         new String("Команда \"goal\" позволяет установить или снять цель Baritone."),
         new String(""),
         new String(
            "Везде, где ожидаются координаты, вы можете использовать ~, как в обычных командах Minecraft. Или вы можете просто использовать обычные числа."
         ),
         new String(""),
         new String("Использование:"),
         new String("> goal - Установить путь в соответствии с вашим текущим положением"),
         new String("> goal <reset/clear/none> - Стереть цель"),
         new String("> goal <y> - Установите путь на уровне Y"),
         new String("> goal <x> <z> - Установить цель в положение X,Z"),
         new String("> goal <x> <y> <z> - Установить цель в положение X,Y,Z")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"goal\" позволяет установить или снять цель Baritone.",
         "",
         "Везде, где ожидаются координаты, вы можете использовать ~, как в обычных командах Minecraft. Или вы можете просто использовать обычные числа.",
         "",
         "Использование:",
         "> goal - Установить путь в соответствии с вашим текущим положением",
         "> goal <reset/clear/none> - Стереть цель",
         "> goal <y> - Установите путь на уровне Y",
         "> goal <x> <z> - Установить цель в положение X,Z",
         "> goal <x> <y> <z> - Установить цель в положение X,Y,Z"
      );
   }

   private static void extends_() {
      catch_ = new byte[]{3, 2, 3, 4, 2, 3, 3, 2, 2, 10, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Устанавливает или убирает путь до точки";
   }

   private static void protected_() {
      break_ = new short[4];
   }
}
