package celestial;

import java.util.List;

public class rxq_3 extends rdb_3 {
   public rxq_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (!var4.class_(xu_3.rg) && !var4.class_(xu_3.while_)) {
         return ryZ_2.FAIL;
      } else {
         rfH_2 var5 = var3.final_();
         if (!var2.finally_(var5)) {
            return ryZ_2.FAIL;
         } else {
            double var6 = (double)var5.b_();
            double var8 = (double)var5.c_();
            double var10 = (double)var5.d_();
            List var12 = var2.class_((an_3)null, new rfl_3(var6, var8, var10, var6 + 1.0, var8 + 2.0, var10 + 1.0));
            if (!var12.isEmpty()) {
               return ryZ_2.FAIL;
            } else {
               if (var2 instanceof rrEm_1) {
                  rSa_1 var13 = new rSa_1(var2, var6 + 0.5, var8, var10 + 0.5);
                  var13.class_(false);
                  var2.a_(var13);
                  rKG var14 = ((rrEm_1)var2).Q();
                  if (var14 != null) {
                     var14.throws_();
                  }
               }

               var1.volatile_().catch_(1);
               return ryZ_2.class_(var2.continue_);
            }
         }
      }
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return true;
   }
}
