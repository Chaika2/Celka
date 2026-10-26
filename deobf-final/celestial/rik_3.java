package celestial;

import java.util.Random;

public class rik_3 extends riW_2 {
   public rik_3(rpr_3 var1, rfi_3 var2) {
      super(raF_2.r, var1, var2);
   }

   public rik_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.r, var2);
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.class_(var1, var5, 2, -1, 2, 11, -1, 11, break_, break_, false);
      this.class_(var1, var5, 0, -1, 0, 1, -1, 11, class_, class_, false);
      this.class_(var1, var5, 12, -1, 0, 13, -1, 11, class_, class_, false);
      this.class_(var1, var5, 2, -1, 0, 11, -1, 1, class_, class_, false);
      this.class_(var1, var5, 2, -1, 12, 11, -1, 13, class_, class_, false);
      this.class_(var1, var5, 0, 0, 0, 0, 0, 13, break_, break_, false);
      this.class_(var1, var5, 13, 0, 0, 13, 0, 13, break_, break_, false);
      this.class_(var1, var5, 1, 0, 0, 12, 0, 0, break_, break_, false);
      this.class_(var1, var5, 1, 0, 13, 12, 0, 13, break_, break_, false);

      for (byte var8 = 2; var8 <= 11; var8 += 3) {
         this.class_(var1, throws_, 0, 0, var8, var5);
         this.class_(var1, throws_, 13, 0, var8, var5);
         this.class_(var1, throws_, var8, 0, 0, var5);
      }

      this.class_(var1, var5, 2, 0, 3, 4, 0, 9, break_, break_, false);
      this.class_(var1, var5, 9, 0, 3, 11, 0, 9, break_, break_, false);
      this.class_(var1, var5, 4, 0, 9, 9, 0, 11, break_, break_, false);
      this.class_(var1, break_, 5, 0, 8, var5);
      this.class_(var1, break_, 8, 0, 8, var5);
      this.class_(var1, break_, 10, 0, 10, var5);
      this.class_(var1, break_, 3, 0, 10, var5);
      this.class_(var1, var5, 3, 0, 3, 3, 0, 7, byte_, byte_, false);
      this.class_(var1, var5, 10, 0, 3, 10, 0, 7, byte_, byte_, false);
      this.class_(var1, var5, 6, 0, 10, 7, 0, 10, byte_, byte_, false);
      byte var11 = 3;

      for (int var9 = 0; var9 < 2; var9++) {
         for (byte var10 = 2; var10 <= 8; var10 += 3) {
            this.class_(var1, var5, var11, 0, var10, var11, 2, var10, break_, break_, false);
         }

         var11 = 10;
      }

      this.class_(var1, var5, 5, 0, 10, 5, 2, 10, break_, break_, false);
      this.class_(var1, var5, 8, 0, 10, 8, 2, 10, break_, break_, false);
      this.class_(var1, var5, 6, -1, 7, 7, -1, 8, byte_, byte_, false);
      this.class_(var1, var5, 6, -1, 3, 7, -1, 4);
      this.class_(var1, var5, 6, 1, 6);
      return true;
   }
}
