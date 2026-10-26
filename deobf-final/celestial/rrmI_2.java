package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmI_2 extends C_try {
   private static boolean[] break_;
   private static byte[] throws_;
   private static short[] case_;
   private static double[] catch_;
   private static float[] private_;
   private static String[] implements_;

   private static void int_() {
      catch_ = new double[]{-1.8F, 2.0, 255.0, 0.5, 0.0, 0.0, 0.0, 0.5, 0.0, 2.0};
   }

   public rrmI_2(C_case var1) {
      super(var1, "vclip");
   }

   static {
      ntfClinit();
   }

   private void class_(double var1) {
      protected_();
      ((cb_3)b_.class_[57]).int_(((cb_3)b_.class_[57]).rx(), var1, ((cb_3)b_.class_[57]).BO());
      protected_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3083304646639701282L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      String var3 = var2.implements_().toLowerCase();
      switch (var3) {
         case "up":
            this.package_();
            break;
         case "down":
            this.final_();
            break;
         case "bedrock":
         case "bd":
            this.volatile_();
            break;
         default:
            if (var2.final_()) {
               double var5 = var2.protected_(Double.class);
               this.class_(((cb_3)b_.class_[57]).re() + var5);
            }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1109568460;
   }

   private double class_(rfH_2 var1) {
      rfl_3 var2 = rrjc_3.break_(var1);
      return var2.throws_ - var2.break_;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -63, -34, 56, 103, -81, -76, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean break_(double var1) {
      rfl_3 var3 = ((cb_3)b_.class_[57]).rN();
      return ((gm_3)b_.class_[56]).a_((cb_3)b_.class_[57], var3.protected_(0.0, var1 - ((cb_3)b_.class_[57]).re(), 0.0))
            && !((gm_3)b_.class_[56]).a_((cb_3)b_.class_[57], var3.protected_(0.0, var1 - ((cb_3)b_.class_[57]).re() - 0.5, 0.0))
         ? true
         : break_[14];
   }

   private static void throws_() {
      case_ = new short[]{57, 57, 57, 57, 57, 0, 57, 56, 57, 57, 56, 57, 57, 57, 57, 57};
   }

   private static void finally_() {
      implements_ = new String[]{
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
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of(
         "> %s%s <значение> - телепортирует вас на указанное количество блоков".formatted(var2, var1),
         "> %s%s up - телепортирует вас на самый верхний блок перед воздухом".formatted(var2, var1),
         "> %s%s down - телепортирует вас на самый нижний блок под воздухом".formatted(var2, var1),
         "> %s%s bedrock - телепортирует вас под бедрок".formatted(var2, var1)
      );
   }

   private static void extends_() {
      break_ = new boolean[]{true, false, false, true, false, false, true, false, true, false, true, false, true, true, false};
   }

   private rfH_2 continue_() {
      for (int var1 = (int)(((cb_3)b_.class_[57]).re() - 2.0); var1 > 0; var1--) {
         rfH_2 var2 = new rfH_2(((cb_3)b_.class_[57]).rx(), (double)var1, ((cb_3)b_.class_[57]).BO());
         if (this.break_((double)var1 + this.class_(var2))) {
            return var2;
         }
      }

      return null;
   }

   @Override
   public String implements_() {
      return "Команда для телепорта по Y координате";
   }

   private static void new_() {
      throws_ = new byte[]{-1, 2, 3, 2, 2, 2, 2};
   }

   private void package_() {
      float var1 = 0.0F;

      for (double var2 = ((cb_3)b_.class_[57]).re() + 2.0; var2 < 255.0; var2 += 0.5) {
         if (this.break_(var2)) {
            var1 = (float)var2;
            break;
         }
      }

      if (var1 == 0.0F) {
         rrfu_3.byte_("Не удалось найти блок над вами!");
      } else {
         this.class_((double)var1);
      }
   }

   public static void protected_() {
   }

   private void final_() {
      rfH_2 var1 = this.continue_();
      if (var1 == null) {
         rrfu_3.byte_("Не удалось найти блок под вами!");
      } else {
         this.class_((double)((float)((double)var1.c_() + this.class_(var1))));
      }
   }

   private void volatile_() {
      this.class_(-1.8F);
   }

   private static void native_() {
      private_ = new float[2];
   }
}
