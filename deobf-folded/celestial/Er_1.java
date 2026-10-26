package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Er_1 extends C_try {
   private static boolean[] id_break;
   private static byte[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;

   public Er_1(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_catch[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2338298556241726871L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_break[2]);
      ((C_case)this.id_class[id_case[0]]).r().id_private();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1036941196;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 0, -118, -2, -98, 107, -1, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new byte[]{4, 2, 3};
   }

   private static void id_finally() {
      id_catch = new String[]{
         new String("schematica"),
         new String("Построение загруженной схемы"),
         new String("Построение схемы, открытой в данный момент в Schematica"),
         new String(""),
         new String("Использование:"),
         new String("> schematica")
      };
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_break[3]] = id_catch[2];
      var10000[1] = id_catch[3];
      var10000[2] = id_catch[4];
      var10000[3] = id_catch[5];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new short[1];
   }

   @Override
   public boolean id_case() {
      return true;
   }

   @Override
   public String id_implements() {
      return id_catch[1];
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, false, false, true, true};
   }
}
