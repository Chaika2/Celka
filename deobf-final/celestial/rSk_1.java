package celestial;

public class rSk_1 extends rBU {
   protected final float private_;

   public rSk_1(aA_2 var1, double var2) {
      this(var1, var2, 0.001F);
   }

   public rSk_1(aA_2 var1, double var2, float var4) {
      super(var1, var2);
      this.private_ = var4;
   }

   @Override
   protected rjU_2 catch_() {
      if (this.class_.Pa()) {
         rjU_2 var1 = iX_2.break_(this.class_, 15, 7);
         return var1 == null ? super.catch_() : var1;
      } else {
         return this.class_.Sa().nextFloat() >= this.private_ ? iX_2.break_(this.class_, 10, 7) : super.catch_();
      }
   }
}
