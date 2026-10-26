package celestial;

import java.util.Optional;
import java.util.UUID;

class ruY_2 implements rmb_3<Optional<UUID>> {
   public Optional<UUID> class_(Optional<UUID> var1) {
      return var1;
   }

   public Optional<UUID> class_(ruu_3 var1) {
      return !var1.readBoolean() ? Optional.empty() : Optional.of(var1.private_());
   }

   public void class_(ruu_3 var1, Optional<UUID> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.class_((UUID)var2.get());
      }
   }
}
