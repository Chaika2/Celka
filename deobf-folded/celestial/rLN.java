package celestial;

import com.mojang.serialization.Codec;
import java.util.function.Function;

class rLN extends rLz_1<T> {
   rLN(boolean var1, rLd_1 var2, Function var3) {
      super(var1, var2);
      this.id_class = var3;
   }

   @Override
   public Codec<T> id_break() {
      return (Codec<T>)this.id_class.apply(this);
   }
}
