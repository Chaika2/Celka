package celestial;

import java.util.Optional;

class rgG_2 implements rgS_2 {
   rgG_2(String var1, rgc_3 var2) {
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
