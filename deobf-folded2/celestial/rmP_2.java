package celestial;

import java.util.Optional;

class rmP_2 implements rmb_3<Optional<rgP_2>> {
   public Optional<rgP_2> id_class(Optional<rgP_2> var1) {
      return var1;
   }

   public Optional<rgP_2> id_class(ruu_3 var1) {
      return var1.readBoolean() ? Optional.of(var1.id_throws()) : Optional.empty();
   }

   public void id_class(ruu_3 var1, Optional<rgP_2> var2) {
      if (var2.isPresent()) {
         var1.writeBoolean(true);
         var1.id_class((rgP_2)var2.get());
      } else {
         var1.writeBoolean(false);
      }
   }
}
