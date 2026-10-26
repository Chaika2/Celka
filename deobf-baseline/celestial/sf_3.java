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
      String[] var10002 = new String[id_case[0]];
      var10002[id_case[1]] = id_throws[0];
      super(var1, var10002);
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
      rc_3 var3 = ((C_case)this.id_class[id_break[0]]).id_import();
      if (var2.id_final()) {
         String[] var10000 = new String[id_catch[0]];
         var10000[id_case[2]] = id_throws[1];
         var10000[id_case[3]] = id_throws[2];
         var10000[id_catch[1]] = id_throws[3];
         if (Arrays.asList(var10000).contains(var2.id_implements())) {
            var2.id_class(id_case[4]);
            if (var3.id_private() != null) {
               var3.id_class(null);
               this.id_case(id_throws[4]);
            } else {
               this.id_case(id_throws[5]);
            }

            return;
         }
      }

      var2.id_class(id_catch[2]);
      rU_2 var4 = ((C_case)this.id_class[id_break[1]]).id_throw().id_volatile();
      rP_2 var5 = var2.id_break((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[id_break[2]], var4);
      var3.id_class(var5);
      String var10001 = id_throws[6];
      Object[] var10002 = new Object[id_case[5]];
      var10002[id_case[6]] = var5.toString();
      this.id_case(String.format(var10001, var10002));
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      v_1 var3 = new v_1();
      if (var2.id_case()) {
         String[] var10001 = new String[id_catch[3]];
         var10001[id_case[7]] = id_throws[7];
         var10001[id_case[8]] = id_throws[8];
         var10001[id_catch[4]] = id_throws[9];
         var10001[id_catch[5]] = id_throws[10];
         var3.id_break(var10001);
      } else if (var2.id_catch(id_catch[6])) {
         while (var2.id_break(id_catch[7]) && var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[id_break[3]]) != null) {
            var2.id_throws();
            if (!var2.id_break(id_catch[8])) {
               String[] var4 = new String[id_case[9]];
               var4[id_case[10]] = id_throws[11];
               var3.id_break(var4);
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
      String[] var10000 = new String[id_catch[9]];
      var10000[id_case[11]] = id_throws[13];
      var10000[id_case[12]] = id_throws[14];
      var10000[id_catch[10]] = id_throws[15];
      var10000[id_catch[11]] = id_throws[16];
      var10000[id_catch[12]] = id_throws[17];
      var10000[id_catch[13]] = id_throws[18];
      var10000[id_catch[14]] = id_throws[19];
      var10000[id_catch[15]] = id_throws[20];
      var10000[id_catch[16]] = id_throws[21];
      var10000[id_catch[17]] = id_throws[22];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new byte[]{3, 2, 3, 4, 2, 3, 3, 2, 2, 10, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   @Override
   public boolean id_case() {
      return id_case[13];
   }

   @Override
   public String id_implements() {
      return id_throws[12];
   }

   private static void id_protected() {
      id_break = new short[4];
   }
}
