package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Collection;

public final class iF_2<E extends iB_2> {
   private final Collection<? extends il_3<?>> class_;
   private final Collection<? extends rrP_2<? extends rrr_3<? super E>>> break_;
   private final Codec<iZ_2<E>> byte_;

   iF_2(Collection<? extends il_3<?>> var1, Collection<? extends rrP_2<? extends rrr_3<? super E>>> var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = iZ_2.break_(var1, var2);
   }

   public iZ_2<E> class_(Dynamic<?> var1) {
      return this.byte_
         .parse(var1)
         .resultOrPartial(iZ_2.class_::error)
         .orElseGet(() -> new iZ_2<>(this.class_, this.break_, ImmutableList.of(), () -> this.byte_));
   }
}
