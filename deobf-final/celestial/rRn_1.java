package celestial;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class rRn_1<T extends rRC<T>> {
   private final Supplier<ArgumentType<?>> class_;
   private final Function<rRn_1<T>, T> break_;
   final BiConsumer<rnW_2, T> byte_;
   private final rRv_1<T> protected_;

   rRn_1(Supplier<ArgumentType<?>> var1, Function<rRn_1<T>, T> var2, BiConsumer<rnW_2, T> var3, rRv_1<T> var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public void class_(rRF var1, rRA<T> var2) {
      this.protected_.call(var1, var2, this);
   }

   public T class_() {
      return this.break_.apply(this);
   }

   public RequiredArgumentBuilder<gy_3, ?> class_(String var1) {
      return gp_3.class_(var1, (ArgumentType<T>)this.class_.get());
   }
}
