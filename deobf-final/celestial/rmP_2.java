package celestial;

import java.util.Optional;

class rmP_2 implements rmb_3<Optional<rgP_2>> {
   public Optional<rgP_2> class_(Optional<rgP_2> var1) {
      return var1;
   }

   public Optional<rgP_2> class_(ruu_3 var1) {
      return var1.readBoolean() ? Optional.of(var1.throws_()) : Optional.empty();
   }

   public void class_(ruu_3 var1, Optional<rgP_2> var2) {
      if (var2.isPresent()) {
         var1.writeBoolean(true);
         var1.class_((rgP_2)var2.get());
      } else {
         var1.writeBoolean(false);
      }
   }
}
