package celestial;

import java.util.List;
import java.util.Random;

public class rau_3 extends raz_3 {
   public rau_3(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.catch_, var1);
      this.class_(var4);
      this.final_ = var3;
   }

   public rau_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.catch_, var2);
   }

   public static rau_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rau_3(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 3, 0, 4, 4, 18, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 5, 0, 3, 7, 18, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 0, 5, 0, 0, 5, 18, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 4, 5, 0, 4, 5, 18, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 4, 2, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 13, 4, 2, 18, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 0, 0, 4, 1, 3, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 0, 15, 4, 1, 18, xu_3.SP.continue_(), xu_3.SP.continue_(), false);

      for (int var8 = 0; var8 <= 4; var8++) {
         for (int var9 = 0; var9 <= 2; var9++) {
            this.break_(var1, xu_3.SP.continue_(), var8, -1, var9, var5);
            this.break_(var1, xu_3.SP.continue_(), var8, -1, 18 - var9, var5);
         }
      }

      xc_3 var11 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
      xc_3 var12 = var11.class_(dp_3.final_, Boolean.valueOf(true));
      xc_3 var10 = var11.class_(dp_3.int_, Boolean.valueOf(true));
      this.class_(var1, var5, 0, 1, 1, 0, 4, 1, var12, var12, false);
      this.class_(var1, var5, 0, 3, 4, 0, 4, 4, var12, var12, false);
      this.class_(var1, var5, 0, 3, 14, 0, 4, 14, var12, var12, false);
      this.class_(var1, var5, 0, 1, 17, 0, 4, 17, var12, var12, false);
      this.class_(var1, var5, 4, 1, 1, 4, 4, 1, var10, var10, false);
      this.class_(var1, var5, 4, 3, 4, 4, 4, 4, var10, var10, false);
      this.class_(var1, var5, 4, 3, 14, 4, 4, 14, var10, var10, false);
      this.class_(var1, var5, 4, 1, 17, 4, 4, 17, var10, var10, false);
      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rac_3)var1, var2, var3, 1, 3, false);
   }
}
