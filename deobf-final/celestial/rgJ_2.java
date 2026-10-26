package celestial;

import java.util.Map;
import java.util.Optional;

class rgJ_2 extends rgX_2 {
   rgJ_2(Map var1) {
      this.class_ = var1;
   }

   @Override
   public rpl_3 class_(rgS_2 var1) {
      return var1x -> var1.class_((var1xx, var2) -> rgL_2.byte_(var2, var1xx, var1x) ? Optional.empty() : rgS_2.class_, rgc_3.class_).isPresent();
   }

   @Override
   public boolean class_() {
      return false;
   }

   @Override
   public String class_(String var1) {
      return this.class_.getOrDefault(var1, var1);
   }

   @Override
   public boolean break_(String var1) {
      return this.class_.containsKey(var1);
   }
}
