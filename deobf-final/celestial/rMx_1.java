package celestial;

public class rMx_1 extends rBm_1 {
   @Override
   public void byte_() {
      this.class_.super_(true);
      this.class_.else_(true);
      this.class_.return_(false);
      iB_2 var1 = this.class_.I_();
      this.class_.continue_().class_(var1, 60.0F, 30.0F);
      rjU_2 var2 = new rjU_2(var1.rx() - this.class_.rx(), var1.re() - this.class_.re(), var1.BO() - this.class_.BO()).protected_();
      this.class_.byte_(this.class_.rv().break_(var2.break_ * 0.8, 0.9, var2.protected_ * 0.8));
      this.class_.public_().final_();
   }

   public rMx_1(rba_3 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      if (!this.class_.sc()) {
         return false;
      } else {
         iB_2 var1 = this.class_.I_();
         if (var1 != null && var1.BM()) {
            if (var1.rS() != var1.Pg()) {
               return false;
            } else {
               boolean var2 = rba_3.class_(this.class_, var1);
               if (!var2) {
                  this.class_.public_().class_(var1, 0);
                  this.class_.synchronized_(false);
                  this.class_.return_(false);
               }

               return var2;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean break_() {
      iB_2 var1 = this.class_.I_();
      if (var1 != null && var1.BM()) {
         double var2 = this.class_.rv().byte_;
         return (!(var2 * var2 < 0.05F) || !(Math.abs((Float)this.class_.throws_[16]) < 15.0F) || !rba_3.byte_(this.class_)) && !this.class_.sx();
      } else {
         return false;
      }
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      if (var1 != null) {
         this.class_.continue_().class_(var1, 60.0F, 30.0F);
      }

      if (!this.class_.sx()) {
         rjU_2 var2 = this.class_.rv();
         if (var2.byte_ * var2.byte_ < 0.03F && (Float)this.class_.throws_[16] != 0.0F) {
            rba_3 var14 = this.class_;
            Float var11 = rfU_2.implements_((Float)this.class_.throws_[16], 0.0F, 0.2F);
            var14.throws_[16] = var11;
         } else {
            double var3 = Math.sqrt(an_3.case_(var2));
            double var5 = Math.signum(-var2.byte_) * Math.acos(var3 / var2.case_()) * 180.0F / (float)Math.PI;
            rba_3 var10000 = this.class_;
            Float var12 = (float)var5;
            var10000.throws_[16] = var12;
         }
      }

      if (var1 != null && this.class_.implements_(var1) <= 2.0F) {
         this.class_.public_(var1);
      } else if ((Float)this.class_.throws_[16] > 0.0F
         && rba_3.protected_(this.class_)
         && (float)this.class_.rv().byte_ != 0.0F
         && ((rYB)this.class_.throws_[7]).byte_(this.class_.Bs()).class_(xu_3.Pq)) {
         rba_3 var15 = this.class_;
         Float var13 = 60.0F;
         var15.throws_[16] = var13;
         this.class_.byte_((iB_2)null);
         this.class_.public_(true);
      }
   }

   @Override
   public void protected_() {
      this.class_.synchronized_(false);
      this.class_.abstract_ = 0.0F;
      this.class_.long_ = 0.0F;
      this.class_.return_(false);
      this.class_.else_(false);
   }

   @Override
   public boolean J_() {
      return false;
   }
}
