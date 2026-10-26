package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sQ_2 extends C_try {
   private static boolean[] break_;
   private static String[] throws_;
   private static byte[] case_;
   private static double[] catch_;
   private static short[] private_;

   public sQ_2(C_case var1) {
      super(var1, "eta");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4929799806815856944L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 200676705;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rr_3 var3 = ((C_case)this.class_[0]).goto_();
      rz_3 var4 = var3.protected_().orElse(null);
      if (var4 == null) {
         throw new k_1("No process in control");
      } else {
         C_final var5 = ((C_case)this.class_[0]).this_();
         double var6 = var5.extends_().orElse(Double.NaN);
         double var8 = var5.class_().orElse(Double.NaN);
         this.case_(String.format("Next segment: %.1fs (%.0f ticks)\nGoal: %.1fs (%.0f ticks)", var6 / 20.0, var6, var8 / 20.0, var8));
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -15, 42, 74, -61, -23, -51, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("eta"),
         new String("No process in control"),
         new String("Next segment: %.1fs (%.0f ticks)\nGoal: %.1fs (%.0f ticks)"),
         new String("View the current ETA"),
         new String("The ETA command provides information about the estimated time until the next segment."),
         new String("and the goal"),
         new String(""),
         new String("Be aware that the ETA to your goal is really unprecise"),
         new String(""),
         new String("Usage:"),
         new String("> eta - View ETA, if present")
      };
   }

   private static void finally_() {
      case_ = new byte[]{4, 2, 3, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The ETA command provides information about the estimated time until the next segment.",
         "and the goal",
         "",
         "Be aware that the ETA to your goal is really unprecise",
         "",
         "Usage:",
         "> eta - View ETA, if present"
      );
   }

   private static void extends_() {
      break_ = new boolean[]{true, false, false, false, true, false, true};
   }

   @Override
   public String implements_() {
      return "View the current ETA";
   }

   private static void protected_() {
      private_ = new short[2];
   }

   private static void native_() {
      catch_ = new double[]{Double.NaN, Double.NaN, 20.0, 20.0};
   }
}
