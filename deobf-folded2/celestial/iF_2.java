package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;

public final class iF_2<E extends iB_2> {
   private final Collection<? extends il_3<?>> id_class;
   private final Collection<? extends rrP_2<? extends rrr_3<? super E>>> id_break;
   private final Codec<iZ_2<E>> id_byte;

   iF_2(Collection<? extends il_3<?>> var1, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = iZ_2.id_break(var1, var2);
   }

   public iZ_2<E> id_class(Dynamic<?> var1) {
      return this.id_byte
         .parse(var1)
         .resultOrPartial(iZ_2.id_class::error)
         .orElseGet(() -> new iZ_2<>(this.id_class, this.id_break, ImmutableList.of(), () -> this.id_byte));
   }
}
