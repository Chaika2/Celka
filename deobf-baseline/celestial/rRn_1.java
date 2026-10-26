package celestial;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class rRn_1<T extends rRC<T>> {
   private final Supplier<ArgumentType<?>> id_class;
   private final Function<rRn_1<T>, T> id_break;
   final BiConsumer<rnW_2, T> id_byte;
   private final rRv_1<T> id_protected;

   rRn_1(Supplier<ArgumentType<?>> var1, Function<rRn_1<T>, T> var2, BiConsumer<rnW_2, T> var3, rRv_1<T> var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public void id_class(rRF var1, rRA<T> var2) {
      this.id_protected.call(var1, var2, this);
   }

   public T id_class() {
      return this.id_break.apply(this);
   }

   public RequiredArgumentBuilder<gy_3, ?> id_class(String var1) {
      return gp_3.id_class(var1, (ArgumentType<T>)this.id_class.get());
   }
}
