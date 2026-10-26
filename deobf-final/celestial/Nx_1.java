package celestial;

public class Nx_1 extends cr_3 {
   private final cb_3 class_;
   private int package_;

   @Override
   public void byte_() {
      this.package_++;
      if (!(Boolean)this.class_.throws_[27] && (this.package_ <= 20 || this.class_.Sy())) {
         this.catch_ = (double)((float)this.class_.rx());
         this.private_ = (double)((float)this.class_.re());
         this.implements_ = (double)((float)this.class_.BO());
         float var1 = (float)this.class_.rv().catch_();
         if ((double)var1 >= 1.0E-7) {
            this.throws_ = rfU_2.class_(var1 / 4.0F, 0.0F, 1.0F);
         } else {
            this.throws_ = 0.0F;
         }

         if (this.package_ < 20) {
            this.throws_ = 0.0F;
         } else if (this.package_ < 40) {
            this.throws_ = (float)((double)this.throws_ * ((double)(this.package_ - 20) / 20.0));
         }

         float var2 = 0.8F;
         if (this.throws_ > 0.8F) {
            this.case_ = 1.0F + (this.throws_ - 0.8F);
         } else {
            this.case_ = 1.0F;
         }
      } else {
         this.super_();
      }
   }

   public Nx_1(cb_3 var1) {
      super(rqn_3.Bz, rqL_2.PLAYERS);
      this.class_ = var1;
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 0.1F;
   }
}
