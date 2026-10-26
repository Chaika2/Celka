package celestial;

import java.util.Comparator;

public class rrbq_3 implements Comparator {
   @Override
   public int compare(Object var1, Object var2) {
      rrbH_2 var3 = (rrbH_2)var1;
      rrbH_2 var4 = (rrbH_2)var2;
      if (var3.synchronized_ != var4.synchronized_) {
         return var4.synchronized_ - var3.synchronized_;
      } else {
         return !rrbb_3.class_(var3.break_, var4.break_) ? var3.break_.compareTo(var4.break_) : var3.class_.compareTo(var4.class_);
      }
   }
}
