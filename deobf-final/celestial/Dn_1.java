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
   private static final Logger class_ = LogManager.getLogger();
   private final Path break_;
   private final Path byte_;
   private int protected_;
   private final Map<Path, String> throws_ = Maps.newHashMap();
   private final Map<Path, String> case_ = Maps.newHashMap();
   private final Set<Path> catch_ = Sets.newHashSet();

   private Stream<Path> byte_() throws IOException {
      return Files.walk(this.break_).filter(var1 -> !Objects.equals(this.byte_, var1) && !Files.isDirectory(var1));
   }

   public void byte_(Path var1) {
      this.catch_.add(var1);
   }

   public Dn_1(Path var1, String var2) throws IOException {
      this.break_ = var1;
      Path var3 = var1.resolve(".cache");
      Files.createDirectories(var3);
      this.byte_ = var3.resolve(var2);
      this.byte_().forEach(var1x -> {
         String var2x = this.throws_.put(var1x, "");
      });
      if (Files.isReadable(this.byte_)) {
         IOUtils.readLines(Files.newInputStream(this.byte_), Charsets.UTF_8).forEach(var2x -> {
            int var3x = var2x.indexOf(32);
            this.throws_.put(var1.resolve(var2x.substring(var3x + 1)), var2x.substring(0, var3x));
         });
      }
   }

   public void class_() throws IOException {
      this.break_();

      BufferedWriter var1;
      try {
         var1 = Files.newBufferedWriter(this.byte_);
      } catch (IOException var3) {
         class_.warn("Unable write cachefile {}: {}", this.byte_, var3.toString());
         return;
      }

      IOUtils.writeLines(
         this.case_.entrySet().stream().map(var1x -> var1x.getValue() + " " + this.break_.relativize(var1x.getKey())).collect(Collectors.toList()),
         System.lineSeparator(),
         var1
      );
      var1.close();
      class_.debug("Caching: cache hits: {}, created: {} removed: {}", this.protected_, this.case_.size() - this.protected_, this.throws_.size());
   }

   public void class_(Path var1, String var2) {
      this.case_.put(var1, var2);
      if (Objects.equals(this.throws_.remove(var1), var2)) {
         this.protected_++;
      }
   }

   public String class_(Path var1) {
      return this.throws_.get(var1);
   }

   public boolean break_(Path var1) {
      return this.throws_.containsKey(var1);
   }

   private void break_() throws IOException {
      this.byte_().forEach(var1 -> {
         if (this.break_(var1) && !this.catch_.contains(var1)) {
            try {
               Files.delete(var1);
            } catch (IOException var3) {
               class_.debug("Unable to delete: {} ({})", var1, var3.toString());
            }
         }
      });
   }
}
