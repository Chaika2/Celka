package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sf_3 extends C_try {
   private static short[] id_break;
   private static String[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public sf_3(C_case var1) {
      super(var1, "goal");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6999669426968694151L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1330502729;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      rc_3 var3 = ((C_case)this.id_class[0]).id_import();
      if (var2.id_final() && Arrays.asList("reset", "clear", "none").contains(var2.id_implements())) {
         var2.id_class(1);
         if (var3.id_private() != null) {
            var3.id_class(null);
            this.id_case("Цель очищена");
         } else {
            this.id_case("Нету цели чтобы ее очистить");
         }
      } else {
         var2.id_class(3);
         rU_2 var4 = ((C_case)this.id_class[0]).id_throw().id_volatile();
         rP_2 var5 = var2.id_break((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[0], var4);
         var3.id_class(var5);
         this.id_case(String.format("Goal: %s", var5.toString()));
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      v_1 var3 = new v_1();
      if (var2.id_case()) {
         var3.id_break("reset", "clear", "none", "~");
      } else if (var2.id_catch(3)) {
         while (var2.id_break(2) && var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[0]) != null) {
            var2.id_throws();
            if (!var2.id_break(2)) {
               var3.id_break("~");
            }
         }
      }

      return var3.id_class(var2.id_extends()).id_protected();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, 88, 39, -77, 79, -53, -54, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_case = new boolean[]{true, false, false, true, true, true, false, false, true, true, false, false, true, true};
   }

   private static void id_finally() {
      id_throws = new String[]{
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
   public List<String> id_catch() {
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

   private static void id_extends() {
      id_catch = new byte[]{3, 2, 3, 4, 2, 3, 3, 2, 2, 10, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return "Устанавливает или убирает путь до точки";
   }

   private static void id_protected() {
      id_break = new short[4];
   }
}
