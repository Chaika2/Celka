package celestial;

import java.util.List;
import java.util.Random;

public class rrrX extends rrrc_1 {
   public rrrX(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.try_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
   }

   public rrrX(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.try_, var2);
   }

   public static rrrX class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, 5, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrX(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 4, 4, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 1, 1, 0);
      rpr_3 var8 = this.implements_();
      if (var8 != rpr_3.NORTH && var8 != rpr_3.EAST) {
         this.class_(var1, var5, 0, 1, 1, 0, 3, 3, volatile_, volatile_, false);
      } else {
         this.class_(var1, var5, 4, 1, 1, 4, 3, 3, volatile_, volatile_, false);
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      rpr_3 var4 = this.implements_();
      if (var4 != rpr_3.NORTH && var4 != rpr_3.EAST) {
         this.break_((rrrd_1)var1, var2, var3, 1, 1);
      } else {
         this.byte_((rrrd_1)var1, var2, var3, 1, 1);
      }
   }
}
