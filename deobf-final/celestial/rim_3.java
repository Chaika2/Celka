package celestial;

import java.util.Random;

class rim_3 implements riJ_2 {
   @Override
   public boolean class_(riz_3 var1) {
      if (var1.byte_[rpr_3.EAST.byte_()]
         && !var1.break_[rpr_3.EAST.byte_()].protected_
         && var1.byte_[rpr_3.UP.byte_()]
         && !var1.break_[rpr_3.UP.byte_()].protected_) {
         riz_3 var2 = var1.break_[rpr_3.EAST.byte_()];
         return var2.byte_[rpr_3.UP.byte_()] && !var2.break_[rpr_3.UP.byte_()].protected_;
      } else {
         return false;
      }
   }

   @Override
   public riW_2 class_(rpr_3 var1, riz_3 var2, Random var3) {
      var2.protected_ = true;
      var2.break_[rpr_3.EAST.byte_()].protected_ = true;
      var2.break_[rpr_3.UP.byte_()].protected_ = true;
      var2.break_[rpr_3.EAST.byte_()].break_[rpr_3.UP.byte_()].protected_ = true;
      return new riE_2(var1, var2);
   }
}
