package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EM extends C_try {
   private static byte[] id_break;
   private static String[] id_throws;
   private static boolean[] id_case;
   private static short[] id_catch;

   public EM(C_case var1) {
      super(var1, "thisway", "forward");
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1264229944;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_protected(1);
      rX_2 var3 = rX_2.id_class(((Ps_1)this.id_class[1]).id_break(), (Float)((Ps_1)this.id_class[1]).id_catch().id_private[25], var2.id_catch(Double.class));
      ((C_case)this.id_class[0]).id_import().id_class(var3);
      this.id_case(String.format("Goal: %s", var3));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1489240725864872190L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 113, -110, 127, -24, 38, 50, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new boolean[]{false, true, true, true, false, false, true};
   }

   private static void id_finally() {
      id_throws = new String[]{
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
   public List<String> id_catch() {
      return Arrays.asList(
         "Creates a GoalXZ some amount of blocks in the direction you're currently looking",
         "",
         "Usage:",
         "> thisway <distance> - makes a GoalXZ distance blocks in front of you"
      );
   }

   private static void id_extends() {
      id_catch = new short[]{1, 1, 25, 0};
   }

   @Override
   public String id_implements() {
      return "Travel in your current direction";
   }

   private static void id_protected() {
      id_break = new byte[]{2, 4, 2, 3};
   }
}
