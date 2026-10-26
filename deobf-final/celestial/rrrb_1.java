package celestial;

import java.util.List;
import java.util.Random;

public class rrrb_1 extends rrrQ {
   private final boolean class_;

   public rrrb_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.public_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
      this.class_ = var3.throws_() > 6;
   }

   public rrrb_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.public_, var2);
      this.class_ = var2.new_("Tall");
   }

   public static rrrb_1 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
      if (!class_(var7) || rrrn_1.class_(var0, var7) != null) {
         var7 = rfi_3.class_(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
         if (!class_(var7) || rrrn_1.class_(var0, var7) != null) {
            return null;
         }
      }

      return new rrrb_1(var6, var1, var7, var5);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      byte var8 = 11;
      if (!this.class_) {
         var8 = 6;
      }

      this.class_(var1, var5, 0, 0, 0, 13, var8 - 1, 14, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 4, 1, 0);
      this.class_(var1, var5, var4, 0.07F, 2, 1, 1, 11, 4, 13, xu_3.U.continue_(), xu_3.U.continue_(), false, false);
      boolean var9 = true;
      byte var10 = 12;

      for (int var11 = 1; var11 <= 13; var11++) {
         if ((var11 - 1) % 4 == 0) {
            this.class_(var1, var5, 1, 1, var11, 1, 4, var11, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
            this.class_(var1, var5, 12, 1, var11, 12, 4, var11, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.EAST), 2, 3, var11, var5);
            this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.WEST), 11, 3, var11, var5);
            if (this.class_) {
               this.class_(var1, var5, 1, 6, var11, 1, 9, var11, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
               this.class_(var1, var5, 12, 6, var11, 12, 9, var11, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
            }
         } else {
            this.class_(var1, var5, 1, 1, var11, 1, 4, var11, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
            this.class_(var1, var5, 12, 1, var11, 12, 4, var11, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
            if (this.class_) {
               this.class_(var1, var5, 1, 6, var11, 1, 9, var11, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
               this.class_(var1, var5, 12, 6, var11, 12, 9, var11, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
            }
         }
      }

      for (byte var20 = 3; var20 < 12; var20 += 2) {
         this.class_(var1, var5, 3, 1, var20, 4, 3, var20, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
         this.class_(var1, var5, 6, 1, var20, 7, 3, var20, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
         this.class_(var1, var5, 9, 1, var20, 10, 3, var20, xu_3.rj.continue_(), xu_3.rj.continue_(), false);
      }

      if (this.class_) {
         this.class_(var1, var5, 1, 5, 1, 3, 5, 13, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
         this.class_(var1, var5, 10, 5, 1, 12, 5, 13, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
         this.class_(var1, var5, 4, 5, 1, 9, 5, 2, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
         this.class_(var1, var5, 4, 5, 12, 9, 5, 13, xu_3.final_.continue_(), xu_3.final_.continue_(), false);
         this.class_(var1, xu_3.final_.continue_(), 9, 5, 11, var5);
         this.class_(var1, xu_3.final_.continue_(), 8, 5, 11, var5);
         this.class_(var1, xu_3.final_.continue_(), 9, 5, 10, var5);
         xc_3 var21 = xu_3.PV.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true));
         xc_3 var12 = xu_3.PV.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
         this.class_(var1, var5, 3, 6, 3, 3, 6, 11, var12, var12, false);
         this.class_(var1, var5, 10, 6, 3, 10, 6, 9, var12, var12, false);
         this.class_(var1, var5, 4, 6, 2, 9, 6, 2, var21, var21, false);
         this.class_(var1, var5, 4, 6, 12, 7, 6, 12, var21, var21, false);
         this.class_(var1, xu_3.PV.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true)), 3, 6, 2, var5);
         this.class_(var1, xu_3.PV.continue_().class_(dp_3.package_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true)), 3, 6, 12, var5);
         this.class_(var1, xu_3.PV.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.int_, Boolean.valueOf(true)), 10, 6, 2, var5);

         for (int var13 = 0; var13 <= 2; var13++) {
            this.class_(
               var1, xu_3.PV.continue_().class_(dp_3.package_, Boolean.valueOf(true)).class_(dp_3.int_, Boolean.valueOf(true)), 8 + var13, 6, 12 - var13, var5
            );
            if (var13 != 2) {
               this.class_(
                  var1,
                  xu_3.PV.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true)),
                  8 + var13,
                  6,
                  11 - var13,
                  var5
               );
            }
         }

         xc_3 var22 = xu_3.PJ.continue_().class_(kc_3.volatile_, rpr_3.SOUTH);
         this.class_(var1, var22, 10, 1, 13, var5);
         this.class_(var1, var22, 10, 2, 13, var5);
         this.class_(var1, var22, 10, 3, 13, var5);
         this.class_(var1, var22, 10, 4, 13, var5);
         this.class_(var1, var22, 10, 5, 13, var5);
         this.class_(var1, var22, 10, 6, 13, var5);
         this.class_(var1, var22, 10, 7, 13, var5);
         byte var14 = 7;
         byte var15 = 7;
         xc_3 var16 = xu_3.PV.continue_().class_(dp_3.final_, Boolean.valueOf(true));
         this.class_(var1, var16, 6, 9, 7, var5);
         xc_3 var17 = xu_3.PV.continue_().class_(dp_3.int_, Boolean.valueOf(true));
         this.class_(var1, var17, 7, 9, 7, var5);
         this.class_(var1, var16, 6, 8, 7, var5);
         this.class_(var1, var17, 7, 8, 7, var5);
         xc_3 var18 = var12.class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true));
         this.class_(var1, var18, 6, 7, 7, var5);
         this.class_(var1, var18, 7, 7, 7, var5);
         this.class_(var1, var16, 5, 7, 7, var5);
         this.class_(var1, var17, 8, 7, 7, var5);
         this.class_(var1, var16.class_(dp_3.volatile_, Boolean.valueOf(true)), 6, 7, 6, var5);
         this.class_(var1, var16.class_(dp_3.package_, Boolean.valueOf(true)), 6, 7, 8, var5);
         this.class_(var1, var17.class_(dp_3.volatile_, Boolean.valueOf(true)), 7, 7, 6, var5);
         this.class_(var1, var17.class_(dp_3.package_, Boolean.valueOf(true)), 7, 7, 8, var5);
         xc_3 var19 = xu_3.rR.continue_();
         this.class_(var1, var19, 5, 8, 7, var5);
         this.class_(var1, var19, 8, 8, 7, var5);
         this.class_(var1, var19, 6, 8, 6, var5);
         this.class_(var1, var19, 6, 8, 8, var5);
         this.class_(var1, var19, 7, 8, 6, var5);
         this.class_(var1, var19, 7, 8, 8, var5);
      }

      this.class_(var1, var5, var4, 3, 3, 5, rzl_3.return_);
      if (this.class_) {
         this.class_(var1, volatile_, 12, 9, 1, var5);
         this.class_(var1, var5, var4, 12, 8, 1, rzl_3.return_);
      }

      return true;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Tall", this.class_);
   }
}
