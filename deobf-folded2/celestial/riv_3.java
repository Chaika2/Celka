package celestial;

import java.util.Random;

class riv_3 implements riJ_2 {
   @Override
   public boolean id_class(riz_3 var1) {
      if (var1.id_byte[rpr_3.NORTH.id_byte()]
         && !var1.id_break[rpr_3.NORTH.id_byte()].id_protected
         && var1.id_byte[rpr_3.UP.id_byte()]
         && !var1.id_break[rpr_3.UP.id_byte()].id_protected) {
         riz_3 var2 = var1.id_break[rpr_3.NORTH.id_byte()];
         return var2.id_byte[rpr_3.UP.id_byte()] && !var2.id_break[rpr_3.UP.id_byte()].id_protected;
      } else {
         return false;
      }
   }

   @Override
   public riW_2 id_class(rpr_3 var1, riz_3 var2, Random var3) {
      var2.id_protected = true;
      var2.id_break[rpr_3.NORTH.id_byte()].id_protected = true;
      var2.id_break[rpr_3.UP.id_byte()].id_protected = true;
      var2.id_break[rpr_3.NORTH.id_byte()].id_break[rpr_3.UP.id_byte()].id_protected = true;
      return new rib_3(var1, var2);
   }
}
