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
   private static String[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public sY_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_throws[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      int var3 = var2.id_byte(Integer.class, Integer.valueOf(id_throws[2]));
      var2.id_private(1);
      ArrayList var4 = new ArrayList();

      while (var2.id_final()) {
         var4.add((re_3)var2.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_catch[0]]));
      }

      ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_catch[1]]).id_class((Ps_1)this.id_class[1]);
      String var10001 = id_break[1];
      Object[] var10002 = new Object[1];
      var10002[id_throws[5]] = var4;
      this.id_case(String.format(var10001, var10002));
      ((C_case)this.id_class[id_catch[3]]).id_case().id_class(var3, var4.toArray(new re_3[id_throws[6]]));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1759180990;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7640027867007280878L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return var2.id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_catch[4]]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -84, 60, 93, 53, 118, -89, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new short[]{0, 0, 1, 0, 0};
   }

   private static void id_finally() {
      id_break = new String[]{
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
   public List<String> id_catch() {
      String[] var10000 = new String[6];
      var10000[id_throws[7]] = id_break[3];
      var10000[1] = id_break[4];
      var10000[2] = id_break[5];
      var10000[3] = id_break[6];
      var10000[4] = id_break[7];
      var10000[5] = id_break[8];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new boolean[]{true, false, false, true, true, false, false, false, true, true};
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
      id_case = new byte[]{6, 2, 3, 4, 5};
   }
}
