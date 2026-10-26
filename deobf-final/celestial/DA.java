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
   private static final Logger class_ = LogManager.getLogger();
   private final Collection<Path> break_;
   private final Path byte_;
   private final List<DT> protected_ = Lists.newArrayList();

   public void byte_() throws IOException {
      Dn_1 var1 = new Dn_1(this.byte_, "cache");
      var1.byte_(this.break_().resolve("version.json"));
      Stopwatch var2 = Stopwatch.createStarted();
      Stopwatch var3 = Stopwatch.createUnstarted();

      for (DT var5 : this.protected_) {
         class_.info("Starting provider: {}", var5.class_());
         var3.start();
         var5.class_(var1);
         var3.stop();
         class_.info("{} finished after {} ms", var5.class_(), var3.elapsed(TimeUnit.MILLISECONDS));
         var3.reset();
      }

      class_.info("All providers took: {} ms", var2.elapsed(TimeUnit.MILLISECONDS));
      var1.class_();
   }

   public DA(Path var1, Collection<Path> var2) {
      this.byte_ = var1;
      this.break_ = var2;
   }

   static {
      rVN.class_();
   }

   public void class_(DT var1) {
      this.protected_.add(var1);
   }

   public Collection<Path> class_() {
      return this.break_;
   }

   public Path break_() {
      return this.byte_;
   }
}
