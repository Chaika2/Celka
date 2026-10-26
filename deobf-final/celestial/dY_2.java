package celestial;

import java.util.Random;
import java.util.function.Supplier;

public class dY_2 extends xF_2 implements kX_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private final Supplier<rDg_1<rUm_1, ?>> final_;

   protected dY_2(Jq_1 var1, Supplier<rDg_1<rUm_1, ?>> var2) {
      super(var1);
      this.final_ = var2;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.final_.get().class_(var1, var1.else_().implements_(), var2, var3);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      xd_3 var5 = ((rUm_1)this.final_.get().case_).case_.break_();
      xd_3 var6 = var1.byte_(var2.break_()).break_();
      return var6 == var5;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   protected boolean catch_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.class_(rls_3.c) || var1.class_(xu_3.Bi) || var1.class_(xu_3.Po) || super.catch_(var1, var2, var3);
   }
}
