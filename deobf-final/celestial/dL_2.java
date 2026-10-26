package celestial;

import java.util.Random;

public class dL_2 extends dB_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   protected dL_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_() + var4.nextDouble();
      double var7 = (double)var3.c_() + 0.8;
      double var9 = (double)var3.d_() + var4.nextDouble();
      var2.class_(rLQ.double_, var5, var7, var9, 0.0, 0.0, 0.0);
   }

   @Override
   public boolean class_(xc_3 var1, rXs_1 var2) {
      return false;
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.break_;
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHp_1();
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var2 instanceof rrEm_1
         && !var4.Pm()
         && !var4.BP()
         && var4.I()
         && rjw_3.byte_(
            rjw_3.class_(var4.rN().protected_((double)(-var3.b_()), (double)(-var3.c_()), (double)(-var3.d_()))), var1.finally_(var2, var3), rjN_2.implements_
         )) {
         rqM_2 var5 = var2.E() == rYB.throws_ ? rYB.byte_ : rYB.throws_;
         rrEm_1 var6 = ((rrEm_1)var2).const_().class_(var5);
         if (var6 == null) {
            return;
         }

         var4.class_(var6);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }
}
