package celestial;

import java.util.List;
import java.util.Random;

public class rrrS extends rrrQ {
   private boolean class_;

   public rrrS(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.this_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
   }

   public rrrS(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.this_, var2);
      this.class_ = var2.new_("Chest");
   }

   public static rrrS class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrS(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 1, 1, 0);
      this.class_(var1, var4, var5, rrrN.OPENING, 1, 1, 6);
      this.class_(var1, var5, 3, 1, 2, 3, 1, 4, xu_3.BL.continue_(), xu_3.BL.continue_(), false);
      this.class_(var1, xu_3.bS.continue_(), 3, 1, 1, var5);
      this.class_(var1, xu_3.bS.continue_(), 3, 1, 5, var5);
      this.class_(var1, xu_3.bS.continue_(), 3, 2, 2, var5);
      this.class_(var1, xu_3.bS.continue_(), 3, 2, 4, var5);

      for (int var8 = 2; var8 <= 4; var8++) {
         this.class_(var1, xu_3.bS.continue_(), 2, 1, var8, var5);
      }

      if (!this.class_ && var5.break_(new rfH_2(this.class_(3, 3), this.class_(2), this.break_(3, 3)))) {
         this.class_ = true;
         this.class_(var1, var5, var4, 3, 2, 3, rzl_3.goto_);
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rrrd_1)var1, var2, var3, 1, 1);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Chest", this.class_);
   }
}
