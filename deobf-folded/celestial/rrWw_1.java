package celestial;

import java.util.List;

public class rrWw_1 implements rrWI<Object> {
   private List<Object> id_class;
   private int id_break;
   private boolean id_byte;

   @Override
   public boolean hasNext() {
      if (!this.id_byte) {
         rrWt_1.id_class(this);
         return false;
      } else {
         return this.id_byte;
      }
   }

   @Override
   public Object next() {
      if (!this.id_byte) {
         return null;
      } else {
         Object var1 = this.id_class.get(this.id_break);
         this.id_break++;
         this.id_byte = this.id_break < this.id_class.size();
         return var1;
      }
   }

   @Override
   public void id_class(List<Object> var1) {
      if (this.id_byte) {
         throw new RuntimeException("Iterator still used, oldList: " + this.id_class + ", newList: " + var1);
      } else {
         this.id_class = var1;
         this.id_break = 0;
         this.id_byte = var1 != null && this.id_break < var1.size();
      }
   }
}
