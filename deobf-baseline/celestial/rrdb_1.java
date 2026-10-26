package celestial;

import java.util.ArrayDeque;
import java.util.Deque;

public class rrdb_1 {
   private Deque<rrdG> id_class = new ArrayDeque<>();

   public void id_class(rrdG var1) {
      this.id_class.addLast(var1);
      if (this.id_class.size() > 100) {
         throw new RuntimeException("Program stack overflow: " + this.id_class.size());
      }
   }

   public rrdG id_class() {
      if (this.id_class.isEmpty()) {
         throw new RuntimeException("Program stack empty");
      } else {
         return this.id_class.pollLast();
      }
   }
}
