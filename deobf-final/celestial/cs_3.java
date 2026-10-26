package celestial;

public class cs_3 extends cr_3 {
   private final cb_3 class_;
   private int package_;

   @Override
   public void byte_() {
      if (!(Boolean)this.class_.throws_[27] && this.package_ >= 0) {
         if (this.class_.W()) {
            this.package_++;
         } else {
            this.package_ -= 2;
         }

         this.package_ = Math.min(this.package_, 40);
         this.throws_ = Math.max(0.0F, Math.min((float)this.package_ / 40.0F, 1.0F));
      } else {
         this.super_();
      }
   }

   public cs_3(cb_3 var1) {
      super(rqn_3.super_, rqL_2.AMBIENT);
      this.class_ = var1;
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 1.0F;
      this.volatile_ = true;
      this.final_ = true;
   }
}
