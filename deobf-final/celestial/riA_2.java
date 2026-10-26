package celestial;

import java.util.Random;

public class riA_2 extends rrrH<rUt_1> {
   private boolean throws_;

   public riA_2(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      if (!this.throws_) {
         this.break_.clear();
         this.break_(this.case_(), this.catch_());
      }

      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      this.break_(var4, var5);
   }

   private void break_(int var1, int var2) {
      int var3 = var1 * 16 - 29;
      int var4 = var2 * 16 - 29;
      rpr_3 var5 = rpb_3.HORIZONTAL.class_(this.protected_);
      this.break_.add(new rix_3(this.protected_, var3, var4, var5));
      this.break_();
      this.throws_ = true;
   }
}
