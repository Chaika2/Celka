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
   private final rKy_1[] id_class;
   private final DoubleList id_break;
   private final double id_byte;
   private final double id_protected;

   private rKt_1(rqm_3 var1, Pair<Integer, DoubleList> var2) {
      int var3 = (Integer)var2.getFirst();
      this.id_break = (DoubleList)var2.getSecond();
      rKy_1 var4 = new rKy_1(var1);
      int var5 = this.id_break.size();
      int var6 = -var3;
      this.id_class = new rKy_1[var5];
      if (var6 >= 0 && var6 < var5) {
         double var7 = this.id_break.getDouble(var6);
         if (var7 != 0.0) {
            this.id_class[var6] = var4;
         }
      }

      for (int var13 = var6 - 1; var13 >= 0; var13--) {
         if (var13 < var5) {
            double var8 = this.id_break.getDouble(var13);
            if (var8 != 0.0) {
               this.id_class[var13] = new rKy_1(var1);
            } else {
               var1.id_class(262);
            }
         } else {
            var1.id_class(262);
         }
      }

      if (var6 < var5 - 1) {
         long var14 = (long)(var4.id_class(0.0, 0.0, 0.0, 0.0, 0.0) * 9.223372E18F);
         rqm_3 var9 = new rqm_3(var14);

         for (int var10 = var6 + 1; var10 < var5; var10++) {
            if (var10 >= 0) {
               double var11 = this.id_break.getDouble(var10);
               if (var11 != 0.0) {
                  this.id_class[var10] = new rKy_1(var9);
               } else {
                  var9.id_class(262);
               }
            } else {
               var9.id_class(262);
            }
         }
      }

      this.id_protected = Math.pow(2.0, (double)(-var6));
      this.id_byte = Math.pow(2.0, (double)(var5 - 1)) / (Math.pow(2.0, (double)var5) - 1.0);
   }

   private rKt_1(rqm_3 var1, IntSortedSet var2) {
      this(var1, id_class(var2));
   }

   public rKt_1(rqm_3 var1, List<Integer> var2) {
      this(var1, new IntRBTreeSet(var2));
   }

   public rKt_1(rqm_3 var1, IntStream var2) {
      this(var1, var2.boxed().collect(ImmutableList.toImmutableList()));
   }

   public double id_class(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      double var12 = 0.0;
      double var14 = this.id_protected;
      double var16 = this.id_byte;

      for (int var18 = 0; var18 < this.id_class.length; var18++) {
         rKy_1 var19 = this.id_class[var18];
         if (var19 != null) {
            var12 += this.id_break.getDouble(var18)
               * var19.id_class(id_class(var1 * var14), var11 ? -var19.id_break : id_class(var3 * var14), id_class(var5 * var14), var7 * var14, var9 * var14)
               * var16;
         }

         var14 *= 2.0;
         var16 /= 2.0;
      }

      return var12;
   }

   public rKy_1 id_class(int var1) {
      return this.id_class[this.id_class.length - 1 - var1];
   }

   @Override
   public double id_class(double var1, double var3, double var5, double var7) {
      return this.id_class(var1, var3, 0.0, var5, var7, false);
   }

   public static double id_class(double var0) {
      return var0 - (double)rfU_2.id_protected(var0 / 3.3554432E7 + 0.5) * 3.3554432E7;
   }

   public double id_class(double var1, double var3, double var5) {
      return this.id_class(var1, var3, var5, 0.0, 0.0, false);
   }

   private static Pair<Integer, DoubleList> id_class(IntSortedSet var0) {
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

   public static rKt_1 id_class(rqm_3 var0, int var1, DoubleList var2) {
      return new rKt_1(var0, Pair.of(var1, var2));
   }
}
