package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public final class rVH<E> implements Codec<rVC<E>> {
   private final Codec<rVC<E>> id_class;
   private final rqM_2<? extends rVL<E>> id_break;
   private final Codec<E> id_byte;

   private rVH(rqM_2<? extends rVL<E>> var1, Lifecycle var2, Codec<E> var3) {
      this.id_class = rVC.id_byte(var1, var2, var3);
      this.id_break = var1;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return "RegistryDataPackCodec[" + this.id_class + " " + this.id_break + " " + this.id_byte + "]";
   }

   public <T> DataResult<Pair<rVC<E>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult var3 = this.id_class.decode(var1, var2);
      return var1 instanceof rVq_1
         ? var3.flatMap(
            var2x -> ((rVq_1)var1).id_class((rVC<E>)var2x.getFirst(), this.id_break, this.id_byte).map(var1xx -> Pair.of(var1xx, var2x.getSecond()))
         )
         : var3;
   }

   public static <E> rVH<E> id_class(rqM_2<? extends rVL<E>> var0, Lifecycle var1, Codec<E> var2) {
      return new rVH<>(var0, var1, var2);
   }

   public <T> DataResult<T> id_class(rVC<E> var1, DynamicOps<T> var2, T var3) {
      return this.id_class.encode(var1, var2, var3);
   }
}
