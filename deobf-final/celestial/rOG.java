package celestial;

class rOG extends rBp_1 {
   private final rMi_1 catch_;
   private boolean private_;
   private boolean implements_;

   public rOG(rMi_1 var1) {
      super(var1, 0.7F, 16);
      this.catch_ = var1;
   }

   @Override
   protected boolean class_(rRR var1, rfH_2 var2) {
      xd_3 var3 = var1.byte_(var2).break_();
      if (var3 == xu_3.PS && this.private_ && !this.implements_) {
         var2 = var2.final_();
         xc_3 var4 = var1.byte_(var2);
         var3 = var4.break_();
         if (var3 instanceof xl_3 && ((xl_3)var3).implements_(var4)) {
            this.implements_ = true;
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean class_() {
      if (this.byte_ <= 0) {
         if (!((rYB)this.catch_.throws_[7]).B().break_(rRu_1.break_)) {
            return false;
         }

         this.implements_ = false;
         this.private_ = this.catch_.sZ();
         this.private_ = true;
      }

      return super.class_();
   }

   @Override
   public boolean break_() {
      return this.implements_ && super.break_();
   }

   @Override
   public void throws_() {
      super.throws_();
      this.catch_
         .continue_()
         .class_((double)this.throws_.b_() + 0.5, (double)(this.throws_.c_() + 1), (double)this.throws_.d_() + 0.5, 10.0F, (float)this.catch_.r());
      if (this.native_()) {
         rYB var1 = (rYB)this.catch_.throws_[7];
         rfH_2 var2 = this.throws_.final_();
         xc_3 var3 = var1.byte_(var2);
         xd_3 var4 = var3.break_();
         if (this.implements_ && var4 instanceof xl_3) {
            Integer var5 = var3.byte_(xl_3.final_);
            if (var5 == 0) {
               var1.class_(var2, xu_3.class_.continue_(), 2);
               var1.class_(var2, true, this.catch_);
            } else {
               var1.class_(var2, var3.class_(xl_3.final_, Integer.valueOf(var5 - 1)), 2);
               var1.byte_(2001, var2, xd_3.finally_(var3));
            }

            this.catch_.goto_ = 40;
         }

         this.implements_ = false;
         this.byte_ = 10;
      }
   }
}
