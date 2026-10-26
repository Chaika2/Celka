package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sU_2 extends C_try {
   private static short[] id_break;
   private static String[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public sU_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_case[1]] = id_throws[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4597510169120732693L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(id_case[2]);
      ((Ps_1)this.id_class[1]).id_package().id_break().id_break();
      this.id_case(id_throws[1]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1601597799;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, 85, -100, 21, -49, 113, 119, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new String[]{
         new String("reloadall"),
         new String("Reloaded"),
         new String("Reloads Baritone's cache for this world"),
         new String("The reloadall command reloads Baritone's world cache."),
         new String(""),
         new String("Usage:"),
         new String("> reloadall")
      };
   }

   private static void id_finally() {
      id_break = new short[]{1};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[4];
      var10000[id_case[3]] = id_throws[3];
      var10000[1] = id_throws[4];
      var10000[2] = id_throws[5];
      var10000[3] = id_throws[6];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_catch = new byte[]{4, 2, 3};
   }

   @Override
   public String id_implements() {
      return id_throws[2];
   }

   private static void id_protected() {
      id_case = new boolean[]{true, false, false, false, true};
   }
}
