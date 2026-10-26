package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntArrayList;

public final class rjZ_2 implements rjc_3 {
   private final DoubleArrayList id_class;
   private final IntArrayList id_break;
   private final IntArrayList id_byte;

   protected rjZ_2(DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var5 = 0;
      int var6 = 0;
      double var7 = Double.NaN;
      int var9 = var1.size();
      int var10 = var2.size();
      int var11 = var9 + var10;
      this.id_class = new DoubleArrayList(var11);
      this.id_break = new IntArrayList(var11);
      this.id_byte = new IntArrayList(var11);

      while (true) {
         boolean var12 = var5 < var9;
         boolean var13 = var6 < var10;
         if (!var12 && !var13) {
            if (this.id_class.isEmpty()) {
               this.id_class.add(Math.min(var1.getDouble(var9 - 1), var2.getDouble(var10 - 1)));
            }

            return;
         }

         boolean var14 = var12 && (!var13 || var1.getDouble(var5) < var2.getDouble(var6) + 1.0E-7);
         double var15 = var14 ? var1.getDouble(var5++) : var2.getDouble(var6++);
         if ((var5 != 0 && var12 || var14 || var4) && (var6 != 0 && var13 || !var14 || var3)) {
            if (!(var7 >= var15 - 1.0E-7)) {
               this.id_break.add(var5 - 1);
               this.id_byte.add(var6 - 1);
               this.id_class.add(var15);
               var7 = var15;
            } else if (!this.id_class.isEmpty()) {
               this.id_break.set(this.id_break.size() - 1, var5 - 1);
               this.id_byte.set(this.id_byte.size() - 1, var6 - 1);
            }
         }
      }
   }

   @Override
   public boolean id_class(rju_3 var1) {
      for (int var2 = 0; var2 < this.id_class.size() - 1; var2++) {
         if (!var1.merge(this.id_break.getInt(var2), this.id_byte.getInt(var2), var2)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList id_class() {
      return this.id_class;
   }
}
