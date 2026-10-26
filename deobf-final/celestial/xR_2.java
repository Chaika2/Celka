package celestial;

import java.util.Random;

public class xR_2 extends Wt_1 {
   protected xR_2(Jq_1 var1) {
      super(0.3125F, var1);
      this.extends_(
         this.abstract_
            .break_()
            .class_(volatile_, Boolean.valueOf(false))
            .class_(final_, Boolean.valueOf(false))
            .class_(package_, Boolean.valueOf(false))
            .class_(int_, Boolean.valueOf(false))
            .class_(new_, Boolean.valueOf(false))
            .class_(continue_, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_());
      boolean var5 = !var2.byte_(var3.final_()).catch_() && !var4.catch_();

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rfH_2 var8 = var3.break_(var7);
         xd_3 var9 = var2.byte_(var8).break_();
         if (var9 == this) {
            if (var5) {
               return false;
            }

            xd_3 var10 = var2.byte_(var8.break_()).break_();
            if (var10 == this || var10 == xu_3.Sh) {
               return true;
            }
         }
      }

      xd_3 var11 = var4.break_();
      return var11 == this || var11 == xu_3.Sh;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_, package_, int_, new_, continue_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.class_(var1.int_(), var1.class_());
   }

   public xc_3 class_(rRq_1 var1, rfH_2 var2) {
      xd_3 var3 = var1.byte_(var2.break_()).break_();
      xd_3 var4 = var1.byte_(var2.final_()).break_();
      xd_3 var5 = var1.byte_(var2.private_()).break_();
      xd_3 var6 = var1.byte_(var2.extends_()).break_();
      xd_3 var7 = var1.byte_(var2.protected_()).break_();
      xd_3 var8 = var1.byte_(var2.byte_()).break_();
      return this.continue_()
         .class_(continue_, Boolean.valueOf(var3 == this || var3 == xu_3.bl || var3 == xu_3.Sh))
         .class_(new_, Boolean.valueOf(var4 == this || var4 == xu_3.bl))
         .class_(volatile_, Boolean.valueOf(var5 == this || var5 == xu_3.bl))
         .class_(final_, Boolean.valueOf(var6 == this || var6 == xu_3.bl))
         .class_(package_, Boolean.valueOf(var7 == this || var7 == xu_3.bl))
         .class_(int_, Boolean.valueOf(var8 == this || var8 == xu_3.bl));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
         return super.class_(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var7 = var3.break_() == this || var3.class_(xu_3.bl) || var2 == rpr_3.DOWN && var3.class_(xu_3.Sh);
         return var1.class_(super_.get(var2), Boolean.valueOf(var7));
      }
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }
}
