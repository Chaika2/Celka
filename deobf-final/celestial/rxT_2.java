package celestial;

public class rxT_2 extends rdb_3 {
   public rxT_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (!var4.class_(xu_3.SO) || var4.byte_(dA_2.final_)) {
         return ryZ_2.PASS;
      } else if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         xc_3 var5 = var4.class_(dA_2.final_, Boolean.valueOf(true));
         xd_3.class_(var4, var5, var2, var3);
         var2.class_(var3, var5, 2);
         var2.byte_(var3, xu_3.SO);
         var1.volatile_().catch_(1);
         var2.byte_(1503, var3, 0);
         QJ var6 = dA_2.break_().class_(var2, var3);
         if (var6 != null) {
            rfH_2 var7 = var6.class_().break_(-3, 0, -3);

            for (int var8 = 0; var8 < 3; var8++) {
               for (int var9 = 0; var9 < 3; var9++) {
                  var2.class_(var7.break_(var8, 0, var9), xu_3.SM.continue_(), 2);
               }
            }

            var2.break_(1038, var7.break_(1, 0, 1), 0);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rff_3 var5 = class_(var1, var2, rjs_3.NONE);
      if (var5.byte_() == rjM_2.BLOCK && var1.byte_(var5.class_()).class_(xu_3.SO)) {
         return rym_3.byte_(var4);
      } else {
         var2.break_(var3);
         if (var1 instanceof rrEm_1) {
            rfH_2 var6 = ((rrEm_1)var1).else_().implements_().class_((rrEm_1)var1, rrrZ.extends_, var2.Bs(), 100, false);
            if (var6 != null) {
               rhl_3 var7 = new rhl_3(var1, var2.rx(), var2.byte_(0.5), var2.BO());
               var7.break_(var4);
               var7.class_(var6);
               var1.a_(var7);
               if (var2 instanceof rhN_2) {
                  Oo_1.volatile_.class_((rhN_2)var2, var6);
               }

               var1.class_((rhd_3)null, var2.rx(), var2.re(), var2.BO(), rqn_3.BC, rqL_2.NEUTRAL, 0.5F, 0.4F / (private_.nextFloat() * 0.4F + 0.8F));
               var1.class_((rhd_3)null, 1003, var2.Bs(), 0);
               if (!((rhx_3)var2.implements_[18]).protected_) {
                  var4.catch_(1);
               }

               var2.class_(rlB_2.byte_.break_(this));
               var2.class_(var3, true);
               return rym_3.class_(var4);
            }
         }

         return rym_3.break_(var4);
      }
   }
}
