package celestial;

import java.util.function.IntUnaryOperator;

public class rWD implements IntUnaryOperator {
   final Integer class_;
   final Integer break_;
   private final IntUnaryOperator byte_;

   rWD(Integer var1, Integer var2) {
      this.class_ = var1;
      this.break_ = var2;
      if (var1 == null) {
         if (var2 == null) {
            this.byte_ = var0 -> var0;
         } else {
            int var3 = var2;
            this.byte_ = var1x -> Math.min(var3, var1x);
         }
      } else {
         int var5 = var1;
         if (var2 == null) {
            this.byte_ = var1x -> Math.max(var5, var1x);
         } else {
            int var4 = var2;
            this.byte_ = var2x -> rfU_2.class_(var2x, var5, var4);
         }
      }
   }

   public static rWD class_(int var0) {
      return new rWD(var0, (Integer)null);
   }

   public static rWD class_(int var0, int var1) {
      return new rWD(var0, var1);
   }

   public static rWD break_(int var0) {
      return new rWD((Integer)null, var0);
   }

   @Override
   public int applyAsInt(int var1) {
      return this.byte_.applyAsInt(var1);
   }
}
