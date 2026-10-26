package celestial;

import java.util.Random;

class riX_2 implements riJ_2 {
   @Override
   public boolean class_(riz_3 var1) {
      return !var1.byte_[rpr_3.WEST.byte_()]
         && !var1.byte_[rpr_3.EAST.byte_()]
         && !var1.byte_[rpr_3.NORTH.byte_()]
         && !var1.byte_[rpr_3.SOUTH.byte_()]
         && !var1.byte_[rpr_3.UP.byte_()];
   }

   @Override
   public riW_2 class_(rpr_3 var1, riz_3 var2, Random var3) {
      var2.protected_ = true;
      return new riN_2(var1, var2);
   }
}
