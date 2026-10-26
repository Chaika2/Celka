package celestial;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class rnn_3<V> implements Supplier<V> {
   private final String id_break;
   private final V id_byte;
   private final Function<V, String> id_protected;

   rnn_3(String var1, V var2, Function<V, String> var3, Function var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = (V)var3;
      this.id_protected = var4;
   }

   @Override
   public V get() {
      return this.id_byte;
   }

   public T id_class(rVm_1 var1, V var2) {
      Properties var3 = this.id_class.id_class();
      var3.put(this.id_break, this.id_protected.apply((V)var2));
      return (T)this.id_class.id_class(var1, var3);
   }
}
