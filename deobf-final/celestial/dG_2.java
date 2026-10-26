package celestial;

import java.util.Random;

public class dG_2 extends Jf_1 {
   private final xd_3 package_;
   protected static final rjC_2 final_ = xd_3.class_(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   protected dG_2(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.package_ = var1;
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN && !var1.class_(var4, var5)) {
         return xu_3.class_.continue_();
      } else {
         this.class_(var1, var4, var5);
         if (var1.byte_(volatile_)) {
            var4.extends_().class_(var5, rXG.byte_, rXG.byte_.class_(var4));
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      this.class_(var1, (rRg_1)var2, var3);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!case_(var1, var2, var3)) {
         var2.class_(var3, this.package_.continue_().class_(volatile_, Boolean.valueOf(false)), 2);
      }
   }
}
