package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class rjZ_2 implements rjc_3 {
   private final DoubleArrayList class_;
   private final IntArrayList break_;
   private final IntArrayList byte_;

   protected rjZ_2(DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var5 = 0;
      int var6 = 0;
      double var7 = Double.NaN;
      int var9 = var1.size();
      int var10 = var2.size();
      int var11 = var9 + var10;
      this.class_ = new DoubleArrayList(var11);
      this.break_ = new IntArrayList(var11);
      this.byte_ = new IntArrayList(var11);

      while (true) {
         boolean var12 = var5 < var9;
         boolean var13 = var6 < var10;
         if (!var12 && !var13) {
            if (this.class_.isEmpty()) {
               this.class_.add(Math.min(var1.getDouble(var9 - 1), var2.getDouble(var10 - 1)));
            }

            return;
         }

         boolean var14 = var12 && (!var13 || var1.getDouble(var5) < var2.getDouble(var6) + 1.0E-7);
         double var15 = var14 ? var1.getDouble(var5++) : var2.getDouble(var6++);
         if ((var5 != 0 && var12 || var14 || var4) && (var6 != 0 && var13 || !var14 || var3)) {
            if (!(var7 >= var15 - 1.0E-7)) {
               this.break_.add(var5 - 1);
               this.byte_.add(var6 - 1);
               this.class_.add(var15);
               var7 = var15;
            } else if (!this.class_.isEmpty()) {
               this.break_.set(this.break_.size() - 1, var5 - 1);
               this.byte_.set(this.byte_.size() - 1, var6 - 1);
            }
         }
      }
   }

   @Override
   public boolean class_(rju_3 var1) {
      for (int var2 = 0; var2 < this.class_.size() - 1; var2++) {
         if (!var1.merge(this.break_.getInt(var2), this.byte_.getInt(var2), var2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList class_() {
      return this.class_;
   }
}
