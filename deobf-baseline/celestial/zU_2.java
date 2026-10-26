package celestial;

import java.util.Random;

public class zU_2 extends dI_2 {
   public zU_2(rLR var1, Jq_1 var2) {
      super(var1, 8, var2);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.id_continue && var2.id_abstract() != rRO.PEACEFUL && var4 instanceof iB_2 var5 && !var5.id_class(rye_3.id_int)) {
         var5.id_break(new rLY(rLD.id_this, 40));
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      rjC_2 var5 = this.id_class(var1, var2, var3, rjm_3.id_break());
      rjU_2 var6 = var5.id_class().id_case();
      double var7 = (double)var3.b_() + var6.id_break;
      double var9 = (double)var3.d_() + var6.id_protected;

      for (int var11 = 0; var11 < 3; var11++) {
         if (var4.nextBoolean()) {
            var2.id_class(
               rLQ.id_double, var7 + var4.nextDouble() / 5.0, (double)var3.c_() + (0.5 - var4.nextDouble()), var9 + var4.nextDouble() / 5.0, 0.0, 0.0, 0.0
            );
         }
      }
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return super.id_catch(var1, var2, var3) || var1.id_class(xu_3.PR) || var1.id_class(xu_3.PY) || var1.id_class(xu_3.Po);
   }
}
