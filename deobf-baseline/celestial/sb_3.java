package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sb_3 extends C_try {
   private static short[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static String[] id_catch;

   public sb_3(C_case var1) {
      String[] var10002 = new String[id_case[0]];
      var10002[id_throws[0]] = id_catch[0];
      var10002[id_throws[1]] = id_catch[1];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_throws[2]);
      rB_2 var3 = new rB_2();
      ((C_case)this.id_class[id_break[0]]).id_import().id_class(var3);
      String var10001 = id_catch[2];
      Object[] var10002 = new Object[id_throws[3]];
      var10002[id_throws[4]] = var3.toString();
      this.id_case(String.format(var10001, var10002));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 690878563922051451L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 665658149;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 16, -123, -114, 31, -41, -60, -111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new String[]{
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

   private static void id_finally() {
      id_throws = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_case[1]];
      var10000[id_throws[5]] = id_catch[4];
      var10000[id_throws[6]] = id_catch[5];
      var10000[id_case[2]] = id_catch[6];
      var10000[id_case[3]] = id_catch[7];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new byte[]{2, 4, 2, 3};
   }

   @Override
   public String id_implements() {
      return id_catch[3];
   }

   private static void id_protected() {
      id_break = new short[1];
   }
}
