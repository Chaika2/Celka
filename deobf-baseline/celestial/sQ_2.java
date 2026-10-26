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
      String[] var10002 = new String[id_break[0]];
      var10002[id_break[1]] = id_throws[0];
      super(var1, var10002);
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
      var2.id_class(id_break[2]);
      rr_3 var3 = ((C_case)this.id_class[id_private[0]]).id_goto();
      rz_3 var4 = var3.id_protected().orElse(null);
      if (var4 == null) {
         throw new k_1(id_throws[1]);
      } else {
         C_final var5 = ((C_case)this.id_class[id_private[1]]).id_this();
         double var6 = var5.id_extends().orElse(id_catch[0]);
         double var8 = var5.id_class().orElse(id_catch[1]);
         String var10001 = id_throws[2];
         Object[] var10002 = new Object[id_case[0]];
         var10002[id_break[3]] = var6 / id_catch[2];
         var10002[id_break[4]] = var6;
         var10002[id_case[1]] = var8 / id_catch[3];
         var10002[id_case[2]] = var8;
         this.id_case(String.format(var10001, var10002));
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
      String[] var10000 = new String[id_case[3]];
      var10000[id_break[5]] = id_throws[4];
      var10000[id_break[6]] = id_throws[5];
      var10000[id_case[4]] = id_throws[6];
      var10000[id_case[5]] = id_throws[7];
      var10000[id_case[6]] = id_throws[8];
      var10000[id_case[7]] = id_throws[9];
      var10000[id_case[8]] = id_throws[10];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_break = new boolean[]{true, false, false, false, true, false, true};
   }

   @Override
   public String id_implements() {
      return id_throws[3];
   }

   private static void id_protected() {
      id_private = new short[2];
   }

   private static void id_native() {
      id_catch = new double[]{Double.NaN, Double.NaN, 20.0, 20.0};
   }
}
