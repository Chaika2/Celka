package celestial;

import com.google.common.collect.Queues;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class rTd_1 implements rTx_1<rTk_1, Runnable> {
   private final List<ConcurrentLinkedQueue<Runnable>> id_class;

   public Runnable id_byte() {
      for (ConcurrentLinkedQueue var2 : this.id_class) {
         Runnable var3 = (Runnable)var2.poll();
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }

   public rTd_1(int var1) {
      this.id_class = IntStream.range(0, var1).mapToObj(var0 -> Queues.newConcurrentLinkedQueue()).collect(Collectors.toList());
   }

   public boolean id_class(rTk_1 var1) {
      int var2 = var1.id_class();
      this.id_class.get(var2).add(var1);
      return true;
   }

   @Override
   public boolean id_break() {
      return this.id_class.stream().allMatch(Collection::isEmpty);
   }
}
