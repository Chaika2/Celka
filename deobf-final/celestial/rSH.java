package celestial;

public class rSH extends rSp_1 {
   private static final ay_3 break_ = new ay_3().class_(128.0);
   private rLC byte_;
   private rjU_2 protected_;

   @Override
   public void byte_() {
      this.byte_ = null;
      this.protected_ = null;
   }

   public rSH(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void break_() {
      double var1 = this.protected_ == null ? 0.0 : this.protected_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO());
      if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.class_.throws_[23] || (Boolean)this.class_.throws_[24]) {
         this.finally_();
      }
   }

   private void finally_() {
      if (this.byte_ == null || this.byte_.byte_()) {
         int var1 = this.class_.catch_();
         rfH_2 var2 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_);
         rhd_3 var3 = ((rYB)this.class_.throws_[7]).class_(break_, (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
         int var4;
         if (var3 != null) {
            rjU_2 var5 = new rjU_2(var3.rx(), 0.0, var3.BO()).protected_();
            var4 = this.class_.continue_(-var5.break_ * 40.0, 105.0, -var5.protected_ * 40.0);
         } else {
            var4 = this.class_.continue_(40.0, (double)var2.c_(), 0.0);
         }

         rLq_1 var6 = new rLq_1(var2.b_(), var2.c_(), var2.d_());
         this.byte_ = this.class_.class_(var1, var4, var6);
         if (this.byte_ != null) {
            this.byte_.class_();
         }
      }

      this.extends_();
      if (this.byte_ != null && this.byte_.byte_()) {
         this.class_.L().class_(rST.protected_);
      }
   }

   private void extends_() {
      if (this.byte_ != null && !this.byte_.byte_()) {
         rfH_2 var1 = this.byte_.catch_();
         this.byte_.class_();
         double var2 = (double)var1.b_();
         double var4 = (double)var1.d_();

         double var6;
         do {
            var6 = (double)((float)var1.c_() + this.class_.Sa().nextFloat() * 20.0F);
         } while (var6 < (double)var1.c_());

         this.protected_ = new rjU_2(var2, var6, var4);
      }
   }

   @Override
   public rjU_2 case_() {
      return this.protected_;
   }

   @Override
   public rST<rSH> protected_() {
      return rST.byte_;
   }
}
