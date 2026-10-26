package celestial;

import java.util.Random;

class rGF extends rBk_1 {
   private final rGZ class_;
   private int break_;

   public rGF(rGZ var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return this.break_ > 0;
   }

   @Override
   public void throws_() {
      this.break_--;
      if (this.break_ <= 0) {
         rYB var1 = (rYB)this.class_.throws_[7];
         Random var2 = this.class_.Sa();
         rfH_2 var3 = this.class_.Bs();

         for (int var4 = 0; var4 <= 5 && var4 >= -5; var4 = (var4 <= 0 ? 1 : 0) - var4) {
            for (int var5 = 0; var5 <= 10 && var5 >= -10; var5 = (var5 <= 0 ? 1 : 0) - var5) {
               for (int var6 = 0; var6 <= 10 && var6 >= -10; var6 = (var6 <= 0 ? 1 : 0) - var6) {
                  rfH_2 var7 = var3.break_(var5, var4, var6);
                  xc_3 var8 = var1.byte_(var7);
                  xd_3 var9 = var8.break_();
                  if (var9 instanceof WT) {
                     if (var1.B().break_(rRu_1.break_)) {
                        var1.class_(var7, true, this.class_);
                     } else {
                        var1.class_(var7, ((WT)var9).break_().continue_(), 3);
                     }

                     if (var2.nextBoolean()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public void catch_() {
      if (this.break_ == 0) {
         this.break_ = 20;
      }
   }
}
