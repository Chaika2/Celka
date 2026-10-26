package celestial;

import java.util.List;
import java.util.Random;

public class xO_2 extends dB_2 {
   private static final rpr_3[] package_ = new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.SOUTH};
   public static final rCc_1 volatile_ = kE_2.p;
   public static final rCm_1 final_ = rCT.L;

   public xO_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(final_, Integer.valueOf(0)).class_(volatile_, rpr_3.NORTH));
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHx_1();
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(final_, volatile_);
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(volatile_, var1.case_().case_());
   }

   private void class_(rYB var1, rfH_2 var2, rjC_2 var3, double var4) {
      this.class_(
         var1,
         (double)var2.b_() + var3.break_(rpB_2.X),
         (double)var2.b_() + var3.byte_(rpB_2.X),
         (double)var2.d_() + var3.break_(rpB_2.Z),
         (double)var2.d_() + var3.byte_(rpB_2.Z),
         var4
      );
   }

   public static rpr_3 class_(Random var0) {
      return rqR_2.class_(package_, var0);
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var4.byte_(var6).break_() instanceof dt_3 && var4.class_(var5) instanceof rHx_1 var8) {
         var8.class_((rhd_3)null, var1, rHk_1.EMERGENCY);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public List<rdn_3> class_(xc_3 var1, rzP_2 var2) {
      an_3 var3 = var2.break_(rzQ_2.class_);
      if (var3 instanceof rsX_2 || var3 instanceof rEJ || var3 instanceof rhU_2 || var3 instanceof rSN || var3 instanceof rsv_3) {
         ryO_2 var4 = var2.break_(rzQ_2.private_);
         if (var4 instanceof rHx_1 var5) {
            var5.class_((rhd_3)null, var1, rHk_1.EMERGENCY);
         }
      }

      return super.class_(var1, var2);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.continue_ && var4.implements_() && var1.B().break_(rRu_1.case_) && var1.class_(var2) instanceof rHx_1 var6) {
         rdn_3 var7 = new rdn_3(this);
         int var8 = var3.byte_(final_);
         boolean var9 = !var6.catch_();
         if (!var9 && var8 == 0) {
            return;
         }

         if (var9) {
            rcd_3 var10 = new rcd_3();
            var10.class_("Bees", var6.volatile_());
            var7.class_("BlockEntityTag", var10);
         }

         rcd_3 var12 = new rcd_3();
         var12.break_("honey_level", var8);
         var7.class_("BlockStateTag", var12);
         rsE_2 var11 = new rsE_2(var1, (double)var2.b_(), (double)var2.c_(), (double)var2.d_(), var7);
         var11.private_();
         var1.a_(var11);
      }

      super.class_(var1, var2, var3, var4);
   }

   public void class_(rYB var1, xc_3 var2, rfH_2 var3, rhd_3 var4, rHk_1 var5) {
      this.class_(var1, var2, var3);
      if (var1.class_(var3) instanceof rHx_1 var7) {
         var7.class_(var4, var2, var5);
      }
   }

   private void class_(rYB var1, double var2, double var4, double var6, double var8, double var10) {
      var1.class_(rLQ.d, rfU_2.protected_(var1.int_.nextDouble(), var2, var4), var10, rfU_2.protected_(var1.int_.nextDouble(), var6, var8), 0.0, 0.0, 0.0);
   }

   @Override
   public void class_(rYB var1, rhd_3 var2, rfH_2 var3, xc_3 var4, ryO_2 var5, rdn_3 var6) {
      super.class_(var1, var2, var3, var4, var5, var6);
      if (!var1.continue_ && var5 instanceof rHx_1 var7) {
         if (eA_2.class_(eY_2.else_, var6) == 0) {
            var7.class_(var2, var4, rHk_1.EMERGENCY);
            var1.byte_(var3, this);
            this.break_(var1, var3);
         }

         Oo_1.import_.class_((rhN_2)var2, var4.break_(), var6, var7.finally_());
      }
   }

   public static void class_(rYB var0, rfH_2 var1) {
      class_(var0, var1, new rdn_3(rdy_3.Wm, 3));
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      int var8 = var1.byte_(final_);
      boolean var9 = false;
      if (var8 >= 5) {
         if (var7.break_() == rdy_3.JJ) {
            var2.class_(var4, var4.rx(), var4.re(), var4.BO(), rqn_3.f, rqL_2.NEUTRAL, 1.0F, 1.0F);
            class_(var2, var3);
            var7.class_(1, var4, var1x -> var1x.byte_(var5));
            var9 = true;
         } else if (var7.break_() == rdy_3.Jn) {
            var7.catch_(1);
            var2.class_(var4, var4.rx(), var4.re(), var4.BO(), rqn_3.rb, rqL_2.NEUTRAL, 1.0F, 1.0F);
            if (var7.class_()) {
               var4.class_(var5, new rdn_3(rdy_3.WF));
            } else if (!((rhz_3)var4.implements_[1]).throws_(new rdn_3(rdy_3.WF))) {
               var4.class_(new rdn_3(rdy_3.WF), false);
            }

            var9 = true;
         }
      }

      if (var9) {
         if (!xn_3.class_(var2, var3)) {
            if (this.protected_(var2, var3)) {
               this.break_(var2, var3);
            }

            this.class_(var2, var1, var3, var4, rHk_1.EMERGENCY);
         } else {
            this.class_(var2, var1, var3);
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return super.class_(var1, var2, var3, var4, var5, var6);
      }
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      if (var3.volatile_().byte_() && !(var1.int_.nextFloat() < 0.3F)) {
         rjC_2 var4 = var3.extends_(var1, var2);
         double var5 = var4.byte_(rpB_2.Y);
         if (var5 >= 1.0 && !var3.class_(rls_3.B)) {
            double var7 = var4.break_(rpB_2.Y);
            if (var7 > 0.0) {
               this.class_(var1, var2, var4, (double)var2.c_() + var7 - 0.05);
            } else {
               rfH_2 var9 = var2.break_();
               xc_3 var10 = var1.byte_(var9);
               rjC_2 var11 = var10.extends_(var1, var9);
               double var12 = var11.byte_(rpB_2.Y);
               if ((var12 < 1.0 || !var10.new_(var1, var9)) && var10.volatile_().byte_()) {
                  this.class_(var1, var2, var4, (double)var2.c_() - 0.05);
               }
            }
         }
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.byte_(final_) >= 5) {
         for (int var5 = 0; var5 < var4.nextInt(1) + 1; var5++) {
            this.class_(var2, var3, var1);
         }
      }
   }

   public void class_(rYB var1, xc_3 var2, rfH_2 var3) {
      var1.class_(var3, var2.class_(final_, Integer.valueOf(0)), 3);
   }

   private void break_(rYB var1, rfH_2 var2) {
      List var3 = var1.class_(rbF_2.class, new rfl_3(var2).byte_(8.0, 6.0, 8.0));
      if (!var3.isEmpty()) {
         List var4 = var1.class_(rhd_3.class, new rfl_3(var2).byte_(8.0, 6.0, 8.0));
         int var5 = var4.size();

         for (rbF_2 var7 : var3) {
            if (var7.I_() == null) {
               var7.byte_((iB_2)var4.get(var1.int_.nextInt(var5)));
            }
         }
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.byte_(final_);
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }

   private boolean protected_(rYB var1, rfH_2 var2) {
      return var1.class_(var2) instanceof rHx_1 var4 ? !var4.catch_() : false;
   }
}
