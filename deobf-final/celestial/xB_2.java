package celestial;

import java.util.Random;

public class xB_2 extends xd_3 implements kX_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public Jp_1 byte_() {
      return Jp_1.XZ;
   }

   public xB_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean class_(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void class_(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.class_(var1, var3);
   }

   @Override
   public float class_(xc_3 var1, rhd_3 var2, rRq_1 var3, rfH_2 var4) {
      return var2.ss().break_() instanceof rkx_3 ? 1.0F : super.class_(var1, var2, var3, var4);
   }

   protected void class_(rYB var1, rfH_2 var2) {
      var1.class_(var2.final_(), xu_3.hs.continue_().class_(xP_2.new_, rCy_1.SMALL), 3);
   }

   @Override
   public rdn_3 class_(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(rdy_3.rw);
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(3) == 0 && var2.finally_(var3.final_()) && var2.class_(var3.final_(), 0) >= 9) {
         this.class_(var2, var3);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.byte_(var3.break_()).class_(rls_3.M);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.class_(var4, var5)) {
         return xu_3.class_.continue_();
      } else {
         if (var2 == rpr_3.UP && var3.class_(xu_3.hs)) {
            var4.class_(var5, xu_3.hs.continue_(), 2);
         }

         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjU_2 var5 = var1.class_(var3);
      return volatile_.class_(var5.break_, var5.byte_, var5.protected_);
   }

   @Override
   public boolean class_(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var1.byte_(var2.final_()).catch_();
   }
}
