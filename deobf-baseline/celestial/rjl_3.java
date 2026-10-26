package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;

public final class rjl_3 extends rjC_2 {
   private final DoubleList id_break;
   private final DoubleList id_byte;
   private final DoubleList id_protected;

   protected rjl_3(rjp_3 var1, double[] var2, double[] var3, double[] var4) {
      this(
         var1,
         DoubleArrayList.wrap(Arrays.copyOf(var2, var1.id_break() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var3, var1.id_byte() + 1)),
         DoubleArrayList.wrap(Arrays.copyOf(var4, var1.id_protected() + 1))
      );
   }

   rjl_3(rjp_3 var1, DoubleList var2, DoubleList var3, DoubleList var4) {
      super(var1);
      int var5 = var1.id_break() + 1;
      int var6 = var1.id_byte() + 1;
      int var7 = var1.id_protected() + 1;
      if (var5 == var2.size() && var6 == var3.size() && var7 == var4.size()) {
         this.id_break = var2;
         this.id_byte = var3;
         this.id_protected = var4;
      } else {
         throw (IllegalArgumentException)rqR_2.id_byte(
            new IllegalArgumentException("Lengths of point arrays must be consistent with the size of the VoxelShape.")
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected DoubleList id_class(rpB_2 var1) {
      switch (var1) {
         case X:
            return this.id_break;
         case Y:
            return this.id_byte;
         case Z:
            return this.id_protected;
         default:
            throw new IllegalArgumentException();
      }
   }
}
