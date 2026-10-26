package celestial;

import java.util.Random;

class riX_2 implements riJ_2 {
   @Override
   public boolean id_class(riz_3 var1) {
      return !var1.id_byte[rpr_3.WEST.id_byte()]
         && !var1.id_byte[rpr_3.EAST.id_byte()]
         && !var1.id_byte[rpr_3.NORTH.id_byte()]
         && !var1.id_byte[rpr_3.SOUTH.id_byte()]
         && !var1.id_byte[rpr_3.UP.id_byte()];
   }

   @Override
   public riW_2 id_class(rpr_3 var1, riz_3 var2, Random var3) {
      var2.id_protected = true;
      return new riN_2(var1, var2);
   }
}
