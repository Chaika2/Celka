package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;

public final class ryz_3<T extends ryO_2> {
   private final Supplier<? extends T> class_;
   final Set<xd_3> break_;

   private ryz_3(Supplier<? extends T> var1, Set<xd_3> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public static <T extends ryO_2> ryz_3<T> class_(Supplier<? extends T> var0, xd_3... var1) {
      return new ryz_3<>(var0, ImmutableSet.copyOf(var1));
   }

   public ryW_2<T> class_(Type<?> var1) {
      return new ryW_2<>(this.class_, this.break_, var1);
   }
}
