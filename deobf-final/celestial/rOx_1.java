package celestial;

class rOx_1 extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 0;
   }

   rOx_1(rOJ var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.Sr();
      return this.class_.rT() && var1 != null ? this.class_.int_(var1) < 100.0 : false;
   }

   @Override
   public void throws_() {
      this.break_++;
      iB_2 var1 = this.class_.Sr();
      if (var1 != null) {
         rjU_2 var2 = new rjU_2(this.class_.rx() - var1.rx(), this.class_.re() - var1.re(), this.class_.BO() - var1.BO());
         xc_3 var3 = ((rYB)this.class_.throws_[7])
            .byte_(new rfH_2(this.class_.rx() + var2.break_, this.class_.re() + var2.byte_, this.class_.BO() + var2.protected_));
         rXE var4 = ((rYB)this.class_.throws_[7])
            .break_(new rfH_2(this.class_.rx() + var2.break_, this.class_.re() + var2.byte_, this.class_.BO() + var2.protected_));
         if (var4.class_(rlG_2.break_) || var3.catch_()) {
            double var5 = var2.case_();
            if (var5 > 0.0) {
               var2.protected_();
               float var7 = 3.0F;
               if (var5 > 5.0) {
                  var7 = (float)((double)var7 - (var5 - 5.0) / 5.0);
               }

               if (var7 > 0.0F) {
                  var2 = var2.class_((double)var7);
               }
            }

            if (var3.catch_()) {
               var2 = var2.class_(0.0, var2.byte_, 0.0);
            }

            this.class_.byte_((float)var2.break_ / 20.0F, (float)var2.byte_ / 20.0F, (float)var2.protected_ / 20.0F);
         }

         if (this.break_ % 10 == 5) {
            ((rYB)this.class_.throws_[7]).class_(rLQ.throws_, this.class_.rx(), this.class_.re(), this.class_.BO(), 0.0, 0.0, 0.0);
         }
      }
   }
}
