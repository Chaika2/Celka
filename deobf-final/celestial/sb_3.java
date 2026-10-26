package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sb_3 extends C_try {
   private static short[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static String[] catch_;

   public sb_3(C_case var1) {
      super(var1, "axis", "highway");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      rB_2 var3 = new rB_2();
      ((C_case)this.class_[0]).import_().class_(var3);
      this.case_(String.format("Goal: %s", var3.toString()));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 690878563922051451L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 665658149;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 16, -123, -114, 31, -41, -60, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new String[]{
         new String("axis"),
         new String("highway"),
         new String("Goal: %s"),
         new String("Set a goal to the axes"),
         new String("The axis command sets a goal that tells Baritone to head towards the nearest axis. That is, X=0 or Z=0."),
         new String(""),
         new String("Usage:"),
         new String("> axis")
      };
   }

   private static void finally_() {
      throws_ = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("The axis command sets a goal that tells Baritone to head towards the nearest axis. That is, X=0 or Z=0.", "", "Usage:", "> axis");
   }

   private static void extends_() {
      case_ = new byte[]{2, 4, 2, 3};
   }

   @Override
   public String implements_() {
      return "Set a goal to the axes";
   }

   private static void protected_() {
      break_ = new short[1];
   }
}
