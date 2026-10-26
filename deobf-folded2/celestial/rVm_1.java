package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rVm_1 {
   private static final Logger id_class = LogManager.getLogger();
   static final Map<rqM_2<? extends rVL<?>>, rVZ<?>> id_break = rqR_2.id_class((Supplier<Map<rqM_2<? extends rVL<?>>, rVZ<?>>>)(() -> {
      Builder var0 = ImmutableMap.builder();
      id_class(var0, rVL.id_void, rRJ.id_protected, rRJ.id_protected);
      id_class(var0, rVL.n, rYG.id_break, rYG.id_byte);
      id_class(var0, rVL.m, rrSR.id_class);
      id_class(var0, rVL.Z, rDM.id_class);
      id_class(var0, rVL.v, rDg_1.id_class);
      id_class(var0, rVL.F, reP_2.id_class);
      id_class(var0, rVL.L, rrPx_1.id_native);
      id_class(var0, rVL.A, reu_3.id_class);
      id_class(var0, rVL.u, rKW.id_class);
      return var0.build();
   }));
   private static final rVv_1 id_byte = rqR_2.id_class((Supplier<rVv_1>)(() -> {
      rVv_1 var0 = new rVv_1();
      rRJ.id_class(var0);
      id_break.keySet().stream().filter(var0x -> !var0x.equals(rVL.id_void)).forEach(var1 -> id_class(var0, (rqM_2<? extends rVL<?>>)var1));
      return var0;
   }));

   private static <E> void id_class(rVq_1<?> var0, rVv_1 var1, rVZ<E> var2) {
      rqM_2 var3 = var2.id_class();
      rVC var4 = Optional.ofNullable(var1.id_break.get(var3))
         .map(var0x -> (rVC)var0x)
         .orElseThrow(() -> new IllegalStateException("Missing registry: " + var3));
      DataResult var5 = var0.id_class(var4, var2.id_class(), var2.id_break());
      var5.error().ifPresent(var0x -> id_class.error("Error loading registry data: {}", var0x.message()));
   }

   public rVL<rRJ> id_class() {
      return this.id_break(rVL.id_void);
   }

   public static void id_class(rVv_1 var0, rVq_1<?> var1) {
      for (rVZ var3 : id_break.values()) {
         id_class(var1, var0, var3);
      }
   }

   public abstract <E> Optional<rVF<E>> id_class(rqM_2<? extends rVL<E>> var1);

   private static <E> void id_class(Builder<rqM_2<? extends rVL<?>>, rVZ<?>> var0, rqM_2<? extends rVL<E>> var1, Codec<E> var2, Codec<E> var3) {
      var0.put(var1, new rVZ(var1, var2, var3));
   }

   private static <E> void id_class(Builder<rqM_2<? extends rVL<?>>, rVZ<?>> var0, rqM_2<? extends rVL<E>> var1, Codec<E> var2) {
      var0.put(var1, new rVZ(var1, var2, (Codec<E>)null));
   }

   private static <E> void id_class(rVv_1 var0, rVw_1 var1, rVZ<E> var2) {
      rqM_2 var3 = var2.id_class();
      boolean var4 = !var3.equals(rVL.u) && !var3.equals(rVL.id_void);
      rVF var5 = id_byte.id_break(var3);
      rVF var6 = var0.id_break(var3);

      for (Entry var8 : var5.id_throws()) {
         Object var9 = var8.getValue();
         if (var4) {
            var1.id_class(id_byte, (rqM_2<Object>)var8.getKey(), var2.id_break(), var5.id_class(var9), var9, var5.id_protected(var9));
         } else {
            var6.id_class(var5.id_class(var9), (rqM_2)var8.getKey(), var9, var5.id_protected(var9));
         }
      }
   }

   private static <R extends rVL<?>> void id_class(rVv_1 var0, rqM_2<R> var1) {
      rVL var2 = rVy_1.id_break;
      rVL var3 = (rVL)var2.id_class(var1);
      if (var3 == null) {
         throw new IllegalStateException("Missing builtin registry: " + var1);
      } else {
         id_class(var0, var3);
      }
   }

   private static <E> void id_class(rVv_1 var0, rVL<E> var1) {
      rVF var2 = (rVF)var0.id_class(var1.id_break()).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1.id_break()));

      for (Entry var4 : var1.id_throws()) {
         Object var5 = var4.getValue();
         var2.id_class(var1.id_class(var5), (rqM_2)var4.getKey(), var5, var1.id_protected(var5));
      }
   }

   public <E> rVF<E> id_break(rqM_2<? extends rVL<E>> var1) {
      return this.<E>id_class(var1).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1));
   }

   public static rVv_1 id_break() {
      rVv_1 var0 = new rVv_1();
      rVw_1 var1 = new rVw_1();

      for (rVZ var3 : id_break.values()) {
         id_class(var0, var1, var3);
      }

      rVq_1.id_class(JsonOps.INSTANCE, var1, var0);
      return var0;
   }
}
