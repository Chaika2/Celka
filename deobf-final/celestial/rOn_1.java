package celestial;

import java.util.Random;

class rOn_1 extends rBk_1 {
   private final rON class_;
   private final double break_;
   private boolean byte_;

   @Override
   public void byte_() {
      short var1 = 512;
      byte var2 = 4;
      Random var3 = rON.byte_(this.class_);
      int var4 = var3.nextInt(1025) - 512;
      int var5 = var3.nextInt(9) - 4;
      int var6 = var3.nextInt(1025) - 512;
      if ((double)var5 + this.class_.re() > (double)(((rYB)this.class_.throws_[7]).short_() - 1)) {
         var5 = 0;
      }

      rfH_2 var7 = new rfH_2((double)var4 + this.class_.rx(), (double)var5 + this.class_.re(), (double)var6 + this.class_.BO());
      this.class_.finally_(var7);
      this.class_.return_(true);
      this.byte_ = false;
   }

   rOn_1(rON var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean class_() {
      return !this.class_.sc() && !this.class_.L() && this.class_.rT();
   }

   @Override
   public boolean break_() {
      return !this.class_.public_().native_() && !this.byte_ && !this.class_.sc() && !this.class_.sQ() && !this.class_.L();
   }

   @Override
   public void throws_() {
      if (this.class_.public_().native_()) {
         rjU_2 var1 = rjU_2.protected_(this.class_.sd());
         rjU_2 var2 = iX_2.class_(this.class_, 16, 3, var1, (float) (Math.PI / 10));
         if (var2 == null) {
            var2 = iX_2.break_(this.class_, 8, 7, var1);
         }

         if (var2 != null) {
            int var3 = rfU_2.byte_(var2.break_);
            int var4 = rfU_2.byte_(var2.protected_);
            byte var5 = 34;
            if (!((rYB)this.class_.throws_[7]).class_(var3 - 34, 0, var4 - 34, var3 + 34, 0, var4 + 34)) {
               var2 = null;
            }
         }

         if (var2 == null) {
            this.byte_ = true;
            return;
         }

         this.class_.public_().class_(var2.break_, var2.byte_, var2.protected_, this.break_);
      }
   }

   @Override
   public void protected_() {
      this.class_.return_(false);
      super.protected_();
   }
}
