package celestial;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class rjv_3 extends AbstractDoubleList implements rjc_3 {
   private final DoubleList class_;
   private final DoubleList break_;
   private final boolean byte_;

   public rjv_3(DoubleList var1, DoubleList var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public int size() {
      return this.class_.size() + this.break_.size();
   }

   public double getDouble(int var1) {
      return var1 < this.class_.size() ? this.class_.getDouble(var1) : this.break_.getDouble(var1 - this.class_.size());
   }

   @Override
   public DoubleList class_() {
      return this;
   }

   @Override
   public boolean class_(rju_3 var1) {
      return this.byte_ ? this.break_((var1x, var2, var3) -> var1.merge(var2, var1x, var3)) : this.break_(var1);
   }

   private boolean break_(rju_3 var1) {
      int var2 = this.class_.size() - 1;

      for (int var3 = 0; var3 < var2; var3++) {
         if (!var1.merge(var3, -1, var3)) {
            return false;
         }
      }

      if (!var1.merge(var2, -1, var2)) {
         return false;
      } else {
         for (int var4 = 0; var4 < this.break_.size(); var4++) {
            if (!var1.merge(var2, var4, var2 + 1 + var4)) {
               return false;
            }
         }

         return true;
      }
   }
}
