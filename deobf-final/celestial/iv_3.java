package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;

class iv_3 extends MapCodec<iZ_2<E>> {
   iv_3(Collection var1, Collection var2, MutableObject var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public <T> DataResult<iZ_2<E>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      MutableObject var3 = new MutableObject(DataResult.success(ImmutableList.builder()));
      var2.entries().forEach(var3x -> {
         DataResult var4x = rVL.d.parse(var1, var3x.getFirst());
         DataResult var5 = var4x.flatMap(var3xx -> this.class_(var3xx, var1, var3x.getSecond()));
         var3.setValue(((DataResult)var3.getValue()).apply2(Builder::add, var5));
      });
      ImmutableList var4 = ((DataResult)var3.getValue()).resultOrPartial(iZ_2.class_::error).<ImmutableList>map(Builder::build).orElseGet(ImmutableList::of);
      return DataResult.success(new iZ_2(this.class_, this.break_, var4, this.byte_::getValue));
   }

   private <T, U> DataResult<iL_2<U>> class_(il_3<U> var1, DynamicOps<T> var2, T var3) {
      return var1.class_()
         .<DataResult>map(DataResult::success)
         .orElseGet(() -> DataResult.error("No codec for memory: " + var1))
         .flatMap(var2x -> var2x.parse(var2, var3))
         .map(var1x -> new iL_2(var1, Optional.of(var1x)));
   }

   public <T> RecordBuilder<T> class_(iZ_2<E> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      var1.case_().forEach(var2x -> var2x.class_(var2, var3));
      return var3;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.class_
         .stream()
         .flatMap(var0 -> rqR_2.class_(var0.class_().map(var1x -> rVL.d.break_((il_3<?>)var0))))
         .map(var1x -> (T)var1.createString(var1x.toString()));
   }
}
