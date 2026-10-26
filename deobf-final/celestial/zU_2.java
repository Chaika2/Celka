package celestial;

import java.util.Random;

public class zU_2 extends dI_2 {
   public zU_2(rLR var1, Jq_1 var2) {
      super(var1, 8, var2);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.continue_ && var2.abstract_() != rRO.PEACEFUL && var4 instanceof iB_2 var5 && !var5.class_(rye_3.int_)) {
         var5.break_(new rLY(rLD.this_, 40));
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rjC_2 var5 = this.class_(var1, var2, var3, rjm_3.break_());
      rjU_2 var6 = var5.class_().case_();
      double var7 = (double)var3.b_() + var6.break_;
      double var9 = (double)var3.d_() + var6.protected_;

      for (int var11 = 0; var11 < 3; var11++) {
         if (var4.nextBoolean()) {
            var2.class_(
               rLQ.double_, var7 + var4.nextDouble() / 5.0, (double)var3.c_() + (0.5 - var4.nextDouble()), var9 + var4.nextDouble() / 5.0, 0.0, 0.0, 0.0
            );
         }
      }
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return super.catch_(var1, var2, var3) || var1.class_(xu_3.PR) || var1.class_(xu_3.PY) || var1.class_(xu_3.Po);
   }
}
