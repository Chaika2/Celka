package celestial;

import java.util.Optional;

class rug_3 implements rmb_3<Optional<rfH_2>> {
   public Optional<rfH_2> id_class(Optional<rfH_2> var1) {
      return var1;
   }

   public Optional<rfH_2> id_class(ruu_3 var1) {
      return !var1.readBoolean() ? Optional.empty() : Optional.of(var1.id_byte());
   }

   public void id_class(ruu_3 var1, Optional<rfH_2> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.id_class((rfH_2)var2.get());
      }
   }
}
