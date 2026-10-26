package celestial;

import java.util.Objects;

class rob_3 implements roG_2 {
   private final double break_;
   private final double byte_;
   private final long protected_;
   private final long throws_;
   private final double case_;

   @Override
   public double byte_() {
      return Math.max(this.class_.break_() - this.throws_() / 2.0, (double)(-this.class_.implements_));
   }

   rob_3(roE_2 var1, double var2, double var4, long var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var4;
      this.case_ = (double)var6;
      this.throws_ = rqR_2.break_();
      this.protected_ = this.throws_ + var6;
   }

   @Override
   public double class_() {
      return Math.max(this.class_.class_() - this.throws_() / 2.0, (double)(-this.class_.implements_));
   }

   @Override
   public double break_() {
      return Math.min(this.class_.class_() + this.throws_() / 2.0, (double)this.class_.implements_);
   }

   @Override
   public double throws_() {
      double var1 = (double)(rqR_2.break_() - this.throws_) / this.case_;
      return var1 < 1.0 ? rfU_2.protected_(var1, this.break_, this.byte_) : this.byte_;
   }

   @Override
   public void finally_() {
   }

   @Override
   public long catch_() {
      return this.protected_ - rqR_2.break_();
   }

   @Override
   public void extends_() {
   }

   @Override
   public double case_() {
      return Math.abs(this.break_ - this.byte_) / (double)(this.protected_ - this.throws_);
   }

   @Override
   public roB_2 implements_() {
      return this.byte_ < this.break_ ? roB_2.SHRINKING : roB_2.GROWING;
   }

   @Override
   public double protected_() {
      return Math.min(this.class_.break_() + this.throws_() / 2.0, (double)this.class_.implements_);
   }

   @Override
   public double private_() {
      return this.byte_;
   }

   @Override
   public rjC_2 volatile_() {
      return rjw_3.class_(
         rjw_3.class_,
         rjw_3.class_(
            Math.floor(this.class_()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.byte_()),
            Math.ceil(this.break_()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.protected_())
         ),
         rjN_2.throws_
      );
   }

   @Override
   public roG_2 native_() {
      Object var10000;
      if (this.catch_() <= 0L) {
         roE_2 var10002 = this.class_;
         Objects.requireNonNull(this.class_);
         var10000 = new roO_2(var10002, this.byte_);
      } else {
         var10000 = this;
      }

      return (roG_2)var10000;
   }
}
