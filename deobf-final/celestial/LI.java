package celestial;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;

class LI extends AbstractList<E> {
   private final List<E> break_;

   LI(LT var1) {
      this.class_ = var1;
      this.break_ = Lists.newArrayList();
   }

   @Override
   public int size() {
      return this.break_.size();
   }

   public E class_(int var1) {
      return (E)((Lt_1)this.break_.get(var1));
   }

   public E class_(int var1, E var2) {
      Lt_1 var3 = this.break_.set(var1, var2);
      this.class_.case_(var2);
      return (E)var3;
   }

   public E break_(int var1) {
      return (E)((Lt_1)this.break_.remove(var1));
   }

   public void break_(int var1, E var2) {
      this.break_.add(var1, var2);
      this.class_.case_(var2);
   }
}
