package celestial;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum E implements C_switch<File, File> {
   ;
   public static Object[] staticFieldsa68f70fa3b203574ab28df4fae9f18d2;
   private static boolean[] booleansa68f70fa3b203574ab28df4fae9f18d2;
   private static String[] stringsa68f70fa3b203574ab28df4fae9f18d2;
   private static byte[] bytesa68f70fa3b203574ab28df4fae9f18d2;
   private static short[] shortsa68f70fa3b203574ab28df4fae9f18d2;

   private static void byte_() {
      stringsa68f70fa3b203574ab28df4fae9f18d2 = new String[]{
         new String("./"), new String("invalid path"), new String("."), new String(" "), new String(""), new String("INSTANCE")
      };
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6925873144640269820L;
   }

   public File class_(C_for var1, File var2) throws x_1 {
      if (var2 == null) {
         var2 = new File("./");
      }

      Path var3;
      try {
         var3 = FileSystems.getDefault().getPath(var1.class_().extends_());
      } catch (InvalidPathException var5) {
         throw new IllegalArgumentException("invalid path");
      }

      return class_(var2.toPath().resolve(var3).toFile());
   }

   public static File class_() {
      File var0 = ((File)PP.b_.class_[24]).getAbsoluteFile();
      return var0.getName().equals(".") ? var0.getParentFile() : var0;
   }

   @Override
   public Stream<String> class_(C_for var1) {
      return Stream.empty();
   }

   public static Stream<String> class_(C_static var0, File var1) throws x_1 {
      File var2 = class_(var1);
      String var3 = var0.extends_();
      Path var4 = FileSystems.getDefault().getPath(var3);
      Path var5 = var4.isAbsolute() ? var4.getRoot() : var2.toPath();
      boolean var6 = !var3.isEmpty() && !var3.endsWith(File.separator) ? true : booleansa68f70fa3b203574ab28df4fae9f18d2[3];
      File var7 = var4.isAbsolute() ? var4.toFile() : new File(var2, var3);
      return Stream.of(Objects.requireNonNull(class_(var6 ? var7.getParentFile() : var7).listFiles()))
         .map(
            var2x -> (var4.isAbsolute() ? var2x : var5.relativize(var2x.toPath()).toString())
                  + (var2x.isDirectory() ? File.separator : stringsa68f70fa3b203574ab28df4fae9f18d2[4])
         )
         .filter(var1x -> var1x.toLowerCase(Locale.US).startsWith(var3.toLowerCase(Locale.US)))
         .filter(var0x -> !var0x.contains(" ") ? true : booleansa68f70fa3b203574ab28df4fae9f18d2[5]);
   }

   private static File class_(File var0) {
      try {
         return var0.getCanonicalFile();
      } catch (IOException var2) {
         throw new UncheckedIOException(var2);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, 92, -68, -85, -29, -82, 6, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 287088413;
   }

   private static void break_() {
      bytesa68f70fa3b203574ab28df4fae9f18d2 = new byte[]{2};
   }

   private static void throws_() {
      shortsa68f70fa3b203574ab28df4fae9f18d2 = new short[]{1, 24, 0};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new E(), null};
      var0[1] = new E[]{(E)var0[0]};
      staticFieldsa68f70fa3b203574ab28df4fae9f18d2 = var0;
   }

   private static void protected_() {
      booleansa68f70fa3b203574ab28df4fae9f18d2 = new boolean[]{false, false, true, false, true, false, true, false, false, false, true};
   }
}
