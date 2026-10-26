package celestial;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;

class LI extends AbstractList<E> {
   private final List<E> id_break;

   LI(LT var1) {
      this.id_class = var1;
      this.id_break = Lists.newArrayList();
   }

   @Override
   public int size() {
      return this.id_break.size();
   }

   public E id_class(int var1) {
      return (E)((Lt_1)this.id_break.get(var1));
   }

   public E id_class(int var1, E var2) {
      Lt_1 var3 = this.id_break.set(var1, var2);
      this.id_class.id_case(var2);
      return (E)var3;
   }

   public E id_break(int var1) {
      return (E)((Lt_1)this.id_break.remove(var1));
   }

   public void id_break(int var1, E var2) {
      this.id_break.add(var1, var2);
      this.id_class.id_case(var2);
   }
}
