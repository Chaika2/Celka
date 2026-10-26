package celestial;

import java.util.List;

public class rav_3 extends rrrH<rUt_1> {
   public rav_3(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rac_3 var8 = new rac_3(this.protected_, (var4 << 4) + 2, (var5 << 4) + 2);
      this.break_.add(var8);
      var8.class_(var8, this.break_, this.protected_);
      List var9 = var8.protected_;

      while (!var9.isEmpty()) {
         int var10 = this.protected_.nextInt(var9.size());
         rrrn_1 var11 = (rrrn_1)var9.remove(var10);
         var11.class_(var8, this.break_, this.protected_);
      }

      this.break_();
      this.class_(this.protected_, 48, 70);
   }
}
