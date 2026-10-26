package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class se_3 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;

   public se_3(C_case var1) {
      String[] var10002 = new String[id_break[0]];
      var10002[id_break[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2071597137;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2388435061493023649L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_break[2]);
      rU_2 var3 = ((Ps_1)this.id_class[id_case[0]]).id_volatile();
      int var4 = (((Qw_1)b_.id_class[id_case[1]]).id_break + id_break[3]) * id_throws[0];
      ((yX_2)b_.id_class[id_case[2]])
         .id_class(
            (Integer)var3.id_break[id_case[3]] - var4,
            id_break[4],
            (Integer)var3.id_break[id_case[4]] - var4,
            (Integer)var3.id_break[id_case[5]] + var4,
            id_case[6],
            (Integer)var3.id_break[id_case[7]] + var4
         );
      this.id_case(id_catch[1]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 12, 24, 126, 115, -118, -87, 25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, false, true, false, false, true};
   }

   private static void id_finally() {
      id_catch = new String[]{
         new String("render"),
         new String("Done"),
         new String("Fix glitched chunks"),
         new String("The render command fixes glitched chunk rendering without having to reload all of them."),
         new String(""),
         new String("Usage:"),
         new String("> render")
      };
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_throws[1]];
      var10000[id_break[5]] = id_catch[3];
      var10000[id_break[6]] = id_catch[4];
      var10000[id_throws[2]] = id_catch[5];
      var10000[id_throws[3]] = id_catch[6];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new byte[]{16, 4, 2, 3};
   }

   @Override
   public String id_implements() {
      return id_catch[2];
   }

   private static void id_protected() {
      id_case = new short[]{1, 20, 8, 0, 2, 0, 255, 2};
   }
}
