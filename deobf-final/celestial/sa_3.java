package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sa_3 extends C_try {
   private static String[] break_;
   private static byte[] throws_;
   private static boolean[] case_;
   private static short[] catch_;

   public sa_3(C_case var1) {
      super(var1, "repack", "rescan");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5061815375472199920L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1990819864;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(0);
      this.case_(String.format("Queued %d chunks for repacking", ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[0]).class_((Ps_1)this.class_[1])));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{50, 122, -110, 56, 126, -47, -21, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return Stream.empty();
   }

   private static void throws_() {
      throws_ = new byte[]{2, 4, 2, 3};
   }

   private static void finally_() {
      break_ = new String[]{
         new String("repack"),
         new String("rescan"),
         new String("Queued %d chunks for repacking"),
         new String("Re-cache chunks"),
         new String("Repack chunks around you. This basically re-caches them."),
         new String(""),
         new String("Usage:"),
         new String("> repack - Repack chunks.")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList("Repack chunks around you. This basically re-caches them.", "", "Usage:", "> repack - Repack chunks.");
   }

   private static void extends_() {
      case_ = new boolean[]{false, true, false, true, false, false, true};
   }

   @Override
   public String implements_() {
      return "Re-cache chunks";
   }

   private static void protected_() {
      catch_ = new short[]{0, 1};
   }
}
