package celestial;

import java.util.List;
import java.util.Random;

public class raO_2 extends raz_3 {
   public raO_2(int var1, rfi_3 var2, rpr_3 var3) {
      super(raF_2.implements_, var1);
      this.class_(var3);
      this.final_ = var2;
   }

   public raO_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.implements_, var2);
   }

   public static raO_2 class_(List<rrrn_1> var0, int var1, int var2, int var3, rpr_3 var4, int var5) {
      rfi_3 var6 = rfi_3.class_(var1, var2, var3, -3, 0, 0, 9, 7, 9, var4);
      return class_(var6) && rrrn_1.class_(var0, var6) == null ? new raO_2(var5, var6, var4) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      xc_3 var8 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
      xc_3 var9 = xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true));
      this.class_(var1, var5, 0, 0, 0, 8, 1, 8, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 8, 5, 8, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 0, 6, 0, 8, 6, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 2, 5, 0, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 6, 2, 0, 8, 5, 0, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 3, 0, 1, 4, 0, var9, var9, false);
      this.class_(var1, var5, 7, 3, 0, 7, 4, 0, var9, var9, false);
      this.class_(var1, var5, 0, 2, 4, 8, 2, 8, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 1, 4, 2, 2, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 6, 1, 4, 7, 2, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 1, 3, 8, 7, 3, 8, var9, var9, false);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.final_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true)), 0, 3, 8, var5);
      this.class_(var1, xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true)), 8, 3, 8, var5);
      this.class_(var1, var5, 0, 3, 6, 0, 3, 7, var8, var8, false);
      this.class_(var1, var5, 8, 3, 6, 8, 3, 7, var8, var8, false);
      this.class_(var1, var5, 0, 3, 4, 0, 5, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 8, 3, 4, 8, 5, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 3, 5, 2, 5, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 6, 3, 5, 7, 5, 5, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 4, 5, 1, 5, 5, var9, var9, false);
      this.class_(var1, var5, 7, 4, 5, 7, 5, 5, var9, var9, false);

      for (int var10 = 0; var10 <= 5; var10++) {
         for (int var11 = 0; var11 <= 8; var11++) {
            this.break_(var1, xu_3.SP.continue_(), var11, -1, var10, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      byte var4 = 1;
      rpr_3 var5 = this.implements_();
      if (var5 == rpr_3.WEST || var5 == rpr_3.NORTH) {
         var4 = 5;
      }

      this.break_((rac_3)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
      this.byte_((rac_3)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
   }
}
