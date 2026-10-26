package celestial;

import java.util.EnumSet;

class rGR extends rBk_1 {
   @Override
   public void byte_() {
      iB_2 var1 = this.class_.I_();
      rjU_2 var2 = var1.new_(1.0F);
      rGg_1.break_(this.class_).class_(var2.break_, var2.byte_, var2.protected_, 1.0);
      this.class_.this_(true);
      this.class_.class_(rqn_3.dD, 1.0F, 1.0F);
   }

   public rGR(rGg_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      return this.class_.I_() != null && !this.class_.super_().break_() && rGg_1.class_(this.class_).nextInt(7) == 0
         ? this.class_.int_(this.class_.I_()) > 4.0
         : false;
   }

   @Override
   public boolean break_() {
      return this.class_.super_().break_() && this.class_.sx() && this.class_.I_() != null && this.class_.I_().BM();
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      if (this.class_.rN().byte_(var1.rN())) {
         this.class_.public_(var1);
         this.class_.this_(false);
      } else {
         double var2 = this.class_.int_(var1);
         if (var2 < 9.0) {
            rjU_2 var4 = var1.new_(1.0F);
            rGg_1.byte_(this.class_).class_(var4.break_, var4.byte_, var4.protected_, 1.0);
         }
      }
   }

   @Override
   public void protected_() {
      this.class_.this_(false);
   }
}
