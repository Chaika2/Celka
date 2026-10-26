package celestial;

class rMt_1 extends rBP {
   private final rMl_1 protected_;
   private int throws_;

   public rMt_1(rMl_1 var1, rMl_1 var2, double var3) {
      super(var2, var3);
      this.protected_ = var2;
   }

   @Override
   public boolean class_() {
      if (!super.class_() || this.protected_.L() != 0) {
         return false;
      } else if (!this.private_()) {
         if (this.throws_ <= (Integer)this.protected_.throws_[41]) {
            this.protected_.else_(32);
            this.throws_ = (Integer)this.protected_.throws_[41] + 600;
            if (this.protected_.try_()) {
               rhd_3 var1 = this.break_.class_(rMl_1.while_, this.protected_);
               this.protected_.static_.class_(var1);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private boolean private_() {
      rfH_2 var1 = this.protected_.Bs();
      rfw_3 var2 = new rfw_3();

      for (int var3 = 0; var3 < 3; var3++) {
         for (int var4 = 0; var4 < 8; var4++) {
            for (int var5 = 0; var5 <= var4; var5 = var5 > 0 ? -var5 : 1 - var5) {
               for (int var6 = var5 < var4 && var5 > -var4 ? var4 : 0; var6 <= var4; var6 = var6 > 0 ? -var6 : 1 - var6) {
                  var2.class_(var1, var5, var3, var6);
                  if (this.break_.byte_(var2).class_(xu_3.hs)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }
}
