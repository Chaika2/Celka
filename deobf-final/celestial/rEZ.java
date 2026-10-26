package celestial;

import java.util.Random;

class rEZ extends rBk_1 {
   private final rEu_1 class_;

   public rEZ(rEu_1 var1) {
      this.class_ = var1;
   }

   private boolean class_(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, xc_3 var5, rfH_2 var6) {
      return var4.catch_()
         && !var5.catch_()
         && !var5.class_(xu_3.while_)
         && var5.new_(var1, var6)
         && var3.class_((rRR)var1, var2)
         && var1.class_(this.class_, rfl_3.class_(rjU_2.byte_(var2))).isEmpty();
   }

   @Override
   public boolean class_() {
      if (this.class_.sd() == null) {
         return false;
      } else {
         return !((rYB)this.class_.throws_[7]).B().break_(rRu_1.break_) ? false : this.class_.Sa().nextInt(2000) == 0;
      }
   }

   @Override
   public void throws_() {
      Random var1 = this.class_.Sa();
      rYB var2 = (rYB)this.class_.throws_[7];
      int var3 = rfU_2.byte_(this.class_.rx() - 1.0 + var1.nextDouble() * 2.0);
      int var4 = rfU_2.byte_(this.class_.re() + var1.nextDouble() * 2.0);
      int var5 = rfU_2.byte_(this.class_.BO() - 1.0 + var1.nextDouble() * 2.0);
      rfH_2 var6 = new rfH_2(var3, var4, var5);
      xc_3 var7 = var2.byte_(var6);
      rfH_2 var8 = var6.break_();
      xc_3 var9 = var2.byte_(var8);
      xc_3 var10 = this.class_.sd();
      if (var10 != null) {
         var10 = xd_3.break_(var10, (rYB)this.class_.throws_[7], var6);
         if (this.class_(var2, var6, var10, var7, var9, var8)) {
            var2.class_(var6, var10, 3);
            this.class_.byte_((xc_3)null);
         }
      }
   }
}
