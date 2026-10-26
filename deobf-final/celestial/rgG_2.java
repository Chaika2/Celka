package celestial;

import java.util.Optional;

class rgG_2 implements rgS_2 {
   rgG_2(String var1, rgc_3 var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   public <T> Optional<T> class_(rgO_2<T> var1) {
      return var1.accept(this.byte_);
   }

   @Override
   public <T> Optional<T> class_(rgM_2<T> var1, rgc_3 var2) {
      return var1.accept(this.protected_.class_(var2), this.byte_);
   }
}
