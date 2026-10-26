package celestial;

import java.util.OptionalInt;

class ruD_2 implements rmb_3<OptionalInt> {
   public OptionalInt class_(OptionalInt var1) {
      return var1;
   }

   public OptionalInt class_(ruu_3 var1) {
      int var2 = var1.case_();
      return var2 == 0 ? OptionalInt.empty() : OptionalInt.of(var2 - 1);
   }

   public void class_(ruu_3 var1, OptionalInt var2) {
      var1.protected_(var2.orElse(-1) + 1);
   }
}
