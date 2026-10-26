package celestial;

import java.util.List;
import java.util.Optional;

class rgb_3 implements rgS_2 {
   rgb_3(List var1) {
      this.id_byte = var1;
   }

   @Override
   public <T> Optional<T> id_class(rgO_2<T> var1) {
      for (rgS_2 var3 : this.id_byte) {
         Optional var4 = var3.id_class(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> id_class(rgM_2<T> var1, rgc_3 var2) {
      for (rgS_2 var4 : this.id_byte) {
         Optional var5 = var4.id_class(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
