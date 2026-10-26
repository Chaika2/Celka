package celestial;

import java.util.Random;
import java.util.function.Supplier;

public class dY_2 extends xF_2 implements kX_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<rDg_1<rUm_1, ?>> id_final;

   protected dY_2(Jq_1 var1, Supplier<rDg_1<rUm_1, ?>> var2) {
      super(var1);
      this.id_final = var2;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.id_final.get().id_class(var1, var1.id_else().id_implements(), var2, var3);
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      xd_3 var5 = ((rUm_1)this.id_final.get().id_case).id_case.id_break();
      xd_3 var6 = var1.id_byte(var2.id_break()).id_break();
      return var6 == var5;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(rls_3.c) || var1.id_class(xu_3.Bi) || var1.id_class(xu_3.Po) || super.id_catch(var1, var2, var3);
   }
}
