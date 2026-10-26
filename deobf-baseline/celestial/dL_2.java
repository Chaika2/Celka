package celestial;

import java.util.Random;

public class dL_2 extends dB_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   protected dL_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_() + var4.nextDouble();
      double var7 = (double)var3.c_() + 0.8;
      double var9 = (double)var3.d_() + var4.nextDouble();
      var2.id_class(rLQ.id_double, var5, var7, var9, 0.0, 0.0, 0.0);
   }

   @Override
   public boolean id_class(xc_3 var1, rXs_1 var2) {
      return false;
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return rdn_3.id_break;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHp_1();
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var2 instanceof rrEm_1
         && !var4.Pm()
         && !var4.BP()
         && var4.I()
         && rjw_3.id_byte(
            rjw_3.id_class(var4.rN().id_protected((double)(-var3.b_()), (double)(-var3.c_()), (double)(-var3.d_()))),
            var1.id_finally(var2, var3),
            rjN_2.id_implements
         )) {
         rqM_2 var5 = var2.E() == rYB.id_throws ? rYB.id_byte : rYB.id_throws;
         rrEm_1 var6 = ((rrEm_1)var2).id_const().id_class(var5);
         if (var6 == null) {
            return;
         }

         var4.id_class(var6);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }
}
