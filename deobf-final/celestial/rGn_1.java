package celestial;

import java.util.EnumSet;

class rGn_1 extends rBk_1 {
   private final rGA class_;
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 300;
      super.byte_();
   }

   public rGn_1(rGA var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         return var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).implements_[18]).class_ ? false : this.class_.super_() instanceof rGy_1;
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.class_.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         return var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).implements_[18]).class_ ? false : --this.break_ > 0;
      }
   }

   @Override
   public void throws_() {
      this.class_.class_(this.class_.I_(), 10.0F, 10.0F);
      ((rGy_1)this.class_.super_()).class_((Float)this.class_.throws_[15], this.class_.n());
   }
}
