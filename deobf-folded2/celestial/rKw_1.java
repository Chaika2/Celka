package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class rKw_1 implements rKn_1 {
   private final rKI[] id_class;
   private final double id_break;
   private final double id_byte;

   private rKw_1(rqm_3 var1, IntSortedSet var2) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int var3 = -var2.firstInt();
         int var4 = var2.lastInt();
         int var5 = var3 + var4 + 1;
         if (var5 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            rKI var6 = new rKI(var1);
            int var7 = var4;
            this.id_class = new rKI[var5];
            if (var4 >= 0 && var4 < var5 && var2.contains(0)) {
               this.id_class[var4] = var6;
            }

            for (int var8 = var4 + 1; var8 < var5; var8++) {
               if (var8 >= 0 && var2.contains(var7 - var8)) {
                  this.id_class[var8] = new rKI(var1);
               } else {
                  var1.id_class(262);
               }
            }

            if (var4 > 0) {
               long var12 = (long)(var6.id_class(var6.id_break, var6.id_byte, var6.id_protected) * 9.223372E18F);
               rqm_3 var10 = new rqm_3(var12);

               for (int var11 = var7 - 1; var11 >= 0; var11--) {
                  if (var11 < var5 && var2.contains(var7 - var11)) {
                     this.id_class[var11] = new rKI(var10);
                  } else {
                     var10.id_class(262);
                  }
               }
            }

            this.id_byte = Math.pow(2.0, (double)var4);
            this.id_break = 1.0 / (Math.pow(2.0, (double)var5) - 1.0);
         }
      }
   }

   public rKw_1(rqm_3 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public rKw_1(rqm_3 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public double id_class(double var1, double var3, boolean var5) {
      double var6 = 0.0;
      double var8 = this.id_byte;
      double var10 = this.id_break;

      for (rKI var15 : this.id_class) {
         if (var15 != null) {
            var6 += var15.id_class(var1 * var8 + (var5 ? var15.id_break : 0.0), var3 * var8 + (var5 ? var15.id_byte : 0.0)) * var10;
         }

         var8 /= 2.0;
         var10 *= 2.0;
      }

      return var6;
   }

   @Override
   public double id_class(double var1, double var3, double var5, double var7) {
      return this.id_class(var1, var3, true) * 0.55;
   }
}
