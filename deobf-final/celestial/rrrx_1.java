package celestial;

import java.util.List;
import java.util.Random;

public class rrrx_1 extends rrrQ {
   private final boolean class_;

   public rrrx_1(rrPt_1 var1, rcd_3 var2) {
      this(raF_2.throw_, var2);
   }

   public rrrx_1(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.class_ = var2.new_("Source");
   }

   public rrrx_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.throw_, var1);
      this.class_ = false;
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
   }

   public rrrx_1(raF_2 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.class_ = true;
      this.class_(rpb_3.HORIZONTAL.class_(var3));
      this.protected_ = rrrN.OPENING;
      if (this.implements_().final_() == rpB_2.Z) {
         this.final_ = new rfi_3(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      } else {
         this.final_ = new rfi_3(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      }
   }

   public static rrrx_1 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrx_1(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 1, 7, 0);
      this.class_(var1, var4, var5, rrrN.OPENING, 1, 1, 4);
      this.class_(var1, xu_3.BL.continue_(), 2, 6, 1, var5);
      this.class_(var1, xu_3.BL.continue_(), 1, 5, 1, var5);
      this.class_(var1, xu_3.Ge.continue_(), 1, 6, 1, var5);
      this.class_(var1, xu_3.BL.continue_(), 1, 5, 2, var5);
      this.class_(var1, xu_3.BL.continue_(), 1, 4, 3, var5);
      this.class_(var1, xu_3.Ge.continue_(), 1, 5, 3, var5);
      this.class_(var1, xu_3.BL.continue_(), 2, 4, 3, var5);
      this.class_(var1, xu_3.BL.continue_(), 3, 3, 3, var5);
      this.class_(var1, xu_3.Ge.continue_(), 3, 4, 3, var5);
      this.class_(var1, xu_3.BL.continue_(), 3, 3, 2, var5);
      this.class_(var1, xu_3.BL.continue_(), 3, 2, 1, var5);
      this.class_(var1, xu_3.Ge.continue_(), 3, 3, 1, var5);
      this.class_(var1, xu_3.BL.continue_(), 2, 2, 1, var5);
      this.class_(var1, xu_3.BL.continue_(), 1, 1, 1, var5);
      this.class_(var1, xu_3.Ge.continue_(), 1, 2, 1, var5);
      this.class_(var1, xu_3.BL.continue_(), 1, 1, 2, var5);
      this.class_(var1, xu_3.Ge.continue_(), 1, 1, 3, var5);
      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      if (this.class_) {
         rii_3.byte_ = rrrE.class;
      }

      this.class_((rrrd_1)var1, var2, var3, 1, 1);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Source", this.class_);
   }
}
