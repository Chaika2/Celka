package celestial;

import java.lang.management.BufferPoolMXBean;
import java.util.function.LongSupplier;

class rrWa_1 implements LongSupplier {
   rrWa_1(BufferPoolMXBean var1) {
      this.class_ = var1;
   }

   @Override
   public long getAsLong() {
      return this.class_.getMemoryUsed();
   }
}
