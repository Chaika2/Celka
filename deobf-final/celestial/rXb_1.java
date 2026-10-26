package celestial;

import java.util.Random;

public abstract class rXb_1 extends rXB {
   @Override
   protected float byte_() {
      return 100.0F;
   }

   @Override
   public int byte_(rRR var1) {
      return var1.default_().protected_() ? 1 : 2;
   }

   @Override
   public int class_(rRR var1) {
      return var1.default_().protected_() ? 10 : 30;
   }

   @Override
   public boolean class_(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5) {
      return var1.class_(var2, var3) >= 0.44444445F && var4.class_(rlG_2.break_);
   }

   @Override
   public boolean class_(rXs_1 var1) {
      return var1 == rXG.throws_ || var1 == rXG.protected_;
   }

   @Override
   protected void class_(rRg_1 var1, rfH_2 var2, xc_3 var3) {
      this.class_(var1, var2);
   }

   @Override
   public int class_(rYB var1, rfH_2 var2, rXE var3, rXE var4) {
      int var5 = this.class_(var1);
      if (!var3.byte_()
         && !var4.byte_()
         && !var3.byte_(class_)
         && !var4.byte_(class_)
         && var4.class_((rRq_1)var1, var2) > var3.class_((rRq_1)var1, var2)
         && var1.long_().nextInt(4) != 0) {
         var5 *= 4;
      }

      return var5;
   }

   private void class_(rRg_1 var1, rfH_2 var2) {
      var1.byte_(1501, var2, 0);
   }

   @Override
   protected void class_(rRg_1 var1, rfH_2 var2, xc_3 var3, rpr_3 var4, rXE var5) {
      if (var4 == rpr_3.DOWN) {
         rXE var6 = var1.break_(var2);
         if (this.class_(rlG_2.byte_) && var6.class_(rlG_2.break_)) {
            if (var3.break_() instanceof dj_3) {
               var1.class_(var2, xu_3.break_.continue_(), 3);
            }

            this.class_(var1, var2);
            return;
         }
      }

      super.class_(var1, var2, var3, var4, var5);
   }

   private boolean class_(rRR var1, rfH_2 var2) {
      for (rpr_3 var6 : rpr_3.values()) {
         if (this.break_(var1, var2.break_(var6))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public rdb_3 class_() {
      return rdy_3.hY;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      rfH_2 var5 = var2.final_();
      if (var1.byte_(var5).catch_() && !var1.byte_(var5).implements_(var1, var5)) {
         if (var4.nextInt(100) == 0) {
            double var6 = (double)var2.b_() + var4.nextDouble();
            double var8 = (double)var2.c_() + 1.0;
            double var10 = (double)var2.d_() + var4.nextDouble();
            var1.class_(rLQ.default_, var6, var8, var10, 0.0, 0.0, 0.0);
            var1.class_(var6, var8, var10, rqn_3.Gs, rqL_2.BLOCKS, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false);
         }

         if (var4.nextInt(200) == 0) {
            var1.class_(
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
   public void break_(rYB var1, rfH_2 var2, rXE var3, Random var4) {
      if (var1.B().break_(rRu_1.class_)) {
         int var5 = var4.nextInt(3);
         if (var5 > 0) {
            rfH_2 var6 = var2;

            for (int var7 = 0; var7 < var5; var7++) {
               var6 = var6.break_(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if (!var1.synchronized_(var6)) {
                  return;
               }

               xc_3 var8 = var1.byte_(var6);
               if (var8.catch_()) {
                  if (this.class_((rRR)var1, var6)) {
                     var1.break_(var6, Jj_1.class_(var1, var6));
                     return;
                  }
               } else if (var8.byte_().byte_()) {
                  return;
               }
            }
         } else {
            for (int var9 = 0; var9 < 3; var9++) {
               rfH_2 var10 = var2.break_(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
               if (!var1.synchronized_(var10)) {
                  return;
               }

               if (var1.finally_(var10.final_()) && this.break_(var1, var10)) {
                  var1.break_(var10.final_(), Jj_1.class_(var1, var10));
               }
            }
         }
      }
   }

   @Override
   public xc_3 break_(rXE var1) {
      return xu_3.instanceof_.continue_().class_(dj_3.volatile_, Integer.valueOf(throws_(var1)));
   }

   @Override
   public int break_(rRR var1) {
      return var1.default_().protected_() ? 4 : 2;
   }

   private boolean break_(rRR var1, rfH_2 var2) {
      return var2.c_() >= 0 && var2.c_() < 256 && !var1.int_(var2) ? false : var1.byte_(var2).byte_().protected_();
   }

   @Override
   public rXs_1 throws_() {
      return rXG.throws_;
   }

   @Override
   protected boolean finally_() {
      return true;
   }

   @Override
   protected boolean case_() {
      return false;
   }

   @Override
   public rLx_1 implements_() {
      return rLQ.finally_;
   }

   @Override
   public rXs_1 protected_() {
      return rXG.protected_;
   }
}
