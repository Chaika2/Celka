package celestial;

import com.mojang.serialization.Codec;
import java.util.function.Function;

class rLN extends rLz_1<T> {
   rLN(boolean var1, rLd_1 var2, Function var3) {
      super(var1, var2);
      this.class_ = var3;
   }

   @Override
   public Codec<T> break_() {
      return (Codec<T>)this.class_.apply(this);
   }
}
