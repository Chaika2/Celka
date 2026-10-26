package celestial;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class rrft_3 implements MinecraftAccessor {
   public static void id_class(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }
   }

   public static void id_class(Runnable var0, int var1) {
      ScheduledExecutorService var2 = Executors.newSingleThreadScheduledExecutor();
      var2.schedule(var0, (long)var1, TimeUnit.MILLISECONDS);
      var2.shutdown();
   }
}
