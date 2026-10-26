package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class rVp_1<T> extends rTF<T> {
   private final rVm_1 break_;

   private rVp_1(DynamicOps<T> var1, rVm_1 var2) {
      super(var1);
      this.break_ = var2;
   }

   public static <T> rVp_1<T> class_(DynamicOps<T> var0, rVm_1 var1) {
      return new rVp_1<>(var0, var1);
   }

   protected <E> DataResult<T> class_(E var1, T var2, rqM_2<? extends rVL<E>> var3, Codec<E> var4) {
      Optional var5 = this.break_.class_(var3);
      if (var5.isPresent()) {
         rVF var6 = (rVF)var5.get();
         Optional var7 = var6.byte_(var1);
         if (var7.isPresent()) {
            rqM_2 var8 = (rqM_2)var7.get();
            return rqO_2.class_.encode(var8.class_(), this.class_, var2);
         }
      }

      return var4.encode(var1, this, var2);
   }
}
