package celestial;

import java.util.List;
import java.util.Random;

public class raJ_2 extends raz_3 {
   public raJ_2(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.extends_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public raJ_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.extends_, var2);
   }

   public static raJ_2 class_(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new raJ_2(var5, var6, var4) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 1, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 4, 5, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 0, 5, 0, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 4, 2, 0, 4, 5, 0, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 4, 0, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 4, 2, 4, 4, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 6, 0, 4, 6, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);

      for (int var8 = 0; var8 <= 4; var8++) {
         for (int var9 = 0; var9 <= 4; var9++) {
            this.break_(var1, xu_3.SP.continue_(), var8, -1, var9, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rac_3)var1, var2, var3, 1, 0, true);
      this.break_((rac_3)var1, var2, var3, 0, 1, true);
      this.byte_((rac_3)var1, var2, var3, 0, 1, true);
   }
}
