package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class rKw_1 implements rKn_1 {
   private final rKI[] class_;
   private final double break_;
   private final double byte_;

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
            this.class_ = new rKI[var5];
            if (var4 >= 0 && var4 < var5 && var2.contains(0)) {
               this.class_[var4] = var6;
            }

            for (int var8 = var4 + 1; var8 < var5; var8++) {
               if (var8 >= 0 && var2.contains(var7 - var8)) {
                  this.class_[var8] = new rKI(var1);
               } else {
                  var1.class_(262);
               }
            }

            if (var4 > 0) {
               long var12 = (long)(var6.class_(var6.break_, var6.byte_, var6.protected_) * 9.223372E18F);
               rqm_3 var10 = new rqm_3(var12);

               for (int var11 = var7 - 1; var11 >= 0; var11--) {
                  if (var11 < var5 && var2.contains(var7 - var11)) {
                     this.class_[var11] = new rKI(var10);
                  } else {
                     var10.class_(262);
                  }
               }
            }

            this.byte_ = Math.pow(2.0, (double)var4);
            this.break_ = 1.0 / (Math.pow(2.0, (double)var5) - 1.0);
         }
      }
   }

   public rKw_1(rqm_3 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public rKw_1(rqm_3 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public double class_(double var1, double var3, boolean var5) {
      double var6 = 0.0;
      double var8 = this.byte_;
      double var10 = this.break_;

      for (rKI var15 : this.class_) {
         if (var15 != null) {
            var6 += var15.class_(var1 * var8 + (var5 ? var15.break_ : 0.0), var3 * var8 + (var5 ? var15.byte_ : 0.0)) * var10;
         }

         var8 /= 2.0;
         var10 *= 2.0;
      }

      return var6;
   }

   @Override
   public double class_(double var1, double var3, double var5, double var7) {
      return this.class_(var1, var3, true) * 0.55;
   }
}
