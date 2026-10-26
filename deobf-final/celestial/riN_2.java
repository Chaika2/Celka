package celestial;

import java.util.Random;

public class riN_2 extends riW_2 {
   public riN_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.B, 1, var1, var2, 1, 1, 1);
   }

   public riN_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.B, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.native_.class_ / 25 > 0) {
         this.class_(var1, var5, 0, 0, this.native_.byte_[rpr_3.DOWN.byte_()]);
      }

      if (this.native_.break_[rpr_3.UP.byte_()] == null) {
         this.class_(var1, var5, 1, 4, 1, 6, 4, 6, class_);
      }

      for (int var8 = 1; var8 <= 6; var8++) {
         for (int var9 = 1; var9 <= 6; var9++) {
            if (var4.nextInt(3) != 0) {
               int var10 = 2 + (var4.nextInt(4) == 0 ? 0 : 1);
               xc_3 var11 = xu_3.c.continue_();
               this.class_(var1, var5, var8, var10, var9, var8, 3, var9, var11, var11, false);
            }
         }
      }

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

      return true;
   }
}
