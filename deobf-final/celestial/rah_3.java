package celestial;

import java.util.List;
import java.util.Random;

public class rah_3 extends raz_3 {
   public rah_3(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.volatile_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public rah_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.volatile_, var2);
   }

   public static rah_3 class_(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new rah_3(var5, var6, var4) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 1, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 4, 5, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      xc_3 var8 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
      this.class_(var1, var5, 0, 2, 0, 0, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 4, 2, 0, 4, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 3, 1, 0, 4, 1, var8, var8, false);
      this.class_(var1, var5, 0, 3, 3, 0, 4, 3, var8, var8, false);
      this.class_(var1, var5, 4, 3, 1, 4, 4, 1, var8, var8, false);
      this.class_(var1, var5, 4, 3, 3, 4, 4, 3, var8, var8, false);
      this.class_(var1, var5, 0, 6, 0, 4, 6, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);

      for (int var9 = 0; var9 <= 4; var9++) {
         for (int var10 = 0; var10 <= 4; var10++) {
            this.break_(var1, xu_3.SP.continue_(), var9, -1, var10, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rac_3)var1, var2, var3, 1, 0, true);
   }
}
