package celestial;

import java.util.Random;

public class ris_3 extends riW_2 {
   public ris_3(rpr_3 var1, riz_3 var2) {
      super(raF_2.strictfp_, 1, var1, var2, 2, 1, 1);
   }

   public ris_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.strictfp_, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.native_.break_[rpr_3.EAST.byte_()];
      riz_3 var9 = this.native_;
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 8, 0, var8.byte_[rpr_3.DOWN.byte_()]);
         this.class_(var1, var5, 0, 0, var9.byte_[rpr_3.DOWN.byte_()]);
      }

      if (var9.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 4, 1, 7, 4, 6, class_);
      }

      if (var8.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 8, 4, 1, 14, 4, 6, class_);
      }

      this.class_(var1, var5, 0, 3, 0, 0, 3, 7, break_, break_, false);
      this.class_(var1, var5, 15, 3, 0, 15, 3, 7, break_, break_, false);
      this.class_(var1, var5, 1, 3, 0, 15, 3, 0, break_, break_, false);
      this.class_(var1, var5, 1, 3, 7, 14, 3, 7, break_, break_, false);
      this.class_(var1, var5, 0, 2, 0, 0, 2, 7, class_, class_, false);
      this.class_(var1, var5, 15, 2, 0, 15, 2, 7, class_, class_, false);
      this.class_(var1, var5, 1, 2, 0, 15, 2, 0, class_, class_, false);
      this.class_(var1, var5, 1, 2, 7, 14, 2, 7, class_, class_, false);
      this.class_(var1, var5, 0, 1, 0, 0, 1, 7, break_, break_, false);
      this.class_(var1, var5, 15, 1, 0, 15, 1, 7, break_, break_, false);
      this.class_(var1, var5, 1, 1, 0, 15, 1, 0, break_, break_, false);
      this.class_(var1, var5, 1, 1, 7, 14, 1, 7, break_, break_, false);
      this.class_(var1, var5, 5, 1, 0, 10, 1, 4, break_, break_, false);
      this.class_(var1, var5, 6, 2, 0, 9, 2, 3, class_, class_, false);
      this.class_(var1, var5, 5, 3, 0, 10, 3, 4, break_, break_, false);
      this.class_(var1, throws_, 6, 2, 3, var5);
      this.class_(var1, throws_, 9, 2, 3, var5);
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

      return true;
   }
}
