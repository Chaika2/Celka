package celestial;

public class NO extends cr_3 {
   private int class_;
   private int package_;

   @Override
   public void byte_() {
      if (this.package_ < 0) {
         this.super_();
      }

      this.package_ = this.package_ + this.class_;
      this.throws_ = rfU_2.class_((float)this.package_ / 40.0F, 0.0F, 1.0F);
   }

   public NO(rqA_2 var1) {
      super(var1, rqL_2.AMBIENT);
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 1.0F;
      this.final_ = true;
   }

   public void class_() {
      this.package_ = Math.min(this.package_, 40);
      this.class_ = -1;
   }

   public void break_() {
      this.package_ = Math.max(0, this.package_);
      this.class_ = 1;
   }
}
