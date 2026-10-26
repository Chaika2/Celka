package celestial;

import java.util.Random;

public class ric_3 extends riW_2 {
   private int id_int;

   public ric_3(rpr_3 var1, rfi_3 var2, int var3) {
      super(raF_2.S, var1, var2);
      this.id_int = var3 & 1;
   }

   public ric_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.S, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_int == 0) {
         for (int var8 = 0; var8 < 4; var8++) {
            this.id_class(var1, var5, 10 - var8, 3 - var8, 20 - var8, 12 + var8, 3 - var8, 20, id_break, id_break, false);
         }

         this.id_class(var1, var5, 7, 0, 6, 15, 0, 16, id_break, id_break, false);
         this.id_class(var1, var5, 6, 0, 6, 6, 3, 20, id_break, id_break, false);
         this.id_class(var1, var5, 16, 0, 6, 16, 3, 20, id_break, id_break, false);
         this.id_class(var1, var5, 7, 1, 7, 7, 1, 20, id_break, id_break, false);
         this.id_class(var1, var5, 15, 1, 7, 15, 1, 20, id_break, id_break, false);
         this.id_class(var1, var5, 7, 1, 6, 9, 3, 6, id_break, id_break, false);
         this.id_class(var1, var5, 13, 1, 6, 15, 3, 6, id_break, id_break, false);
         this.id_class(var1, var5, 8, 1, 7, 9, 1, 7, id_break, id_break, false);
         this.id_class(var1, var5, 13, 1, 7, 14, 1, 7, id_break, id_break, false);
         this.id_class(var1, var5, 9, 0, 5, 13, 0, 5, id_break, id_break, false);
         this.id_class(var1, var5, 10, 0, 7, 12, 0, 7, id_byte, id_byte, false);
         this.id_class(var1, var5, 8, 0, 10, 8, 0, 12, id_byte, id_byte, false);
         this.id_class(var1, var5, 14, 0, 10, 14, 0, 12, id_byte, id_byte, false);

         for (byte var12 = 18; var12 >= 7; var12 -= 3) {
            this.id_class(var1, id_throws, 6, 3, var12, var5);
            this.id_class(var1, id_throws, 16, 3, var12, var5);
         }

         this.id_class(var1, id_throws, 10, 0, 10, var5);
         this.id_class(var1, id_throws, 12, 0, 10, var5);
         this.id_class(var1, id_throws, 10, 0, 12, var5);
         this.id_class(var1, id_throws, 12, 0, 12, var5);
         this.id_class(var1, id_throws, 8, 3, 6, var5);
         this.id_class(var1, id_throws, 14, 3, 6, var5);
         this.id_class(var1, id_break, 4, 2, 4, var5);
         this.id_class(var1, id_throws, 4, 1, 4, var5);
         this.id_class(var1, id_break, 4, 0, 4, var5);
         this.id_class(var1, id_break, 18, 2, 4, var5);
         this.id_class(var1, id_throws, 18, 1, 4, var5);
         this.id_class(var1, id_break, 18, 0, 4, var5);
         this.id_class(var1, id_break, 4, 2, 18, var5);
         this.id_class(var1, id_throws, 4, 1, 18, var5);
         this.id_class(var1, id_break, 4, 0, 18, var5);
         this.id_class(var1, id_break, 18, 2, 18, var5);
         this.id_class(var1, id_throws, 18, 1, 18, var5);
         this.id_class(var1, id_break, 18, 0, 18, var5);
         this.id_class(var1, id_break, 9, 7, 20, var5);
         this.id_class(var1, id_break, 13, 7, 20, var5);
         this.id_class(var1, var5, 6, 0, 21, 7, 4, 21, id_break, id_break, false);
         this.id_class(var1, var5, 15, 0, 21, 16, 4, 21, id_break, id_break, false);
         this.id_class(var1, var5, 11, 2, 16);
      } else if (this.id_int == 1) {
         this.id_class(var1, var5, 9, 3, 18, 13, 3, 20, id_break, id_break, false);
         this.id_class(var1, var5, 9, 0, 18, 9, 2, 18, id_break, id_break, false);
         this.id_class(var1, var5, 13, 0, 18, 13, 2, 18, id_break, id_break, false);
         byte var13 = 9;
         byte var9 = 20;
         byte var10 = 5;

         for (int var11 = 0; var11 < 2; var11++) {
            this.id_class(var1, id_break, var13, 6, 20, var5);
            this.id_class(var1, id_throws, var13, 5, 20, var5);
            this.id_class(var1, id_break, var13, 4, 20, var5);
            var13 = 13;
         }

         this.id_class(var1, var5, 7, 3, 7, 15, 3, 14, id_break, id_break, false);
         var13 = 10;

         for (int var16 = 0; var16 < 2; var16++) {
            this.id_class(var1, var5, var13, 0, 10, var13, 6, 10, id_break, id_break, false);
            this.id_class(var1, var5, var13, 0, 12, var13, 6, 12, id_break, id_break, false);
            this.id_class(var1, id_throws, var13, 0, 10, var5);
            this.id_class(var1, id_throws, var13, 0, 12, var5);
            this.id_class(var1, id_throws, var13, 4, 10, var5);
            this.id_class(var1, id_throws, var13, 4, 12, var5);
            var13 = 12;
         }

         var13 = 8;

         for (int var17 = 0; var17 < 2; var17++) {
            this.id_class(var1, var5, var13, 0, 7, var13, 2, 7, id_break, id_break, false);
            this.id_class(var1, var5, var13, 0, 14, var13, 2, 14, id_break, id_break, false);
            var13 = 14;
         }

         this.id_class(var1, var5, 8, 3, 8, 8, 3, 13, id_byte, id_byte, false);
         this.id_class(var1, var5, 14, 3, 8, 14, 3, 13, id_byte, id_byte, false);
         this.id_class(var1, var5, 11, 5, 13);
      }

      return true;
   }
}
