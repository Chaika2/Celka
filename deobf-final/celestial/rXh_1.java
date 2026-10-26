package celestial;

import java.util.Random;

public abstract class rXh_1 extends rXB {
   @Override
   protected float byte_() {
      return 100.0F;
   }

   @Override
   public int byte_(rRR var1) {
      return 1;
   }

   @Override
   protected void class_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var3.break_().protected_() ? var1.class_(var2) : null;
      xd_3.class_(var3, var1, var2, var4);
   }

   @Override
   public boolean class_(rXs_1 var1) {
      return var1 == rXG.byte_ || var1 == rXG.break_;
   }

   @Override
   public int class_(rRR var1) {
      return 5;
   }

   @Override
   public boolean class_(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5) {
      return var5 == rpr_3.DOWN && !var4.class_(rlG_2.break_);
   }

   @Override
   public rdb_3 class_() {
      return rdy_3.hR;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      if (!var3.break_() && !var3.byte_(class_)) {
         if (var4.nextInt(64) == 0) {
            var1.class_(
               (double)var2.b_() + 0.5,
               (double)var2.c_() + 0.5,
               (double)var2.d_() + 0.5,
               rqn_3.kq,
               rqL_2.BLOCKS,
               var4.nextFloat() * 0.25F + 0.75F,
               var4.nextFloat() + 0.5F,
               false
            );
         }
      } else if (var4.nextInt(10) == 0) {
         var1.class_(rLQ.s, (double)var2.b_() + var4.nextDouble(), (double)var2.c_() + var4.nextDouble(), (double)var2.d_() + var4.nextDouble(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public xc_3 break_(rXE var1) {
      return xu_3.try_.continue_().class_(dj_3.volatile_, Integer.valueOf(throws_(var1)));
   }

   @Override
   public int break_(rRR var1) {
      return 4;
   }

   @Override
   public rXs_1 throws_() {
      return rXG.byte_;
   }

   @Override
   protected boolean case_() {
      return true;
   }

   @Override
   public rLx_1 implements_() {
      return rLQ.volatile_;
   }

   @Override
   public rXs_1 protected_() {
      return rXG.break_;
   }
}
