package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjv_3 extends AbstractDoubleList implements rjc_3 {
   private final DoubleList id_class;
   private final DoubleList id_break;
   private final boolean id_byte;

   public rjv_3(DoubleList var1, DoubleList var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public int size() {
      return this.id_class.size() + this.id_break.size();
   }

   public double getDouble(int var1) {
      return var1 < this.id_class.size() ? this.id_class.getDouble(var1) : this.id_break.getDouble(var1 - this.id_class.size());
   }

   @Override
   public DoubleList id_class() {
      return this;
   }

   @Override
   public boolean id_class(rju_3 var1) {
      return this.id_byte ? this.id_break((var1x, var2, var3) -> var1.merge(var2, var1x, var3)) : this.id_break(var1);
   }

   private boolean id_break(rju_3 var1) {
      int var2 = this.id_class.size() - 1;

      for (int var3 = 0; var3 < var2; var3++) {
         if (!var1.merge(var3, -1, var3)) {
            return false;
         }
      }

      if (!var1.merge(var2, -1, var2)) {
         return false;
      } else {
         for (int var4 = 0; var4 < this.id_break.size(); var4++) {
            if (!var1.merge(var2, var4, var2 + 1 + var4)) {
               return false;
            }
         }

         return true;
      }
   }
}
