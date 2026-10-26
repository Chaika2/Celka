package celestial;

import java.util.EnumSet;
import java.util.Random;

class rGv_1 extends rBU {
   private rpr_3 private_;
   private boolean implements_;

   @Override
   public void byte_() {
      if (!this.implements_) {
         super.byte_();
      } else {
         rYB var1 = (rYB)this.class_.throws_[7];
         rfH_2 var2 = new rfH_2(this.class_.rx(), this.class_.re() + 0.5, this.class_.BO()).break_(this.private_);
         xc_3 var3 = var1.byte_(var2);
         if (WT.private_(var3)) {
            var1.class_(var2, WT.class_(var3.break_()), 3);
            this.class_.float_();
            this.class_.PD();
         }
      }
   }

   public rGv_1(rGZ var1) {
      super(var1, 1.0, 10);
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.class_.I_() != null) {
         return false;
      } else if (!this.class_.public_().native_()) {
         return false;
      } else {
         Random var1 = this.class_.Sa();
         if (((rYB)this.class_.throws_[7]).B().break_(rRu_1.break_) && var1.nextInt(10) == 0) {
            this.private_ = rpr_3.class_(var1);
            rfH_2 var2 = new rfH_2(this.class_.rx(), this.class_.re() + 0.5, this.class_.BO()).break_(this.private_);
            xc_3 var3 = ((rYB)this.class_.throws_[7]).byte_(var2);
            if (WT.private_(var3)) {
               this.implements_ = true;
               return true;
            }
         }

         this.implements_ = false;
         return super.class_();
      }
   }

   @Override
   public boolean break_() {
      return this.implements_ ? false : super.break_();
   }
}
