package celestial;

import java.util.Random;

class rEF extends rBk_1 {
   private final rEu_1 class_;

   public rEF(rEu_1 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.class_.sd() != null) {
         return false;
      } else {
         return !((rYB)this.class_.throws_[7]).B().break_(rRu_1.break_) ? false : this.class_.Sa().nextInt(20) == 0;
      }
   }

   @Override
   public void throws_() {
      Random var1 = this.class_.Sa();
      rYB var2 = (rYB)this.class_.throws_[7];
      int var3 = rfU_2.byte_(this.class_.rx() - 2.0 + var1.nextDouble() * 4.0);
      int var4 = rfU_2.byte_(this.class_.re() + var1.nextDouble() * 3.0);
      int var5 = rfU_2.byte_(this.class_.BO() - 2.0 + var1.nextDouble() * 4.0);
      rfH_2 var6 = new rfH_2(var3, var4, var5);
      xc_3 var7 = var2.byte_(var6);
      xd_3 var8 = var7.break_();
      rjU_2 var9 = new rjU_2((double)rfU_2.byte_(this.class_.rx()) + 0.5, (double)var4 + 0.5, (double)rfU_2.byte_(this.class_.BO()) + 0.5);
      rjU_2 var10 = new rjU_2((double)var3 + 0.5, (double)var4 + 0.5, (double)var5 + 0.5);
      rff_3 var11 = var2.class_(new rjB_2(var9, var10, rjS_2.OUTLINE, rjs_3.NONE, this.class_));
      boolean var12 = var11.class_().equals(var6);
      if (var8.class_(rls_3.switch_) && var12) {
         var2.class_(var6, false);
         this.class_.byte_(var7.break_().continue_());
      }
   }
}
