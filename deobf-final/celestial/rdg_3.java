package celestial;

class rdg_3 extends Uy_1 {
   private final Uy_1 break_ = new Uy_1();

   @Override
   public rdn_3 class_(Uq_1 var1, rdn_3 var2) {
      rpr_3 var3 = var1.throws_().byte_(dQ_2.volatile_);
      rrEm_1 var4 = var1.catch_();
      double var5 = var1.class_() + (double)var3.implements_() * 1.125;
      double var7 = Math.floor(var1.break_()) + (double)var3.finally_();
      double var9 = var1.byte_() + (double)var3.extends_() * 1.125;
      rfH_2 var11 = var1.protected_().break_(var3);
      xc_3 var12 = var4.byte_(var11);
      rCR var13 = var12.break_() instanceof Jo_1 ? var12.byte_(((Jo_1)var12.break_()).implements_()) : rCR.NORTH_SOUTH;
      double var14;
      if (var12.class_(rls_3.float_)) {
         if (var13.break_()) {
            var14 = 0.6;
         } else {
            var14 = 0.1;
         }
      } else {
         if (!var12.catch_() || !var4.byte_(var11.break_()).class_(rls_3.float_)) {
            return this.break_.dispense(var1, var2);
         }

         xc_3 var16 = var4.byte_(var11.break_());
         rCR var17 = var16.break_() instanceof Jo_1 ? var16.byte_(((Jo_1)var16.break_()).implements_()) : rCR.NORTH_SOUTH;
         if (var3 != rpr_3.DOWN && var17.break_()) {
            var14 = -0.4;
         } else {
            var14 = -0.9;
         }
      }

      rsJ_2 var18 = rsJ_2.class_(var4, var5, var7 + var14, var9, ((rdV_2)var2.break_()).break_);
      if (var2.this_()) {
         var18.break_(var2.continue_());
      }

      var4.a_(var18);
      var2.catch_(1);
      return var2;
   }

   @Override
   protected void class_(Uq_1 var1) {
      var1.catch_().byte_(1000, var1.protected_(), 0);
   }
}
