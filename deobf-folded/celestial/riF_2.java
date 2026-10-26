package celestial;

import java.util.Random;

class riF_2 implements riJ_2 {
   @Override
   public boolean id_class(riz_3 var1) {
      return var1.id_byte[rpr_3.NORTH.id_byte()] && !var1.id_break[rpr_3.NORTH.id_byte()].id_protected;
   }

   @Override
   public riW_2 id_class(rpr_3 var1, riz_3 var2, Random var3) {
      riz_3 var4 = var2;
      if (!var2.id_byte[rpr_3.NORTH.id_byte()] || var2.id_break[rpr_3.NORTH.id_byte()].id_protected) {
         var4 = var2.id_break[rpr_3.SOUTH.id_byte()];
      }

      var4.id_protected = true;
      var4.id_break[rpr_3.NORTH.id_byte()].id_protected = true;
      return new riM_2(var1, var4);
   }
}
