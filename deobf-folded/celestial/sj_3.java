package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sj_3 extends C_try {
   private static String[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public sj_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_catch[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2292656314244847957L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      if (var2.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[id_case[0]]) != null) {
         var2.id_class(3);
         rU_2 var5 = ((C_case)this.id_class[id_case[1]]).id_throw().id_volatile();
         rP_2 var4 = var2.id_break((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[id_case[2]], var5);
         String var10001 = id_break[1];
         Object[] var10002 = new Object[1];
         var10002[id_catch[3]] = var4.toString();
         this.id_case(String.format(var10001, var10002));
         ((C_case)this.id_class[id_case[3]]).id_import().id_break(var4);
      } else {
         var2.id_class(1);
         re_3 var3 = var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[4]]);
         ((C_case)this.id_class[id_case[5]]).id_super().id_class(var3);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1098455967;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -114, -97, 65, -111, 6, -8, 81}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return var2.id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_case[6]]);
   }

   private static void id_throws() {
      id_break = new String[]{
         new String("goto"),
         new String("Идем к: %s"),
         new String("Идти к координатам или блоку"),
         new String("Команда \"goto\" указывает Baritone направиться к заданной цели или блоку."),
         new String(""),
         new String(
            "Везде, где ожидаются координаты, вы можете использовать ~, как в обычных командах Minecraft. Или вы можете просто использовать обычные числа."
         ),
         new String(""),
         new String("Использование:"),
         new String("> goto <block> - Идти к блоку, где бы он ни находился."),
         new String("> goto <y> - Идти на Y координату"),
         new String("> goto <x> <z> - Идти к X,Z координатам"),
         new String("> goto <x> <y> <z> - Идти к X,Y,Z координатам")
      };
   }

   private static void id_finally() {
      id_throws = new byte[]{3, 9, 2, 3, 4, 5, 6, 7, 8};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[9];
      var10000[id_catch[5]] = id_break[3];
      var10000[1] = id_break[4];
      var10000[2] = id_break[5];
      var10000[3] = id_break[6];
      var10000[4] = id_break[7];
      var10000[5] = id_break[8];
      var10000[6] = id_break[9];
      var10000[7] = id_break[10];
      var10000[8] = id_break[11];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new boolean[]{true, false, true, false, true, false, true, true};
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_break[2];
   }

   private static void id_protected() {
      id_case = new short[7];
   }
}
