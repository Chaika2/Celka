package celestial;

import java.util.Random;

public class ris_3 extends riW_2 {
   public ris_3(rpr_3 var1, riz_3 var2) {
      super(raF_2.id_strictfp, 1, var1, var2, 2, 1, 1);
   }

   public ris_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_strictfp, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      riz_3 var8 = this.id_native.id_break[rpr_3.EAST.id_byte()];
      riz_3 var9 = this.id_native;
      if (this.id_native.id_class / 25 > 0) {
         this.id_class(var1, var5, 8, 0, var8.id_byte[rpr_3.DOWN.id_byte()]);
         this.id_class(var1, var5, 0, 0, var9.id_byte[rpr_3.DOWN.id_byte()]);
      }

      if (var9.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 1, 4, 1, 7, 4, 6, id_class);
      }

      if (var8.id_break[rpr_3.UP.id_byte()] == null) {
         this.id_class(var1, var5, 8, 4, 1, 14, 4, 6, id_class);
      }

      this.id_class(var1, var5, 0, 3, 0, 0, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 15, 3, 0, 15, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 3, 0, 15, 3, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 3, 7, 14, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 2, 0, 0, 2, 7, id_class, id_class, false);
      this.id_class(var1, var5, 15, 2, 0, 15, 2, 7, id_class, id_class, false);
      this.id_class(var1, var5, 1, 2, 0, 15, 2, 0, id_class, id_class, false);
      this.id_class(var1, var5, 1, 2, 7, 14, 2, 7, id_class, id_class, false);
      this.id_class(var1, var5, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 15, 1, 0, 15, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 1, 0, 15, 1, 0, id_break, id_break, false);
      this.id_class(var1, var5, 1, 1, 7, 14, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 5, 1, 0, 10, 1, 4, id_break, id_break, false);
      this.id_class(var1, var5, 6, 2, 0, 9, 2, 3, id_class, id_class, false);
      this.id_class(var1, var5, 5, 3, 0, 10, 3, 4, id_break, id_break, false);
      this.id_class(var1, id_throws, 6, 2, 3, var5);
      this.id_class(var1, id_throws, 9, 2, 3, var5);
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

      return true;
   }
}
