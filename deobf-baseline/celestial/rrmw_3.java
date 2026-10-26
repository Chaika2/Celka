package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmw_3 extends C_try {
   private static short[] id_break;
   private static double[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;

   public rrmw_3(C_case var1) {
      String[] var10002 = new String[id_case[0]];
      var10002[id_catch[0]] = id_private[0];
      var10002[id_catch[1]] = id_private[1];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      if ((rrfq_3)rrfp_3.id_class[id_break[0]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[1]]) {
         rrfu_3.id_byte(id_private[2]);
      } else {
         var2.id_private(id_catch[2]);
         if (var2.id_case(id_catch[3])) {
            String var9 = var2.id_extends();
            rhd_3 var10 = ((gm_3)b_.id_class[id_break[2]]).id_break(var9);
            if (var10 == null) {
               this.id_case(id_private[3]);
               return;
            }

            double var3 = (double)((float)var10.rx());
            double var5 = (double)((float)var10.re());
            double var7 = (double)((float)var10.BO());
            rrIi_1.id_class((rrfB_2)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[id_break[3]], var3, var5, var7);
         } else {
            boolean var14 = var2.id_break(id_case[1]);
            var2.id_private(var14 ? id_case[2] : id_case[3]);
            double var11 = var2.id_catch(Double.class);
            double var12 = var14 ? var2.id_catch(Double.class) : id_throws[0];
            double var13 = var2.id_catch(Double.class);
            rrIi_1.id_class((rrfB_2)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[id_break[4]], var11, var12, var13);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8733825064801399677L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -324048458;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, -100, -69, 86, -114, -96, 34, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new short[]{1, 2, 56, 2, 1, 0};
   }

   private static void id_finally() {
      id_case = new byte[]{2, 3, 3, 2, 2, 2};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(id_catch[4]);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[5]];
      String var10000 = id_private[5];
      Object[] var10001 = new Object[id_case[4]];
      var10001[id_catch[5]] = var2;
      var10001[id_catch[6]] = var1;
      var10000 = var10000.formatted(var10001);
      String var4 = id_private[6];
      Object[] var10002 = new Object[id_case[5]];
      var10002[id_catch[7]] = var2;
      var10002[id_catch[8]] = var1;
      return List.of(var10000, var4.formatted(var10002));
   }

   private static void id_extends() {
      id_catch = new boolean[]{false, true, true, true, false, false, true, false, true};
   }

   @Override
   public String id_implements() {
      return id_private[4];
   }

   private static void id_protected() {
      id_throws = new double[]{180.0};
   }

   private static void id_native() {
      id_private = new String[]{
         new String("tp"),
         new String("teleport"),
         new String("Данная команда банится на этом сервере"),
         new String("Игрок не найден"),
         new String("Команда для телепорта на указанные координаты"),
         new String("> %s%s <X Y Z> - телепортирует вас на указанные координаты"),
         new String("> %s%s <ник> - телепортирует вас к игроку в радиусе прорисовки")
      };
   }
}
