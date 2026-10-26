package celestial;

public class rxN_2 extends rdb_3 {
   private final rXs_1 class_;

   public rxN_2(rXs_1 var1, rdO_2 var2) {
      super(var2);
      this.class_ = var1;
   }

   public void class_(rYB var1, rdn_3 var2, rfH_2 var3) {
   }

   public boolean class_(rhd_3 var1, rYB var2, rfH_2 var3, rff_3 var4) {
      if (!(this.class_ instanceof rXB)) {
         return false;
      } else {
         xc_3 var5 = var2.byte_(var3);
         xd_3 var6 = var5.break_();
         QP var7 = var5.byte_();
         boolean var8 = var5.class_(this.class_);
         boolean var9 = var5.catch_() || var8 || var6 instanceof kJ_2 && ((kJ_2)var6).class_(var2, var3, var5, this.class_);
         if (!var9) {
            return var4 != null && this.class_(var1, var2, var4.class_().break_(var4.break_()), (rff_3)null);
         } else if (var2.default_().protected_() && this.class_.class_(rlG_2.break_)) {
            int var10 = var3.b_();
            int var11 = var3.c_();
            int var12 = var3.d_();
            var2.class_(var1, var3, rqn_3.Sk, rqL_2.BLOCKS, 0.5F, 2.6F + (var2.int_.nextFloat() - var2.int_.nextFloat()) * 0.8F);

            for (int var13 = 0; var13 < 8; var13++) {
               var2.class_(rLQ.short_, (double)var10 + Math.random(), (double)var11 + Math.random(), (double)var12 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if (var6 instanceof kJ_2 && this.class_ == rXG.byte_) {
            ((kJ_2)var6).class_(var2, var3, var5, ((rXB)this.class_).class_(false));
            this.class_(var1, var2, var3);
            return true;
         } else {
            if (!var2.continue_ && var8 && !var7.class_()) {
               var2.break_(var3, true);
            }

            if (!var2.class_(var3, this.class_.private_().catch_(), 11) && !var5.volatile_().break_()) {
               return false;
            } else {
               this.class_(var1, var2, var3);
               return true;
            }
         }
      }
   }

   protected void class_(rhd_3 var1, rRg_1 var2, rfH_2 var3) {
      rqA_2 var4 = this.class_.class_(rlG_2.byte_) ? rqn_3.rz : rqn_3.rk;
      var2.class_(var1, var3, var4, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   protected rdn_3 class_(rdn_3 var1, rhd_3 var2) {
      return !((rhx_3)var2.implements_[18]).protected_ ? new rdn_3(rdy_3.hg) : var1;
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rff_3 var5 = class_(var1, var2, this.class_ == rXG.class_ ? rjs_3.SOURCE_ONLY : rjs_3.NONE);
      if (var5.byte_() == rjM_2.MISS) {
         return rym_3.byte_(var4);
      } else if (var5.byte_() != rjM_2.BLOCK) {
         return rym_3.byte_(var4);
      } else {
         rff_3 var6 = var5;
         rfH_2 var7 = var6.class_();
         rpr_3 var8 = var6.break_();
         rfH_2 var9 = var7.break_(var8);
         if (!var1.class_(var2, var7) || !var2.class_(var9, var8, var4)) {
            return rym_3.protected_(var4);
         } else if (this.class_ == rXG.class_) {
            xc_3 var13 = var1.byte_(var7);
            if (var13.break_() instanceof kh_3) {
               rXs_1 var14 = ((kh_3)var13.break_()).break_(var1, var7, var13);
               if (var14 != rXG.class_) {
                  var2.class_(rlB_2.byte_.break_(this));
                  var2.class_(var14.class_(rlG_2.byte_) ? rqn_3.rc : rqn_3.rQ, 1.0F, 1.0F);
                  rdn_3 var12 = rpO_2.class_(var4, var2, new rdn_3(var14.class_()));
                  if (!var1.continue_) {
                     Oo_1.finally_.class_((rhN_2)var2, new rdn_3(var14.class_()));
                  }

                  return rym_3.class_(var12, var1.import_());
               }
            }

            return rym_3.protected_(var4);
         } else {
            xc_3 var10 = var1.byte_(var7);
            rfH_2 var11 = var10.break_() instanceof kJ_2 && this.class_ == rXG.byte_ ? var7 : var9;
            if (this.class_(var2, var1, var11, var6)) {
               this.class_(var1, var4, var11);
               if (var2 instanceof rhN_2) {
                  Oo_1.goto_.class_((rhN_2)var2, var11, var4);
               }

               var2.class_(rlB_2.byte_.break_(this));
               return rym_3.class_(this.class_(var4, var2), var1.import_());
            } else {
               return rym_3.protected_(var4);
            }
         }
      }
   }
}
