package celestial;

public class Ny_1 extends cr_3 {
   private final rhd_3 class_;
   private final rsJ_2 package_;

   @Override
   public void byte_() {
      if (!(Boolean)this.package_.throws_[27] && this.class_.Pm() && this.class_.ra() == this.package_) {
         float var1 = rfU_2.class_(an_3.case_(this.package_.rv()));
         if ((double)var1 >= 0.01) {
            this.throws_ = 0.0F + rfU_2.class_(var1, 0.0F, 1.0F) * 0.75F;
         } else {
            this.throws_ = 0.0F;
         }
      } else {
         this.super_();
      }
   }

   public Ny_1(rhd_3 var1, rsJ_2 var2) {
      super(rqn_3.Gj, rqL_2.NEUTRAL);
      this.class_ = var1;
      this.package_ = var2;
      this.native_ = NN.NONE;
      this.finally_ = true;
      this.extends_ = 0;
      this.throws_ = 0.0F;
   }

   @Override
   public boolean throws_() {
      return !this.package_.BF();
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
