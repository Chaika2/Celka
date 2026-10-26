package celestial;

import java.util.Random;

class rbV_2 extends rBk_1 {
   private final rbf_3 class_;
   private rhd_3 break_;
   private rfH_2 byte_;
   private int protected_;

   @Override
   public void byte_() {
      if (this.byte_ != null) {
         this.class_.public_(false);
         this.class_.public_().class_((double)this.byte_.b_(), (double)this.byte_.c_(), (double)this.byte_.d_(), 1.1F);
      }
   }

   public rbV_2(rbf_3 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      if (!this.class_.sZ()) {
         return false;
      } else if (this.class_.sL()) {
         return false;
      } else {
         iB_2 var1 = this.class_.sF();
         if (var1 instanceof rhd_3) {
            this.break_ = (rhd_3)var1;
            if (!var1.Sc()) {
               return false;
            }

            if (this.class_.int_(this.break_) > 100.0) {
               return false;
            }

            rfH_2 var2 = this.break_.Bs();
            xc_3 var3 = ((rYB)this.class_.throws_[7]).byte_(var2);
            if (var3.break_().class_(rls_3.short_)) {
               this.byte_ = var3.protected_(xb_3.p).map(var1x -> var2.break_(var1x.case_())).orElseGet(() -> new rfH_2(var2));
               return !this.catch_();
            }
         }

         return false;
      }
   }

   @Override
   public boolean break_() {
      return this.class_.sZ() && !this.class_.sL() && this.break_ != null && this.break_.Sc() && this.byte_ != null && !this.catch_();
   }

   @Override
   public void throws_() {
      if (this.break_ != null && this.byte_ != null) {
         this.class_.public_(false);
         this.class_.public_().class_((double)this.byte_.b_(), (double)this.byte_.c_(), (double)this.byte_.d_(), 1.1F);
         if (this.class_.int_(this.break_) < 2.5) {
            this.protected_++;
            if (this.protected_ > 16) {
               this.class_.this_(true);
               this.class_.else_(false);
            } else {
               this.class_.class_(this.break_, 45.0F, 45.0F);
               this.class_.else_(true);
            }
         } else {
            this.class_.this_(false);
         }
      }
   }

   private boolean catch_() {
      for (rbf_3 var2 : ((rYB)this.class_.throws_[7]).class_(rbf_3.class, new rfl_3(this.byte_).class_(2.0))) {
         if (var2 != this.class_ && (var2.sJ() || var2.sx())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void protected_() {
      this.class_.this_(false);
      float var1 = ((rYB)this.class_.throws_[7]).protected_(1.0F);
      if (this.break_.su() >= 100 && (double)var1 > 0.77 && (double)var1 < 0.8 && (double)((rYB)this.class_.throws_[7]).long_().nextFloat() < 0.7) {
         this.private_();
      }

      this.protected_ = 0;
      this.class_.else_(false);
      this.class_.public_().final_();
   }

   private void private_() {
      Random var1 = this.class_.Sa();
      rfw_3 var2 = new rfw_3();
      var2.class_(this.class_.Bs());
      this.class_
         .class_((double)(var2.b_() + var1.nextInt(11) - 5), (double)(var2.c_() + var1.nextInt(5) - 2), (double)(var2.d_() + var1.nextInt(11) - 5), false);
      var2.class_(this.class_.Bs());
      rzL_2 var3 = ((rYB)this.class_.throws_[7]).const_().o().class_(rzl_3.W);
      rzP_2 var4 = new rzP_2((rrEm_1)((rYB)this.class_.throws_[7])).class_(rzQ_2.case_, this.class_.Ps()).class_(rzQ_2.class_, this.class_).class_(var1);

      for (rdn_3 var6 : var3.class_(var4.class_(rzz_3.catch_))) {
         ((rYB)this.class_.throws_[7])
            .a_(
               new rsE_2(
                  (rYB)this.class_.throws_[7],
                  (double)var2.b_() - (double)rfU_2.class_((Float)this.class_.private_[23] * (float) (Math.PI / 180.0)),
                  (double)var2.c_(),
                  (double)var2.d_() + (double)rfU_2.break_((Float)this.class_.private_[23] * (float) (Math.PI / 180.0)),
                  var6
               )
            );
      }
   }
}
