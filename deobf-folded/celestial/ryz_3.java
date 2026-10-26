package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;

public final class ryz_3<T extends ryO_2> {
   private final Supplier<? extends T> id_class;
   final Set<xd_3> id_break;

   private ryz_3(Supplier<? extends T> var1, Set<xd_3> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public static <T extends ryO_2> ryz_3<T> id_class(Supplier<? extends T> var0, xd_3... var1) {
      return new ryz_3<>(var0, ImmutableSet.copyOf(var1));
   }

   public ryW_2<T> id_class(Type<?> var1) {
      return new ryW_2<>(this.id_class, this.id_break, var1);
   }
}
