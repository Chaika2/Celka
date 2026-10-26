package celestial;

public class rSn_1 extends rSp_1 {
   private static final ay_3 break_ = new ay_3().class_(64.0);
   private rLC byte_;
   private rjU_2 protected_;
   private boolean throws_;

   @Override
   public void byte_() {
      this.byte_ = null;
      this.protected_ = null;
   }

   public rSn_1(rSu_1 var1) {
      super(var1);
   }

   private void class_(rhd_3 var1) {
      this.class_.L().class_(rST.break_);
      this.class_.L().break_(rST.break_).class_(var1);
   }

   @Override
   public void class_(rSa_1 var1, rfH_2 var2, rye_3 var3, rhd_3 var4) {
      if (var4 != null && !((rhx_3)var4.implements_[18]).class_) {
         this.class_(var4);
      }
   }

   @Override
   public void break_() {
      double var1 = this.protected_ == null ? 0.0 : this.protected_.protected_(this.class_.rx(), this.class_.re(), this.class_.BO());
      if (var1 < 100.0 || var1 > 22500.0 || (Boolean)this.class_.throws_[23] || (Boolean)this.class_.throws_[24]) {
         this.finally_();
      }
   }

   private void finally_() {
      if (this.byte_ != null && this.byte_.byte_()) {
         rfH_2 var1 = ((rYB)this.class_.throws_[7]).class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, new rfH_2(rUs_1.class_));
         int var2 = this.class_.n() == null ? 0 : this.class_.n().byte_();
         if (this.class_.Sa().nextInt(var2 + 3) == 0) {
            this.class_.L().class_(rST.byte_);
            return;
         }

         double var3 = 64.0;
         rhd_3 var5 = ((rYB)this.class_.throws_[7]).class_(break_, (double)var1.b_(), (double)var1.c_(), (double)var1.d_());
         if (var5 != null) {
            var3 = var1.class_(var5.Ps(), true) / 512.0;
         }

         if (var5 != null
            && !((rhx_3)var5.implements_[18]).class_
            && (this.class_.Sa().nextInt(rfU_2.class_((int)var3) + 2) == 0 || this.class_.Sa().nextInt(var2 + 2) == 0)) {
            this.class_(var5);
            return;
         }
      }

      if (this.byte_ == null || this.byte_.byte_()) {
         int var6 = this.class_.catch_();
         int var7 = var6;
         if (this.class_.Sa().nextInt(8) == 0) {
            this.throws_ = !this.throws_;
            var7 = var6 + 6;
         }

         if (this.throws_) {
            var7++;
         } else {
            var7--;
         }

         if (this.class_.n() != null && this.class_.n().byte_() >= 0) {
            var7 %= 12;
            if (var7 < 0) {
               var7 += 12;
            }
         } else {
            var7 -= 12;
            var7 &= 7;
            var7 += 12;
         }

         this.byte_ = this.class_.class_(var6, var7, (rLq_1)null);
         if (this.byte_ != null) {
            this.byte_.class_();
         }
      }

      this.extends_();
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
   public rST<rSn_1> protected_() {
      return rST.class_;
   }
}
