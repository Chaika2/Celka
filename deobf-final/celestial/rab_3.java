package celestial;

import java.util.List;
import java.util.Random;

public class rab_3 extends raz_3 {
   private boolean class_;

   public rab_3(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.final_, var1);
      this.class_(var4);
      this.final_ = var3;
      this.class_ = var2.nextInt(3) == 0;
   }

   public rab_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.final_, var2);
      this.class_ = var2.new_("Chest");
   }

   public static rab_3 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rab_3(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 1, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 2, 0, 4, 5, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      xc_3 var8 = xu_3.SB.continue_().class_(dp_3.int_, Boolean.valueOf(true)).class_(dp_3.final_, Boolean.valueOf(true));
      xc_3 var9 = xu_3.SB.continue_().class_(dp_3.volatile_, Boolean.valueOf(true)).class_(dp_3.package_, Boolean.valueOf(true));
      this.class_(var1, var5, 0, 2, 0, 0, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 0, 3, 1, 0, 4, 1, var9, var9, false);
      this.class_(var1, var5, 0, 3, 3, 0, 4, 3, var9, var9, false);
      this.class_(var1, var5, 4, 2, 0, 4, 5, 0, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 2, 4, 4, 5, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);
      this.class_(var1, var5, 1, 3, 4, 1, 4, 4, var8, var8, false);
      this.class_(var1, var5, 3, 3, 4, 3, 4, 4, var8, var8, false);
      if (this.class_ && var5.break_(new rfH_2(this.class_(1, 3), this.class_(2), this.break_(1, 3)))) {
         this.class_ = false;
         this.class_(var1, var5, var4, 1, 2, 3, rzl_3.synchronized_);
      }

      this.class_(var1, var5, 0, 6, 0, 4, 6, 4, xu_3.SP.continue_(), xu_3.SP.continue_(), false);

      for (int var10 = 0; var10 <= 4; var10++) {
         for (int var11 = 0; var11 <= 4; var11++) {
            this.break_(var1, xu_3.SP.continue_(), var10, -1, var11, var5);
         }
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.byte_((rac_3)var1, var2, var3, 0, 1, true);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Chest", this.class_);
   }
}
