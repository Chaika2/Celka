package celestial;

import java.util.Optional;

class rmS_2 implements rmb_3<Optional<xc_3>> {
   public Optional<xc_3> class_(Optional<xc_3> var1) {
      return var1;
   }

   public Optional<xc_3> class_(ruu_3 var1) {
      int var2 = var1.case_();
      return var2 == 0 ? Optional.empty() : Optional.of(xd_3.class_(var2));
   }

   public void class_(ruu_3 var1, Optional<xc_3> var2) {
      if (var2.isPresent()) {
         var1.protected_(xd_3.finally_((xc_3)var2.get()));
      } else {
         var1.protected_(0);
      }
   }
}
