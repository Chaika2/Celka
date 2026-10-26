package celestial;

import java.util.List;
import java.util.Random;

public class rrrz_1 extends rrrQ {
   private final boolean class_;
   private final boolean break_;

   public rrrz_1(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.char_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
      this.class_ = var2.nextInt(2) == 0;
      this.break_ = var2.nextInt(2) == 0;
   }

   public rrrz_1(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.char_, var2);
      this.class_ = var2.new_("Left");
      this.break_ = var2.new_("Right");
   }

   public static rrrz_1 class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrz_1(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 1, 1, 0);
      this.class_(var1, var4, var5, rrrN.OPENING, 1, 1, 6);
      xc_3 var8 = xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.EAST);
      xc_3 var9 = xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.WEST);
      this.class_(var1, var5, var4, 0.1F, 1, 2, 1, var8);
      this.class_(var1, var5, var4, 0.1F, 3, 2, 1, var9);
      this.class_(var1, var5, var4, 0.1F, 1, 2, 5, var8);
      this.class_(var1, var5, var4, 0.1F, 3, 2, 5, var9);
      if (this.class_) {
         this.class_(var1, var5, 0, 1, 2, 0, 3, 4, volatile_, volatile_, false);
      }

      if (this.break_) {
         this.class_(var1, var5, 4, 1, 2, 4, 3, 4, volatile_, volatile_, false);
      }

      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      this.class_((rrrd_1)var1, var2, var3, 1, 1);
      if (this.class_) {
         this.break_((rrrd_1)var1, var2, var3, 1, 2);
      }

      if (this.break_) {
         this.byte_((rrrd_1)var1, var2, var3, 1, 2);
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Left", this.class_);
      var1.class_("Right", this.break_);
   }
}
