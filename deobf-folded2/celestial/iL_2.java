package celestial;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

final class iL_2<U> {
   private final il_3<U> id_class;
   private final Optional<? extends in_3<U>> id_break;

   iL_2(il_3<U> var1, Optional<? extends in_3<U>> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public <T> void id_class(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.id_class
         .id_class()
         .ifPresent(var3 -> this.id_break.ifPresent(var4 -> var2.add(rVL.d.encodeStart(var1, this.id_class), var3.encodeStart(var1, var4))));
   }

   void id_class(iZ_2<?> var1) {
      var1.id_break(this.id_class, this.id_break);
   }

   static <U> iL_2<U> id_class(il_3<U> var0, Optional<? extends in_3<?>> var1) {
      return new iL_2<>(var0, var1);
   }
}
