package celestial;

class roO_2 implements roG_2 {
   private final double break_;
   private double byte_;
   private double protected_;
   private double throws_;
   private double case_;
   private rjC_2 catch_;

   @Override
   public double byte_() {
      return this.protected_;
   }

   public roO_2(roE_2 var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.final_();
   }

   @Override
   public double class_() {
      return this.byte_;
   }

   @Override
   public double break_() {
      return this.throws_;
   }

   @Override
   public double throws_() {
      return this.break_;
   }

   @Override
   public void finally_() {
      this.final_();
   }

   @Override
   public long catch_() {
      return 0L;
   }

   @Override
   public void extends_() {
      this.final_();
   }

   @Override
   public double case_() {
      return 0.0;
   }

   @Override
   public roB_2 implements_() {
      return roB_2.STATIONARY;
   }

   @Override
   public double protected_() {
      return this.case_;
   }

   @Override
   public double private_() {
      return this.break_;
   }

   private void final_() {
      this.byte_ = Math.max(this.class_.class_() - this.break_ / 2.0, (double)(-this.class_.implements_));
      this.protected_ = Math.max(this.class_.break_() - this.break_ / 2.0, (double)(-this.class_.implements_));
      this.throws_ = Math.min(this.class_.class_() + this.break_ / 2.0, (double)this.class_.implements_);
      this.case_ = Math.min(this.class_.break_() + this.break_ / 2.0, (double)this.class_.implements_);
      this.catch_ = rjw_3.class_(
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
   public rjC_2 volatile_() {
      return this.catch_;
   }

   @Override
   public roG_2 native_() {
      return this;
   }
}
