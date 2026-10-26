package celestial;

import java.util.EnumSet;

class rEh_1 extends rBk_1 {
   private final rEO class_;
   private int break_;
   private int byte_;
   private int protected_;

   @Override
   public void byte_() {
      this.break_ = 0;
   }

   public rEh_1(rEO var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      return var1 != null && var1.BM() && this.class_.catch_(var1);
   }

   @Override
   public void throws_() {
      this.byte_--;
      iB_2 var1 = this.class_.I_();
      if (var1 != null) {
         boolean var2 = this.class_.goto_().class_(var1);
         if (var2) {
            this.protected_ = 0;
         } else {
            this.protected_++;
         }

         double var3 = this.class_.int_(var1);
         if (var3 < 4.0) {
            if (!var2) {
               return;
            }

            if (this.byte_ <= 0) {
               this.byte_ = 20;
               this.class_.public_(var1);
            }

            this.class_.super_().class_(var1.rx(), var1.re(), var1.BO(), 1.0);
         } else if (var3 < this.catch_() * this.catch_() && var2) {
            double var5 = var1.rx() - this.class_.rx();
            double var7 = var1.byte_(0.5) - this.class_.byte_(0.5);
            double var9 = var1.BO() - this.class_.BO();
            if (this.byte_ <= 0) {
               this.break_++;
               if (this.break_ == 1) {
                  this.byte_ = 60;
                  this.class_.this_(true);
               } else if (this.break_ <= 4) {
                  this.byte_ = 6;
               } else {
                  this.byte_ = 100;
                  this.break_ = 0;
                  this.class_.this_(false);
               }

               if (this.break_ > 1) {
                  float var11 = rfU_2.byte_(rfU_2.class_(var3)) * 0.5F;
                  if (!this.class_.BF()) {
                     ((rYB)this.class_.throws_[7]).class_((rhd_3)null, 1018, this.class_.Bs(), 0);
                  }

                  for (int var12 = 0; var12 < 1; var12++) {
                     rhR_2 var13 = new rhR_2(
                        (rYB)this.class_.throws_[7],
                        this.class_,
                        var5 + this.class_.Sa().nextGaussian() * (double)var11,
                        var7,
                        var9 + this.class_.Sa().nextGaussian() * (double)var11
                     );
                     var13.new_(var13.rx(), this.class_.byte_(0.5) + 0.5, var13.BO());
                     ((rYB)this.class_.throws_[7]).a_(var13);
                  }
               }
            }

            this.class_.continue_().class_(var1, 10.0F, 10.0F);
         } else if (this.protected_ < 5) {
            this.class_.super_().class_(var1.rx(), var1.re(), var1.BO(), 1.0);
         }

         super.throws_();
      }
   }

   private double catch_() {
      return this.class_.class_(iQ_2.break_);
   }

   @Override
   public void protected_() {
      this.class_.this_(false);
      this.protected_ = 0;
   }
}
