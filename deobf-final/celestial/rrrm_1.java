package celestial;

import java.util.List;

public class rrrm_1 extends rrrH<rUt_1> {
   private final long throws_;

   public rrrm_1(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.throws_ = var6;
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      int var8 = 0;

      rrrd_1 var9;
      do {
         this.break_.clear();
         this.byte_ = rfi_3.class_();
         this.protected_.byte_(this.throws_ + (long)(var8++), var4, var5);
         rii_3.class_();
         var9 = new rrrd_1(this.protected_, (var4 << 4) + 2, (var5 << 4) + 2);
         this.break_.add(var9);
         var9.class_(var9, this.break_, this.protected_);
         List var10 = var9.byte_;

         while (!var10.isEmpty()) {
            int var11 = this.protected_.nextInt(var10.size());
            rrrn_1 var12 = (rrrn_1)var10.remove(var11);
            var12.class_(var9, this.break_, this.protected_);
         }

         this.break_();
         this.class_(var2.case_(), this.protected_, 10);
      } while (this.break_.isEmpty() || var9.break_ == null);
   }
}
