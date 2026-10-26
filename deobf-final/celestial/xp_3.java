package celestial;

public class xp_3 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.Z;
   private static final rjC_2 package_ = class_(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final rjC_2 final_ = rjw_3.class_(
      rjw_3.break_(),
      rjw_3.class_(class_(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), class_(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), class_(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), package_),
      rjN_2.throws_
   );

   @Override
   public void byte_(rYB var1, rfH_2 var2) {
      if (var1.int_.nextInt(20) == 1) {
         float var3 = var1.implements_(var2).class_(var2);
         if (!(var3 < 0.15F)) {
            xc_3 var4 = var1.byte_(var2);
            if (var4.byte_(volatile_) < 3) {
               var1.class_(var2, var4.class_(volatile_), 2);
            }
         }
      }
   }

   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return package_;
   }

   public xp_3(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      int var5 = var1.byte_(volatile_);
      float var6 = (float)var3.c_() + (6.0F + (float)(3 * var5)) / 16.0F;
      if (!var2.continue_ && var4.Pz() && var5 > 0 && var4.re() <= (double)var6) {
         var4.rE();
         this.class_(var2, var3, var1, var5 - 1);
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.protected_(var5);
      if (var7.class_()) {
         return ryZ_2.PASS;
      } else {
         int var8 = var1.byte_(volatile_);
         rdb_3 var9 = var7.break_();
         if (var9 == rdy_3.hR) {
            if (var8 < 3 && !var2.continue_) {
               if (!((rhx_3)var4.implements_[18]).protected_) {
                  var4.class_(var5, new rdn_3(rdy_3.hg));
               }

               var4.break_(rlB_2.r);
               this.class_(var2, var3, var1, 3);
               var2.class_((rhd_3)null, var3, rqn_3.rk, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            return ryZ_2.class_(var2.continue_);
         } else if (var9 == rdy_3.hg) {
            if (var8 == 3 && !var2.continue_) {
               if (!((rhx_3)var4.implements_[18]).protected_) {
                  var7.catch_(1);
                  if (var7.class_()) {
                     var4.class_(var5, new rdn_3(rdy_3.hR));
                  } else if (!((rhz_3)var4.implements_[1]).throws_(new rdn_3(rdy_3.hR))) {
                     var4.class_(new rdn_3(rdy_3.hR), false);
                  }
               }

               var4.break_(rlB_2.P);
               this.class_(var2, var3, var1, 0);
               var2.class_((rhd_3)null, var3, rqn_3.rQ, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            return ryZ_2.class_(var2.continue_);
         } else if (var9 == rdy_3.Jn) {
            if (var8 > 0 && !var2.continue_) {
               if (!((rhx_3)var4.implements_[18]).protected_) {
                  rdn_3 var15 = rAB.class_(new rdn_3(rdy_3.JA), rAS.break_);
                  var4.break_(rlB_2.P);
                  var7.catch_(1);
                  if (var7.class_()) {
                     var4.class_(var5, var15);
                  } else if (!((rhz_3)var4.implements_[1]).throws_(var15)) {
                     var4.class_(var15, false);
                  } else if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).class_((rJT)var4.implements_[3]);
                  }
               }

               var2.class_((rhd_3)null, var3, rqn_3.rb, rqL_2.BLOCKS, 1.0F, 1.0F);
               this.class_(var2, var3, var1, var8 - 1);
            }

            return ryZ_2.class_(var2.continue_);
         } else if (var9 == rdy_3.JA && rAB.protected_(var7) == rAS.break_) {
            if (var8 < 3 && !var2.continue_) {
               if (!((rhx_3)var4.implements_[18]).protected_) {
                  rdn_3 var14 = new rdn_3(rdy_3.Jn);
                  var4.break_(rlB_2.P);
                  var4.class_(var5, var14);
                  if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).class_((rJT)var4.implements_[3]);
                  }
               }

               var2.class_((rhd_3)null, var3, rqn_3.rG, rqL_2.BLOCKS, 1.0F, 1.0F);
               this.class_(var2, var3, var1, var8 + 1);
            }

            return ryZ_2.class_(var2.continue_);
         } else {
            if (var8 > 0 && var9 instanceof rds_3 var10 && var10.c_(var7) && !var2.continue_) {
               var10.e_(var7);
               this.class_(var2, var3, var1, var8 - 1);
               var4.break_(rlB_2.B);
               return ryZ_2.SUCCESS;
            }

            if (var8 > 0 && var9 instanceof rxO_2) {
               if (rHb_1.break_(var7) > 0 && !var2.continue_) {
                  rdn_3 var13 = var7.implements_();
                  var13.throws_(1);
                  rHb_1.byte_(var13);
                  var4.break_(rlB_2.S);
                  if (!((rhx_3)var4.implements_[18]).protected_) {
                     var7.catch_(1);
                     this.class_(var2, var3, var1, var8 - 1);
                  }

                  if (var7.class_()) {
                     var4.class_(var5, var13);
                  } else if (!((rhz_3)var4.implements_[1]).throws_(var13)) {
                     var4.class_(var13, false);
                  } else if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).class_((rJT)var4.implements_[3]);
                  }
               }

               return ryZ_2.class_(var2.continue_);
            } else if (var8 > 0 && var9 instanceof rxJ_2) {
               xd_3 var12 = ((rxJ_2)var9).catch_();
               if (var12 instanceof Wp_1 && !var2.import_()) {
                  rdn_3 var11 = new rdn_3(xu_3.bD, 1);
                  if (var7.final_()) {
                     var11.byte_(var7.package_().catch_());
                  }

                  var4.class_(var5, var11);
                  this.class_(var2, var3, var1, var8 - 1);
                  var4.break_(rlB_2.s);
                  return ryZ_2.SUCCESS;
               } else {
                  return ryZ_2.CONSUME;
               }
            } else {
               return ryZ_2.PASS;
            }
         }
      }
   }

   public void class_(rYB var1, rfH_2 var2, xc_3 var3, int var4) {
      var1.class_(var2, var3.class_(volatile_, Integer.valueOf(rfU_2.class_(var4, 0, 3))), 2);
      var1.byte_(var2, this);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return final_;
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.byte_(volatile_);
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
