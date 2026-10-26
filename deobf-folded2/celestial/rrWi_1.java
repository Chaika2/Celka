package celestial;

import java.util.function.LongSupplier;

class rrWi_1 implements LongSupplier {
   @Override
   public long getAsLong() {
      return Runtime.getRuntime().maxMemory();
   }
}
