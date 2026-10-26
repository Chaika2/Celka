package celestial;

import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sL_2 extends C_try {
   private static String[] break_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static short[] catch_;

   public sL_2(C_case var1) {
      super(var1, "explorefilter");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1716111961529065593L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1247692559;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.class_(2);
      File var3 = var2.break_((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[0], ((File)b_.class_[24]).getAbsoluteFile().getParentFile());
      boolean var4 = false;
      if (var2.final_()) {
         if (!var2.extends_().equalsIgnoreCase("invert")) {
            throw new W(var2.private_(), "either \"invert\" or nothing");
         }

         var4 = true;
      }

      try {
         ((C_case)this.class_[catch_[2]]).class_().class_(var3.toPath().toAbsolutePath(), var4);
      } catch (NoSuchFileException var6) {
         throw new k_1("File not found");
      } catch (JsonSyntaxException var7) {
         throw new k_1("Invalid JSON syntax");
      } catch (Exception var8) {
         throw new IllegalStateException(var8);
      }

      this.case_(String.format("Explore filter applied. Inverted: %s", Boolean.toString(var4)));
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return var2.case_() ? E.class_(var2, E.class_()) : Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 60, -117, -63, -75, 27, 64, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      break_ = new String[]{
         new String("explorefilter"),
         new String("invert"),
         new String("either \"invert\" or nothing"),
         new String("File not found"),
         new String("Invalid JSON syntax"),
         new String("Explore filter applied. Inverted: %s"),
         new String("Explore chunks from a json"),
         new String("Apply an explore filter before using explore, which tells the explore process which chunks have been explored/not explored."),
         new String(""),
         new String("The JSON file will follow this format: [{\"x\":0,\"z\":0},...]"),
         new String(""),
         new String("If 'invert' is specified, the chunks listed will be considered NOT explored, rather than explored."),
         new String(""),
         new String("Usage:"),
         new String(
            "> explorefilter <path> [invert] - Load the JSON file referenced by the specified path. If invert is specified, it must be the literal word 'invert'."
         )
      };
   }

   private static void finally_() {
      catch_ = new short[]{0, 24, 0};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Apply an explore filter before using explore, which tells the explore process which chunks have been explored/not explored.",
         "",
         "The JSON file will follow this format: [{\"x\":0,\"z\":0},...]",
         "",
         "If 'invert' is specified, the chunks listed will be considered NOT explored, rather than explored.",
         "",
         "Usage:",
         "> explorefilter <path> [invert] - Load the JSON file referenced by the specified path. If invert is specified, it must be the literal word 'invert'."
      );
   }

   private static void extends_() {
      case_ = new byte[]{2, 8, 2, 3, 4, 5, 6, 7};
   }

   @Override
   public String implements_() {
      return "Explore chunks from a json";
   }

   private static void protected_() {
      throws_ = new boolean[]{true, false, false, true, true, false, false, true};
   }
}
