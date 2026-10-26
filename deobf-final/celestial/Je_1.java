package celestial;

import java.util.Random;

public abstract class Je_1 extends JR implements kX_2 {
   public static final rCm_1 int_ = rCT.W;
   private final double new_;

   protected Je_1(Jq_1 var1, rpr_3 var2, rjC_2 var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.new_ = var5;
      this.extends_(this.abstract_.break_().class_(int_, Integer.valueOf(0)));
   }

   @Override
   public xc_3 class_(rRg_1 var1) {
      return this.continue_().class_(int_, Integer.valueOf(var1.long_().nextInt(25)));
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return this.private_(var1.byte_(var2.break_(this.volatile_)));
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      rfH_2 var5 = var3.break_(this.volatile_);
      int var6 = Math.min(var4.byte_(int_) + 1, 25);
      int var7 = this.class_(var2);

      for (int var8 = 0; var8 < var7 && this.private_(var1.byte_(var5)); var8++) {
         var1.break_(var5, var4.class_(int_, Integer.valueOf(var6)));
         var5 = var5.break_(this.volatile_);
         var6 = Math.min(var6 + 1, 25);
      }
   }

   protected abstract int class_(Random var1);

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.byte_(int_) < 25 && var4.nextDouble() < this.new_) {
         rfH_2 var5 = var3.break_(this.volatile_);
         if (this.private_(var2.byte_(var5))) {
            var2.break_(var5, var1.class_(int_));
         }
      }
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == this.volatile_.case_() && !var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      if (var2 != this.volatile_ || !var3.class_(this) && !var3.class_(this.break_())) {
         if (this.final_) {
            var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         return this.break_().continue_();
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(int_);
   }

   @Override
   protected Je_1 implements_() {
      return this;
   }

   protected abstract boolean private_(xc_3 var1);

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(int_) < 25;
   }
}
