package celestial;

import java.util.Random;

public class riE_2 extends riW_2 {
   public riE_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.boolean_, 1, var1, var2, 2, 2, 1);
   }

   public riE_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.boolean_, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.native_.break_[rpr_3.EAST.byte_()];
      riz_3 var9 = this.native_;
      riz_3 var10 = var9.break_[rpr_3.UP.byte_()];
      riz_3 var11 = var8.break_[rpr_3.UP.byte_()];
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 8, 0, var8.byte_[rpr_3.DOWN.byte_()]);
         this.class_(var1, var5, 0, 0, var9.byte_[rpr_3.DOWN.byte_()]);
      }

      if (var10.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 8, 1, 7, 8, 6, class_);
      }

      if (var11.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 8, 8, 1, 14, 8, 6, class_);
      }

      for (int var12 = 1; var12 <= 7; var12++) {
         xc_3 var13 = break_;
         if (var12 == 2 || var12 == 6) {
            var13 = class_;
         }

         this.class_(var1, var5, 0, var12, 0, 0, var12, 7, var13, var13, false);
         this.class_(var1, var5, 15, var12, 0, 15, var12, 7, var13, var13, false);
         this.class_(var1, var5, 1, var12, 0, 15, var12, 0, var13, var13, false);
         this.class_(var1, var5, 1, var12, 7, 14, var12, 7, var13, var13, false);
      }

      this.class_(var1, var5, 2, 1, 3, 2, 7, 4, break_, break_, false);
      this.class_(var1, var5, 3, 1, 2, 4, 7, 2, break_, break_, false);
      this.class_(var1, var5, 3, 1, 5, 4, 7, 5, break_, break_, false);
      this.class_(var1, var5, 13, 1, 3, 13, 7, 4, break_, break_, false);
      this.class_(var1, var5, 11, 1, 2, 12, 7, 2, break_, break_, false);
      this.class_(var1, var5, 11, 1, 5, 12, 7, 5, break_, break_, false);
      this.class_(var1, var5, 5, 1, 3, 5, 3, 4, break_, break_, false);
      this.class_(var1, var5, 10, 1, 3, 10, 3, 4, break_, break_, false);
      this.class_(var1, var5, 5, 7, 2, 10, 7, 5, break_, break_, false);
      this.class_(var1, var5, 5, 5, 2, 5, 7, 2, break_, break_, false);
      this.class_(var1, var5, 10, 5, 2, 10, 7, 2, break_, break_, false);
      this.class_(var1, var5, 5, 5, 5, 5, 7, 5, break_, break_, false);
      this.class_(var1, var5, 10, 5, 5, 10, 7, 5, break_, break_, false);
      this.class_(var1, break_, 6, 6, 2, var5);
      this.class_(var1, break_, 9, 6, 2, var5);
      this.class_(var1, break_, 6, 6, 5, var5);
      this.class_(var1, break_, 9, 6, 5, var5);
      this.class_(var1, var5, 5, 4, 3, 6, 4, 4, break_, break_, false);
      this.class_(var1, var5, 9, 4, 3, 10, 4, 4, break_, break_, false);
      this.class_(var1, throws_, 5, 4, 2, var5);
      this.class_(var1, throws_, 5, 4, 5, var5);
      this.class_(var1, throws_, 10, 4, 2, var5);
      this.class_(var1, throws_, 10, 4, 5, var5);
      if (var9.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (var9.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (var9.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (var8.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 11, 1, 0, 12, 2, 0);
      }

      if (var8.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 11, 1, 7, 12, 2, 7);
      }

      if (var8.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 15, 1, 3, 15, 2, 4);
      }

      if (var10.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (var10.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 3, 5, 7, 4, 6, 7);
      }

      if (var10.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 5, 3, 0, 6, 4);
      }

      if (var11.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 11, 5, 0, 12, 6, 0);
      }

      if (var11.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 11, 5, 7, 12, 6, 7);
      }

      if (var11.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 15, 5, 3, 15, 6, 4);
      }

      return true;
   }
}
