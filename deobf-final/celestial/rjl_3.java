package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public final class rjl_3 extends rjC_2 {
   private final DoubleList break_;
   private final DoubleList byte_;
   private final DoubleList protected_;

   protected rjl_3(rjp_3 var1, double[] var2, double[] var3, double[] var4) {
      this(
         var1,
         DoubleArrayList.wrap(Arrays.copyOf(var2, var1.break_() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var3, var1.byte_() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var4, var1.protected_() + 1))
      );
   }

   rjl_3(rjp_3 var1, DoubleList var2, DoubleList var3, DoubleList var4) {
      super(var1);
      int var5 = var1.break_() + 1;
      int var6 = var1.byte_() + 1;
      int var7 = var1.protected_() + 1;
      if (var5 == var2.size() && var6 == var3.size() && var7 == var4.size()) {
         this.break_ = var2;
         this.byte_ = var3;
         this.protected_ = var4;
      } else {
         throw (IllegalArgumentException)rqR_2.byte_(
            new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.")
         );
      }
   }

   @Override
   protected DoubleList class_(rpB_2 var1) {
      switch (var1) {
         case X:
            return this.break_;
         case Y:
            return this.byte_;
         case Z:
            return this.protected_;
         default:
            throw new IllegalArgumentException();
      }
   }
}
