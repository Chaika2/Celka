package celestial;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

final class iL_2<U> {
   private final il_3<U> class_;
   private final Optional<? extends in_3<U>> break_;

   iL_2(il_3<U> var1, Optional<? extends in_3<U>> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public <T> void class_(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.class_.class_().ifPresent(var3 -> this.break_.ifPresent(var4 -> var2.add(rVL.d.encodeStart(var1, this.class_), var3.encodeStart(var1, var4))));
   }

   void class_(iZ_2<?> var1) {
      var1.break_(this.class_, this.break_);
   }

   static <U> iL_2<U> class_(il_3<U> var0, Optional<? extends in_3<?>> var1) {
      return new iL_2<>(var0, var1);
   }
}
