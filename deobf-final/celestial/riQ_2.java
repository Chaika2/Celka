package celestial;

import java.util.Random;

public class riQ_2 extends riW_2 {
   private int int_;

   public riQ_2(rpr_3 var1, riz_3 var2, Random var3) {
      super(raF_2.P, 1, var1, var2, 1, 1, 1);
      this.int_ = var3.nextInt(3);
   }

   public riQ_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.P, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 0, 0, this.native_.byte_[rpr_3.DOWN.byte_()]);
      }

      if (this.native_.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 4, 1, 6, 4, 6, class_);
      }

      boolean var8 = this.int_ != 0
         && var4.nextBoolean()
         && !this.native_.byte_[rpr_3.DOWN.byte_()]
         && !this.native_.byte_[rpr_3.UP.byte_()]
         && this.native_.byte_() > 1;
      if (this.int_ == 0) {
         this.class_(var1, var5, 0, 1, 0, 2, 1, 2, break_, break_, false);
         this.class_(var1, var5, 0, 3, 0, 2, 3, 2, break_, break_, false);
         this.class_(var1, var5, 0, 2, 0, 0, 2, 2, class_, class_, false);
         this.class_(var1, var5, 1, 2, 0, 2, 2, 0, class_, class_, false);
         this.class_(var1, throws_, 1, 2, 1, var5);
         this.class_(var1, var5, 5, 1, 0, 7, 1, 2, break_, break_, false);
         this.class_(var1, var5, 5, 3, 0, 7, 3, 2, break_, break_, false);
         this.class_(var1, var5, 7, 2, 0, 7, 2, 2, class_, class_, false);
         this.class_(var1, var5, 5, 2, 0, 6, 2, 0, class_, class_, false);
         this.class_(var1, throws_, 6, 2, 1, var5);
         this.class_(var1, var5, 0, 1, 5, 2, 1, 7, break_, break_, false);
         this.class_(var1, var5, 0, 3, 5, 2, 3, 7, break_, break_, false);
         this.class_(var1, var5, 0, 2, 5, 0, 2, 7, class_, class_, false);
         this.class_(var1, var5, 1, 2, 7, 2, 2, 7, class_, class_, false);
         this.class_(var1, throws_, 1, 2, 6, var5);
         this.class_(var1, var5, 5, 1, 5, 7, 1, 7, break_, break_, false);
         this.class_(var1, var5, 5, 3, 5, 7, 3, 7, break_, break_, false);
         this.class_(var1, var5, 7, 2, 5, 7, 2, 7, class_, class_, false);
         this.class_(var1, var5, 5, 2, 7, 6, 2, 7, class_, class_, false);
         this.class_(var1, throws_, 6, 2, 6, var5);
         if (this.native_.byte_[rpr_3.SOUTH.byte_()]) {
            this.class_(var1, var5, 3, 3, 0, 4, 3, 0, break_, break_, false);
         } else {
            this.class_(var1, var5, 3, 3, 0, 4, 3, 1, break_, break_, false);
            this.class_(var1, var5, 3, 2, 0, 4, 2, 0, class_, class_, false);
            this.class_(var1, var5, 3, 1, 0, 4, 1, 1, break_, break_, false);
         }

         if (this.native_.byte_[rpr_3.NORTH.byte_()]) {
            this.class_(var1, var5, 3, 3, 7, 4, 3, 7, break_, break_, false);
         } else {
            this.class_(var1, var5, 3, 3, 6, 4, 3, 7, break_, break_, false);
            this.class_(var1, var5, 3, 2, 7, 4, 2, 7, class_, class_, false);
            this.class_(var1, var5, 3, 1, 6, 4, 1, 7, break_, break_, false);
         }

         if (this.native_.byte_[rpr_3.WEST.byte_()]) {
            this.class_(var1, var5, 0, 3, 3, 0, 3, 4, break_, break_, false);
         } else {
            this.class_(var1, var5, 0, 3, 3, 1, 3, 4, break_, break_, false);
            this.class_(var1, var5, 0, 2, 3, 0, 2, 4, class_, class_, false);
            this.class_(var1, var5, 0, 1, 3, 1, 1, 4, break_, break_, false);
         }

         if (this.native_.byte_[rpr_3.EAST.byte_()]) {
            this.class_(var1, var5, 7, 3, 3, 7, 3, 4, break_, break_, false);
         } else {
            this.class_(var1, var5, 6, 3, 3, 7, 3, 4, break_, break_, false);
            this.class_(var1, var5, 7, 2, 3, 7, 2, 4, class_, class_, false);
            this.class_(var1, var5, 6, 1, 3, 7, 1, 4, break_, break_, false);
         }
      } else if (this.int_ == 1) {
         this.class_(var1, var5, 2, 1, 2, 2, 3, 2, break_, break_, false);
         this.class_(var1, var5, 2, 1, 5, 2, 3, 5, break_, break_, false);
         this.class_(var1, var5, 5, 1, 5, 5, 3, 5, break_, break_, false);
         this.class_(var1, var5, 5, 1, 2, 5, 3, 2, break_, break_, false);
         this.class_(var1, throws_, 2, 2, 2, var5);
         this.class_(var1, throws_, 2, 2, 5, var5);
         this.class_(var1, throws_, 5, 2, 5, var5);
         this.class_(var1, throws_, 5, 2, 2, var5);
         this.class_(var1, var5, 0, 1, 0, 1, 3, 0, break_, break_, false);
         this.class_(var1, var5, 0, 1, 1, 0, 3, 1, break_, break_, false);
         this.class_(var1, var5, 0, 1, 7, 1, 3, 7, break_, break_, false);
         this.class_(var1, var5, 0, 1, 6, 0, 3, 6, break_, break_, false);
         this.class_(var1, var5, 6, 1, 7, 7, 3, 7, break_, break_, false);
         this.class_(var1, var5, 7, 1, 6, 7, 3, 6, break_, break_, false);
         this.class_(var1, var5, 6, 1, 0, 7, 3, 0, break_, break_, false);
         this.class_(var1, var5, 7, 1, 1, 7, 3, 1, break_, break_, false);
         this.class_(var1, class_, 1, 2, 0, var5);
         this.class_(var1, class_, 0, 2, 1, var5);
         this.class_(var1, class_, 1, 2, 7, var5);
         this.class_(var1, class_, 0, 2, 6, var5);
         this.class_(var1, class_, 6, 2, 7, var5);
         this.class_(var1, class_, 7, 2, 6, var5);
         this.class_(var1, class_, 6, 2, 0, var5);
         this.class_(var1, class_, 7, 2, 1, var5);
         if (!this.native_.byte_[rpr_3.SOUTH.byte_()]) {
            this.class_(var1, var5, 1, 3, 0, 6, 3, 0, break_, break_, false);
            this.class_(var1, var5, 1, 2, 0, 6, 2, 0, class_, class_, false);
            this.class_(var1, var5, 1, 1, 0, 6, 1, 0, break_, break_, false);
         }

         if (!this.native_.byte_[rpr_3.NORTH.byte_()]) {
            this.class_(var1, var5, 1, 3, 7, 6, 3, 7, break_, break_, false);
            this.class_(var1, var5, 1, 2, 7, 6, 2, 7, class_, class_, false);
            this.class_(var1, var5, 1, 1, 7, 6, 1, 7, break_, break_, false);
         }

         if (!this.native_.byte_[rpr_3.WEST.byte_()]) {
            this.class_(var1, var5, 0, 3, 1, 0, 3, 6, break_, break_, false);
            this.class_(var1, var5, 0, 2, 1, 0, 2, 6, class_, class_, false);
            this.class_(var1, var5, 0, 1, 1, 0, 1, 6, break_, break_, false);
         }

         if (!this.native_.byte_[rpr_3.EAST.byte_()]) {
            this.class_(var1, var5, 7, 3, 1, 7, 3, 6, break_, break_, false);
            this.class_(var1, var5, 7, 2, 1, 7, 2, 6, class_, class_, false);
            this.class_(var1, var5, 7, 1, 1, 7, 1, 6, break_, break_, false);
         }
      } else if (this.int_ == 2) {
         this.class_(var1, var5, 0, 1, 0, 0, 1, 7, break_, break_, false);
         this.class_(var1, var5, 7, 1, 0, 7, 1, 7, break_, break_, false);
         this.class_(var1, var5, 1, 1, 0, 6, 1, 0, break_, break_, false);
         this.class_(var1, var5, 1, 1, 7, 6, 1, 7, break_, break_, false);
         this.class_(var1, var5, 0, 2, 0, 0, 2, 7, byte_, byte_, false);
         this.class_(var1, var5, 7, 2, 0, 7, 2, 7, byte_, byte_, false);
         this.class_(var1, var5, 1, 2, 0, 6, 2, 0, byte_, byte_, false);
         this.class_(var1, var5, 1, 2, 7, 6, 2, 7, byte_, byte_, false);
         this.class_(var1, var5, 0, 3, 0, 0, 3, 7, break_, break_, false);
         this.class_(var1, var5, 7, 3, 0, 7, 3, 7, break_, break_, false);
         this.class_(var1, var5, 1, 3, 0, 6, 3, 0, break_, break_, false);
         this.class_(var1, var5, 1, 3, 7, 6, 3, 7, break_, break_, false);
         this.class_(var1, var5, 0, 1, 3, 0, 2, 4, byte_, byte_, false);
         this.class_(var1, var5, 7, 1, 3, 7, 2, 4, byte_, byte_, false);
         this.class_(var1, var5, 3, 1, 0, 4, 2, 0, byte_, byte_, false);
         this.class_(var1, var5, 3, 1, 7, 4, 2, 7, byte_, byte_, false);
         if (this.native_.byte_[rpr_3.SOUTH.byte_()]) {
            this.class_(var1, var5, 3, 1, 0, 4, 2, 0);
         }

         if (this.native_.byte_[rpr_3.NORTH.byte_()]) {
            this.class_(var1, var5, 3, 1, 7, 4, 2, 7);
         }

         if (this.native_.byte_[rpr_3.WEST.byte_()]) {
            this.class_(var1, var5, 0, 1, 3, 0, 2, 4);
         }

         if (this.native_.byte_[rpr_3.EAST.byte_()]) {
            this.class_(var1, var5, 7, 1, 3, 7, 2, 4);
         }
      }

      if (var8) {
         this.class_(var1, var5, 3, 1, 3, 4, 1, 4, break_, break_, false);
         this.class_(var1, var5, 3, 2, 3, 4, 2, 4, class_, class_, false);
         this.class_(var1, var5, 3, 3, 3, 4, 3, 4, break_, break_, false);
      }

      return true;
   }
}
