package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import java.util.stream.IntStream;

public class rKt_1 implements rKn_1 {
   private final rKy_1[] class_;
   private final DoubleList break_;
   private final double byte_;
   private final double protected_;

   private rKt_1(rqm_3 var1, Pair<Integer, DoubleList> var2) {
      int var3 = (Integer)var2.getFirst();
      this.break_ = (DoubleList)var2.getSecond();
      rKy_1 var4 = new rKy_1(var1);
      int var5 = this.break_.size();
      int var6 = -var3;
      this.class_ = new rKy_1[var5];
      if (var6 >= 0 && var6 < var5) {
         double var7 = this.break_.getDouble(var6);
         if (var7 != 0.0) {
            this.class_[var6] = var4;
         }
      }

      for (int var13 = var6 - 1; var13 >= 0; var13--) {
         if (var13 < var5) {
            double var8 = this.break_.getDouble(var13);
            if (var8 != 0.0) {
               this.class_[var13] = new rKy_1(var1);
            } else {
               var1.class_(262);
            }
         } else {
            var1.class_(262);
         }
      }

      if (var6 < var5 - 1) {
         long var14 = (long)(var4.class_(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372E18F);
         rqm_3 var9 = new rqm_3(var14);

         for (int var10 = var6 + 1; var10 < var5; var10++) {
            if (var10 >= 0) {
               double var11 = this.break_.getDouble(var10);
               if (var11 != 0.0) {
                  this.class_[var10] = new rKy_1(var9);
               } else {
                  var9.class_(262);
               }
            } else {
               var9.class_(262);
            }
         }
      }

      this.protected_ = Math.pow(2.0, (double)(-var6));
      this.byte_ = Math.pow(2.0, (double)(var5 - 1)) / (Math.pow(2.0, (double)var5) - 1.0);
   }

   private rKt_1(rqm_3 var1, IntSortedSet var2) {
      this(var1, class_(var2));
   }

   public rKt_1(rqm_3 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public rKt_1(rqm_3 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public double class_(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      double var12 = 0.0;
      double var14 = this.protected_;
      double var16 = this.byte_;

      for (int var18 = 0; var18 < this.class_.length; var18++) {
         rKy_1 var19 = this.class_[var18];
         if (var19 != null) {
            var12 += this.break_.getDouble(var18)
               * var19.class_(class_(var1 * var14), var11 ? -var19.break_ : class_(var3 * var14), class_(var5 * var14), var7 * var14, var9 * var14)
               * var16;
         }

         var14 *= 2.0;
         var16 /= 2.0;
      }

      return var12;
   }

   public rKy_1 class_(int var1) {
      return this.class_[this.class_.length - 1 - var1];
   }

   @Override
   public double class_(double var1, double var3, double var5, double var7) {
      return this.class_(var1, var3, 0.0, var5, var7, false);
   }

   public static double class_(double var0) {
      return var0 - (double)rfU_2.protected_(var0 / 3.3554432E7 + 0.5) * 3.3554432E7;
   }

   public double class_(double var1, double var3, double var5) {
      return this.class_(var1, var3, var5, 0.0, 0.0, false);
   }

   private static Pair<Integer, DoubleList> class_(IntSortedSet var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int var1 = -var0.firstInt();
         int var2 = var0.lastInt();
         int var3 = var1 + var2 + 1;
         if (var3 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            DoubleArrayList var4 = new DoubleArrayList(new double[var3]);
            IntBidirectionalIterator var5 = var0.iterator();

            while (var5.hasNext()) {
               int var6 = var5.nextInt();
               var4.set(var6 + var1, 1.0);
            }

            return Pair.of(-var1, var4);
         }
      }
   }

   public static rKt_1 class_(rqm_3 var0, int var1, DoubleList var2) {
      return new rKt_1(var0, Pair.of(var1, var2));
   }
}
