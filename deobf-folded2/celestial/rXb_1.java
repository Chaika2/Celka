package celestial;

import java.util.Random;

public abstract class rXb_1 extends rXB {
   @Override
   protected float id_byte() {
      return 100.0F;
   }

   @Override
   public int id_byte(rRR var1) {
      return var1.id_default().id_protected() ? 1 : 2;
   }

   @Override
   public int id_class(rRR var1) {
      return var1.id_default().id_protected() ? 10 : 30;
   }

   @Override
   public boolean id_class(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5) {
      return var1.id_class(var2, var3) >= 0.44444445F && var4.id_class(rlG_2.id_break);
   }

   @Override
   public boolean id_class(rXs_1 var1) {
      return var1 == rXG.id_throws || var1 == rXG.id_protected;
   }

   @Override
   protected void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      this.id_class(var1, var2);
   }

   @Override
   public int id_class(rYB var1, rfH_2 var2, rXE var3, rXE var4) {
      int var5 = this.id_class(var1);
      if (!var3.id_byte()
         && !var4.id_byte()
         && !var3.id_byte(id_class)
         && !var4.id_byte(id_class)
         && var4.id_class((rRq_1)var1, var2) > var3.id_class((rRq_1)var1, var2)
         && var1.id_long().nextInt(4) != 0) {
         var5 *= 4;
      }

      return var5;
   }

   private void id_class(rRg_1 var1, rfH_2 var2) {
      var1.id_byte(1501, var2, 0);
   }

   @Override
   protected void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rXE var5) {
      if (var4 == rpr_3.DOWN) {
         rXE var6 = var1.id_break(var2);
         if (this.id_class(rlG_2.id_byte) && var6.id_class(rlG_2.id_break)) {
            if (var3.id_break() instanceof dj_3) {
               var1.id_class(var2, xu_3.id_break.id_continue(), 3);
            }

            this.id_class(var1, var2);
            return;
         }
      }

      super.id_class(var1, var2, var3, var4, var5);
   }

   private boolean id_class(rRR var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         if (this.id_break(var1, var2.id_break(var6))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public rdb_3 id_class() {
      return rdy_3.hY;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      rfH_2 var5 = var2.id_final();
      if (var1.id_byte(var5).id_catch() && !var1.id_byte(var5).id_implements(var1, var5)) {
         if (var4.nextInt(100) == 0) {
            double var6 = (double)var2.b_() + var4.nextDouble();
            double var8 = (double)var2.c_() + 1.0;
            double var10 = (double)var2.d_() + var4.nextDouble();
            var1.id_class(rLQ.id_default, var6, var8, var10, 0.0, 0.0, 0.0);
            var1.id_class(var6, var8, var10, rqn_3.Gs, rqL_2.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }

         if (var4.nextInt(200) == 0) {
            var1.id_class(
               (double)var2.b_(),
               (double)var2.c_(),
               (double)var2.d_(),
               rqn_3.GB,
               rqL_2.BLOCKS,
               0.2F + var4.nextFloat() * 0.2F,
               0.9F + var4.nextFloat() * 0.15F,
               false
            );
         }
      }
   }

   @Override
   public void id_break(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      if (var1.B().id_break(rRu_1.id_class)) {
         int var5 = var4.nextInt(3);
         if (var5 > 0) {
            rfH_2 var6 = var2;

            for (int var7 = 0; var7 < var5; var7++) {
               var6 = var6.id_break(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if (!var1.id_synchronized(var6)) {
                  return;
               }

               xc_3 var8 = var1.id_byte(var6);
               if (var8.id_catch()) {
                  if (this.id_class((rRR)var1, var6)) {
                     var1.id_break(var6, Jj_1.id_class(var1, var6));
                     return;
                  }
               } else if (var8.id_byte().id_byte()) {
                  return;
               }
            }
         } else {
            for (int var9 = 0; var9 < 3; var9++) {
               rfH_2 var10 = var2.id_break(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
               if (!var1.id_synchronized(var10)) {
                  return;
               }

               if (var1.id_finally(var10.id_final()) && this.id_break(var1, var10)) {
                  var1.id_break(var10.id_final(), Jj_1.id_class(var1, var10));
               }
            }
         }
      }
   }

   @Override
   public xc_3 id_break(rXE var1) {
      return xu_3.id_instanceof.id_continue().id_class(dj_3.id_volatile, Integer.valueOf(id_throws(var1)));
   }

   @Override
   public int id_break(rRR var1) {
      return var1.id_default().id_protected() ? 4 : 2;
   }

   private boolean id_break(rRR var1, rfH_2 var2) {
      return var2.c_() >= 0 && var2.c_() < 256 && !var1.id_int(var2) ? false : var1.id_byte(var2).id_byte().id_protected();
   }

   @Override
   public rXs_1 id_throws() {
      return rXG.id_throws;
   }

   @Override
   protected boolean id_finally() {
      return true;
   }

   @Override
   protected boolean id_case() {
      return false;
   }

   @Override
   public rLx_1 id_implements() {
      return rLQ.id_finally;
   }

   @Override
   public rXs_1 id_protected() {
      return rXG.id_protected;
   }
}
