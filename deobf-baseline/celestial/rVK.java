package celestial;

import java.util.Optional;

class rVK implements rgS_2 {
   final String id_byte;
   final rgc_3 id_protected;

   public rVK(String var1, rgc_3 var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   public <T> Optional<T> id_class(rgO_2<T> var1) {
      return var1.accept(this.id_byte);
   }

   @Override
   public <T> Optional<T> id_class(rgM_2<T> var1, rgc_3 var2) {
      return var1.accept(this.id_protected.id_class(var2), this.id_byte);
   }
}
