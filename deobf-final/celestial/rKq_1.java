package celestial;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;

public class rKq_1 {
   private final double class_;
   private final rKt_1 break_;
   private final rKt_1 byte_;

   private rKq_1(rqm_3 var1, int var2, DoubleList var3) {
      this.break_ = rKt_1.class_(var1, var2, var3);
      this.byte_ = rKt_1.class_(var1, var2, var3);
      int var4 = Integer.MAX_VALUE;
      int var5 = Integer.MIN_VALUE;
      DoubleListIterator var6 = var3.iterator();

      while (var6.hasNext()) {
         int var7 = var6.nextIndex();
         double var8 = var6.nextDouble();
         if (var8 != 0.0) {
            var4 = Math.min(var4, var7);
            var5 = Math.max(var5, var7);
         }
      }

      this.class_ = 0.16666666666666666 / class_(var5 - var4);
   }

   public double class_(double var1, double var3, double var5) {
      double var7 = var1 * 1.0181268882175227;
      double var9 = var3 * 1.0181268882175227;
      double var11 = var5 * 1.0181268882175227;
      return (this.break_.class_(var1, var3, var5) + this.byte_.class_(var7, var9, var11)) * this.class_;
   }

   private static double class_(int var0) {
      return 0.1 * (1.0 + 1.0 / (double)(var0 + 1));
   }

   public static rKq_1 class_(rqm_3 var0, int var1, DoubleList var2) {
      return new rKq_1(var0, var1, var2);
   }
}
