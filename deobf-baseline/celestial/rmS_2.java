package celestial;

import java.util.Optional;

class rmS_2 implements rmb_3<Optional<xc_3>> {
   public Optional<xc_3> id_class(Optional<xc_3> var1) {
      return var1;
   }

   public Optional<xc_3> id_class(ruu_3 var1) {
      int var2 = var1.id_case();
      return var2 == 0 ? Optional.empty() : Optional.of(xd_3.id_class(var2));
   }

   public void id_class(ruu_3 var1, Optional<xc_3> var2) {
      if (var2.isPresent()) {
         var1.id_protected(xd_3.id_finally((xc_3)var2.get()));
      } else {
         var1.id_protected(0);
      }
   }
}
