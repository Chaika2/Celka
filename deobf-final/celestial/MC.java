package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MC {
   private final List<ConcurrentLinkedQueue<OJ>> class_ = ImmutableList.of(
      new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue()
   );
   private volatile int break_;
   private volatile int byte_;
   private volatile int protected_;

   public MC() {
      this.break_ = this.byte_ = this.protected_ + 1;
   }
}
