package celestial;

import java.util.Random;

public class rib_3 extends riW_2 {
   public rib_3(rpr_3 var1, riz_3 var2) {
      super(raF_2.for_, 1, var1, var2, 1, 2, 2);
   }

   public rib_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.for_, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.native_.break_[rpr_3.NORTH.byte_()];
      riz_3 var9 = this.native_;
      riz_3 var10 = var8.break_[rpr_3.UP.byte_()];
      riz_3 var11 = var9.break_[rpr_3.UP.byte_()];
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 0, 8, var8.byte_[rpr_3.DOWN.byte_()]);
         this.class_(var1, var5, 0, 0, var9.byte_[rpr_3.DOWN.byte_()]);
      }

      if (var11.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 8, 1, 6, 8, 7, class_);
      }

      if (var10.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 8, 8, 6, 8, 14, class_);
      }

      for (int var12 = 1; var12 <= 7; var12++) {
         xc_3 var13 = break_;
         if (var12 == 2 || var12 == 6) {
            var13 = class_;
         }

         this.class_(var1, var5, 0, var12, 0, 0, var12, 15, var13, var13, false);
         this.class_(var1, var5, 7, var12, 0, 7, var12, 15, var13, var13, false);
         this.class_(var1, var5, 1, var12, 0, 6, var12, 0, var13, var13, false);
         this.class_(var1, var5, 1, var12, 15, 6, var12, 15, var13, var13, false);
      }

      for (int var14 = 1; var14 <= 7; var14++) {
         xc_3 var15 = byte_;
         if (var14 == 2 || var14 == 6) {
            var15 = throws_;
         }

         this.class_(var1, var5, 3, var14, 7, 4, var14, 8, var15, var15, false);
      }

      if (var9.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (var9.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 7, 1, 3, 7, 2, 4);
      }

      if (var9.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (var8.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 3, 1, 15, 4, 2, 15);
      }

      if (var8.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 1, 11, 0, 2, 12);
      }

      if (var8.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 7, 1, 11, 7, 2, 12);
      }

      if (var11.byte_[rpr_3.SOUTH.byte_()]) {
         this.class_(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (var11.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 7, 5, 3, 7, 6, 4);
         this.class_(var1, var5, 5, 4, 2, 6, 4, 5, break_, break_, false);
         this.class_(var1, var5, 6, 1, 2, 6, 3, 2, break_, break_, false);
         this.class_(var1, var5, 6, 1, 5, 6, 3, 5, break_, break_, false);
      }

      if (var11.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 5, 3, 0, 6, 4);
         this.class_(var1, var5, 1, 4, 2, 2, 4, 5, break_, break_, false);
         this.class_(var1, var5, 1, 1, 2, 1, 3, 2, break_, break_, false);
         this.class_(var1, var5, 1, 1, 5, 1, 3, 5, break_, break_, false);
      }

      if (var10.byte_[rpr_3.NORTH.byte_()]) {
         this.class_(var1, var5, 3, 5, 15, 4, 6, 15);
      }

      if (var10.byte_[rpr_3.WEST.byte_()]) {
         this.class_(var1, var5, 0, 5, 11, 0, 6, 12);
         this.class_(var1, var5, 1, 4, 10, 2, 4, 13, break_, break_, false);
         this.class_(var1, var5, 1, 1, 10, 1, 3, 10, break_, break_, false);
         this.class_(var1, var5, 1, 1, 13, 1, 3, 13, break_, break_, false);
      }

      if (var10.byte_[rpr_3.EAST.byte_()]) {
         this.class_(var1, var5, 7, 5, 11, 7, 6, 12);
         this.class_(var1, var5, 5, 4, 10, 6, 4, 13, break_, break_, false);
         this.class_(var1, var5, 6, 1, 10, 6, 3, 10, break_, break_, false);
         this.class_(var1, var5, 6, 1, 13, 6, 3, 13, break_, break_, false);
      }

      return true;
   }
}
