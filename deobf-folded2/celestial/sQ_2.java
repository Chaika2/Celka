package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sQ_2 extends C_try {
   private static boolean[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;
   private static double[] id_catch;
   private static short[] id_private;

   public sQ_2(C_case var1) {
      super(var1, "eta");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4929799806815856944L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 200676705;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      rr_3 var3 = ((C_case)this.id_class[0]).id_goto();
      rz_3 var4 = var3.id_protected().orElse(null);
      if (var4 == null) {
         throw new k_1("No process in control");
      } else {
         C_final var5 = ((C_case)this.id_class[0]).id_this();
         double var6 = var5.id_extends().orElse(Double.NaN);
         double var8 = var5.id_class().orElse(Double.NaN);
         this.id_case(String.format("Next segment: %.1fs (%.0f ticks)\nGoal: %.1fs (%.0f ticks)", var6 / 20.0, var6, var8 / 20.0, var8));
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -15, 42, 74, -61, -23, -51, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_throws = new String[]{
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

   private static void id_finally() {
      id_case = new byte[]{4, 2, 3, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public List<String> id_catch() {
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

   private static void id_extends() {
      id_break = new boolean[]{true, false, false, false, true, false, true};
   }

   @Override
   public String id_implements() {
      return "View the current ETA";
   }

   private static void id_protected() {
      id_private = new short[2];
   }

   private static void id_native() {
      id_catch = new double[]{Double.NaN, Double.NaN, 20.0, 20.0};
   }
}
