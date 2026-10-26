package celestial;

import java.util.ArrayDeque;
import java.util.Deque;

public class rrdb_1 {
   private Deque<rrdG> class_ = new ArrayDeque<>();

   public void class_(rrdG var1) {
      this.class_.addLast(var1);
      if (this.class_.size() > 100) {
         throw new RuntimeException("Program stack overflow: " + this.class_.size());
      }
   }

   public rrdG class_() {
      if (this.class_.isEmpty()) {
         throw new RuntimeException("Program stack empty");
      } else {
         return this.class_.pollLast();
      }
   }
}
