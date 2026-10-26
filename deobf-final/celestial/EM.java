package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EM extends C_try {
   private static byte[] break_;
   private static String[] throws_;
   private static boolean[] case_;
   private static short[] catch_;

   public EM(C_case var1) {
      super(var1, "thisway", "forward");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1264229944;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.protected_(1);
      rX_2 var3 = rX_2.class_(((Ps_1)this.class_[1]).break_(), (Float)((Ps_1)this.class_[1]).catch_().private_[25], var2.catch_(Double.class));
      ((C_case)this.class_[0]).import_().class_(var3);
      this.case_(String.format("Goal: %s", var3));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1489240725864872190L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 113, -110, 127, -24, 38, 50, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      case_ = new boolean[]{false, true, true, true, false, false, true};
   }

   private static void finally_() {
      throws_ = new String[]{
         new String("thisway"),
         new String("forward"),
         new String("Goal: %s"),
         new String("Travel in your current direction"),
         new String("Creates a GoalXZ some amount of blocks in the direction you're currently looking"),
         new String(""),
         new String("Usage:"),
         new String("> thisway <distance> - makes a GoalXZ distance blocks in front of you")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Creates a GoalXZ some amount of blocks in the direction you're currently looking",
         "",
         "Usage:",
         "> thisway <distance> - makes a GoalXZ distance blocks in front of you"
      );
   }

   private static void extends_() {
      catch_ = new short[]{1, 1, 25, 0};
   }

   @Override
   public String implements_() {
      return "Travel in your current direction";
   }

   private static void protected_() {
      break_ = new byte[]{2, 4, 2, 3};
   }
}
