package celestial;

import java.util.Random;

public class reR_2 extends riY_2 {
   private final boolean[] throws_ = new boolean[4];

   public reR_2(Random var1, int var2, int var3) {
      super(raF_2.short_, var1, var2, 64, var3, 21, 15, 21);
   }

   public reR_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.short_, var2);
      this.throws_[0] = var2.new_("hasPlacedChest0");
      this.throws_[1] = var2.new_("hasPlacedChest1");
      this.throws_[2] = var2.new_("hasPlacedChest2");
      this.throws_[3] = var2.new_("hasPlacedChest3");
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 0, -4, 0, this.class_ - 1, 0, this.byte_ - 1, xu_3.F.continue_(), xu_3.F.continue_(), false);

      for (int var8 = 1; var8 <= 9; var8++) {
         this.class_(var1, var5, var8, var8, var8, this.class_ - 1 - var8, var8, this.byte_ - 1 - var8, xu_3.F.continue_(), xu_3.F.continue_(), false);
         this.class_(
            var1, var5, var8 + 1, var8, var8 + 1, this.class_ - 2 - var8, var8, this.byte_ - 2 - var8, xu_3.class_.continue_(), xu_3.class_.continue_(), false
         );
      }

      for (int var16 = 0; var16 < this.class_; var16++) {
         for (int var9 = 0; var9 < this.byte_; var9++) {
            byte var10 = -5;
            this.break_(var1, xu_3.F.continue_(), var16, -5, var9, var5);
         }
      }

      xc_3 var17 = xu_3.Sd.continue_().class_(zG_2.volatile_, rpr_3.NORTH);
      xc_3 var18 = xu_3.Sd.continue_().class_(zG_2.volatile_, rpr_3.SOUTH);
      xc_3 var19 = xu_3.Sd.continue_().class_(zG_2.volatile_, rpr_3.EAST);
      xc_3 var11 = xu_3.Sd.continue_().class_(zG_2.volatile_, rpr_3.WEST);
      this.class_(var1, var5, 0, 0, 0, 4, 9, 4, xu_3.F.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 1, 10, 1, 3, 10, 3, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var17, 2, 10, 0, var5);
      this.class_(var1, var18, 2, 10, 4, var5);
      this.class_(var1, var19, 0, 10, 2, var5);
      this.class_(var1, var11, 4, 10, 2, var5);
      this.class_(var1, var5, this.class_ - 5, 0, 0, this.class_ - 1, 9, 4, xu_3.F.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, this.class_ - 4, 10, 1, this.class_ - 2, 10, 3, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var17, this.class_ - 3, 10, 0, var5);
      this.class_(var1, var18, this.class_ - 3, 10, 4, var5);
      this.class_(var1, var19, this.class_ - 5, 10, 2, var5);
      this.class_(var1, var11, this.class_ - 1, 10, 2, var5);
      this.class_(var1, var5, 8, 0, 0, 12, 4, 4, xu_3.F.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 9, 1, 0, 11, 3, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, xu_3.A.continue_(), 9, 1, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 9, 2, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 9, 3, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 10, 3, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 11, 3, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 11, 2, 1, var5);
      this.class_(var1, xu_3.A.continue_(), 11, 1, 1, var5);
      this.class_(var1, var5, 4, 1, 1, 8, 3, 3, xu_3.F.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 4, 1, 2, 8, 2, 2, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 12, 1, 1, 16, 3, 3, xu_3.F.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 12, 1, 2, 16, 2, 2, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 5, 4, 5, this.class_ - 6, 4, this.byte_ - 6, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, 9, 4, 9, 11, 4, 11, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, 8, 1, 8, 8, 3, 8, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 12, 1, 8, 12, 3, 8, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 8, 1, 12, 8, 3, 12, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 12, 1, 12, 12, 3, 12, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 1, 1, 5, 4, 4, 11, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, this.class_ - 5, 1, 5, this.class_ - 2, 4, 11, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, 6, 7, 9, 6, 7, 11, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, this.class_ - 7, 7, 9, this.class_ - 7, 7, 11, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, 5, 5, 9, 5, 7, 11, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, this.class_ - 6, 5, 9, this.class_ - 6, 7, 11, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, xu_3.class_.continue_(), 5, 5, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 5, 6, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 6, 6, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), this.class_ - 6, 5, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), this.class_ - 6, 6, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), this.class_ - 7, 6, 10, var5);
      this.class_(var1, var5, 2, 4, 4, 2, 6, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, this.class_ - 3, 4, 4, this.class_ - 3, 6, 4, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var17, 2, 4, 5, var5);
      this.class_(var1, var17, 2, 3, 4, var5);
      this.class_(var1, var17, this.class_ - 3, 4, 5, var5);
      this.class_(var1, var17, this.class_ - 3, 3, 4, var5);
      this.class_(var1, var5, 1, 1, 3, 2, 2, 3, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, this.class_ - 3, 1, 3, this.class_ - 2, 2, 3, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, xu_3.F.continue_(), 1, 1, 2, var5);
      this.class_(var1, xu_3.F.continue_(), this.class_ - 2, 1, 2, var5);
      this.class_(var1, xu_3.Ga.continue_(), 1, 2, 2, var5);
      this.class_(var1, xu_3.Ga.continue_(), this.class_ - 2, 2, 2, var5);
      this.class_(var1, var11, 2, 1, 2, var5);
      this.class_(var1, var19, this.class_ - 3, 1, 2, var5);
      this.class_(var1, var5, 4, 3, 5, 4, 3, 17, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, this.class_ - 5, 3, 5, this.class_ - 5, 3, 17, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, 3, 1, 5, 4, 2, 16, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, var5, this.class_ - 6, 1, 5, this.class_ - 5, 2, 16, xu_3.class_.continue_(), xu_3.class_.continue_(), false);

      for (byte var12 = 5; var12 <= 17; var12 += 2) {
         this.class_(var1, xu_3.A.continue_(), 4, 1, var12, var5);
         this.class_(var1, xu_3.L.continue_(), 4, 2, var12, var5);
         this.class_(var1, xu_3.A.continue_(), this.class_ - 5, 1, var12, var5);
         this.class_(var1, xu_3.L.continue_(), this.class_ - 5, 2, var12, var5);
      }

      this.class_(var1, xu_3.sI.continue_(), 10, 0, 7, var5);
      this.class_(var1, xu_3.sI.continue_(), 10, 0, 8, var5);
      this.class_(var1, xu_3.sI.continue_(), 9, 0, 9, var5);
      this.class_(var1, xu_3.sI.continue_(), 11, 0, 9, var5);
      this.class_(var1, xu_3.sI.continue_(), 8, 0, 10, var5);
      this.class_(var1, xu_3.sI.continue_(), 12, 0, 10, var5);
      this.class_(var1, xu_3.sI.continue_(), 7, 0, 10, var5);
      this.class_(var1, xu_3.sI.continue_(), 13, 0, 10, var5);
      this.class_(var1, xu_3.sI.continue_(), 9, 0, 11, var5);
      this.class_(var1, xu_3.sI.continue_(), 11, 0, 11, var5);
      this.class_(var1, xu_3.sI.continue_(), 10, 0, 12, var5);
      this.class_(var1, xu_3.sI.continue_(), 10, 0, 13, var5);
      this.class_(var1, xu_3.sU.continue_(), 10, 0, 10, var5);

      for (int var20 = 0; var20 <= this.class_ - 1; var20 += this.class_ - 1) {
         this.class_(var1, xu_3.A.continue_(), var20, 2, 1, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 2, 2, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 2, 3, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 3, 1, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 3, 2, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 3, 3, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 4, 1, var5);
         this.class_(var1, xu_3.L.continue_(), var20, 4, 2, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 4, 3, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 5, 1, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 5, 2, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 5, 3, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 6, 1, var5);
         this.class_(var1, xu_3.L.continue_(), var20, 6, 2, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 6, 3, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 7, 1, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 7, 2, var5);
         this.class_(var1, xu_3.sI.continue_(), var20, 7, 3, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 8, 1, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 8, 2, var5);
         this.class_(var1, xu_3.A.continue_(), var20, 8, 3, var5);
      }

      for (int var21 = 2; var21 <= this.class_ - 3; var21 += this.class_ - 3 - 2) {
         this.class_(var1, xu_3.A.continue_(), var21 - 1, 2, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21, 2, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 + 1, 2, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 - 1, 3, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21, 3, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 + 1, 3, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 - 1, 4, 0, var5);
         this.class_(var1, xu_3.L.continue_(), var21, 4, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 + 1, 4, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 - 1, 5, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21, 5, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 + 1, 5, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 - 1, 6, 0, var5);
         this.class_(var1, xu_3.L.continue_(), var21, 6, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 + 1, 6, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 - 1, 7, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21, 7, 0, var5);
         this.class_(var1, xu_3.sI.continue_(), var21 + 1, 7, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 - 1, 8, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21, 8, 0, var5);
         this.class_(var1, xu_3.A.continue_(), var21 + 1, 8, 0, var5);
      }

      this.class_(var1, var5, 8, 4, 0, 12, 6, 0, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, xu_3.class_.continue_(), 8, 6, 0, var5);
      this.class_(var1, xu_3.class_.continue_(), 12, 6, 0, var5);
      this.class_(var1, xu_3.sI.continue_(), 9, 5, 0, var5);
      this.class_(var1, xu_3.L.continue_(), 10, 5, 0, var5);
      this.class_(var1, xu_3.sI.continue_(), 11, 5, 0, var5);
      this.class_(var1, var5, 8, -14, 8, 12, -11, 12, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 8, -10, 8, 12, -10, 12, xu_3.L.continue_(), xu_3.L.continue_(), false);
      this.class_(var1, var5, 8, -9, 8, 12, -9, 12, xu_3.A.continue_(), xu_3.A.continue_(), false);
      this.class_(var1, var5, 8, -8, 8, 12, -1, 12, xu_3.F.continue_(), xu_3.F.continue_(), false);
      this.class_(var1, var5, 9, -11, 9, 11, -1, 11, xu_3.class_.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, xu_3.Pm.continue_(), 10, -11, 10, var5);
      this.class_(var1, var5, 9, -13, 9, 11, -13, 11, xu_3.rf.continue_(), xu_3.class_.continue_(), false);
      this.class_(var1, xu_3.class_.continue_(), 8, -11, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 8, -10, 10, var5);
      this.class_(var1, xu_3.L.continue_(), 7, -10, 10, var5);
      this.class_(var1, xu_3.A.continue_(), 7, -11, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 12, -11, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 12, -10, 10, var5);
      this.class_(var1, xu_3.L.continue_(), 13, -10, 10, var5);
      this.class_(var1, xu_3.A.continue_(), 13, -11, 10, var5);
      this.class_(var1, xu_3.class_.continue_(), 10, -11, 8, var5);
      this.class_(var1, xu_3.class_.continue_(), 10, -10, 8, var5);
      this.class_(var1, xu_3.L.continue_(), 10, -10, 7, var5);
      this.class_(var1, xu_3.A.continue_(), 10, -11, 7, var5);
      this.class_(var1, xu_3.class_.continue_(), 10, -11, 12, var5);
      this.class_(var1, xu_3.class_.continue_(), 10, -10, 12, var5);
      this.class_(var1, xu_3.L.continue_(), 10, -10, 13, var5);
      this.class_(var1, xu_3.A.continue_(), 10, -11, 13, var5);

      for (rpr_3 var13 : rpb_3.HORIZONTAL) {
         if (!this.throws_[var13.protected_()]) {
            int var14 = var13.implements_() * 2;
            int var15 = var13.extends_() * 2;
            this.throws_[var13.protected_()] = this.class_(var1, var5, var4, 10 + var14, -11, 10 + var15, rzl_3.while_);
         }
      }

      return true;
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("hasPlacedChest0", this.throws_[0]);
      var1.class_("hasPlacedChest1", this.throws_[1]);
      var1.class_("hasPlacedChest2", this.throws_[2]);
      var1.class_("hasPlacedChest3", this.throws_[3]);
   }
}
