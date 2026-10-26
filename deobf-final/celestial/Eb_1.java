package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eb_1 extends C_try {
   private static String[] break_;
   private static byte[] throws_;
   private static short[] case_;
   private static boolean[] catch_;

   public Eb_1(C_case var1) {
      super(var1, "surface", "top");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      rU_2 var3 = ((C_case)this.class_[0]).throw_().volatile_();
      int var4 = ((C_case)this.class_[0]).throw_().case_().short_();
      int var5 = ((C_case)this.class_[0]).throw_().case_().try_();
      if (var3.c_() > var4 && ((gm_3)b_.class_[56]).byte_(var3.class_()).break_() instanceof Ja_1) {
         this.case_("Вы уже на поверхности");
      } else {
         int var6 = Math.max(var3.c_(), var4);

         for (int var7 = var6; var7 < var5; var7++) {
            rU_2 var8 = new rU_2(var3.b_(), var7, var3.d_());
            if (!(((gm_3)b_.class_[56]).byte_(var8).break_() instanceof Ja_1) && var8.c_() > var3.c_()) {
               rS_2 var9 = new rS_2(var8.class_());
               this.case_(String.format("Идем к: %s", var9.toString()));
               ((C_case)this.class_[0]).import_().break_(var9);
               return;
            }
         }

         this.case_("Не удалось найти поверхность");
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 381185163;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5096936801780201357L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -43, 37, 12, 105, 103, -35, 124}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      break_ = new String[]{
         new String("surface"),
         new String("top"),
         new String("Вы уже на поверхности"),
         new String("Идем к: %s"),
         new String("Не удалось найти поверхность"),
         new String("Used to get out of caves, mines, ..."),
         new String("The surface/top command tells Baritone to head towards the closest surface-like area."),
         new String(""),
         new String("This can be the surface or the highest available air space, depending on circumstances."),
         new String(""),
         new String("Usage:"),
         new String("> surface - Used to get out of caves, mines, ..."),
         new String("> top - Used to get out of caves, mines, ...")
      };
   }

   private static void finally_() {
      throws_ = new byte[]{2, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The surface/top command tells Baritone to head towards the closest surface-like area.",
         "",
         "This can be the surface or the highest available air space, depending on circumstances.",
         "",
         "Usage:",
         "> surface - Used to get out of caves, mines, ...",
         "> top - Used to get out of caves, mines, ..."
      );
   }

   private static void extends_() {
      catch_ = new boolean[]{false, true, true, false, false, true, true};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Used to get out of caves, mines, ...";
   }

   private static void protected_() {
      case_ = new short[]{0, 0, 0, 56, 56, 0};
   }
}
