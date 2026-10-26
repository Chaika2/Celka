package celestial;

import java.util.Optional;

class rVK implements rgS_2 {
   final String byte_;
   final rgc_3 protected_;

   public rVK(String var1, rgc_3 var2) {
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
