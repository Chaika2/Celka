package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EX extends C_try {
   private static byte[] id_break;
   private static boolean[] id_throws;
   private static String[] id_case;

   public EX(C_case var1) {
      super(var1, "version");
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(0);
      String var3 = this.getClass().getPackage().getImplementationVersion();
      if (var3 == null) {
         throw new k_1("Null version (this is normal in a dev environment)");
      } else {
         this.id_case(String.format("You are running Baritone v%s", var3));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2142977015;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8971882904782954546L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 23, -15, 72, 31, -118, -116, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("version"),
         new String("Null version (this is normal in a dev environment)"),
         new String("You are running Baritone v%s"),
         new String("View the Baritone version"),
         new String("The version command prints the version of Baritone you're currently running."),
         new String(""),
         new String("Usage:"),
         new String("> version - View version information, if present")
      };
   }

   private static void id_finally() {
      id_break = new byte[]{4, 2, 3};
   }

   @Override
   public List<String> id_catch() {
      return Arrays.asList(
         "The version command prints the version of Baritone you're currently running.", "", "Usage:", "> version - View version information, if present"
      );
   }

   @Override
   public String id_implements() {
      return "View the Baritone version";
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, false, false, true, false, false, true};
   }
}
