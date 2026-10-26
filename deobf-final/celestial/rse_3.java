package celestial;

import java.util.EnumSet;

class rse_3 extends rBk_1 {
   final rsU_2 class_;
   final double break_;
   final double byte_;

   rse_3(rsU_2 var1, rsU_2 var2, double var3, double var5) {
      this.protected_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var5;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private boolean class_(rfH_2 var1, double var2) {
      return !var1.class_(this.class_.Ps(), var2);
   }

   @Override
   public boolean class_() {
      rfH_2 var1 = this.class_.sQ();
      return var1 != null && this.class_(var1, this.break_);
   }

   @Override
   public void throws_() {
      rfH_2 var1 = this.class_.sQ();
      if (var1 != null && rsU_2.break_(this.protected_).native_()) {
         if (this.class_(var1, 10.0)) {
            rjU_2 var2 = new rjU_2((double)var1.b_() - this.class_.rx(), (double)var1.c_() - this.class_.re(), (double)var1.d_() - this.class_.BO())
               .protected_();
            rjU_2 var3 = var2.class_(10.0).break_(this.class_.rx(), this.class_.re(), this.class_.BO());
            rsU_2.byte_(this.protected_).class_(var3.break_, var3.byte_, var3.protected_, this.byte_);
         } else {
            rsU_2.protected_(this.protected_).class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), this.byte_);
         }
      }
   }

   @Override
   public void protected_() {
      this.class_.implements_((rfH_2)null);
      rsU_2.class_(this.protected_).final_();
   }
}
