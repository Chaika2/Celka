package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sF_2 extends C_try {
   private static short[] break_;
   private static String[] throws_;
   private static boolean[] case_;
   private static byte[] catch_;

   public sF_2(C_case var1) {
      super(var1, "explore");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8793290330787231981L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      if (var2.final_()) {
         var2.protected_(2);
      } else {
         var2.class_(0);
      }

      rX_2 var3 = var2.final_()
         ? var2.break_((M)M.staticFields458f40b2da6139cb91242091b209a91e[0], ((Ps_1)this.class_[1]).volatile_())
         : new rX_2(((Ps_1)this.class_[1]).volatile_());
      ((C_case)this.class_[0]).class_().class_(var3.byte_(), var3.break_());
      this.case_(String.format("Exploring from %s", var3.toString()));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 529979453;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -105, -18, -54, 64, -18, -117, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) {
      return var2.catch_(2) ? var2.class_((M)M.staticFields458f40b2da6139cb91242091b209a91e[0]) : Stream.empty();
   }

   private static void throws_() {
      break_ = new short[]{0, 1, 1, 0, 0};
   }

   private static void finally_() {
      throws_ = new String[]{
         new String("explore"),
         new String("Exploring from %s"),
         new String("Explore things"),
         new String("Tell Baritone to explore randomly. If you used explorefilter before this, it will be applied."),
         new String(""),
         new String("Usage:"),
         new String("> explore - Explore from your current position."),
         new String("> explore <x> <z> - Explore from the specified X and Z position.")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Tell Baritone to explore randomly. If you used explorefilter before this, it will be applied.",
         "",
         "Usage:",
         "> explore - Explore from your current position.",
         "> explore <x> <z> - Explore from the specified X and Z position."
      );
   }

   private static void extends_() {
      case_ = new boolean[]{true, false, false, true, false, false, true};
   }

   @Override
   public String implements_() {
      return "Explore things";
   }

   private static void protected_() {
      catch_ = new byte[]{2, 2, 5, 2, 3, 4};
   }
}
