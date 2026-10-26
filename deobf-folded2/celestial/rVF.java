package celestial;

import com.mojang.serialization.Lifecycle;
import java.util.OptionalInt;

public abstract class rVF<T> extends rVL<T> {
   public rVF(rqM_2<? extends rVL<T>> var1, Lifecycle var2) {
      super(var1, var2);
   }

   public abstract <V extends T> V id_class(OptionalInt var1, rqM_2<T> var2, V var3, Lifecycle var4);

   public abstract <V extends T> V id_class(rqM_2<T> var1, V var2, Lifecycle var3);

   public abstract <V extends T> V id_class(int var1, rqM_2<T> var2, V var3, Lifecycle var4);
}
