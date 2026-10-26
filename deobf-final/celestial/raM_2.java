package celestial;

import java.util.List;
import java.util.Random;

public class raM_2 extends raz_3 {
   public raM_2(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.private_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public raM_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.private_, var2);
   }

   public static raM_2 class_(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -1, -7, 0, 5, 14, 10, var4);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new raM_2(var5, var6, var4) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      xc_3 var8 = xu_3.SS.continue_().class_(zG_2.volatile_, rpr_3.SOUTH);
      xc_3 var9 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));

      for (int var10 = 0; var10 <= 9; var10++) {
         int var11 = Math.max(1, 7 - var10);
         int var12 = Math.min(Math.max(var11 + 5, 14 - var10), 13);
         int var13 = var10;
         this.class_(var1, var5, 0, 0, var10, 4, var11, var10, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         this.class_(var1, var5, 1, var11 + 1, var10, 3, var12 - 1, var10, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
         if (var10 <= 6) {
            this.class_(var1, var8, 1, var11 + 1, var10, var5);
            this.class_(var1, var8, 2, var11 + 1, var10, var5);
            this.class_(var1, var8, 3, var11 + 1, var10, var5);
         }

         this.class_(var1, var5, 0, var12, var10, 4, var12, var10, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         this.class_(var1, var5, 0, var11 + 1, var10, 0, var12 - 1, var10, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         this.class_(var1, var5, 4, var11 + 1, var10, 4, var12 - 1, var10, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
         if ((var10 & 1) == 0) {
            this.class_(var1, var5, 0, var11 + 2, var10, 0, var11 + 3, var10, var9, var9, false);
            this.class_(var1, var5, 4, var11 + 2, var10, 4, var11 + 3, var10, var9, var9, false);
         }

         for (int var14 = 0; var14 <= 4; var14++) {
            this.break_(var1, xu_3.SP.continue_(), var14, -1, var13, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rac_3)var1, var2, var3, 1, 0, true);
   }
}
