package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class si_3 extends C_try {
   private static short[] id_break;
   private static String[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;

   public si_3(C_case var1) {
      super(var1, "saveall");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2268209142613857925L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      ((Ps_1)this.id_class[1]).id_package().id_break().id_class();
      this.id_case("Saved");
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 877788548;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 106, -50, 36, -29, 104, 30, -125}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new short[]{1};
   }

   private static void id_finally() {
      id_case = new byte[]{4, 2, 3};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList("The saveall command saves Baritone's world cache.", "", "Usage:", "> saveall");
   }

   private static void id_extends() {
      id_catch = new boolean[]{true, false, false, false, true};
   }

   @Override
   public String id_implements() {
      return "Saves Baritone's cache for this world";
   }

   private static void id_protected() {
      id_throws = new String[]{
         new String("saveall"),
         new String("Saved"),
         new String("Saves Baritone's cache for this world"),
         new String("The saveall command saves Baritone's world cache."),
         new String(""),
         new String("Usage:"),
         new String("> saveall")
      };
   }
}
