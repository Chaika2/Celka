package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MC {
   private final List<ConcurrentLinkedQueue<OJ>> id_class = ImmutableList.of(
      new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue()
   );
   private volatile int id_break;
   private volatile int id_byte;
   private volatile int id_protected;

   public MC() {
      this.id_break = this.id_byte = this.id_protected + 1;
   }
}
