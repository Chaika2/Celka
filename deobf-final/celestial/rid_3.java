package celestial;

import java.util.Random;

public class rid_3 extends riW_2 {
   public rid_3(rpr_3 var1, riz_3 var2) {
      super(raF_2.const_, 1, var1, var2, 2, 2, 2);
   }

   public rid_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.const_, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 1, 8, 0, 14, 8, 14, class_);
      byte var8 = 7;
      xc_3 var9 = break_;
      this.class_(var1, var5, 0, 7, 0, 0, 7, 15, var9, var9, false);
      this.class_(var1, var5, 15, 7, 0, 15, 7, 15, var9, var9, false);
      this.class_(var1, var5, 1, 7, 0, 15, 7, 0, var9, var9, false);
      this.class_(var1, var5, 1, 7, 15, 14, 7, 15, var9, var9, false);

      for (int var10 = 1; var10 <= 6; var10++) {
         var9 = break_;
         if (var10 == 2 || var10 == 6) {
            var9 = class_;
         }

         for (byte var11 = 0; var11 <= 15; var11 += 15) {
            this.class_(var1, var5, var11, var10, 0, var11, var10, 1, var9, var9, false);
            this.class_(var1, var5, var11, var10, 6, var11, var10, 9, var9, var9, false);
            this.class_(var1, var5, var11, var10, 14, var11, var10, 15, var9, var9, false);
         }

         this.class_(var1, var5, 1, var10, 0, 1, var10, 0, var9, var9, false);
         this.class_(var1, var5, 6, var10, 0, 9, var10, 0, var9, var9, false);
         this.class_(var1, var5, 14, var10, 0, 14, var10, 0, var9, var9, false);
         this.class_(var1, var5, 1, var10, 15, 14, var10, 15, var9, var9, false);
      }

      this.class_(var1, var5, 6, 3, 6, 9, 6, 9, byte_, byte_, false);
      this.class_(var1, var5, 7, 4, 7, 8, 5, 8, xu_3.rt.continue_(), xu_3.rt.continue_(), false);

      for (byte var13 = 3; var13 <= 6; var13 += 3) {
         for (byte var14 = 6; var14 <= 9; var14 += 3) {
            this.class_(var1, throws_, var14, var13, 6, var5);
            this.class_(var1, throws_, var14, var13, 9, var5);
         }
      }

      this.class_(var1, var5, 5, 1, 6, 5, 2, 6, break_, break_, false);
      this.class_(var1, var5, 5, 1, 9, 5, 2, 9, break_, break_, false);
      this.class_(var1, var5, 10, 1, 6, 10, 2, 6, break_, break_, false);
      this.class_(var1, var5, 10, 1, 9, 10, 2, 9, break_, break_, false);
      this.class_(var1, var5, 6, 1, 5, 6, 2, 5, break_, break_, false);
      this.class_(var1, var5, 9, 1, 5, 9, 2, 5, break_, break_, false);
      this.class_(var1, var5, 6, 1, 10, 6, 2, 10, break_, break_, false);
      this.class_(var1, var5, 9, 1, 10, 9, 2, 10, break_, break_, false);
      this.class_(var1, var5, 5, 2, 5, 5, 6, 5, break_, break_, false);
      this.class_(var1, var5, 5, 2, 10, 5, 6, 10, break_, break_, false);
      this.class_(var1, var5, 10, 2, 5, 10, 6, 5, break_, break_, false);
      this.class_(var1, var5, 10, 2, 10, 10, 6, 10, break_, break_, false);
      this.class_(var1, var5, 5, 7, 1, 5, 7, 6, break_, break_, false);
      this.class_(var1, var5, 10, 7, 1, 10, 7, 6, break_, break_, false);
      this.class_(var1, var5, 5, 7, 9, 5, 7, 14, break_, break_, false);
      this.class_(var1, var5, 10, 7, 9, 10, 7, 14, break_, break_, false);
      this.class_(var1, var5, 1, 7, 5, 6, 7, 5, break_, break_, false);
      this.class_(var1, var5, 1, 7, 10, 6, 7, 10, break_, break_, false);
      this.class_(var1, var5, 9, 7, 5, 14, 7, 5, break_, break_, false);
      this.class_(var1, var5, 9, 7, 10, 14, 7, 10, break_, break_, false);
      this.class_(var1, var5, 2, 1, 2, 2, 1, 3, break_, break_, false);
      this.class_(var1, var5, 3, 1, 2, 3, 1, 2, break_, break_, false);
      this.class_(var1, var5, 13, 1, 2, 13, 1, 3, break_, break_, false);
      this.class_(var1, var5, 12, 1, 2, 12, 1, 2, break_, break_, false);
      this.class_(var1, var5, 2, 1, 12, 2, 1, 13, break_, break_, false);
      this.class_(var1, var5, 3, 1, 13, 3, 1, 13, break_, break_, false);
      this.class_(var1, var5, 13, 1, 12, 13, 1, 13, break_, break_, false);
      this.class_(var1, var5, 12, 1, 13, 12, 1, 13, break_, break_, false);
      return true;
   }
}
