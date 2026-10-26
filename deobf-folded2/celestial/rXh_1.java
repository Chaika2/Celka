package celestial;

import java.util.Random;

public abstract class rXh_1 extends rXB {
   @Override
   protected float id_byte() {
      return 100.0F;
   }

   @Override
   public int id_byte(rRR var1) {
      return 1;
   }

   @Override
   protected void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      ryO_2 var4 = var3.id_break().id_protected() ? var1.id_class(var2) : null;
      xd_3.id_class(var3, var1, var2, var4);
   }

   @Override
   public boolean id_class(rXs_1 var1) {
      return var1 == rXG.id_byte || var1 == rXG.id_break;
   }

   @Override
   public int id_class(rRR var1) {
      return 5;
   }

   @Override
   public boolean id_class(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5) {
      return var5 == rpr_3.DOWN && !var4.id_class(rlG_2.id_break);
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.hR;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      if (!var3.id_break() && !var3.id_byte(id_class)) {
         if (var4.nextInt(64) == 0) {
            var1.id_class(
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
         var1.id_class(
            rLQ.s, (double)var2.b_() + var4.nextDouble(), (double)var2.c_() + var4.nextDouble(), (double)var2.d_() + var4.nextDouble(), 0.0, 0.0, 0.0
         );
      }
   }

   @Override
   public xc_3 id_break(rXE var1) {
      return xu_3.id_try.id_continue().id_class(dj_3.id_volatile, Integer.valueOf(id_throws(var1)));
   }

   @Override
   public int id_break(rRR var1) {
      return 4;
   }

   @Override
   public rXs_1 id_throws() {
      return rXG.id_byte;
   }

   @Override
   protected boolean id_case() {
      return true;
   }

   @Override
   public rLx_1 id_implements() {
      return rLQ.id_volatile;
   }

   @Override
   public rXs_1 id_protected() {
      return rXG.id_break;
   }
}
