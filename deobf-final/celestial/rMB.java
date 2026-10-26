package celestial;

public class rMB extends rBp_1 {
   protected int catch_;

   @Override
   public void byte_() {
      this.catch_ = 0;
      this.private_.this_(false);
      super.byte_();
   }

   public rMB(rba_3 var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.private_ = var1;
   }

   @Override
   public boolean class_() {
      return !this.private_.Sc() && super.class_();
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      xc_3 var3 = var1.byte_(var2);
      return var3.class_(xu_3.XJ) && var3.byte_(zz_3.volatile_) >= 2;
   }

   @Override
   public void throws_() {
      if (this.native_()) {
         if (this.catch_ >= 40) {
            this.final_();
         } else {
            this.catch_++;
         }
      } else if (!this.native_() && rba_3.class_(this.private_).nextFloat() < 0.05F) {
         this.private_.class_(rqn_3.SC, 1.0F, 1.0F);
      }

      super.throws_();
   }

   @Override
   public boolean extends_() {
      return this.protected_ % 100 == 0;
   }

   @Override
   public double private_() {
      return 2.0;
   }

   protected void final_() {
      if (((rYB)this.private_.throws_[7]).B().break_(rRu_1.break_)) {
         xc_3 var1 = ((rYB)this.private_.throws_[7]).byte_(this.throws_);
         if (var1.class_(xu_3.XJ)) {
            int var2 = var1.byte_(zz_3.volatile_);
            var1.class_(zz_3.volatile_, Integer.valueOf(1));
            int var3 = 1 + ((rYB)this.private_.throws_[7]).int_.nextInt(2) + (var2 == 3 ? 1 : 0);
            rdn_3 var4 = this.private_.class_(rXQ.MAINHAND);
            if (var4.class_()) {
               this.private_.class_(rXQ.MAINHAND, new rdn_3(rdy_3.WQ));
               var3--;
            }

            if (var3 > 0) {
               xd_3.class_((rYB)this.private_.throws_[7], this.throws_, new rdn_3(rdy_3.WQ, var3));
            }

            this.private_.class_(rqn_3.dE, 1.0F, 1.0F);
            ((rYB)this.private_.throws_[7]).class_(this.throws_, var1.class_(zz_3.volatile_, Integer.valueOf(1)), 2);
         }
      }
   }
}
