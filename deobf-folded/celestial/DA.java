package celestial;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DA {
   private static final Logger id_class = LogManager.getLogger();
   private final Collection<Path> id_break;
   private final Path id_byte;
   private final List<DT> id_protected = Lists.newArrayList();

   public void id_byte() throws IOException {
      Dn_1 var1 = new Dn_1(this.id_byte, "cache");
      var1.id_byte(this.id_break().resolve("version.json"));
      Stopwatch var2 = Stopwatch.createStarted();
      Stopwatch var3 = Stopwatch.createUnstarted();

      for (DT var5 : this.id_protected) {
         id_class.info("Starting provider: {}", var5.id_class());
         var3.start();
         var5.id_class(var1);
         var3.stop();
         id_class.info("{} finished after {} ms", var5.id_class(), var3.elapsed(TimeUnit.MILLISECONDS));
         var3.reset();
      }

      id_class.info("All providers took: {} ms", var2.elapsed(TimeUnit.MILLISECONDS));
      var1.id_class();
   }

   public DA(Path var1, Collection<Path> var2) {
      this.id_byte = var1;
      this.id_break = var2;
   }

   static {
      rVN.id_class();
   }

   public void id_class(DT var1) {
      this.id_protected.add(var1);
   }

   public Collection<Path> id_class() {
      return this.id_break;
   }

   public Path id_break() {
      return this.id_byte;
   }
}
