package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.function.Function;

public class rzq_3<E, T extends rzH_2<E>> {
   private final rVL<T> id_class;
   private final String id_break;
   private final String id_byte;
   private final Function<E, T> id_protected;
   private Pair<T, rzp_3<? extends E>> id_throws;

   rzq_3(rVL<T> var1, String var2, String var3, Function<E, T> var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public Object id_class() {
      return new rzT_2<>(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }
}
