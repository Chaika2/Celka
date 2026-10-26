package celestial;

public class rho_3 extends rhm_3 {
   private int private_ = 200;

   public rho_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.p, var2, var4, var6, var1);
   }

   public rho_3(rYB var1, iB_2 var2) {
      super(aI_2.p, var2, var1);
   }

   public rho_3(aI_2<? extends rho_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_ && !this.class_) {
         ((rYB)this.throws_[7]).class_(rLQ.float_, this.rx(), this.re(), this.BO(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void class_(iB_2 var1) {
      super.class_(var1);
      rLY var2 = new rLY(rLD.public_, this.private_, 0);
      var1.break_(var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Duration", this.private_);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("Duration")) {
         this.private_ = var1.private_("Duration");
      }
   }

   @Override
   protected rdn_3 catch_() {
      return new rdn_3(rdy_3.kW);
   }
}
