package celestial;

public class rSf_1 extends rSp_1 {
   private boolean break_;
   private rLC byte_;
   private rjU_2 protected_;

   @Override
   public void byte_() {
      this.break_ = true;
      this.byte_ = null;
      this.protected_ = null;
   }

   public rSf_1(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void break_() {
      if (!this.break_ && this.byte_ != null) {
         rfH_2 var1 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_);
         if (!var1.class_(this.class_.Ps(), 10.0)) {
            this.class_.L().class_(rST.class_);
         }
      } else {
         this.break_ = false;
         this.finally_();
      }
   }

   private void finally_() {
      int var1 = this.class_.catch_();
      rjU_2 var2 = this.class_.byte_(1.0F);
      int var3 = this.class_.continue_(-var2.break_ * 40.0, 105.0, -var2.protected_ * 40.0);
      if (this.class_.n() != null && this.class_.n().byte_() > 0) {
         var3 %= 12;
         if (var3 < 0) {
            var3 += 12;
         }
      } else {
         var3 -= 12;
         var3 &= 7;
         var3 += 12;
      }

      this.byte_ = this.class_.class_(var1, var3, (rLq_1)null);
      this.extends_();
   }

   private void extends_() {
      if (this.byte_ != null) {
         this.byte_.class_();
         if (!this.byte_.byte_()) {
            rfH_2 var1 = this.byte_.catch_();
            this.byte_.class_();

            double var2;
            do {
               var2 = (double)((float)var1.c_() + this.class_.Sa().nextFloat() * 20.0F);
            } while (var2 < (double)var1.c_());

            this.protected_ = new rjU_2((double)var1.b_(), var2, (double)var1.d_());
         }
      }
   }

   @Override
   public rjU_2 case_() {
      return this.protected_;
   }

   @Override
   public rST<rSf_1> protected_() {
      return rST.throws_;
   }
}
