package celestial;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rpz_3 {
   private static final Pattern class_ = Pattern.compile("(<name>.*) \\((<count>\\d*)\\)", 66);
   private static final Pattern break_ = Pattern.compile(".*\\.|(?:COM|CLOCK\\$|CON|PRN|AUX|NUL|COM[1-9]|LPT[1-9])(?:\\..*)?", 2);

   public static boolean class_(Path var0) {
      Path var1 = var0.normalize();
      return var1.equals(var0);
   }

   public static String class_(Path var0, String var1, String var2) throws IOException {
      for (char var6 : rqu_3.protected_) {
         var1 = var1.replace(var6, '_');
      }

      var1 = var1.replaceAll("[./\"]", "_");
      if (break_.matcher(var1).matches()) {
         var1 = "_" + var1 + "_";
      }

      Matcher var10 = class_.matcher(var1);
      int var11 = 0;
      if (var10.matches()) {
         var1 = var10.group("name");
         var11 = Integer.parseInt(var10.group("count"));
      }

      if (var1.length() > 255 - var2.length()) {
         var1 = var1.substring(0, 255 - var2.length());
      }

      while (true) {
         String var12 = var1;
         if (var11 != 0) {
            String var14 = " (" + var11 + ")";
            int var7 = 255 - var14.length();
            if (var1.length() > var7) {
               var12 = var1.substring(0, var7);
            }

            var12 = var12 + var14;
         }

         var12 = var12 + var2;
         Path var15 = var0.resolve(var12);

         try {
            Path var16 = Files.createDirectory(var15);
            Files.deleteIfExists(var16);
            return var0.relativize(var16).toString();
         } catch (FileAlreadyExistsException var8) {
            var11++;
         }
      }
   }

   public static boolean break_(Path var0) {
      for (Path var2 : var0) {
         if (break_.matcher(var2.toString()).matches()) {
            return false;
         }
      }

      return true;
   }

   public static Path break_(Path var0, String var1, String var2) {
      String var3 = var1 + var2;
      Path var4 = Paths.get(var3);
      if (var4.endsWith(var2)) {
         throw new InvalidPathException(var3, "empty resource name");
      } else {
         return var0.resolve(var4);
      }
   }
}
