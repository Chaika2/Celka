package celestial;

public class rLw_1 extends rLy_1 {
   private boolean class_;

   @Override
   public void byte_(boolean var1) {
   }

   @Override
   protected rjU_2 byte_() {
      return new rjU_2(this.break_.rx(), this.break_.byte_(0.5), this.break_.BO());
   }

   public rLw_1(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected boolean class_(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      rjU_2 var6 = new rjU_2(var2.break_, var2.byte_ + (double)this.break_.Bm() * 0.5, var2.protected_);
      return this.byte_.class_(new rjB_2(var1, var6, rjS_2.COLLIDER, rjs_3.NONE, this.break_)).byte_() == rjM_2.MISS;
   }

   @Override
   public boolean class_(rfH_2 var1) {
      return !this.byte_.byte_(var1).implements_(this.byte_, var1);
   }

   @Override
   protected rLl_1 class_(int var1) {
      this.class_ = this.break_ instanceof rbo_3;
      this.int_ = new rLt_1(this.class_);
      return new rLl_1(this.int_, var1);
   }

   @Override
   public void class_() {
      this.case_++;
      if (this.final_) {
         this.implements_();
      }

      if (!this.native_()) {
         if (this.break_()) {
            this.extends_();
         } else if (this.protected_ != null && !this.protected_.byte_()) {
            rjU_2 var1 = this.protected_.class_(this.break_);
            if (rfU_2.byte_(this.break_.rx()) == rfU_2.byte_(var1.break_)
               && rfU_2.byte_(this.break_.re()) == rfU_2.byte_(var1.byte_)
               && rfU_2.byte_(this.break_.BO()) == rfU_2.byte_(var1.protected_)) {
               this.protected_.class_();
            }
         }

         ruP_2.class_(this.byte_, this.break_, this.protected_, this.volatile_);
         if (!this.native_()) {
            rjU_2 var2 = this.protected_.class_(this.break_);
            this.break_.super_().class_(var2.break_, var2.byte_, var2.protected_, this.throws_);
         }
      }
   }

   @Override
   protected void class_(rjU_2 var1) {
      if (this.case_ - this.catch_ > 100) {
         if (var1.implements_(this.private_) < 2.25) {
            this.final_();
         }

         this.catch_ = this.case_;
         this.private_ = var1;
      }

      if (this.protected_ != null && !this.protected_.byte_()) {
         rfH_2 var2 = this.protected_.catch_();
         if (var2.equals(this.implements_)) {
            this.finally_ = this.finally_ + (rqR_2.break_() - this.extends_);
         } else {
            this.implements_ = var2;
            double var3 = var1.case_(rjU_2.class_(this.implements_));
            this.native_ = this.break_.sB() > 0.0F ? var3 / (double)this.break_.sB() * 100.0 : 0.0;
         }

         if (this.native_ > 0.0 && (double)this.finally_ > this.native_ * 2.0) {
            this.implements_ = rja_3.case_;
            this.finally_ = 0L;
            this.native_ = 0.0;
            this.final_();
         }

         this.extends_ = rqR_2.break_();
      }
   }

   @Override
   protected boolean break_() {
      return this.class_ || this.package_();
   }

   @Override
   protected void extends_() {
      if (this.protected_ != null) {
         rjU_2 var1 = this.byte_();
         float var2 = this.break_.PN();
         float var3 = var2 > 0.75F ? var2 / 2.0F : 0.75F - var2 / 2.0F;
         rjU_2 var4 = this.break_.rv();
         if (Math.abs(var4.break_) > 0.2 || Math.abs(var4.protected_) > 0.2) {
            var3 = (float)((double)var3 * var4.case_() * 6.0);
         }

         byte var5 = 6;
         rjU_2 var6 = rjU_2.protected_(this.protected_.catch_());
         if (Math.abs(this.break_.rx() - var6.break_) < (double)var3
            && Math.abs(this.break_.BO() - var6.protected_) < (double)var3
            && Math.abs(this.break_.re() - var6.byte_) < (double)(var3 * 2.0F)) {
            this.protected_.class_();
         }

         for (int var7 = Math.min(this.protected_.case_() + 6, this.protected_.throws_() - 1); var7 > this.protected_.case_(); var7--) {
            var6 = this.protected_.class_(this.break_, var7);
            if (!(var6.implements_(var1) > 36.0) && this.class_(var1, var6, 0, 0, 0)) {
               this.protected_.byte_(var7);
               break;
            }
         }

         this.class_(var1);
      }
   }
}
