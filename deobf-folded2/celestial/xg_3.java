package celestial;

import java.util.Random;

public class xg_3 extends xd_3 {
   public static final rCm_1 id_volatile = rCT.x;
   private final xR_2 id_final;

   protected xg_3(xR_2 var1, Jq_1 var2) {
      super(var2);
      this.id_final = var1;
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 != rpr_3.UP && !var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   public static void id_class(rRg_1 var0, rfH_2 var1, Random var2, int var3) {
      var0.id_class(var1, ((xR_2)xu_3.bC).id_class(var0, var1), 2);
      id_class(var0, var1, var2, var1, var3, 0);
   }

   private static void id_class(rRg_1 var0, rfH_2 var1, Random var2, rfH_2 var3, int var4, int var5) {
      xR_2 var6 = (xR_2)xu_3.bC;
      int var7 = var2.nextInt(4) + 1;
      if (var5 == 0) {
         var7++;
      }

      for (int var8 = 0; var8 < var7; var8++) {
         rfH_2 var9 = var1.id_break(var8 + 1);
         if (!id_break(var0, var9, (rpr_3)null)) {
            return;
         }

         var0.id_class(var9, var6.id_class(var0, var9), 2);
         var0.id_class(var9.id_break(), var6.id_class(var0, var9.id_break()), 2);
      }

      boolean var13 = false;
      if (var5 < 4) {
         int var14 = var2.nextInt(4);
         if (var5 == 0) {
            var14++;
         }

         for (int var10 = 0; var10 < var14; var10++) {
            rpr_3 var11 = rpb_3.HORIZONTAL.id_class(var2);
            rfH_2 var12 = var1.id_break(var7).id_break(var11);
            if (Math.abs(var12.b_() - var3.b_()) < var4
               && Math.abs(var12.d_() - var3.d_()) < var4
               && var0.id_finally(var12)
               && var0.id_finally(var12.id_break())
               && id_break(var0, var12, var11.id_case())) {
               var13 = true;
               var0.id_class(var12, var6.id_class(var0, var12), 2);
               var0.id_class(var12.id_break(var11.id_case()), var6.id_class(var0, var12.id_break(var11.id_case())), 2);
               id_class(var0, var12, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!var13) {
         var0.id_class(var1.id_break(var7), xu_3.bl.id_continue().id_class(id_volatile, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      if (var4.BC().id_class(rlE_2.id_case)) {
         rfH_2 var5 = var3.id_class();
         var1.id_class(var5, true, var4);
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      rfH_2 var5 = var3.id_final();
      if (var2.id_finally(var5) && var5.c_() < 256) {
         int var6 = var1.id_byte(id_volatile);
         if (var6 < 5) {
            boolean var7 = false;
            boolean var8 = false;
            xc_3 var9 = var2.id_byte(var3.id_break());
            xd_3 var10 = var9.id_break();
            if (var10 == xu_3.Sh) {
               var7 = true;
            } else if (var10 != this.id_final) {
               if (var9.id_catch()) {
                  var7 = true;
               }
            } else {
               int var11 = 1;

               for (int var12 = 0; var12 < 4; var12++) {
                  xd_3 var13 = var2.id_byte(var3.id_catch(var11 + 1)).id_break();
                  if (var13 != this.id_final) {
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

            if (var7 && id_break(var2, var5, (rpr_3)null) && var2.id_finally(var3.id_break(2))) {
               var2.id_class(var3, this.id_final.id_class(var2, var3), 2);
               this.id_class(var2, var5, var6);
            } else if (var6 < 4) {
               int var16 = var4.nextInt(4);
               if (var8) {
                  var16++;
               }

               boolean var17 = false;

               for (int var18 = 0; var18 < var16; var18++) {
                  rpr_3 var14 = rpb_3.HORIZONTAL.id_class(var4);
                  rfH_2 var15 = var3.id_break(var14);
                  if (var2.id_finally(var15) && var2.id_finally(var15.id_break()) && id_break(var2, var15, var14.id_case())) {
                     this.id_class(var2, var15, var6 + 1);
                     var17 = true;
                  }
               }

               if (var17) {
                  var2.id_class(var3, this.id_final.id_class(var2, var3), 2);
               } else {
                  this.id_class(var2, var3);
               }
            } else {
               this.id_class(var2, var3);
            }
         }
      }
   }

   private void id_class(rYB var1, rfH_2 var2) {
      var1.id_class(var2, this.id_continue().id_class(id_volatile, Integer.valueOf(5)), 2);
      var1.id_byte(1034, var2, 0);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3.id_break());
      if (var4.id_break() != this.id_final && !var4.id_class(xu_3.Sh)) {
         if (!var4.id_catch()) {
            return false;
         } else {
            boolean var5 = false;

            for (rpr_3 var7 : rpb_3.HORIZONTAL) {
               xc_3 var8 = var2.id_byte(var3.id_break(var7));
               if (var8.id_class(this.id_final)) {
                  if (var5) {
                     return false;
                  }

                  var5 = true;
               } else if (!var8.id_catch()) {
                  return false;
               }
            }

            return var5;
         }
      } else {
         return true;
      }
   }

   private void id_class(rYB var1, rfH_2 var2, int var3) {
      var1.id_class(var2, this.id_continue().id_class(id_volatile, Integer.valueOf(var3)), 2);
      var1.id_byte(1033, var2, 0);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }

   private static boolean id_break(rRR var0, rfH_2 var1, rpr_3 var2) {
      for (rpr_3 var4 : rpb_3.HORIZONTAL) {
         if (var4 != var2 && !var0.id_finally(var1.id_break(var4))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile) < 5;
   }
}
