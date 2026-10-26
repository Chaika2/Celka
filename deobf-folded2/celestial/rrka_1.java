package celestial;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class rrka_1 {
   private Class id_class = null;
   private int id_break = 0;
   private ArrayDeque id_byte = new ArrayDeque();

   public rrka_1(Class var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public synchronized Object id_class(int var1) {
      Object var2 = this.id_byte.pollLast();
      if (var2 == null || Array.getLength(var2) < var1) {
         var2 = Array.newInstance(this.id_class, var1);
      }

      return var2;
   }

   public synchronized void id_class(Object var1) {
      if (var1 != null) {
         Class var2 = var1.getClass();
         if (var2.getComponentType() != this.id_class) {
            throw new IllegalArgumentException("Wrong component type");
         }

         if (this.id_byte.size() < this.id_break) {
            this.id_byte.add(var1);
         }
      }
   }
}
