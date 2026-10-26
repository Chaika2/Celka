package celestial;

import java.util.Optional;
import java.util.Random;

public abstract class Jj_1 extends xd_3 {
   private final float final_;
   protected static final rjC_2 volatile_ = xd_3.class_(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public Jj_1(Jq_1 var1, float var2) {
      super(var1);
      this.final_ = var2;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         if (class_(var2)) {
            Optional var6 = WB.class_(var2, var3, rpB_2.X);
            if (var6.isPresent()) {
               ((WB)var6.get()).break_();
               return;
            }
         }

         if (!var1.class_((rRR)var2, var3)) {
            var2.class_(var3, false);
         }
      }
   }

   private static boolean class_(rYB var0) {
      return var0.E() == rYB.byte_ || var0.E() == rYB.protected_;
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.import_()) {
         var1.class_((rhd_3)null, 1009, var2, 0);
      }
   }

   public static boolean class_(rYB var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.byte_(var1);
      return !var3.catch_() ? false : class_(var0, var1).class_((rRR)var0, var1) || break_(var0, var1, var2);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var4.q()) {
         var4.protected_(var4.ru() + 1);
         if (var4.ru() == 0) {
            var4.case_(8);
         }

         var4.break_(rye_3.class_, this.final_);
      }

      super.class_(var1, var2, var3, var4);
   }

   public static xc_3 class_(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.break_();
      xc_3 var3 = var0.byte_(var2);
      return Wa_1.class_(var3.break_()) ? xu_3.rK.continue_() : ((dt_3)xu_3.ro).break_(var0, var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return volatile_;
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(24) == 0) {
         var2.class_(
            (double)var3.b_() + 0.5,
            (double)var3.c_() + 0.5,
            (double)var3.d_() + 0.5,
            rqn_3.Sd,
            rqL_2.BLOCKS,
            1.0F + var4.nextFloat(),
            var4.nextFloat() * 0.7F + 0.3F,
            false
         );
      }

      rfH_2 var5 = var3.break_();
      xc_3 var6 = var2.byte_(var5);
      if (!this.catch_(var6) && !var6.protected_(var2, var5, rpr_3.UP)) {
         if (this.catch_(var2.byte_(var3.byte_()))) {
            for (int var14 = 0; var14 < 2; var14++) {
               double var19 = (double)var3.b_() + var4.nextDouble() * 0.1F;
               double var24 = (double)var3.c_() + var4.nextDouble();
               double var29 = (double)var3.d_() + var4.nextDouble();
               var2.class_(rLQ.short_, var19, var24, var29, 0.0, 0.0, 0.0);
            }
         }

         if (this.catch_(var2.byte_(var3.extends_()))) {
            for (int var15 = 0; var15 < 2; var15++) {
               double var20 = (double)(var3.b_() + 1) - var4.nextDouble() * 0.1F;
               double var25 = (double)var3.c_() + var4.nextDouble();
               double var30 = (double)var3.d_() + var4.nextDouble();
               var2.class_(rLQ.short_, var20, var25, var30, 0.0, 0.0, 0.0);
            }
         }

         if (this.catch_(var2.byte_(var3.private_()))) {
            for (int var16 = 0; var16 < 2; var16++) {
               double var21 = (double)var3.b_() + var4.nextDouble();
               double var26 = (double)var3.c_() + var4.nextDouble();
               double var31 = (double)var3.d_() + var4.nextDouble() * 0.1F;
               var2.class_(rLQ.short_, var21, var26, var31, 0.0, 0.0, 0.0);
            }
         }

         if (this.catch_(var2.byte_(var3.protected_()))) {
            for (int var17 = 0; var17 < 2; var17++) {
               double var22 = (double)var3.b_() + var4.nextDouble();
               double var27 = (double)var3.c_() + var4.nextDouble();
               double var32 = (double)(var3.d_() + 1) - var4.nextDouble() * 0.1F;
               var2.class_(rLQ.short_, var22, var27, var32, 0.0, 0.0, 0.0);
            }
         }

         if (this.catch_(var2.byte_(var3.final_()))) {
            for (int var18 = 0; var18 < 2; var18++) {
               double var23 = (double)var3.b_() + var4.nextDouble();
               double var28 = (double)(var3.c_() + 1) - var4.nextDouble() * 0.1F;
               double var33 = (double)var3.d_() + var4.nextDouble();
               var2.class_(rLQ.short_, var23, var28, var33, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var7 = 0; var7 < 3; var7++) {
            double var8 = (double)var3.b_() + var4.nextDouble();
            double var10 = (double)var3.c_() + var4.nextDouble() * 0.5 + 0.5;
            double var12 = (double)var3.d_() + var4.nextDouble();
            var2.class_(rLQ.short_, var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return class_(var1.int_(), var1.class_());
   }

   private static boolean break_(rYB var0, rfH_2 var1, rpr_3 var2) {
      if (!class_(var0)) {
         return false;
      } else {
         rfw_3 var3 = var1.new_();
         boolean var4 = false;

         for (rpr_3 var8 : rpr_3.values()) {
            if (var0.byte_(var3.class_(var1).class_(var8)).class_(xu_3.rg)) {
               var4 = true;
               break;
            }
         }

         if (!var4) {
            return false;
         } else {
            rpB_2 var9 = var2.final_().protected_() ? var2.private_().final_() : rpb_3.HORIZONTAL.break_(var0.int_);
            return WB.class_(var0, var1, var9).isPresent();
         }
      }
   }

   protected abstract boolean catch_(xc_3 var1);
}
