package celestial;

import java.util.Optional;

class rgE_2 implements rgS_2 {
   rgE_2(String var1) {
      this.byte_ = var1;
   }

   @Override
   public <T> Optional<T> class_(rgO_2<T> var1) {
      return var1.accept(this.byte_);
   }

   @Override
   public <T> Optional<T> class_(rgM_2<T> var1, rgc_3 var2) {
      return var1.accept(var2, this.byte_);
   }
}
