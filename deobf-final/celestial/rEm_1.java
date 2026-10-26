package celestial;

import java.util.function.Predicate;

class rEm_1 extends rBI<rhd_3> {
   private final rEu_1 implements_;
   private rhd_3 finally_;
   private int extends_;
   private int native_;
   private final ay_3 volatile_;
   private final ay_3 final_ = new ay_3().byte_();

   @Override
   public void byte_() {
      this.extends_ = 5;
      this.native_ = 0;
      this.implements_.sz();
   }

   public rEm_1(rEu_1 var1, Predicate<iB_2> var2) {
      super(var1, rhd_3.class, 10, false, false, var2);
      this.implements_ = var1;
      this.volatile_ = new ay_3().class_(this.extends_()).class_(var1x -> var1.case_((rhd_3)var1x));
   }

   @Override
   public boolean class_() {
      this.finally_ = ((rYB)this.implements_.throws_[7]).class_(this.volatile_, this.implements_);
      return this.finally_ != null;
   }

   @Override
   public boolean break_() {
      if (this.finally_ != null) {
         if (!this.implements_.case_(this.finally_)) {
            return false;
         } else {
            this.implements_.class_(this.finally_, 10.0F, 10.0F);
            return true;
         }
      } else {
         return this.byte_ != null && this.final_.class_(this.implements_, this.byte_) ? true : super.break_();
      }
   }

   @Override
   public void throws_() {
      if (this.implements_.I_() == null) {
         super.class_((iB_2)null);
      }

      if (this.finally_ != null) {
         if (--this.extends_ <= 0) {
            this.byte_ = this.finally_;
            this.finally_ = null;
            super.byte_();
         }
      } else {
         if (this.byte_ != null && !this.implements_.Pm()) {
            if (this.implements_.case_((rhd_3)this.byte_)) {
               if (this.byte_.int_(this.implements_) < 16.0) {
                  this.implements_.sx();
               }

               this.native_ = 0;
            } else if (this.byte_.int_(this.implements_) > 256.0 && this.native_++ >= 30 && this.implements_.class_(this.byte_)) {
               this.native_ = 0;
            }
         }

         super.throws_();
      }
   }

   @Override
   public void protected_() {
      this.finally_ = null;
      super.protected_();
   }
}
