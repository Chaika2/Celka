package celestial;

import java.util.List;
import java.util.Optional;

class rgb_3 implements rgS_2 {
   rgb_3(List var1) {
      this.byte_ = var1;
   }

   @Override
   public <T> Optional<T> class_(rgO_2<T> var1) {
      for (rgS_2 var3 : this.byte_) {
         Optional var4 = var3.class_(var1);
         if (var4.isPresent()) {
            return var4;
         }
      }

      return Optional.empty();
   }

   @Override
   public <T> Optional<T> class_(rgM_2<T> var1, rgc_3 var2) {
      for (rgS_2 var4 : this.byte_) {
         Optional var5 = var4.class_(var1, var2);
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }
}
