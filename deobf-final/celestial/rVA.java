package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Supplier;

public final class rVA<E> implements Codec<Supplier<E>> {
   private final rqM_2<? extends rVL<E>> class_;
   private final Codec<E> break_;
   private final boolean byte_;

   private rVA(rqM_2<? extends rVL<E>> var1, Codec<E> var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.class_ + " " + this.break_ + "]";
   }

   public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> var1, T var2) {
      return (DataResult<Pair<Supplier<E>, T>>)(var1 instanceof rVq_1
         ? ((rVq_1)var1).class_(var2, this.class_, this.break_, this.byte_)
         : this.break_.decode(var1, var2).map(var0 -> var0.mapFirst(var0x -> () -> var0x)));
   }

   private static <E> rVA<E> class_(rqM_2<? extends rVL<E>> var0, Codec<E> var1, boolean var2) {
      return new rVA<>(var0, var1, var2);
   }

   public static <E> rVA<E> class_(rqM_2<? extends rVL<E>> var0, Codec<E> var1) {
      return class_(var0, var1, true);
   }

   public <T> DataResult<T> class_(Supplier<E> var1, DynamicOps<T> var2, T var3) {
      return (DataResult<T>)(var2 instanceof rVp_1
         ? ((rVp_1)var2).class_(var1.get(), var3, this.class_, this.break_)
         : this.break_.encode(var1.get(), var2, var3));
   }

   public static <E> Codec<List<Supplier<E>>> break_(rqM_2<? extends rVL<E>> var0, Codec<E> var1) {
      return Codec.either(class_(var0, var1, false).listOf(), var1.xmap(var0x -> () -> var0x, Supplier::get).listOf())
         .xmap(var0x -> (List)var0x.map(var0xx -> var0xx, var0xx -> var0xx), Either::left);
   }
}
