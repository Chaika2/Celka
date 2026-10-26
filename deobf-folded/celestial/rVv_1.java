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
   public static final Codec<rVv_1> id_class = id_byte();
   final Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> id_break;

   private static <E> DataResult<? extends Codec<E>> id_byte(rqM_2<? extends rVL<E>> var0) {
      return Optional.ofNullable(rVm_1.id_break.get(var0))
         .map(var0x -> var0x.id_byte())
         .<DataResult<? extends Codec<E>>>map(DataResult::success)
         .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + var0));
   }

   private static <E> Codec<rVv_1> id_byte() {
      Codec var0 = rqO_2.id_class.xmap(rqM_2::id_class, rqM_2::id_class);
      Codec var1 = var0.partialDispatch(
         "type", var0x -> DataResult.success(var0x.id_break()), var0x -> id_byte(var0x).map(var1x -> rVC.id_class(var0x, Lifecycle.experimental(), var1x))
      );
      UnboundedMapCodec var2 = Codec.unboundedMap(var0, var1);
      return id_class(var2);
   }

   private rVv_1(Map<? extends rqM_2<? extends rVL<?>>, ? extends rVC<?>> var1) {
      this.id_break = var1;
   }

   public rVv_1() {
      this(rVm_1.id_break.keySet().stream().collect(Collectors.toMap(Function.identity(), rVv_1::id_protected)));
   }

   @Override
   public <E> Optional<rVF<E>> id_class(rqM_2<? extends rVL<E>> var1) {
      return Optional.ofNullable(this.id_break.get(var1)).map(var0 -> (rVF<E>)var0);
   }

   private static <K extends rqM_2<? extends rVL<?>>, V extends rVC<?>> Codec<rVv_1> id_class(UnboundedMapCodec<K, V> var0) {
      return var0.xmap(
         rVv_1::new,
         var0x -> var0x.id_break
               .entrySet()
               .stream()
               .filter(var0xx -> rVm_1.id_break.get(var0xx.getKey()).id_protected())
               .collect(ImmutableMap.toImmutableMap(Entry::getKey, Entry::getValue))
      );
   }

   private static <E> rVC<?> id_protected(rqM_2<? extends rVL<?>> var0) {
      return new rVC<>((rqM_2<? extends rVL<?>>)var0, Lifecycle.stable());
   }
}
