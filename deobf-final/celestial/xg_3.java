package celestial;

import java.util.Random;

public class xg_3 extends xd_3 {
   public static final rCm_1 volatile_ = rCT.x;
   private final xR_2 final_;

   protected xg_3(xR_2 var1, Jq_1 var2) {
      super(var2);
      this.final_ = var1;
      this.extends_(this.abstract_.break_().class_(volatile_, Integer.valueOf(0)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 != rpr_3.UP && !var1.class_(var4, var5)) {
         var4.finally_().class_(var5, this, 1);
      }

      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_);
   }

   public static void class_(rRg_1 var0, rfH_2 var1, Random var2, int var3) {
      var0.class_(var1, ((xR_2)xu_3.bC).class_(var0, var1), 2);
      class_(var0, var1, var2, var1, var3, 0);
   }

   private static void class_(rRg_1 var0, rfH_2 var1, Random var2, rfH_2 var3, int var4, int var5) {
      xR_2 var6 = (xR_2)xu_3.bC;
      int var7 = var2.nextInt(4) + 1;
      if (var5 == 0) {
         var7++;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         rfH_2 var9 = var1.break_(var8 + 1);
         if (!break_(var0, var9, (rpr_3)null)) {
            return;
         }

         var0.class_(var9, var6.class_(var0, var9), 2);
         var0.class_(var9.break_(), var6.class_(var0, var9.break_()), 2);
      }

      boolean var13 = false;
      if (var5 < 4) {
         int var14 = var2.nextInt(4);
         if (var5 == 0) {
            var14++;
         }

         for (int var10 = 0; var10 < var14; var10++) {
            rpr_3 var11 = rpb_3.HORIZONTAL.class_(var2);
            rfH_2 var12 = var1.break_(var7).break_(var11);
            if (Math.abs(var12.b_() - var3.b_()) < var4
               && Math.abs(var12.d_() - var3.d_()) < var4
               && var0.finally_(var12)
               && var0.finally_(var12.break_())
               && break_(var0, var12, var11.case_())) {
               var13 = true;
               var0.class_(var12, var6.class_(var0, var12), 2);
               var0.class_(var12.break_(var11.case_()), var6.class_(var0, var12.break_(var11.case_())), 2);
               class_(var0, var12, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!var13) {
         var0.class_(var1.break_(var7), xu_3.bl.continue_().class_(volatile_, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void class_(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      if (var4.BC().class_(rlE_2.case_)) {
         rfH_2 var5 = var3.class_();
         var1.class_(var5, true, var4);
      }
   }

   @Override
   public void class_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.final_();
      if (var2.finally_(var5) && var5.c_() < 256) {
         int var6 = var1.byte_(volatile_);
         if (var6 < 5) {
            boolean var7 = false;
            boolean var8 = false;
            xc_3 var9 = var2.byte_(var3.break_());
            xd_3 var10 = var9.break_();
            if (var10 == xu_3.Sh) {
               var7 = true;
            } else if (var10 != this.final_) {
               if (var9.catch_()) {
                  var7 = true;
               }
            } else {
               int var11 = 1;

               for (int var12 = 0; var12 < 4; var12++) {
                  xd_3 var13 = var2.byte_(var3.catch_(var11 + 1)).break_();
                  if (var13 != this.final_) {
                     if (var13 == xu_3.Sh) {
                        var8 = true;
                     }
                     break;
                  }

                  var11++;
               }

               if (var11 < 2 || var11 <= var4.nextInt(var8 ? 5 : 4)) {
                  var7 = true;
               }
            }

            if (var7 && break_(var2, var5, (rpr_3)null) && var2.finally_(var3.break_(2))) {
               var2.class_(var3, this.final_.class_(var2, var3), 2);
               this.class_(var2, var5, var6);
            } else if (var6 < 4) {
               int var16 = var4.nextInt(4);
               if (var8) {
                  var16++;
               }

               boolean var17 = false;

               for (int var18 = 0; var18 < var16; var18++) {
                  rpr_3 var14 = rpb_3.HORIZONTAL.class_(var4);
                  rfH_2 var15 = var3.break_(var14);
                  if (var2.finally_(var15) && var2.finally_(var15.break_()) && break_(var2, var15, var14.case_())) {
                     this.class_(var2, var15, var6 + 1);
                     var17 = true;
                  }
               }

               if (var17) {
                  var2.class_(var3, this.final_.class_(var2, var3), 2);
               } else {
                  this.class_(var2, var3);
               }
            } else {
               this.class_(var2, var3);
            }
         }
      }
   }

   private void class_(rYB var1, rfH_2 var2) {
      var1.class_(var2, this.continue_().class_(volatile_, Integer.valueOf(5)), 2);
      var1.byte_(1034, var2, 0);
   }

   @Override
   public boolean class_(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3.break_());
      if (var4.break_() != this.final_ && !var4.class_(xu_3.Sh)) {
         if (!var4.catch_()) {
            return false;
         } else {
            boolean var5 = false;

            for (rpr_3 var7 : rpb_3.HORIZONTAL) {
               xc_3 var8 = var2.byte_(var3.break_(var7));
               if (var8.class_(this.final_)) {
                  if (var5) {
                     return false;
                  }

                  var5 = true;
               } else if (!var8.catch_()) {
                  return false;
               }
            }

            return var5;
         }
      } else {
         return true;
      }
   }

   private void class_(rYB var1, rfH_2 var2, int var3) {
      var1.class_(var2, this.continue_().class_(volatile_, Integer.valueOf(var3)), 2);
      var1.byte_(1033, var2, 0);
   }

   @Override
   public void break_(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.class_(var2, var3)) {
         var2.break_(var3, true);
      }
   }

   private static boolean break_(rRR var0, rfH_2 var1, rpr_3 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         if (var4 != var2 && !var0.finally_(var1.break_(var4))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.byte_(volatile_) < 5;
   }
}
