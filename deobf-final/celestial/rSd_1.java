package celestial;

public class rSd_1 extends rSk_1 {
   public rSd_1(aA_2 var1, double var2) {
      super(var1, var2);
   }

   private rjU_2 finally_() {
      rfH_2 var1 = this.class_.Bs();
      rfw_3 var2 = new rfw_3();
      rfw_3 var3 = new rfw_3();

      for (rfH_2 var5 : rfH_2.break_(
         rfU_2.byte_(this.class_.rx() - 3.0),
         rfU_2.byte_(this.class_.re() - 6.0),
         rfU_2.byte_(this.class_.BO() - 3.0),
         rfU_2.byte_(this.class_.rx() + 3.0),
         rfU_2.byte_(this.class_.re() + 6.0),
         rfU_2.byte_(this.class_.BO() + 3.0)
      )) {
         if (!var1.equals(var5)) {
            xd_3 var6 = ((rYB)this.class_.throws_[7]).byte_(var3.class_(var5, rpr_3.DOWN)).break_();
            boolean var7 = var6 instanceof kZ_2 || var6.class_(rls_3.super_);
            if (var7 && ((rYB)this.class_.throws_[7]).finally_(var5) && ((rYB)this.class_.throws_[7]).finally_(var2.class_(var5, rpr_3.UP))) {
               return rjU_2.protected_(var5);
            }
         }
      }

      return null;
   }

   @Override
   protected rjU_2 catch_() {
      rjU_2 var1 = null;
      if (this.class_.rT()) {
         var1 = iX_2.break_(this.class_, 15, 15);
      }

      if (this.class_.Sa().nextFloat() >= this.private_) {
         var1 = this.finally_();
      }

      return var1 == null ? super.catch_() : var1;
   }
}
