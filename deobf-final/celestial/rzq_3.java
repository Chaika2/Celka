package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.function.Function;

public class rzq_3<E, T extends rzH_2<E>> {
   private final rVL<T> class_;
   private final String break_;
   private final String byte_;
   private final Function<E, T> protected_;
   private Pair<T, rzp_3<? extends E>> throws_;

   rzq_3(rVL<T> var1, String var2, String var3, Function<E, T> var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public Object class_() {
      return new rzT_2<>(this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }
}
