package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sD_2 extends C_try {
   private static String[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;

   public sD_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_catch[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_catch[2]);
      rr_3 var3 = ((C_case)this.id_class[id_case[0]]).id_goto();
      rz_3 var4 = var3.id_protected().orElse(null);
      if (var4 == null) {
         throw new k_1(id_break[1]);
      } else {
         String var10001 = id_break[2];
         Object[] var10002 = new Object[5];
         var10002[id_catch[3]] = var4.getClass().getTypeName();
         var10002[1] = var4.id_case();
         var10002[2] = var4.id_catch();
         var10002[3] = var4.id_break();
         var10002[4] = var3.id_break().map(rn_3::toString).orElse(id_break[3]);
         this.id_case(String.format(var10001, var10002));
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5506135059726129101L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1840389702;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, 115, 5, 20, -112, -91, -32, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_catch = new boolean[]{true, false, false, false, true, false, true};
   }

   private static void id_finally() {
      id_case = new short[1];
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[6];
      var10000[id_catch[5]] = id_break[5];
      var10000[1] = id_break[6];
      var10000[2] = id_break[7];
      var10000[3] = id_break[8];
      var10000[4] = id_break[9];
      var10000[5] = id_break[10];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new byte[]{5, 2, 3, 4, 6, 2, 3, 4, 5};
   }

   @Override
   public String id_implements() {
      return id_break[4];
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("proc"),
         new String("No process in control"),
         new String("Class: %s\nPriority: %f\nTemporary: %b\nDisplay name: %s\nLast command: %s"),
         new String("None"),
         new String("View process state information"),
         new String("The proc command provides miscellaneous information about the process currently controlling Baritone."),
         new String(""),
         new String("You are not expected to understand this if you aren't familiar with how Baritone works."),
         new String(""),
         new String("Usage:"),
         new String("> proc - View process information, if present")
      };
   }
}
