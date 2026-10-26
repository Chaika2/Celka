package celestial;

import java.lang.management.BufferPoolMXBean;
import java.util.function.LongSupplier;

class rrWa_1 implements LongSupplier {
   rrWa_1(BufferPoolMXBean var1) {
      this.id_class = var1;
   }

   @Override
   public long getAsLong() {
      return this.id_class.getMemoryUsed();
   }
}
