package celestial;

import java.util.Random;

public class riE_2 extends riW_2 {
   public riE_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.id_boolean, 1, var1, var2, 2, 2, 1);
   }

   public riE_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_boolean, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.id_native.id_break[rpr_3.EAST.id_byte()];
      riz_3 var9 = this.id_native;
      riz_3 var10 = var9.id_break[rpr_3.UP.id_byte()];
      riz_3 var11 = var8.id_break[rpr_3.UP.id_byte()];
      if (this.id_native.id_class / 25 > 0) {
         this.id_class(var1, var5, 8, 0, var8.id_byte[rpr_3.DOWN.id_byte()]);
         this.id_class(var1, var5, 0, 0, var9.id_byte[rpr_3.DOWN.id_byte()]);
      }

      if (var10.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 1, 8, 1, 7, 8, 6, id_class);
      }

      if (var11.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 8, 8, 1, 14, 8, 6, id_class);
      }

      for (int var12 = 1; var12 <= 7; var12++) {
         xc_3 var13 = id_break;
         if (var12 == 2 || var12 == 6) {
            var13 = id_class;
         }

         this.id_class(var1, var5, 0, var12, 0, 0, var12, 7, var13, var13, false);
         this.id_class(var1, var5, 15, var12, 0, 15, var12, 7, var13, var13, false);
         this.id_class(var1, var5, 1, var12, 0, 15, var12, 0, var13, var13, false);
         this.id_class(var1, var5, 1, var12, 7, 14, var12, 7, var13, var13, false);
      }

      this.id_class(var1, var5, 2, 1, 3, 2, 7, 4, id_break, id_break, false);
      this.id_class(var1, var5, 3, 1, 2, 4, 7, 2, id_break, id_break, false);
      this.id_class(var1, var5, 3, 1, 5, 4, 7, 5, id_break, id_break, false);
      this.id_class(var1, var5, 13, 1, 3, 13, 7, 4, id_break, id_break, false);
      this.id_class(var1, var5, 11, 1, 2, 12, 7, 2, id_break, id_break, false);
      this.id_class(var1, var5, 11, 1, 5, 12, 7, 5, id_break, id_break, false);
      this.id_class(var1, var5, 5, 1, 3, 5, 3, 4, id_break, id_break, false);
      this.id_class(var1, var5, 10, 1, 3, 10, 3, 4, id_break, id_break, false);
      this.id_class(var1, var5, 5, 7, 2, 10, 7, 5, id_break, id_break, false);
      this.id_class(var1, var5, 5, 5, 2, 5, 7, 2, id_break, id_break, false);
      this.id_class(var1, var5, 10, 5, 2, 10, 7, 2, id_break, id_break, false);
      this.id_class(var1, var5, 5, 5, 5, 5, 7, 5, id_break, id_break, false);
      this.id_class(var1, var5, 10, 5, 5, 10, 7, 5, id_break, id_break, false);
      this.id_class(var1, id_break, 6, 6, 2, var5);
      this.id_class(var1, id_break, 9, 6, 2, var5);
      this.id_class(var1, id_break, 6, 6, 5, var5);
      this.id_class(var1, id_break, 9, 6, 5, var5);
      this.id_class(var1, var5, 5, 4, 3, 6, 4, 4, id_break, id_break, false);
      this.id_class(var1, var5, 9, 4, 3, 10, 4, 4, id_break, id_break, false);
      this.id_class(var1, id_throws, 5, 4, 2, var5);
      this.id_class(var1, id_throws, 5, 4, 5, var5);
      this.id_class(var1, id_throws, 10, 4, 2, var5);
      this.id_class(var1, id_throws, 10, 4, 5, var5);
      if (var9.id_byte[rpr_3.SOUTH.id_byte()]) {
         this.id_class(var1, var5, 3, 1, 0, 4, 2, 0);
      }

      if (var9.id_byte[rpr_3.NORTH.id_byte()]) {
         this.id_class(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (var9.id_byte[rpr_3.WEST.id_byte()]) {
         this.id_class(var1, var5, 0, 1, 3, 0, 2, 4);
      }

      if (var8.id_byte[rpr_3.SOUTH.id_byte()]) {
         this.id_class(var1, var5, 11, 1, 0, 12, 2, 0);
      }

      if (var8.id_byte[rpr_3.NORTH.id_byte()]) {
         this.id_class(var1, var5, 11, 1, 7, 12, 2, 7);
      }

      if (var8.id_byte[rpr_3.EAST.id_byte()]) {
         this.id_class(var1, var5, 15, 1, 3, 15, 2, 4);
      }

      if (var10.id_byte[rpr_3.SOUTH.id_byte()]) {
         this.id_class(var1, var5, 3, 5, 0, 4, 6, 0);
      }

      if (var10.id_byte[rpr_3.NORTH.id_byte()]) {
         this.id_class(var1, var5, 3, 5, 7, 4, 6, 7);
      }

      if (var10.id_byte[rpr_3.WEST.id_byte()]) {
         this.id_class(var1, var5, 0, 5, 3, 0, 6, 4);
      }

      if (var11.id_byte[rpr_3.SOUTH.id_byte()]) {
         this.id_class(var1, var5, 11, 5, 0, 12, 6, 0);
      }

      if (var11.id_byte[rpr_3.NORTH.id_byte()]) {
         this.id_class(var1, var5, 11, 5, 7, 12, 6, 7);
      }

      if (var11.id_byte[rpr_3.EAST.id_byte()]) {
         this.id_class(var1, var5, 15, 5, 3, 15, 6, 4);
      }

      return true;
   }
}
