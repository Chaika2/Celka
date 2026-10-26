package celestial;

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dn_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final Path id_break;
   private final Path id_byte;
   private int id_protected;
   private final Map<Path, String> id_throws = Maps.newHashMap();
   private final Map<Path, String> id_case = Maps.newHashMap();
   private final Set<Path> id_catch = Sets.newHashSet();

   private Stream<Path> id_byte() throws IOException {
      return Files.walk(this.id_break).filter(var1 -> !Objects.equals(this.id_byte, var1) && !Files.isDirectory(var1));
   }

   public void id_byte(Path var1) {
      this.id_catch.add(var1);
   }

   public Dn_1(Path var1, String var2) throws IOException {
      this.id_break = var1;
      Path var3 = var1.resolve(".cache");
      Files.createDirectories(var3);
      this.id_byte = var3.resolve(var2);
      this.id_byte().forEach(var1x -> {
         String var2x = this.id_throws.put(var1x, "");
      });
      if (Files.isReadable(this.id_byte)) {
         IOUtils.readLines(Files.newInputStream(this.id_byte), Charsets.UTF_8).forEach(var2x -> {
            int var3x = var2x.indexOf(32);
            this.id_throws.put(var1.resolve(var2x.substring(var3x + 1)), var2x.substring(0, var3x));
         });
      }
   }

   public void id_class() throws IOException {
      this.id_break();

      BufferedWriter var1;
      try {
         var1 = Files.newBufferedWriter(this.id_byte);
      } catch (IOException var3) {
         id_class.warn("Unable write cachefile {}: {}", this.id_byte, var3.toString());
         return;
      }

      IOUtils.writeLines(
         this.id_case.entrySet().stream().map(var1x -> var1x.getValue() + " " + this.id_break.relativize(var1x.getKey())).collect(Collectors.toList()),
         System.lineSeparator(),
         var1
      );
      var1.close();
      id_class.debug("Caching: cache hits: {}, created: {} removed: {}", this.id_protected, this.id_case.size() - this.id_protected, this.id_throws.size());
   }

   public void id_class(Path var1, String var2) {
      this.id_case.put(var1, var2);
      if (Objects.equals(this.id_throws.remove(var1), var2)) {
         this.id_protected++;
      }
   }

   public String id_class(Path var1) {
      return this.id_throws.get(var1);
   }

   public boolean id_break(Path var1) {
      return this.id_throws.containsKey(var1);
   }

   private void id_break() throws IOException {
      this.id_byte().forEach(var1 -> {
         if (this.id_break(var1) && !this.id_catch.contains(var1)) {
            try {
               Files.delete(var1);
            } catch (IOException var3) {
               id_class.debug("Unable to delete: {} ({})", var1, var3.toString());
            }
         }
      });
   }
}
