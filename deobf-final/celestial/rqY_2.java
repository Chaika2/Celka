package celestial;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

class rqY_2 extends ForkJoinWorkerThread {
   rqY_2(ForkJoinPool var1) {
      super(var1);
   }

   @Override
   protected void onTermination(Throwable var1) {
      if (var1 != null) {
         rqR_2.catch_.warn("{} died", this.getName(), var1);
      } else {
         rqR_2.catch_.debug("{} shutdown", this.getName());
      }

      super.onTermination(var1);
   }
}
