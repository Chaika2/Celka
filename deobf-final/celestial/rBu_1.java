package celestial;

public abstract class rBu_1 extends rBk_1 {
   protected is_3 protected_;
   protected rfH_2 throws_ = rfH_2.protected_;
   protected boolean case_;
   private boolean class_;
   private float break_;
   private float byte_;

   @Override
   public void byte_() {
      this.class_ = false;
      this.break_ = (float)((double)this.throws_.b_() + 0.5 - this.protected_.rx());
      this.byte_ = (float)((double)this.throws_.d_() + 0.5 - this.protected_.BO());
   }

   public rBu_1(is_3 var1) {
      this.protected_ = var1;
      if (!rpc_3.class_(var1)) {
         throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
      }
   }

   @Override
   public boolean class_() {
      if (!rpc_3.class_(this.protected_)) {
         return false;
      } else if (!(Boolean)this.protected_.throws_[23]) {
         return false;
      } else {
         rLA var1 = (rLA)this.protected_.public_();
         rLC var2 = var1.finally_();
         if (var2 != null && !var2.byte_() && var1.throws_()) {
            for (int var3 = 0; var3 < Math.min(var2.case_() + 2, var2.throws_()); var3++) {
               rLq_1 var4 = var2.class_(var3);
               this.throws_ = new rfH_2(var4.class_, var4.break_ + 1, var4.byte_);
               if (!(this.protected_.class_((double)this.throws_.b_(), this.protected_.re(), (double)this.throws_.d_()) > 2.25)) {
                  this.case_ = dN_2.class_((rYB)this.protected_.throws_[7], this.throws_);
                  if (this.case_) {
                     return true;
                  }
               }
            }

            this.throws_ = this.protected_.Bs().final_();
            this.case_ = dN_2.class_((rYB)this.protected_.throws_[7], this.throws_);
            return this.case_;
         } else {
            return false;
         }
      }
   }

   protected void class_(boolean var1) {
      if (this.case_) {
         xc_3 var2 = ((rYB)this.protected_.throws_[7]).byte_(this.throws_);
         if (var2.break_() instanceof dN_2) {
            ((dN_2)var2.break_()).class_((rYB)this.protected_.throws_[7], var2, this.throws_, var1);
         }
      }
   }

   @Override
   public boolean break_() {
      return !this.class_;
   }

   @Override
   public void throws_() {
      float var1 = (float)((double)this.throws_.b_() + 0.5 - this.protected_.rx());
      float var2 = (float)((double)this.throws_.d_() + 0.5 - this.protected_.BO());
      float var3 = this.break_ * var1 + this.byte_ * var2;
      if (var3 < 0.0F) {
         this.class_ = true;
      }
   }

   protected boolean catch_() {
      if (!this.case_) {
         return false;
      } else {
         xc_3 var1 = ((rYB)this.protected_.throws_[7]).byte_(this.throws_);
         if (!(var1.break_() instanceof dN_2)) {
            this.case_ = false;
            return false;
         } else {
            return var1.byte_(dN_2.final_);
         }
      }
   }
}
