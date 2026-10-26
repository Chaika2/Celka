package celestial;

import java.util.OptionalInt;

class ruD_2 implements rmb_3<OptionalInt> {
   public OptionalInt id_class(OptionalInt var1) {
      return var1;
   }

   public OptionalInt id_class(ruu_3 var1) {
      int var2 = var1.id_case();
      return var2 == 0 ? OptionalInt.empty() : OptionalInt.of(var2 - 1);
   }

   public void id_class(ruu_3 var1, OptionalInt var2) {
      var1.id_protected(var2.orElse(-1) + 1);
   }
}
