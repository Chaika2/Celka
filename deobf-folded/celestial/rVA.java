package celestial;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Supplier;

public final class rVA<E> implements Codec<Supplier<E>> {
   private final rqM_2<? extends rVL<E>> id_class;
   private final Codec<E> id_break;
   private final boolean id_byte;

   private rVA(rqM_2<? extends rVL<E>> var1, Codec<E> var2, boolean var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return "RegistryFileCodec[" + this.id_class + " " + this.id_break + "]";
   }

   public <T> DataResult<Pair<Supplier<E>, T>> decode(DynamicOps<T> var1, T var2) {
      return (DataResult<Pair<Supplier<E>, T>>)(var1 instanceof rVq_1
         ? ((rVq_1)var1).id_class(var2, this.id_class, this.id_break, this.id_byte)
         : this.id_break.decode(var1, var2).map(var0 -> var0.mapFirst(var0x -> () -> var0x)));
   }

   private static <E> rVA<E> id_class(rqM_2<? extends rVL<E>> var0, Codec<E> var1, boolean var2) {
      return new rVA<>(var0, var1, var2);
   }

   public static <E> rVA<E> id_class(rqM_2<? extends rVL<E>> var0, Codec<E> var1) {
      return id_class(var0, var1, true);
   }

   public <T> DataResult<T> id_class(Supplier<E> var1, DynamicOps<T> var2, T var3) {
      return (DataResult<T>)(var2 instanceof rVp_1
         ? ((rVp_1)var2).id_class(var1.get(), var3, this.id_class, this.id_break)
         : this.id_break.encode(var1.get(), var2, var3));
   }

   public static <E> Codec<List<Supplier<E>>> id_break(rqM_2<? extends rVL<E>> var0, Codec<E> var1) {
      return Codec.either(id_class(var0, var1, false).listOf(), var1.xmap(var0x -> () -> var0x, Supplier::get).listOf())
         .xmap(var0x -> (List)var0x.map(var0xx -> var0xx, var0xx -> var0xx), Either::left);
   }
}
