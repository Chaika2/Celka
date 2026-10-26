package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmI_2 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static double[] id_catch;
   private static float[] id_private;
   private static String[] id_implements;

   private static void id_int() {
      id_catch = new double[]{-1.8F, 2.0, 255.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 2.0};
   }

   public rrmI_2(C_case var1) {
      super(var1, "vclip");
   }

   static {
      ntfClinit();
   }

   private void id_class(double var1) {
      id_protected();
      ((cb_3)b_.id_class[57]).id_int(((cb_3)b_.id_class[57]).rx(), var1, ((cb_3)b_.id_class[57]).BO());
      id_protected();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3083304646639701282L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      String var3 = var2.id_implements().toLowerCase();
      switch (var3) {
         case "up":
            this.id_package();
            break;
         case "down":
            this.id_final();
            break;
         case "bedrock":
         case "bd":
            this.id_volatile();
            break;
         default:
            if (var2.id_final()) {
               double var5 = var2.id_protected(Double.class);
               this.id_class(((cb_3)b_.id_class[57]).re() + var5);
            }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1109568460;
   }

   private double id_class(rfH_2 var1) {
      rfl_3 var2 = rrjc_3.id_break(var1);
      return var2.id_throws - var2.id_break;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -63, -34, 56, 103, -81, -76, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_break(double var1) {
      rfl_3 var3 = ((cb_3)b_.id_class[57]).rN();
      return ((gm_3)b_.id_class[56]).a_((cb_3)b_.id_class[57], var3.id_protected(0.0, var1 - ((cb_3)b_.id_class[57]).re(), 0.0))
            && !((gm_3)b_.id_class[56]).a_((cb_3)b_.id_class[57], var3.id_protected(0.0, var1 - ((cb_3)b_.id_class[57]).re() - 0.5, 0.0))
         ? true
         : id_break[14];
   }

   private static void id_throws() {
      id_case = new short[]{57, 57, 57, 57, 57, 0, 57, 56, 57, 57, 56, 57, 57, 57, 57, 57};
   }

   private static void id_finally() {
      id_implements = new String[]{
         new String("vclip"),
         new String("up"),
         new String("down"),
         new String("bedrock"),
         new String("bd"),
         new String("Не удалось найти блок под вами!"),
         new String("Не удалось найти блок над вами!"),
         new String("Команда для телепорта по Y координате"),
         new String("> %s%s <значение> - телепортирует вас на указанное количество блоков"),
         new String("> %s%s up - телепортирует вас на самый верхний блок перед воздухом"),
         new String("> %s%s down - телепортирует вас на самый нижний блок под воздухом"),
         new String("> %s%s bedrock - телепортирует вас под бедрок")
      };
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of(
         "> %s%s <значение> - телепортирует вас на указанное количество блоков".formatted(var2, var1),
         "> %s%s up - телепортирует вас на самый верхний блок перед воздухом".formatted(var2, var1),
         "> %s%s down - телепортирует вас на самый нижний блок под воздухом".formatted(var2, var1),
         "> %s%s bedrock - телепортирует вас под бедрок".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_break = new boolean[]{true, false, false, true, false, false, true, false, true, false, true, false, true, true, false};
   }

   private rfH_2 id_continue() {
      for (int var1 = (int)(((cb_3)b_.id_class[57]).re() - 2.0); var1 > 0; var1--) {
         rfH_2 var2 = new rfH_2(((cb_3)b_.id_class[57]).rx(), (double)var1, ((cb_3)b_.id_class[57]).BO());
         if (this.id_break((double)var1 + this.id_class(var2))) {
            return var2;
         }
      }

      return null;
   }

   @Override
   public String id_implements() {
      return "Команда для телепорта по Y координате";
   }

   private static void id_new() {
      id_throws = new byte[]{-1, 2, 3, 2, 2, 2, 2};
   }

   private void id_package() {
      float var1 = 0.0F;

      for (double var2 = ((cb_3)b_.id_class[57]).re() + 2.0; var2 < 255.0; var2 += 0.5) {
         if (this.id_break(var2)) {
            var1 = (float)var2;
            break;
         }
      }

      if (var1 == 0.0F) {
         rrfu_3.id_byte("Не удалось найти блок над вами!");
      } else {
         this.id_class((double)var1);
      }
   }

   public static void id_protected() {
   }

   private void id_final() {
      rfH_2 var1 = this.id_continue();
      if (var1 == null) {
         rrfu_3.id_byte("Не удалось найти блок под вами!");
      } else {
         this.id_class((double)((float)((double)var1.c_() + this.id_class(var1))));
      }
   }

   private void id_volatile() {
      this.id_class(-1.8F);
   }

   private static void id_native() {
      id_private = new float[2];
   }
}
