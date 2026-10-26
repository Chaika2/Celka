package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.UnboundedMapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class rVv_1 extends rVm_1 {
   public static final Codec<rVv_1> class_ = byte_();
   final Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> break_;

   private static <E> DataResult<? extends Codec<E>> byte_(rqM_2<? extends rVL<E>> var0) {
      return Optional.ofNullable(rVm_1.break_.get(var0))
         .map(var0x -> var0x.byte_())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + var0));
   }

   private static <E> Codec<rVv_1> byte_() {
      Codec var0 = rqO_2.class_.xmap(rqM_2::class_, rqM_2::class_);
      Codec var1 = var0.partialDispatch(
         "type", var0x -> DataResult.success(var0x.break_()), var0x -> byte_(var0x).map(var1x -> rVC.class_(var0x, Lifecycle.experimental(), var1x))
      );
      UnboundedMapCodec var2 = Codec.unboundedMap(var0, var1);
      return class_(var2);
   }

   private rVv_1(Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> var1) {
      this.break_ = var1;
   }

   public rVv_1() {
      this(rVm_1.break_.keySet().stream().collect(Collectors.toMap(Function.identity(), rVv_1::protected_)));
   }

   @Override
   public <E> Optional<rVF<E>> class_(rqM_2<? extends rVL<E>> var1) {
      return Optional.ofNullable(this.break_.get(var1)).map(var0 -> (rVF<E>)var0);
   }

   private static <K extends rqM_2<? extends rVL<?>>, V extends rVC<?>> Codec<rVv_1> class_(UnboundedMapCodec<K, V> var0) {
      return var0.xmap(
         rVv_1::new,
         var0x -> var0x.break_
               .entrySet()
               .stream()
               .filter(var0xx -> rVm_1.break_.get(var0xx.getKey()).protected_())
               .collect(ImmutableMap.toImmutableMap(Entry::getKey, Entry::getValue))
      );
   }

   private static <E> rVC<?> protected_(rqM_2<? extends rVL<?>> var0) {
      return new rVC<>((rqM_2<? extends rVL<?>>)var0, Lifecycle.stable());
   }
}
