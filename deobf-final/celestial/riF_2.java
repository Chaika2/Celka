package celestial;

import java.util.Random;

class riF_2 implements riJ_2 {
   @Override
   public boolean class_(riz_3 var1) {
      return var1.byte_[rpr_3.NORTH.byte_()] && !var1.break_[rpr_3.NORTH.byte_()].protected_;
   }

   @Override
   public riW_2 class_(rpr_3 var1, riz_3 var2, Random var3) {
      riz_3 var4 = var2;
      if (!var2.byte_[rpr_3.NORTH.byte_()] || var2.break_[rpr_3.NORTH.byte_()].protected_) {
         var4 = var2.break_[rpr_3.SOUTH.byte_()];
      }

      var4.protected_ = true;
      var4.break_[rpr_3.NORTH.byte_()].protected_ = true;
      return new riM_2(var1, var4);
   }
}
