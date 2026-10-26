package celestial;

import java.util.List;
import java.util.Random;

public class rrrb_1 extends rrrQ {
   private final boolean id_class;

   public rrrb_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.id_public, var1);
      this.id_class(var4);
      this.id_protected = this.id_class(var2);
      this.id_final = var3;
      this.id_class = var3.id_throws() > 6;
   }

   public rrrb_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_public, var2);
      this.id_class = var2.id_new("Tall");
   }

   public static rrrb_1 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.id_class(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!id_class(var7) || rrrn_1.id_class(var0, var7) != null) {
         var7 = rfi_3.id_class(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!id_class(var7) || rrrn_1.id_class(var0, var7) != null) {
            return null;
         }
      }

      return new rrrb_1(var6, var1, var7, var5);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      byte var8 = 11;
      if (!this.id_class) {
         var8 = 6;
      }

      this.id_class(var1, var5, 0, 0, 0, 13, var8 - 1, 14, true, var4, rii_3.id_throws);
      this.id_class(var1, var4, var5, this.id_protected, 4, 1, 0);
      this.id_class(var1, var5, var4, 0.07F, 2, 1, 1, 11, 4, 13, xu_3.U.id_continue(), xu_3.U.id_continue(), false, false);
      boolean var9 = true;
      byte var10 = 12;

      for (int var11 = 1; var11 <= 13; var11++) {
         if ((var11 - 1) % 4 == 0) {
            this.id_class(var1, var5, 1, 1, var11, 1, 4, var11, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(var1, var5, 12, 1, var11, 12, 4, var11, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST), 2, 3, var11, var5);
            this.id_class(var1, xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST), 11, 3, var11, var5);
            if (this.id_class) {
               this.id_class(var1, var5, 1, 6, var11, 1, 9, var11, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
               this.id_class(var1, var5, 12, 6, var11, 12, 9, var11, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            }
         } else {
            this.id_class(var1, var5, 1, 1, var11, 1, 4, var11, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            this.id_class(var1, var5, 12, 1, var11, 12, 4, var11, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            if (this.id_class) {
               this.id_class(var1, var5, 1, 6, var11, 1, 9, var11, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
               this.id_class(var1, var5, 12, 6, var11, 12, 9, var11, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            }
         }
      }

      for (byte var20 = 3; var20 < 12; var20 += 2) {
         this.id_class(var1, var5, 3, 1, var20, 4, 3, var20, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
         this.id_class(var1, var5, 6, 1, var20, 7, 3, var20, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
         this.id_class(var1, var5, 9, 1, var20, 10, 3, var20, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
      }

      if (this.id_class) {
         this.id_class(var1, var5, 1, 5, 1, 3, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
         this.id_class(var1, var5, 10, 5, 1, 12, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
         this.id_class(var1, var5, 4, 5, 1, 9, 5, 2, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
         this.id_class(var1, var5, 4, 5, 12, 9, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
         this.id_class(var1, xu_3.id_final.id_continue(), 9, 5, 11, var5);
         this.id_class(var1, xu_3.id_final.id_continue(), 8, 5, 11, var5);
         this.id_class(var1, xu_3.id_final.id_continue(), 9, 5, 10, var5);
         xc_3 var21 = xu_3.PV.id_continue().id_class(dp_3.id_int, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true));
         xc_3 var12 = xu_3.PV.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_package, Boolean.valueOf(true));
         this.id_class(var1, var5, 3, 6, 3, 3, 6, 11, var12, var12, false);
         this.id_class(var1, var5, 10, 6, 3, 10, 6, 9, var12, var12, false);
         this.id_class(var1, var5, 4, 6, 2, 9, 6, 2, var21, var21, false);
         this.id_class(var1, var5, 4, 6, 12, 7, 6, 12, var21, var21, false);
         this.id_class(
            var1, xu_3.PV.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true)), 3, 6, 2, var5
         );
         this.id_class(
            var1, xu_3.PV.id_continue().id_class(dp_3.id_package, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true)), 3, 6, 12, var5
         );
         this.id_class(
            var1, xu_3.PV.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_int, Boolean.valueOf(true)), 10, 6, 2, var5
         );

         for (int var13 = 0; var13 <= 2; var13++) {
            this.id_class(
               var1,
               xu_3.PV.id_continue().id_class(dp_3.id_package, Boolean.valueOf(true)).id_class(dp_3.id_int, Boolean.valueOf(true)),
               8 + var13,
               6,
               12 - var13,
               var5
            );
            if (var13 != 2) {
               this.id_class(
                  var1,
                  xu_3.PV.id_continue().id_class(dp_3.id_volatile, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true)),
                  8 + var13,
                  6,
                  11 - var13,
                  var5
               );
            }
         }

         xc_3 var22 = xu_3.PJ.id_continue().id_class(kc_3.id_volatile, rpr_3.SOUTH);
         this.id_class(var1, var22, 10, 1, 13, var5);
         this.id_class(var1, var22, 10, 2, 13, var5);
         this.id_class(var1, var22, 10, 3, 13, var5);
         this.id_class(var1, var22, 10, 4, 13, var5);
         this.id_class(var1, var22, 10, 5, 13, var5);
         this.id_class(var1, var22, 10, 6, 13, var5);
         this.id_class(var1, var22, 10, 7, 13, var5);
         byte var14 = 7;
         byte var15 = 7;
         xc_3 var16 = xu_3.PV.id_continue().id_class(dp_3.id_final, Boolean.valueOf(true));
         this.id_class(var1, var16, 6, 9, 7, var5);
         xc_3 var17 = xu_3.PV.id_continue().id_class(dp_3.id_int, Boolean.valueOf(true));
         this.id_class(var1, var17, 7, 9, 7, var5);
         this.id_class(var1, var16, 6, 8, 7, var5);
         this.id_class(var1, var17, 7, 8, 7, var5);
         xc_3 var18 = var12.id_class(dp_3.id_int, Boolean.valueOf(true)).id_class(dp_3.id_final, Boolean.valueOf(true));
         this.id_class(var1, var18, 6, 7, 7, var5);
         this.id_class(var1, var18, 7, 7, 7, var5);
         this.id_class(var1, var16, 5, 7, 7, var5);
         this.id_class(var1, var17, 8, 7, 7, var5);
         this.id_class(var1, var16.id_class(dp_3.id_volatile, Boolean.valueOf(true)), 6, 7, 6, var5);
         this.id_class(var1, var16.id_class(dp_3.id_package, Boolean.valueOf(true)), 6, 7, 8, var5);
         this.id_class(var1, var17.id_class(dp_3.id_volatile, Boolean.valueOf(true)), 7, 7, 6, var5);
         this.id_class(var1, var17.id_class(dp_3.id_package, Boolean.valueOf(true)), 7, 7, 8, var5);
         xc_3 var19 = xu_3.rR.id_continue();
         this.id_class(var1, var19, 5, 8, 7, var5);
         this.id_class(var1, var19, 8, 8, 7, var5);
         this.id_class(var1, var19, 6, 8, 6, var5);
         this.id_class(var1, var19, 6, 8, 8, var5);
         this.id_class(var1, var19, 7, 8, 6, var5);
         this.id_class(var1, var19, 7, 8, 8, var5);
      }

      this.id_class(var1, var5, var4, 3, 3, 5, rzl_3.id_return);
      if (this.id_class) {
         this.id_class(var1, id_volatile, 12, 9, 1, var5);
         this.id_class(var1, var5, var4, 12, 8, 1, rzl_3.id_return);
      }

      return true;
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Tall", this.id_class);
   }
}
