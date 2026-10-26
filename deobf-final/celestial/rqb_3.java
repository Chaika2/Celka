package celestial;

import java.util.Random;

public class rqb_3 {
   private final int class_;
   private final int break_;

   public rqb_3(int var1, int var2) {
      if (var2 < var1) {
         throw new IllegalArgumentException("max must be >= minInclusive! Given minInclusive: " + var1 + ", Given max: " + var2);
      } else {
         this.class_ = var1;
         this.break_ = var2;
      }
   }

   @Override
   public String toString() {
      return "IntRange[" + this.class_ + "-" + this.break_ + "]";
   }

   public int class_() {
      return this.class_;
   }

   public static rqb_3 class_(int var0, int var1) {
      return new rqb_3(var0, var1);
   }

   public int class_(Random var1) {
      return this.class_ == this.break_ ? this.class_ : var1.nextInt(this.break_ - this.class_ + 1) + this.class_;
   }

   public int break_() {
      return this.break_;
   }
}
