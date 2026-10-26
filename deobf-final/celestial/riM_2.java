package celestial;

import java.util.Random;

public class riM_2 extends riW_2 {
   public riM_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.double_, 1, var1, var2, 1, 1, 2);
   }

   public riM_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.double_, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.native_.break_[rpr_3.NORTH.byte_()];
      riz_3 var9 = this.native_;
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 0, 8, var8.byte_[rpr_3.DOWN.byte_()]);
         this.class_(var1, var5, 0, 0, var9.byte_[rpr_3.DOWN.byte_()]);
      }

      if (var9.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 4, 1, 6, 4, 7, class_);
      }

      if (var8.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 4, 8, 6, 4, 14, class_);
      }

      this.class_(var1, var5, 0, 3, 0, 0, 3, 15, break_, break_, false);
      this.class_(var1, var5, 7, 3, 0, 7, 3, 15, break_, break_, false);
      this.class_(var1, var5, 1, 3, 0, 7, 3, 0, break_, break_, false);
      this.class_(var1, var5, 1, 3, 15, 6, 3, 15, break_, break_, false);
      this.class_(var1, var5, 0, 2, 0, 0, 2, 15, class_, class_, false);
      this.class_(var1, var5, 7, 2, 0, 7, 2, 15, class_, class_, false);
      this.class_(var1, var5, 1, 2, 0, 7, 2, 0, class_, class_, false);
      this.class_(var1, var5, 1, 2, 15, 6, 2, 15, class_, class_, false);
      this.class_(var1, var5, 0, 1, 0, 0, 1, 15, break_, break_, false);
      this.class_(var1, var5, 7, 1, 0, 7, 1, 15, break_, break_, false);
      this.class_(var1, var5, 1, 1, 0, 7, 1, 0, break_, break_, false);
      this.class_(var1, var5, 1, 1, 15, 6, 1, 15, break_, break_, false);
      this.class_(var1, var5, 1, 1, 1, 1, 1, 2, break_, break_, false);
      this.class_(var1, var5, 6, 1, 1, 6, 1, 2, break_, break_, false);
      this.class_(var1, var5, 1, 3, 1, 1, 3, 2, break_, break_, false);
      this.class_(var1, var5, 6, 3, 1, 6, 3, 2, break_, break_, false);
      this.class_(var1, var5, 1, 1, 13, 1, 1, 14, break_, break_, false);
      this.class_(var1, var5, 6, 1, 13, 6, 1, 14, break_, break_, false);
      this.class_(var1, var5, 1, 3, 13, 1, 3, 14, break_, break_, false);
      this.class_(var1, var5, 6, 3, 13, 6, 3, 14, break_, break_, false);
      this.class_(var1, var5, 2, 1, 6, 2, 3, 6, break_, break_, false);
      this.class_(var1, var5, 5, 1, 6, 5, 3, 6, break_, break_, false);
      this.class_(var1, var5, 2, 1, 9, 2, 3, 9, break_, break_, false);
      this.class_(var1, var5, 5, 1, 9, 5, 3, 9, break_, break_, false);
      this.class_(var1, var5, 3, 2, 6, 4, 2, 6, break_, break_, false);
      this.class_(var1, var5, 3, 2, 9, 4, 2, 9, break_, break_, false);
      this.class_(var1, var5, 2, 2, 7, 2, 2, 8, break_, break_, false);
      this.class_(var1, var5, 5, 2, 7, 5, 2, 8, break_, break_, false);
      this.class_(var1, throws_, 2, 2, 5, var5);
      this.class_(var1, throws_, 5, 2, 5, var5);
      this.class_(var1, throws_, 2, 2, 10, var5);
      this.class_(var1, throws_, 5, 2, 10, var5);
      this.class_(var1, break_, 2, 3, 5, var5);
      this.class_(var1, break_, 5, 3, 5, var5);
      this.class_(var1, break_, 2, 3, 10, var5);
      this.class_(var1, break_, 5, 3, 10, var5);
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

      return true;
   }
}
