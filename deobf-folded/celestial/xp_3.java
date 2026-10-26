package celestial;

public class xp_3 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.Z;
   private static final rjC_2 id_package = id_class(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final rjC_2 id_final = rjw_3.id_class(
      rjw_3.id_break(),
      rjw_3.id_class(id_class(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), id_class(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), id_class(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), id_package),
      rjN_2.id_throws
   );

   @Override
   public void id_byte(rYB var1, rfH_2 var2) {
      if (var1.id_int.nextInt(20) == 1) {
         float var3 = var1.id_implements(var2).id_class(var2);
         if (!(var3 < 0.15F)) {
            xc_3 var4 = var1.id_byte(var2);
            if (var4.id_byte(id_volatile) < 3) {
               var1.id_class(var2, var4.id_class(id_volatile), 2);
            }
         }
      }
   }

   @Override
   public rjC_2 id_byte(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return id_package;
   }

   public xp_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      int var5 = var1.id_byte(id_volatile);
      float var6 = (float)var3.c_() + (6.0F + (float)(3 * var5)) / 16.0F;
      if (!var2.id_continue && var4.Pz() && var5 > 0 && var4.re() <= (double)var6) {
         var4.rE();
         this.id_class(var2, var3, var1, var5 - 1);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.id_protected(var5);
      if (var7.id_class()) {
         return ryZ_2.PASS;
      } else {
         int var8 = var1.id_byte(id_volatile);
         rdb_3 var9 = var7.id_break();
         if (var9 == rdy_3.hR) {
            if (var8 < 3 && !var2.id_continue) {
               if (!((rhx_3)var4.id_implements[18]).id_protected) {
                  var4.id_class(var5, new rdn_3(rdy_3.hg));
               }

               var4.id_break(rlB_2.r);
               this.id_class(var2, var3, var1, 3);
               var2.id_class((rhd_3)null, var3, rqn_3.rk, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            return ryZ_2.id_class(var2.id_continue);
         } else if (var9 == rdy_3.hg) {
            if (var8 == 3 && !var2.id_continue) {
               if (!((rhx_3)var4.id_implements[18]).id_protected) {
                  var7.id_catch(1);
                  if (var7.id_class()) {
                     var4.id_class(var5, new rdn_3(rdy_3.hR));
                  } else if (!((rhz_3)var4.id_implements[1]).id_throws(new rdn_3(rdy_3.hR))) {
                     var4.id_class(new rdn_3(rdy_3.hR), false);
                  }
               }

               var4.id_break(rlB_2.P);
               this.id_class(var2, var3, var1, 0);
               var2.id_class((rhd_3)null, var3, rqn_3.rQ, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            return ryZ_2.id_class(var2.id_continue);
         } else if (var9 == rdy_3.Jn) {
            if (var8 > 0 && !var2.id_continue) {
               if (!((rhx_3)var4.id_implements[18]).id_protected) {
                  rdn_3 var15 = rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_break);
                  var4.id_break(rlB_2.P);
                  var7.id_catch(1);
                  if (var7.id_class()) {
                     var4.id_class(var5, var15);
                  } else if (!((rhz_3)var4.id_implements[1]).id_throws(var15)) {
                     var4.id_class(var15, false);
                  } else if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).id_class((rJT)var4.id_implements[3]);
                  }
               }

               var2.id_class((rhd_3)null, var3, rqn_3.rb, rqL_2.BLOCKS, 1.0F, 1.0F);
               this.id_class(var2, var3, var1, var8 - 1);
            }

            return ryZ_2.id_class(var2.id_continue);
         } else if (var9 == rdy_3.JA && rAB.id_protected(var7) == rAS.id_break) {
            if (var8 < 3 && !var2.id_continue) {
               if (!((rhx_3)var4.id_implements[18]).id_protected) {
                  rdn_3 var14 = new rdn_3(rdy_3.Jn);
                  var4.id_break(rlB_2.P);
                  var4.id_class(var5, var14);
                  if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).id_class((rJT)var4.id_implements[3]);
                  }
               }

               var2.id_class((rhd_3)null, var3, rqn_3.rG, rqL_2.BLOCKS, 1.0F, 1.0F);
               this.id_class(var2, var3, var1, var8 + 1);
            }

            return ryZ_2.id_class(var2.id_continue);
         } else {
            if (var8 > 0 && var9 instanceof rds_3 var10 && var10.c_(var7) && !var2.id_continue) {
               var10.e_(var7);
               this.id_class(var2, var3, var1, var8 - 1);
               var4.id_break(rlB_2.B);
               return ryZ_2.SUCCESS;
            }

            if (var8 > 0 && var9 instanceof rxO_2) {
               if (rHb_1.id_break(var7) > 0 && !var2.id_continue) {
                  rdn_3 var13 = var7.id_implements();
                  var13.id_throws(1);
                  rHb_1.id_byte(var13);
                  var4.id_break(rlB_2.S);
                  if (!((rhx_3)var4.id_implements[18]).id_protected) {
                     var7.id_catch(1);
                     this.id_class(var2, var3, var1, var8 - 1);
                  }

                  if (var7.id_class()) {
                     var4.id_class(var5, var13);
                  } else if (!((rhz_3)var4.id_implements[1]).id_throws(var13)) {
                     var4.id_class(var13, false);
                  } else if (var4 instanceof rhN_2) {
                     ((rhN_2)var4).id_class((rJT)var4.id_implements[3]);
                  }
               }

               return ryZ_2.id_class(var2.id_continue);
            } else if (var8 > 0 && var9 instanceof rxJ_2) {
               xd_3 var12 = ((rxJ_2)var9).id_catch();
               if (var12 instanceof Wp_1 && !var2.id_import()) {
                  rdn_3 var11 = new rdn_3(xu_3.bD, 1);
                  if (var7.id_final()) {
                     var11.id_byte(var7.id_package().id_catch());
                  }

                  var4.id_class(var5, var11);
                  this.id_class(var2, var3, var1, var8 - 1);
                  var4.id_break(rlB_2.s);
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

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, int var4) {
      var1.id_class(var2, var3.id_class(id_volatile, Integer.valueOf(rfU_2.id_class(var4, 0, 3))), 2);
      var1.id_byte(var2, this);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      return var1.id_byte(id_volatile);
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
