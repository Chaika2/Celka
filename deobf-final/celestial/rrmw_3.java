package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmw_3 extends C_try {
   private static short[] break_;
   private static double[] throws_;
   private static byte[] case_;
   private static boolean[] catch_;
   private static String[] private_;

   public rrmw_3(C_case var1) {
      super(var1, "tp", "teleport");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         rrfu_3.byte_("Данная команда банится на этом сервере");
      } else {
         var2.private_(1);
         if (var2.case_(1)) {
            String var9 = var2.extends_();
            rhd_3 var10 = ((gm_3)b_.class_[56]).break_(var9);
            if (var10 == null) {
               this.case_("Игрок не найден");
               return;
            }

            double var3 = (double)((float)var10.rx());
            double var5 = (double)((float)var10.re());
            double var7 = (double)((float)var10.BO());
            rrIi_1.class_((rrfB_2)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[2], var3, var5, var7);
         } else {
            boolean var14 = var2.break_(3);
            var2.private_(var14 ? 3 : case_[3]);
            double var11 = var2.catch_(Double.class);
            double var12 = var14 ? var2.catch_(Double.class) : throws_[0];
            double var13 = var2.catch_(Double.class);
            rrIi_1.class_((rrfB_2)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[1], var11, var12, var13);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8733825064801399677L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -324048458;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-4, -100, -69, 86, -114, -96, 34, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new short[]{1, 2, 56, 2, 1, 0};
   }

   private static void finally_() {
      case_ = new byte[]{2, 3, 3, 2, 2, 2};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s <X Y Z> - телепортирует вас на указанные координаты".formatted(var2, var1),
         "> %s%s <ник> - телепортирует вас к игроку в радиусе прорисовки".formatted(var2, var1)
      );
   }

   private static void extends_() {
      catch_ = new boolean[]{false, true, true, true, false, false, true, false, true};
   }

   @Override
   public String implements_() {
      return "Команда для телепорта на указанные координаты";
   }

   private static void protected_() {
      throws_ = new double[]{180.0};
   }

   private static void native_() {
      private_ = new String[]{
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
