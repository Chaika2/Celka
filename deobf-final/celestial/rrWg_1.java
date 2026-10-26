package celestial;

import java.util.Iterator;

public class rrWg_1 implements Iterator<String> {
   private int break_;

   public rrWg_1(rrWV var1) {
      this.class_ = var1;
   }

   @Override
   public boolean hasNext() {
      return this.break_ < this.class_.class_.size();
   }

   public String class_() {
      String var1 = this.class_.class_.get(this.break_);
      this.break_++;
      return var1;
   }
}
