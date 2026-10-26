package celestial;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

public final class rVn_1<E> extends MapCodec<rVL<E>> {
   private final rqM_2<? extends rVL<E>> class_;

   private rVn_1(rqM_2<? extends rVL<E>> var1) {
      this.class_ = var1;
   }

   public String toString() {
      return "RegistryLookupCodec[" + this.class_ + "]";
   }

   public <T> DataResult<rVL<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return var1 instanceof rVq_1 ? ((rVq_1)var1).class_(this.class_) : DataResult.error("Not a registry ops");
   }

   public <T> RecordBuilder<T> class_(rVL<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var3;
   }

   public static <E> rVn_1<E> class_(rqM_2<? extends rVL<E>> var0) {
      return new rVn_1<>(var0);
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.empty();
   }
}
