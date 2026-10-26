package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EX extends C_try {
   private static byte[] break_;
   private static boolean[] throws_;
   private static String[] case_;

   public EX(C_case var1) {
      super(var1, "version");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      String var3 = this.getClass().getPackage().getImplementationVersion();
      if (var3 == null) {
         throw new k_1("Null version (this is normal in a dev environment)");
      } else {
         this.case_(String.format("You are running Baritone v%s", var3));
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2142977015;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8971882904782954546L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 23, -15, 72, 31, -118, -116, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      case_ = new String[]{
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

   private static void finally_() {
      break_ = new byte[]{4, 2, 3};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The version command prints the version of Baritone you're currently running.", "", "Usage:", "> version - View version information, if present"
      );
   }

   @Override
   public String implements_() {
      return "View the Baritone version";
   }

   private static void protected_() {
      throws_ = new boolean[]{true, false, false, true, false, false, true};
   }
}
