package celestial;

class rET extends rPY {
   private final rEy_1 implements_;
   private int finally_;

   public rET(rEy_1 var1) {
      super(var1);
      this.implements_ = var1;
   }

   @Override
   public void class_() {
      if (this.private_ == rPo_1.MOVE_TO && this.finally_-- <= 0) {
         this.finally_ = this.finally_ + this.implements_.Sa().nextInt(5) + 2;
         rjU_2 var1 = new rjU_2(this.break_ - this.implements_.rx(), this.byte_ - this.implements_.re(), this.protected_ - this.implements_.BO());
         double var2 = var1.case_();
         var1 = var1.protected_();
         if (this.class_(var1, rfU_2.throws_(var2))) {
            this.implements_.byte_(this.implements_.rv().throws_(var1.class_(0.1)));
         } else {
            this.private_ = rPo_1.WAIT;
         }
      }
   }

   private boolean class_(rjU_2 var1, int var2) {
      rfl_3 var3 = this.implements_.rN();

      for (int var4 = 1; var4 < var2; var4++) {
         var3 = var3.protected_(var1);
         if (!((rYB)this.implements_.throws_[7]).a_(this.implements_, var3)) {
            return false;
         }
      }

      return true;
   }
}
