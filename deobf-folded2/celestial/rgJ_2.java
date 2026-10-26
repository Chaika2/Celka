package celestial;

import java.util.Map;
import java.util.Optional;

class rgJ_2 extends rgX_2 {
   rgJ_2(Map var1) {
      this.id_class = var1;
   }

   @Override
   public rpl_3 id_class(rgS_2 var1) {
      return var1x -> var1.id_class((var1xx, var2) -> rgL_2.id_byte(var2, var1xx, var1x) ? Optional.empty() : rgS_2.id_class, rgc_3.id_class).isPresent();
   }

   @Override
   public boolean id_class() {
      return false;
   }

   @Override
   public String id_class(String var1) {
      return this.id_class.getOrDefault(var1, var1);
   }

   @Override
   public boolean id_break(String var1) {
      return this.id_class.containsKey(var1);
   }
}
