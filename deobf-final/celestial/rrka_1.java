package celestial;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class rrka_1 {
   private Class class_ = null;
   private int break_ = 0;
   private ArrayDeque byte_ = new ArrayDeque();

   public rrka_1(Class var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public synchronized Object class_(int var1) {
      Object var2 = this.byte_.pollLast();
      if (var2 == null || Array.getLength(var2) < var1) {
         var2 = Array.newInstance(this.class_, var1);
      }

      return var2;
   }

   public synchronized void class_(Object var1) {
      if (var1 != null) {
         Class var2 = var1.getClass();
         if (var2.getComponentType() != this.class_) {
            throw new IllegalArgumentException("Wrong component type");
         }

         if (this.byte_.size() < this.break_) {
            this.byte_.add(var1);
         }
      }
   }
}
