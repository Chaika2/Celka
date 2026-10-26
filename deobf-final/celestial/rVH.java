package celestial;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public final class rVH<E> implements Codec<rVC<E>> {
   private final Codec<rVC<E>> class_;
   private final rqM_2<? extends rVL<E>> break_;
   private final Codec<E> byte_;

   private rVH(rqM_2<? extends rVL<E>> var1, Lifecycle var2, Codec<E> var3) {
      this.class_ = rVC.byte_(var1, var2, var3);
      this.break_ = var1;
      this.byte_ = var3;
   }

   @Override
   public String toString() {
      return "RegistryDataPackCodec[" + this.class_ + " " + this.break_ + " " + this.byte_ + "]";
   }

   public <T> DataResult<Pair<rVC<E>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult var3 = this.class_.decode(var1, var2);
      return var1 instanceof rVq_1
         ? var3.flatMap(var2x -> ((rVq_1)var1).class_((rVC<E>)var2x.getFirst(), this.break_, this.byte_).map(var1xx -> Pair.of(var1xx, var2x.getSecond())))
         : var3;
   }

   public static <E> rVH<E> class_(rqM_2<? extends rVL<E>> var0, Lifecycle var1, Codec<E> var2) {
      return new rVH<>(var0, var1, var2);
   }

   public <T> DataResult<T> class_(rVC<E> var1, DynamicOps<T> var2, T var3) {
      return this.class_.encode(var1, var2, var3);
   }
}
