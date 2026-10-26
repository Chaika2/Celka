package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sK_2 extends C_try {
   private static short[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static boolean[] id_catch;

   public sK_2(C_case var1) {
      String[] var10002 = new String[id_catch[0]];
      var10002[id_catch[1]] = id_case[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3627153102960250525L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      HashSet var3 = new HashSet();

      while (var2.id_final()) {
         rdb_3 var4 = var2.id_break((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[0]]);
         var3.add(var4);
      }

      if (var3.isEmpty()) {
         ((C_case)this.id_class[id_break[1]]).id_public().id_class(var0 -> id_catch[4]);
         this.id_case(id_case[1]);
      } else {
         ((C_case)this.id_class[id_break[2]]).id_public().id_class(var1x -> var3.contains(var1x.id_break()));
         this.id_case(id_case[2]);
         var3.stream().map(rVL.id_for::id_break).map(rqO_2::toString).forEach(this::id_case);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -781090867;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 6, 41, -35, 0, 8, -14, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      while (var2.id_break(id_throws[0])) {
         if (var2.id_byte((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[3]]) == null) {
            return Stream.empty();
         }

         var2.id_throws();
      }

      return var2.id_class((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[4]]);
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("pickup"),
         new String("Собираем все предметы"),
         new String("Собираем эти предметы:"),
         new String("Подбирать предметы"),
         new String("Usage:"),
         new String("> pickup - Подбирать все предметы"),
         new String("> pickup <item1> <item2> <...> - Подбирать только указанные предметы")
      };
   }

   private static void id_finally() {
      id_throws = new byte[]{2, 3, 2};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[id_throws[1]];
      var10000[id_catch[2]] = id_case[4];
      var10000[id_catch[3]] = id_case[5];
      var10000[id_throws[2]] = id_case[6];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new boolean[]{true, false, false, true, true};
   }

   @Override
   public String id_implements() {
      return id_case[3];
   }

   private static void id_protected() {
      id_break = new short[5];
   }
}
