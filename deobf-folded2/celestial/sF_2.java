package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sF_2 extends C_try {
   private static short[] id_break;
   private static String[] id_throws;
   private static boolean[] id_case;
   private static byte[] id_catch;

   public sF_2(C_case var1) {
      super(var1, "explore");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8793290330787231981L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      if (var2.id_final()) {
         var2.id_protected(2);
      } else {
         var2.id_class(0);
      }

      rX_2 var3 = var2.id_final()
         ? var2.id_break((M)M.staticFields458f40b2da6139cb91242091b209a91e[0], ((Ps_1)this.id_class[1]).id_volatile())
         : new rX_2(((Ps_1)this.id_class[1]).id_volatile());
      ((C_case)this.id_class[0]).id_class().id_class(var3.id_byte(), var3.id_break());
      this.id_case(String.format("Exploring from %s", var3.toString()));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 529979453;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, -105, -18, -54, 64, -18, -117, -119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) {
      return var2.id_catch(2) ? var2.id_class((M)M.staticFields458f40b2da6139cb91242091b209a91e[0]) : Stream.empty();
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 1, 0, 0};
   }

   private static void id_finally() {
      id_throws = new String[]{
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
   public List<String> id_catch() {
      return Arrays.asList(
         "Tell Baritone to explore randomly. If you used explorefilter before this, it will be applied.",
         "",
         "Usage:",
         "> explore - Explore from your current position.",
         "> explore <x> <z> - Explore from the specified X and Z position."
      );
   }

   private static void id_extends() {
      id_case = new boolean[]{true, false, false, true, false, false, true};
   }

   @Override
   public String id_implements() {
      return "Explore things";
   }

   private static void id_protected() {
      id_catch = new byte[]{2, 2, 5, 2, 3, 4};
   }
}
