package celestial;

import java.util.EnumSet;

class rEf_1 extends rBk_1 {
   private final rEI class_;
   private int break_;
   private final boolean byte_;

   @Override
   public void byte_() {
      this.break_ = -10;
      this.class_.public_().final_();
      this.class_.continue_().class_(this.class_.I_(), 90.0F, 90.0F);
      rEI var10000 = this.class_;
      Boolean var5 = true;
      var10000.throws_[57] = var5;
   }

   public rEf_1(rEI var1) {
      this.class_ = var1;
      this.byte_ = var1 instanceof rEc_1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean class_() {
      iB_2 var1 = this.class_.I_();
      return var1 != null && var1.BM();
   }

   @Override
   public boolean break_() {
      return super.break_() && (this.byte_ || this.class_.int_(this.class_.I_()) > 9.0);
   }

   @Override
   public void throws_() {
      iB_2 var1 = this.class_.I_();
      this.class_.public_().final_();
      this.class_.continue_().class_(var1, 90.0F, 90.0F);
      if (!this.class_.while_(var1)) {
         this.class_.byte_((iB_2)null);
      } else {
         this.break_++;
         if (this.break_ == 0) {
            this.class_.class_(this.class_.I_().V());
            if (!this.class_.BF()) {
               ((rYB)this.class_.throws_[7]).class_(this.class_, (byte)21);
            }
         } else if (this.break_ >= this.class_.L()) {
            float var2 = 1.0F;
            if (((rYB)this.class_.throws_[7]).abstract_() == rRO.HARD) {
               var2 += 2.0F;
            }

            if (this.byte_) {
               var2 += 2.0F;
            }

            var1.break_(rye_3.byte_(this.class_, this.class_), var2);
            var1.break_(rye_3.byte_(this.class_), (float)this.class_.class_(iQ_2.case_));
            this.class_.byte_((iB_2)null);
         }

         super.throws_();
      }
   }

   @Override
   public void protected_() {
      this.class_.class_(0);
      this.class_.byte_((iB_2)null);
      this.class_.break_.private_();
   }
}
