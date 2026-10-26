package celestial;

import java.util.List;
import java.util.Random;

public class rrrO extends rrrQ {
   private boolean class_;

   public rrrO(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.goto_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public rrrO(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.goto_, var2);
      this.class_ = var2.new_("Mob");
   }

   public static rrrO class_(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -4, -1, 0, 11, 8, 16, var4);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new rrrO(var5, var6, var4) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 10, 7, 15, false, var4, rii_3.throws_);
      this.class_(var1, var4, var5, rrrN.GRATES, 4, 1, 0);
      int var8 = 6;
      this.class_(var1, var5, 1, var8, 1, 1, var8, 14, false, var4, rii_3.throws_);
      this.class_(var1, var5, 9, var8, 1, 9, var8, 14, false, var4, rii_3.throws_);
      this.class_(var1, var5, 2, var8, 1, 8, var8, 2, false, var4, rii_3.throws_);
      this.class_(var1, var5, 2, var8, 14, 8, var8, 14, false, var4, rii_3.throws_);
      this.class_(var1, var5, 1, 1, 1, 2, 1, 4, false, var4, rii_3.throws_);
      this.class_(var1, var5, 8, 1, 1, 9, 1, 4, false, var4, rii_3.throws_);
      this.class_(var1, var5, 1, 1, 1, 1, 1, 3, xu_3.instanceof_.continue_(), xu_3.instanceof_.continue_(), false);
      this.class_(var1, var5, 9, 1, 1, 9, 1, 3, xu_3.instanceof_.continue_(), xu_3.instanceof_.continue_(), false);
      this.class_(var1, var5, 3, 1, 8, 7, 1, 12, false, var4, rii_3.throws_);
      this.class_(var1, var5, 4, 1, 9, 6, 1, 11, xu_3.instanceof_.continue_(), xu_3.instanceof_.continue_(), false);
      xc_3 var9 = xu_3.Bf.continue_().class_(kK_2.volatile_, Boolean.valueOf(true)).class_(kK_2.package_, Boolean.valueOf(true));
      xc_3 var10 = xu_3.Bf.continue_().class_(kK_2.int_, Boolean.valueOf(true)).class_(kK_2.final_, Boolean.valueOf(true));

      for (byte var11 = 3; var11 < 14; var11 += 2) {
         this.class_(var1, var5, 0, 3, var11, 0, 4, var11, var9, var9, false);
         this.class_(var1, var5, 10, 3, var11, 10, 4, var11, var9, var9, false);
      }

      for (byte var21 = 2; var21 < 9; var21 += 2) {
         this.class_(var1, var5, var21, 3, 15, var21, 4, 15, var10, var10, false);
      }

      xc_3 var22 = xu_3.Ba.continue_().class_(zG_2.volatile_, rpr_3.NORTH);
      this.class_(var1, var5, 4, 1, 5, 6, 1, 7, false, var4, rii_3.throws_);
      this.class_(var1, var5, 4, 2, 6, 6, 2, 7, false, var4, rii_3.throws_);
      this.class_(var1, var5, 4, 3, 7, 6, 3, 7, false, var4, rii_3.throws_);

      for (int var12 = 4; var12 <= 6; var12++) {
         this.class_(var1, var22, var12, 1, 4, var5);
         this.class_(var1, var22, var12, 2, 5, var5);
         this.class_(var1, var22, var12, 3, 6, var5);
      }

      xc_3 var23 = xu_3.SO.continue_().class_(dA_2.volatile_, rpr_3.NORTH);
      xc_3 var13 = xu_3.SO.continue_().class_(dA_2.volatile_, rpr_3.SOUTH);
      xc_3 var14 = xu_3.SO.continue_().class_(dA_2.volatile_, rpr_3.EAST);
      xc_3 var15 = xu_3.SO.continue_().class_(dA_2.volatile_, rpr_3.WEST);
      boolean var16 = true;
      boolean[] var17 = new boolean[12];

      for (int var18 = 0; var18 < var17.length; var18++) {
         var17[var18] = var4.nextFloat() > 0.9F;
         var16 &= var17[var18];
      }

      this.class_(var1, var23.class_(dA_2.final_, Boolean.valueOf(var17[0])), 4, 3, 8, var5);
      this.class_(var1, var23.class_(dA_2.final_, Boolean.valueOf(var17[1])), 5, 3, 8, var5);
      this.class_(var1, var23.class_(dA_2.final_, Boolean.valueOf(var17[2])), 6, 3, 8, var5);
      this.class_(var1, var13.class_(dA_2.final_, Boolean.valueOf(var17[3])), 4, 3, 12, var5);
      this.class_(var1, var13.class_(dA_2.final_, Boolean.valueOf(var17[4])), 5, 3, 12, var5);
      this.class_(var1, var13.class_(dA_2.final_, Boolean.valueOf(var17[5])), 6, 3, 12, var5);
      this.class_(var1, var14.class_(dA_2.final_, Boolean.valueOf(var17[6])), 3, 3, 9, var5);
      this.class_(var1, var14.class_(dA_2.final_, Boolean.valueOf(var17[7])), 3, 3, 10, var5);
      this.class_(var1, var14.class_(dA_2.final_, Boolean.valueOf(var17[8])), 3, 3, 11, var5);
      this.class_(var1, var15.class_(dA_2.final_, Boolean.valueOf(var17[9])), 7, 3, 9, var5);
      this.class_(var1, var15.class_(dA_2.final_, Boolean.valueOf(var17[10])), 7, 3, 10, var5);
      this.class_(var1, var15.class_(dA_2.final_, Boolean.valueOf(var17[11])), 7, 3, 11, var5);
      if (var16) {
         xc_3 var24 = xu_3.SM.continue_();
         this.class_(var1, var24, 4, 3, 9, var5);
         this.class_(var1, var24, 5, 3, 9, var5);
         this.class_(var1, var24, 6, 3, 9, var5);
         this.class_(var1, var24, 4, 3, 10, var5);
         this.class_(var1, var24, 5, 3, 10, var5);
         this.class_(var1, var24, 6, 3, 10, var5);
         this.class_(var1, var24, 4, 3, 11, var5);
         this.class_(var1, var24, 5, 3, 11, var5);
         this.class_(var1, var24, 6, 3, 11, var5);
      }

      if (!this.class_) {
         var8 = this.class_(3);
         rfH_2 var25 = new rfH_2(this.class_(5, 6), var8, this.break_(5, 6));
         if (var5.break_(var25)) {
            this.class_ = true;
            var1.class_(var25, xu_3.rD.continue_(), 2);
            ryO_2 var19 = var1.class_(var25);
            if (var19 instanceof rHU) {
               ((rHU)var19).catch_().class_(aI_2.L);
            }
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      if (var1 != null) {
         ((rrrd_1)var1).break_ = this;
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Mob", this.class_);
   }
}
