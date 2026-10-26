package celestial;

import java.util.Random;

public class riO_2 extends riW_2 {
   public riO_2(rpr_3 var1, riz_3 var2) {
      super(raF_2.id_switch, 1, var1, var2, 1, 1, 1);
   }

   public riO_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_switch, var2);
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_class(var1, var5, 0, 3, 0, 2, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 5, 3, 0, 7, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 2, 0, 1, 2, 7, id_break, id_break, false);
      this.id_class(var1, var5, 6, 2, 0, 7, 2, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 7, 1, 0, 7, 1, 7, id_break, id_break, false);
      this.id_class(var1, var5, 0, 1, 7, 7, 3, 7, id_break, id_break, false);
      this.id_class(var1, var5, 1, 1, 0, 2, 3, 0, id_break, id_break, false);
      this.id_class(var1, var5, 5, 1, 0, 6, 3, 0, id_break, id_break, false);
      if (this.id_native.id_byte[rpr_3.NORTH.id_byte()]) {
         this.id_class(var1, var5, 3, 1, 7, 4, 2, 7);
      }

      if (this.id_native.id_byte[rpr_3.WEST.id_byte()]) {
         this.id_class(var1, var5, 0, 1, 3, 1, 2, 4);
      }

      if (this.id_native.id_byte[rpr_3.EAST.id_byte()]) {
         this.id_class(var1, var5, 6, 1, 3, 7, 2, 4);
      }

      return true;
   }
}
