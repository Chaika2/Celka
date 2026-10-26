package celestial;

import java.util.List;
import java.util.Random;

public class rrrk_1 extends rrrQ {
   public rrrk_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.abstract_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
   }

   public rrrk_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.abstract_, var2);
   }

   public static rrrk_1 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrk_1(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 10, 7, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 1, 7, 0);
      this.class_(var1, var4, var5, rrrN.OPENING, 1, 1, 7);
      xc_3 var8 = xu_3.Pd.continue_().class_(zG_2.volatile_, rpr_3.SOUTH);

      for (int var9 = 0; var9 < 6; var9++) {
         this.class_(var1, var8, 1, 6 - var9, 1 + var9, var5);
         this.class_(var1, var8, 2, 6 - var9, 1 + var9, var5);
         this.class_(var1, var8, 3, 6 - var9, 1 + var9, var5);
         if (var9 < 5) {
            this.class_(var1, xu_3.BL.continue_(), 1, 5 - var9, 1 + var9, var5);
            this.class_(var1, xu_3.BL.continue_(), 2, 5 - var9, 1 + var9, var5);
            this.class_(var1, xu_3.BL.continue_(), 3, 5 - var9, 1 + var9, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rrrd_1)var1, var2, var3, 1, 1);
   }
}
