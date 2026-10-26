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
   private static String[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public sL_2(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_throws[1]] = id_break[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1716111961529065593L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1247692559;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_class(2);
      File var3 = var2.id_break((E)E.staticFieldsa68f70fa3b203574ab28df4fae9f18d2[id_catch[0]], ((File)b_.id_class[24]).getAbsoluteFile().getParentFile());
      boolean var4 = id_throws[2];
      if (var2.id_final()) {
         if (!var2.id_extends().equalsIgnoreCase(id_break[1])) {
            throw new W(var2.id_private(), id_break[2]);
         }

         var4 = true;
      }

      try {
         ((C_case)this.id_class[id_catch[2]]).id_class().id_class(var3.toPath().toAbsolutePath(), var4);
      } catch (NoSuchFileException var6) {
         throw new k_1(id_break[3]);
      } catch (JsonSyntaxException var7) {
         throw new k_1(id_break[4]);
      } catch (Exception var8) {
         throw new IllegalStateException(var8);
      }

      String var10001 = id_break[5];
      Object[] var10002 = new Object[1];
      var10002[id_throws[5]] = Boolean.toString(var4);
      this.id_case(String.format(var10001, var10002));
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return var2.id_case() ? E.id_class(var2, E.id_class()) : Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, 60, -117, -63, -75, 27, 64, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_break = new String[]{
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

   private static void id_finally() {
      id_catch = new short[]{0, 24, 0};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[8];
      var10000[id_throws[6]] = id_break[7];
      var10000[1] = id_break[8];
      var10000[2] = id_break[9];
      var10000[3] = id_break[10];
      var10000[4] = id_break[11];
      var10000[5] = id_break[12];
      var10000[6] = id_break[13];
      var10000[7] = id_break[14];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_case = new byte[]{2, 8, 2, 3, 4, 5, 6, 7};
   }

   @Override
   public String id_implements() {
      return id_break[6];
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, false, false, true, true, false, false, true};
   }
}
