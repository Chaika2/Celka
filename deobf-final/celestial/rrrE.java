package celestial;

import java.util.List;
import java.util.Random;

public class rrrE extends rrrQ {
   private final boolean class_;
   private final boolean break_;
   private final boolean byte_;
   private final boolean throws_;

   public rrrE(int var1, Random var2, rfi_3 var3, rpr_3 var4) {
      super(raF_2.synchronized_, var1);
      this.class_(var4);
      this.protected_ = this.class_(var2);
      this.final_ = var3;
      this.class_ = var2.nextBoolean();
      this.break_ = var2.nextBoolean();
      this.byte_ = var2.nextBoolean();
      this.throws_ = var2.nextInt(3) > 0;
   }

   public rrrE(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.synchronized_, var2);
      this.class_ = var2.new_("leftLow");
      this.break_ = var2.new_("leftHigh");
      this.byte_ = var2.new_("rightLow");
      this.throws_ = var2.new_("rightHigh");
   }

   public static rrrE class_(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6) {
      rfi_3 var7 = rfi_3.class_(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return class_(var7) && rrrn_1.class_(var0, var7) == null ? new rrrE(var6, var1, var7, var5) : null;
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, 0, 0, 9, 8, 10, true, var4, rii_3.throws_);
      this.class_(var1, var4, var5, this.protected_, 4, 3, 0);
      if (this.class_) {
         this.class_(var1, var5, 0, 3, 1, 0, 5, 3, volatile_, volatile_, false);
      }

      if (this.byte_) {
         this.class_(var1, var5, 9, 3, 1, 9, 5, 3, volatile_, volatile_, false);
      }

      if (this.break_) {
         this.class_(var1, var5, 0, 5, 7, 0, 7, 9, volatile_, volatile_, false);
      }

      if (this.throws_) {
         this.class_(var1, var5, 9, 5, 7, 9, 7, 9, volatile_, volatile_, false);
      }

      this.class_(var1, var5, 5, 1, 10, 7, 3, 10, volatile_, volatile_, false);
      this.class_(var1, var5, 1, 2, 1, 8, 2, 6, false, var4, rii_3.throws_);
      this.class_(var1, var5, 4, 1, 5, 4, 4, 9, false, var4, rii_3.throws_);
      this.class_(var1, var5, 8, 1, 5, 8, 4, 9, false, var4, rii_3.throws_);
      this.class_(var1, var5, 1, 4, 7, 3, 4, 9, false, var4, rii_3.throws_);
      this.class_(var1, var5, 1, 3, 5, 3, 3, 6, false, var4, rii_3.throws_);
      this.class_(var1, var5, 1, 3, 4, 3, 3, 4, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(var1, var5, 1, 4, 6, 3, 4, 6, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(var1, var5, 5, 1, 7, 7, 1, 8, false, var4, rii_3.throws_);
      this.class_(var1, var5, 5, 1, 9, 7, 1, 9, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(var1, var5, 5, 2, 7, 7, 2, 7, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(var1, var5, 4, 5, 7, 4, 5, 9, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(var1, var5, 8, 5, 7, 8, 5, 9, xu_3.Ge.continue_(), xu_3.Ge.continue_(), false);
      this.class_(
         var1,
         var5,
         5,
         5,
         7,
         7,
         5,
         9,
         xu_3.Ge.continue_().class_(Wg_1.volatile_, rCo_1.DOUBLE),
         xu_3.Ge.continue_().class_(Wg_1.volatile_, rCo_1.DOUBLE),
         false
      );
      this.class_(var1, xu_3.rY.continue_().class_(zg_3.volatile_, rpr_3.SOUTH), 6, 5, 6, var5);
      return true;
   }

   @Override
   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
      int var4 = 3;
      int var5 = 5;
      rpr_3 var6 = this.implements_();
      if (var6 == rpr_3.WEST || var6 == rpr_3.NORTH) {
         var4 = 8 - var4;
         var5 = 8 - var5;
      }

      this.class_((rrrd_1)var1, var2, var3, 5, 1);
      if (this.class_) {
         this.break_((rrrd_1)var1, var2, var3, var4, 1);
      }

      if (this.break_) {
         this.break_((rrrd_1)var1, var2, var3, var5, 7);
      }

      if (this.byte_) {
         this.byte_((rrrd_1)var1, var2, var3, var4, 1);
      }

      if (this.throws_) {
         this.byte_((rrrd_1)var1, var2, var3, var5, 7);
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("leftLow", this.class_);
      var1.class_("leftHigh", this.break_);
      var1.class_("rightLow", this.byte_);
      var1.class_("rightHigh", this.throws_);
   }
}
