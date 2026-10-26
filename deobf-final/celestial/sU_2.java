package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sU_2 extends C_try {
   private static short[] break_;
   private static String[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;

   public sU_2(C_case var1) {
      super(var1, "reloadall");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4597510169120732693L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      ((Ps_1)this.class_[1]).package_().break_().break_();
      this.case_("Reloaded");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1601597799;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{89, 85, -100, 21, -49, 113, 119, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      throws_ = new String[]{
         new String("reloadall"),
         new String("Reloaded"),
         new String("Reloads Baritone's cache for this world"),
         new String("The reloadall command reloads Baritone's world cache."),
         new String(""),
         new String("Usage:"),
         new String("> reloadall")
      };
   }

   private static void finally_() {
      break_ = new short[]{1};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("The reloadall command reloads Baritone's world cache.", "", "Usage:", "> reloadall");
   }

   private static void extends_() {
      catch_ = new byte[]{4, 2, 3};
   }

   @Override
   public String implements_() {
      return "Reloads Baritone's cache for this world";
   }

   private static void protected_() {
      case_ = new boolean[]{true, false, false, false, true};
   }
}
