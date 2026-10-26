package celestial;

import java.util.List;
import java.util.Random;

public class ram_3 extends raz_3 {
   private boolean class_;

   public ram_3(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.int_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public ram_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.int_, var2);
      this.class_ = var2.new_("Mob");
   }

   public static ram_3 class_(List<rrrn_1> var0, int var1, int var2, int var3, int var4, rpr_3 var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -2, 0, 0, 7, 8, 9, var5);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new ram_3(var4, var6, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 2, 0, 6, 7, 7, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 1, 0, 0, 5, 1, 7, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 2, 1, 5, 2, 7, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 3, 2, 5, 3, 7, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 4, 3, 5, 4, 7, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 2, 0, 1, 4, 2, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 5, 2, 0, 5, 4, 2, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 5, 2, 1, 5, 3, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 5, 5, 2, 5, 5, 3, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 5, 3, 0, 5, 8, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 6, 5, 3, 6, 5, 8, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 5, 8, 5, 5, 8, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      xc_3 var8 = xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true));
      xc_3 var9 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)), 1, 6, 3, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)), 5, 6, 3, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)).class_(dp_3.volatile_, Boolean.valueOf(true)), 0, 6, 3, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.volatile_, Boolean.valueOf(true)), 6, 6, 3, var5);
      this.class_(var1, var5, 0, 6, 4, 0, 6, 7, var9, var9, false);
      this.class_(var1, var5, 6, 6, 4, 6, 6, 7, var9, var9, false);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true)), 0, 6, 8, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true)), 6, 6, 8, var5);
      this.class_(var1, var5, 1, 6, 8, 5, 6, 8, var8, var8, false);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)), 1, 7, 8, var5);
      this.class_(var1, var5, 2, 7, 8, 4, 7, 8, var8, var8, false);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)), 5, 7, 8, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)), 2, 8, 8, var5);
      this.class_(var1, var8, 3, 8, 8, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)), 4, 8, 8, var5);
      if (!this.class_) {
         rfH_2 var10 = new rfH_2(this.class_(3, 5), this.class_(5), this.break_(3, 5));
         if (var5.break_(var10)) {
            this.class_ = true;
            var1.class_(var10, xu_3.rD.continue_(), 2);
            ryO_2 var11 = var1.class_(var10);
            if (var11 instanceof rHU) {
               ((rHU)var11).catch_().class_(aI_2.case_);
            }
         }
      }

      for (int var12 = 0; var12 <= 6; var12++) {
         for (int var13 = 0; var13 <= 6; var13++) {
            this.break_(var1, xu_3.SP.continue_(), var12, -1, var13, var5);
         }
      }

      return true;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Mob", this.class_);
   }
}
