package celestial;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jT_2 extends jo_3 {
   private final File id_break;

   public jT_2(File var1) {
      this.id_break = var1;
   }

   @Override
   public File id_class(rqO_2 var1) {
      return new File(this.id_break, var1.toString().replace(':', '/'));
   }

   @Override
   public File id_class(String var1) {
      return new File(this.id_break, var1);
   }

   @Override
   public Collection<rqO_2> id_class(String var1, String var2, int var3, Predicate<String> var4) {
      Path var5 = this.id_break.toPath().resolve(var2);

      try {
         Collection var7;
         try (Stream var6 = Files.walk(var5.resolve(var1), var3)) {
            var7 = var6.filter(var0 -> Files.isRegularFile(var0))
               .filter(var0 -> !var0.endsWith(".mcmeta"))
               .filter(var1x -> var4.test(var1x.getFileName().toString()))
               .map(var2x -> new rqO_2(var2, var5.relativize(var2x).toString().replaceAll("\\\\", "/")))
               .collect(Collectors.toList());
         }

         return var7;
      } catch (NoSuchFileException var11) {
      } catch (IOException var12) {
         id_class.warn("Unable to getFiles on {}", var1, var12);
      }

      return Collections.emptyList();
   }
}
