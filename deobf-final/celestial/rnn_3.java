package celestial;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class rnn_3<V> implements Supplier<V> {
   private final String break_;
   private final V byte_;
   private final Function<V, String> protected_;

   rnn_3(String var1, V var2, Function<V, String> var3, Function var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = (V)var3;
      this.protected_ = var4;
   }

   @Override
   public V get() {
      return this.byte_;
   }

   public T class_(rVm_1 var1, V var2) {
      Properties var3 = this.class_.class_();
      var3.put(this.break_, this.protected_.apply((V)var2));
      return (T)this.class_.class_(var1, var3);
   }
}
