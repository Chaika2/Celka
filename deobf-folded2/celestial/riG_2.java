package celestial;

import java.util.Random;

public class riG_2 extends riW_2 {
   public riG_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.id_transient, 1, var1, var2, 1, 2, 1);
   }

   public riG_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_transient, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (this.id_native.id_class / 25 > 0) {
         this.id_class(var1, var5, 0, 0, this.id_native.id_byte[rpr_3.DOWN.id_byte()]);
      }

      riz_3 var8 = this.id_native.id_break[rpr_3.UP.id_byte()];
      if (var8.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 1, 8, 1, 6, 8, 6, id_class);
      }

      this.id_class(var1, var5, 0, 4, 0, 0, 4, 7, id_break, id_break, false);
      this.id_class(var1, var5, 7, 4, 0, 7, 4, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 4, 0, 6, 4, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 4, 7, 6, 4, 7, id_break, id_break, false);
      this.id_class(var1, var5, 2, 4, 1, 2, 4, 2, id_break, id_break, false);
      this.id_class(var1, var5, 1, 4, 2, 1, 4, 2, id_break, id_break, false);
      this.id_class(var1, var5, 5, 4, 1, 5, 4, 2, id_break, id_break, false);
      this.id_class(var1, var5, 6, 4, 2, 6, 4, 2, id_break, id_break, false);
      this.id_class(var1, var5, 2, 4, 5, 2, 4, 6, id_break, id_break, false);
      this.id_class(var1, var5, 1, 4, 5, 1, 4, 5, id_break, id_break, false);
      this.id_class(var1, var5, 5, 4, 5, 5, 4, 6, id_break, id_break, false);
      this.id_class(var1, var5, 6, 4, 5, 6, 4, 5, id_break, id_break, false);
      riz_3 var9 = this.id_native;

      for (byte var10 = 1; var10 <= 5; var10 += 4) {
         byte var11 = 0;
         if (var9.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(var1, var5, 2, var10, var11, 2, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 5, var10, var11, 5, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 3, var10 + 2, var11, 4, var10 + 2, var11, id_break, id_break, false);
         } else {
            this.id_class(var1, var5, 0, var10, var11, 7, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 0, var10 + 1, var11, 7, var10 + 1, var11, id_class, id_class, false);
         }

         var11 = 7;
         if (var9.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(var1, var5, 2, var10, var11, 2, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 5, var10, var11, 5, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 3, var10 + 2, var11, 4, var10 + 2, var11, id_break, id_break, false);
         } else {
            this.id_class(var1, var5, 0, var10, var11, 7, var10 + 2, var11, id_break, id_break, false);
            this.id_class(var1, var5, 0, var10 + 1, var11, 7, var10 + 1, var11, id_class, id_class, false);
         }

         byte var12 = 0;
         if (var9.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(var1, var5, var12, var10, 2, var12, var10 + 2, 2, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10, 5, var12, var10 + 2, 5, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10 + 2, 3, var12, var10 + 2, 4, id_break, id_break, false);
         } else {
            this.id_class(var1, var5, var12, var10, 0, var12, var10 + 2, 7, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10 + 1, 0, var12, var10 + 1, 7, id_class, id_class, false);
         }

         var12 = 7;
         if (var9.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(var1, var5, var12, var10, 2, var12, var10 + 2, 2, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10, 5, var12, var10 + 2, 5, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10 + 2, 3, var12, var10 + 2, 4, id_break, id_break, false);
         } else {
            this.id_class(var1, var5, var12, var10, 0, var12, var10 + 2, 7, id_break, id_break, false);
            this.id_class(var1, var5, var12, var10 + 1, 0, var12, var10 + 1, 7, id_class, id_class, false);
         }

         var9 = var8;
      }

      return true;
   }
}
