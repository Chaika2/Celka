package celestial;

import java.util.EnumSet;

class rbI_2 extends rBk_1 {
   @Override
   public void byte_() {
      rjU_2 var1 = this.catch_();
      if (var1 != null) {
         rbF_2.instanceof_(this.class_).class_(rbF_2.try_(this.class_).class_(new rfH_2(var1), 1), 1.0);
      }
   }

   rbI_2(rbF_2 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      return rbF_2.public_(this.class_).native_() && rbF_2.goto_(this.class_).nextInt(10) == 0;
   }

   @Override
   public boolean break_() {
      return rbF_2.while_(this.class_).volatile_();
   }

   private rjU_2 catch_() {
      rjU_2 var1;
      if (this.class_.sH() && !this.class_.break_(this.class_.abstract_, 22)) {
         rjU_2 var2 = rjU_2.class_((rja_3)this.class_.abstract_);
         var1 = var2.protected_(this.class_.Ps()).protected_();
      } else {
         var1 = this.class_.break_(0.0F);
      }

      byte var4 = 8;
      rjU_2 var3 = iX_2.class_(this.class_, 8, 7, var1, (float) (Math.PI / 2), 2, 1);
      return var3 != null ? var3 : iX_2.class_(this.class_, 8, 4, -2, var1, (float) (Math.PI / 2));
   }
}
